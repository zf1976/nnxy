package api;

import impl.ApiServiceIpml;

/**
 * Create by Ant on 2020/2/17 12:55 下午
 * mac
 */
public class ApiServiceFactory{
    private static ApiServiceIpml API_SERVICE_IPML;
    private ApiServiceFactory(){}
    public static ApiServiceIpml getService(){
        synchronized (ApiServiceFactory.class){
            if (API_SERVICE_IPML==null){
                API_SERVICE_IPML=new ApiServiceIpml();
            }
            return API_SERVICE_IPML;
        }
    }

}
