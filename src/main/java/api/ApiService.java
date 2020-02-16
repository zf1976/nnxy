package api;

import response.*;
import response.score.result.CourseScoreResp;
import response.score.result.CourseScoreResult;
import response.login.info.LoginResp;

import java.util.Date;
import java.util.List;

/**
 * Create by Ant on 2020/2/16 1:54 下午
 * mac
 */
public interface ApiService {
    /**
     * 用户登录
     *
     * @param xh 学号
     * @param pwd 密码
     * @return {@link LoginResp}
     */
    LoginResp login(String xh, String pwd);

    /**
     * 获取时间信息
     *
     * @param token token
     * @param date 格式为"YYYY-MM-DD"
     * @return {@link DateInfoResp}
     */
    DateInfoResp getDateInfo(String token, Date date);

    /**
     * 获取时间信息
     *
     * @param token token
     * @param date 格式为"YYYY-MM-DD"
     * @return {@link DateInfoResp}
     */
    DateInfoResp getDateInfo(String token, String date);

    /**
     * 查询成绩
     *
     * @param token token
     * @param xh 学号
     * @param dateId 学年Id
     * @return
     */
    CourseScoreResult<List<CourseScoreResp>> getCourseScoreList(String token, String xh, String dateId);

    /**
     * 获取学年列表
     *
     * @param token token
     * @param xh 学号
     * @return {@link SchoolYearResp}
     */
    List<SchoolYearResp> getSchoolYearList(String token, String xh);

    /**
     * 获取课程信息
     *
     * @param token token
     * @param xh 学号
     * @param xnxqid 学年Id
     * @param zc 周次
     * @return {@link CourseInfoResp}
     */
    List<CourseInfoResp> getCourseInfoList(String token, String xh, String xnxqid, int zc);

    /**
     * 获取用户信息
     *
     * @param token token
     * @param xh 学号
     * @return {@link UserInfoResp}
     */
    UserInfoResp getUserInfo(String token, String xh);
}
