"# WSClient" 
 * Client类之外的类，可用CXF的wsdl2java工具生成
 * 步骤：
 * 到WSClient下打开命令提示符 输入:wsdl2java WebService提供的地址
 * 如：wsdl2java http://192.168.0.2:6344/ws?wdsl
 * 问题：生成代码时，JDK8可能会入到“schema_reference: Failed to read schema document 'xjc.xsd', because 'file' access is not allowed due to restriction set by the accessExternalSchema property.”
 * 解决方案：在/java_home/jdk8/jre/lib文件下创建jaxp.properties文件，并在里面写入javax.xml.accessExternalSchema = all


 服务端与客户端 整体开发步骤：
 1.在window环境变量里面，将cxf/bin路径进行配置，在cmd命令下执行wsdl2java 能看到错误信息Usage : wsdl2java -fe|-fronten 代表配置成功
 2.在服务器段建立Service接口与实现类 ，在接口与实现类上使用@WebService注解
 @WebService //这是一个webservice接口
 public interface WSServer {
 	public String getWeatcher(String area);
 }
 @WebService(endpointInterface="com.ws.service.WSServer")
 //endpointInterface指向接口的全路径
 public class WSServerImpl implements WSServer{
 	@Override
 	public String getWeatcher(String area) {
 		String weather = "";
 		if(area.equals("北京")){
 			weather = "晴转多云，偏北风2~3级";
 		}else if(area.equals("石家庄")){
 			weather = "中到大雨，偏北风8~10级";
 		}else{
 			weather = "未知区域";
 		}
 		return weather;
 	}

 }

 3. 发布webservice ，启动后使用浏览器访问：http://192.168.1.248:6344/ws?wsdl 看到XML文档代表webservice发布成功
 public class WSTestor {
 	public static void main(String[] args) {
 		WSServer server = new WSServerImpl();
 		Endpoint.publish("http://192.168.0.2:6344/ws", server);
 	}
 }

 4. 开发客户端，在客户端工程内 cmd执行 wsdl2java http://192.168.0.2:6344/ws?wsdl，生成客户端
 5. 利用下面的代码远程调用服务器的方法
 	,获取客户端接口的方法名称为getXXXXXPort()
 public class ClientTestor {
 	public static void main(String[] args){
 		WSServerImplService wsService = new WSServerImplService();
 		WSServer ws = wsService.getWSServerImplPort();
 		String weather = ws.getWeatcher("北京");
 		System.out.println(weather);
 	}
 }





 ================================

 网络传输的4个阶段:
 1.客户端发起请求，调用方法，客户端产生输出消息
 2.服务器段，接收该消息，服务器段产生输入消息
 3.服务器段处理后，生成返回值，服务器端产生输出消息
 4.客户端来说，产生输入消息接收服务器的输入