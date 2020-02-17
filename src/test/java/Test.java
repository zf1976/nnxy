import api.ApiServiceFactory;
import response.DateInfoResp;
import response.LoginResp;

/**
 * Create by Ant on 2020/2/17 2:25 下午
 * mac
 */
public class Test {
    public static void main(String[] args) {
        LoginResp loginResp= ApiServiceFactory.getService().login("20181004095","fengge123");
        System.out.println(loginResp);
        DateInfoResp f=ApiServiceFactory.getService().getDateInfo(loginResp.getToken(),"2019-10-29");
        System.out.println(f);
    }
}
