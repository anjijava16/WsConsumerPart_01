/**
 * WsUserServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iwinner.ws.service;

public class WsUserServiceImplServiceLocator extends org.apache.axis.client.Service implements com.iwinner.ws.service.WsUserServiceImplService {

    public WsUserServiceImplServiceLocator() {
    }


    public WsUserServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsUserServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsUserServiceImpl
    private java.lang.String WsUserServiceImpl_address = "http://localhost:3636/WService/services/WsUserServiceImpl";

    public java.lang.String getWsUserServiceImplAddress() {
        return WsUserServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsUserServiceImplWSDDServiceName = "WsUserServiceImpl";

    public java.lang.String getWsUserServiceImplWSDDServiceName() {
        return WsUserServiceImplWSDDServiceName;
    }

    public void setWsUserServiceImplWSDDServiceName(java.lang.String name) {
        WsUserServiceImplWSDDServiceName = name;
    }

    public com.iwinner.ws.service.WsUserServiceImpl getWsUserServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsUserServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsUserServiceImpl(endpoint);
    }

    public com.iwinner.ws.service.WsUserServiceImpl getWsUserServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.iwinner.ws.service.WsUserServiceImplSoapBindingStub _stub = new com.iwinner.ws.service.WsUserServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getWsUserServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsUserServiceImplEndpointAddress(java.lang.String address) {
        WsUserServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.iwinner.ws.service.WsUserServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.iwinner.ws.service.WsUserServiceImplSoapBindingStub _stub = new com.iwinner.ws.service.WsUserServiceImplSoapBindingStub(new java.net.URL(WsUserServiceImpl_address), this);
                _stub.setPortName(getWsUserServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WsUserServiceImpl".equals(inputPortName)) {
            return getWsUserServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws.iwinner.com", "WsUserServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws.iwinner.com", "WsUserServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsUserServiceImpl".equals(portName)) {
            setWsUserServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
