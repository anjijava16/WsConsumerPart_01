/**
 * LoingWSServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.iwinner.ws.service;

public class LoingWSServiceImplServiceLocator extends org.apache.axis.client.Service implements com.iwinner.ws.service.LoingWSServiceImplService {

    public LoingWSServiceImplServiceLocator() {
    }


    public LoingWSServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoingWSServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoingWSServiceImpl
    private java.lang.String LoingWSServiceImpl_address = "http://iwinnertech.com/WService/services/LoingWSServiceImpl";

    public java.lang.String getLoingWSServiceImplAddress() {
        return LoingWSServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LoingWSServiceImplWSDDServiceName = "LoingWSServiceImpl";

    public java.lang.String getLoingWSServiceImplWSDDServiceName() {
        return LoingWSServiceImplWSDDServiceName;
    }

    public void setLoingWSServiceImplWSDDServiceName(java.lang.String name) {
        LoingWSServiceImplWSDDServiceName = name;
    }

    public com.iwinner.ws.service.LoingWSServiceImpl getLoingWSServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoingWSServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoingWSServiceImpl(endpoint);
    }

    public com.iwinner.ws.service.LoingWSServiceImpl getLoingWSServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.iwinner.ws.service.LoingWSServiceImplSoapBindingStub _stub = new com.iwinner.ws.service.LoingWSServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getLoingWSServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoingWSServiceImplEndpointAddress(java.lang.String address) {
        LoingWSServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.iwinner.ws.service.LoingWSServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.iwinner.ws.service.LoingWSServiceImplSoapBindingStub _stub = new com.iwinner.ws.service.LoingWSServiceImplSoapBindingStub(new java.net.URL(LoingWSServiceImpl_address), this);
                _stub.setPortName(getLoingWSServiceImplWSDDServiceName());
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
        if ("LoingWSServiceImpl".equals(inputPortName)) {
            return getLoingWSServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.ws.iwinner.com", "LoingWSServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.ws.iwinner.com", "LoingWSServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LoingWSServiceImpl".equals(portName)) {
            setLoingWSServiceImplEndpointAddress(address);
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
