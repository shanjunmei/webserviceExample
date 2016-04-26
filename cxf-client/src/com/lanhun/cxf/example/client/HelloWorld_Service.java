/**
 * HelloWorld_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lanhun.cxf.example.client;

public interface HelloWorld_Service extends javax.xml.rpc.Service {
    public java.lang.String getHelloWorldImplPortAddress();

    public com.lanhun.cxf.example.client.HelloWorld_PortType getHelloWorldImplPort() throws javax.xml.rpc.ServiceException;

    public com.lanhun.cxf.example.client.HelloWorld_PortType getHelloWorldImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
