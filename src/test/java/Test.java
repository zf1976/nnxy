import lombok.extern.slf4j.Slf4j;
import response.user.LoginResp;
import util.ApiServiceFactory;
import util.Tools;

/**
 * @author ant
 * Create by Ant on 2020/2/17 2:25 下午
 * mac
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        LoginResp loginResp= ApiServiceFactory.getService()
                                              .login("20181004095","fengge123");
        String token=loginResp.getToken();
//        LOG.info("{}",util.ApiServiceFactory.getService().getDateInfo(token, "2019-10-29"));
//        LOG.info("{}",util.ApiServiceFactory.getService().getEmptyClassroomResult(token, "2019-10-29", "allday"));
//        LOG.info("{}",util.ApiServiceFactory.getService().getCampusResult(token));
//        LOG.info("{}",util.ApiServiceFactory.getService().getCourseResult(token, "20181004095", "2019-2020-1", 5));
  //     LOG.info("{}",util.ApiServiceFactory.getService().getCourseScoreResult(token, "20181004095", ""));
 //       LOG.info("{}",util.ApiServiceFactory.getService().getSchoolYearResult(token, "20181004095"));
//        LOG.info("{}",util.ApiServiceFactory.getService().getBuildingResult(token, 3));
//        LOG.info("{}",util.ApiServiceFactory.getService().getUserInfo(token, "20181004095"));
//
        log.info("{}",Tools.getCurrentSchoolYear(token, "20181004095"));
    }

}
