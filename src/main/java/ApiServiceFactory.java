import api.impl.ApiServiceImpl;

/**
 * Create by Ant on 2020/2/17 12:55 下午
 * mac
 * @author ant
 */
public class ApiServiceFactory{
    private static ApiServiceImpl ADI_SERVICE_IMPL;
    private ApiServiceFactory(){}
    public static ApiServiceImpl getService(){
        synchronized (ApiServiceFactory.class){
            if (ADI_SERVICE_IMPL ==null){
                ADI_SERVICE_IMPL =new ApiServiceImpl();
            }
            return ADI_SERVICE_IMPL;
        }
    }

}
