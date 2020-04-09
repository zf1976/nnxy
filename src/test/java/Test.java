import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import response.user.LoginResp;
import util.ApiServiceFactory;
import util.Tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ant
 * Create by Ant on 2020/2/17 2:25 下午
 * mac
 */
public class Test {

    public static Logger LOG= LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {
        LoginResp loginResp= ApiServiceFactory.getService()
                                              .login("20181004095","fengge123");
        String token=loginResp.getToken();
        LOG.info("{}",loginResp);
//        LOG.info("{}",util.ApiServiceFactory.getService().getDateInfo(token, "2019-10-29"));
//        LOG.info("{}",util.ApiServiceFactory.getService().getEmptyClassroomResult(token, "2019-10-29", "allday"));
//        LOG.info("{}",util.ApiServiceFactory.getService().getCampusResult(token));
//        LOG.info("{}",util.ApiServiceFactory.getService().getCourseResult(token, "20181004095", "2019-2020-1", 5));
  //     LOG.info("{}",util.ApiServiceFactory.getService().getCourseScoreResult(token, "20181004095", ""));
 //       LOG.info("{}",util.ApiServiceFactory.getService().getSchoolYearResult(token, "20181004095"));
//        LOG.info("{}",util.ApiServiceFactory.getService().getBuildingResult(token, 3));
//        LOG.info("{}",util.ApiServiceFactory.getService().getUserInfo(token, "20181004095"));
//
        System.out.println(Tools.getCurrentSchoolYear(token, "20181004095"));
    }

    public static class  Demotest{
        public static void main(String[] args) {
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-DD");
            System.out.println(dateFormat.format(new Date()));
        }
    }
}
