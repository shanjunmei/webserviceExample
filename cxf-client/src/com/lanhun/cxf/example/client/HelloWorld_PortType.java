/**
 * HelloWorld_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lanhun.cxf.example.client;

public interface HelloWorld_PortType extends java.rmi.Remote {
    public java.lang.String sayHi(java.lang.String text) throws java.rmi.RemoteException;
    public java.lang.String sayHiToUser(com.lanhun.cxf.example.client.User arg0) throws java.rmi.RemoteException;
    public java.lang.String[] sayHiToUserList(com.lanhun.cxf.example.client.User[] arg0) throws java.rmi.RemoteException;
}
