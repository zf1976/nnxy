import api.ApiServiceFactory;
import response.DateInfoResp;
import response.EmptyClassrommResult;
import response.LoginResp;

/**
 * Create by Ant on 2020/2/17 2:25 下午
 * mac
 */
public class Test {
    public static void main(String[] args) {
        LoginResp loginResp= ApiServiceFactory.getService().login("20181004095","fengge123");
        String token=loginResp.getToken();
        System.out.println(loginResp);
        System.out.println(ApiServiceFactory.getService().getDateInfo(token, "2019-10-29"));
        System.out.println(ApiServiceFactory.getService().getEmptyClassroomList(token, "2019-10-29", "allday"));
        System.out.println(ApiServiceFactory.getService().getCampusList(token));
        System.out.println(ApiServiceFactory.getService().getCourseInfoList(token, "20181004095", "2019-2020-1", 5));
        System.out.println(ApiServiceFactory.getService().getCourseScoreList(token, "20181004095", "2019-2020-1"));
        System.out.println(ApiServiceFactory.getService().getSchoolYearList(token, "20181004095"));
        System.out.println(ApiServiceFactory.getService().getTeachBiuldList(token, 3));
        System.out.println(ApiServiceFactory.getService().getUserInfo(token, "20181004095"));

    }
}
