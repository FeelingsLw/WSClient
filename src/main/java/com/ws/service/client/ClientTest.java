package com.ws.service.client;

import com.ws.service.WSService;
import com.ws.service.impl.WSServiceImpService;

/**
 * Created by admin-pc on 2016/9/4.
 */
public class ClientTest {
    public static void main(String[]args){
        WSServiceImpService wsService=new WSServiceImpService();
        WSService ws=wsService.getWSServiceImpPort();
        System.out.println(ws.getWeatcher("北京"));
    }
}
