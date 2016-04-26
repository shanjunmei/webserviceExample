package com.lanhun.cxf.example.client;

public class HelloWorldProxy implements com.lanhun.cxf.example.client.HelloWorld_PortType {
  private String _endpoint = null;
  private com.lanhun.cxf.example.client.HelloWorld_PortType helloWorld_PortType = null;
  
  public HelloWorldProxy() {
    _initHelloWorldProxy();
  }
  
  public HelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldProxy();
  }
  
  private void _initHelloWorldProxy() {
    try {
      helloWorld_PortType = (new com.lanhun.cxf.example.client.HelloWorld_ServiceLocator()).getHelloWorldImplPort();
      if (helloWorld_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld_PortType != null)
      ((javax.xml.rpc.Stub)helloWorld_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lanhun.cxf.example.client.HelloWorld_PortType getHelloWorld_PortType() {
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType;
  }
  
  public java.lang.String sayHi(java.lang.String text) throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.sayHi(text);
  }
  
  public java.lang.String sayHiToUser(com.lanhun.cxf.example.client.User arg0) throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.sayHiToUser(arg0);
  }
  
  public java.lang.String[] sayHiToUserList(com.lanhun.cxf.example.client.User[] arg0) throws java.rmi.RemoteException{
    if (helloWorld_PortType == null)
      _initHelloWorldProxy();
    return helloWorld_PortType.sayHiToUserList(arg0);
  }
  
  
}