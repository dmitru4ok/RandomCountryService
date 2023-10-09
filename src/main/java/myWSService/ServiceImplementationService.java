/**
 * ServiceImplementationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package myWSService;

public interface ServiceImplementationService extends javax.xml.rpc.Service {
    public java.lang.String getServiceImplementationPortAddress();

    public myWSService.ServiceImplementation getServiceImplementationPort() throws javax.xml.rpc.ServiceException;

    public myWSService.ServiceImplementation getServiceImplementationPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
