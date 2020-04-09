import api.param.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import response.user.LoginResp;
import util.ApiServiceFactory;
import util.Tools;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ant
 * Create by Ant on 2020/2/17 2:25 下午
 * mac
 */
public class Test {

    public static Logger LOG= LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) throws IOException {
        Tools.getGradeHx(Param.GRADE.RJ).forEach(System.out::println);
    }
}
