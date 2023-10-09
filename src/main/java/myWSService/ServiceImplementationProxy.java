package myWSService;

public class ServiceImplementationProxy implements myWSService.ServiceImplementation {
  private String _endpoint = null;
  private myWSService.ServiceImplementation serviceImplementation = null;
  
  public ServiceImplementationProxy() {
    _initServiceImplementationProxy();
  }
  
  public ServiceImplementationProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceImplementationProxy();
  }
  
  private void _initServiceImplementationProxy() {
    try {
      serviceImplementation = (new myWSService.ServiceImplementationServiceLocator()).getServiceImplementationPort();
      if (serviceImplementation != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceImplementation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceImplementation)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceImplementation != null)
      ((javax.xml.rpc.Stub)serviceImplementation)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public myWSService.ServiceImplementation getServiceImplementation() {
    if (serviceImplementation == null)
      _initServiceImplementationProxy();
    return serviceImplementation;
  }
  
  public int add(int arg0, int arg1) throws java.rmi.RemoteException{
    if (serviceImplementation == null)
      _initServiceImplementationProxy();
    return serviceImplementation.add(arg0, arg1);
  }
  
  
}