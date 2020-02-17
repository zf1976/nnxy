import api.ApiServiceFactory;
import api.response.LoginResp;

/**
 * Create by Ant on 2020/2/16 1:52 下午
 * mac
 */
public class Test {

    public static void main(String[] args) {
        LoginResp loginResp=ApiServiceFactory.getService().login("20181004095","fengge123");
        try {
        //    System.out.println(ApiServiceFactory.getService().getDateInfo(loginResp.getToken(), "2019-09-27"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
