
package com.ws.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetWeatcherResponse_QNAME = new QName("http://service.ws.com/", "getWeatcherResponse");
    private final static QName _GetWeatcher_QNAME = new QName("http://service.ws.com/", "getWeatcher");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeatcherResponse }
     * 
     */
    public GetWeatcherResponse createGetWeatcherResponse() {
        return new GetWeatcherResponse();
    }

    /**
     * Create an instance of {@link GetWeatcher }
     * 
     */
    public GetWeatcher createGetWeatcher() {
        return new GetWeatcher();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatcherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.com/", name = "getWeatcherResponse")
    public JAXBElement<GetWeatcherResponse> createGetWeatcherResponse(GetWeatcherResponse value) {
        return new JAXBElement<GetWeatcherResponse>(_GetWeatcherResponse_QNAME, GetWeatcherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatcher }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ws.com/", name = "getWeatcher")
    public JAXBElement<GetWeatcher> createGetWeatcher(GetWeatcher value) {
        return new JAXBElement<GetWeatcher>(_GetWeatcher_QNAME, GetWeatcher.class, null, value);
    }

}
