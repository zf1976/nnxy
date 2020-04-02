import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import response.user.LoginResp;

/**
 * @author ant
 * Create by Ant on 2020/2/17 2:25 下午
 * mac
 */
public class Test {

    public static Logger LOG= LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        LoginResp loginResp= ApiServiceFactory.getService().login("20181004095","fengge123");
        String token=loginResp.getToken();
        LOG.info("{}",loginResp);
        LOG.info("{}",ApiServiceFactory.getService().getDateInfo(token, "2019-10-29"));
        LOG.info("{}",ApiServiceFactory.getService().getEmptyClassroomList(token, "2019-10-29", "allday"));
        LOG.info("{}",ApiServiceFactory.getService().getCampusList(token));
        LOG.info("{}",ApiServiceFactory.getService().getCourseInfoList(token, "20181004095", "2019-2020-1", 5));
        LOG.info("{}",ApiServiceFactory.getService().getCourseScoreList(token, "20161004016", "2019-2020-1"));
        LOG.info("{}",ApiServiceFactory.getService().getSchoolYearList(token, "20181004095"));
        LOG.info("{}",ApiServiceFactory.getService().getBuildingList(token, 3));
        LOG.info("{}",ApiServiceFactory.getService().getUserInfo(token, "20181004095"));
        
    }
}
