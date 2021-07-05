import api.param.Param;
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

    /**
     * 查询成绩demo
     */
    public static void main(String[] args) {
        LoginResp loginResp= ApiServiceFactory.getService()
                                              .login("20181004095","");
        String token=loginResp.getToken();
        log.info("{}",util.ApiServiceFactory.getService().getCourseScoreResult(token, "20181004095", Param.DATE.ALL));
    }

}
