package api.impl;

import api.ApiService;
import api.http.ApiHttpInterface;
import okhttp3.OkHttpClient;
import response.*;
import response.classroom.result.CampusInfo;
import response.classroom.result.EmptyClassrommResult;
import response.classroom.result.EmptyClassroom;
import response.score.result.CourseScore;
import response.login.info.LoginResp;
import response.score.result.CourseScoreResult;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Date;
import java.util.List;

/**
 * Create by Ant on 2020/2/16 1:55 下午
 * mac
 */
public class ApiServiceIpml implements ApiService {

    private static ApiHttpInterface INTERFACE;

    static {
            Retrofit retrofit= new Retrofit.Builder()
                    .baseUrl("http://jw.nnxy.cn")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(new OkHttpClient()).build();
            INTERFACE=retrofit.create(ApiHttpInterface.class);
    }
    /**
     * 用户登录
     *
     * @param xh  学号
     * @param pwd 密码
     * @return {@link LoginResp}
     */
    public LoginResp login(String xh, String pwd) {
        return null;
    }

    /**
     * 获取时间信息
     *
     * @param token token
     * @param date  格式为"YYYY-MM-DD"
     * @return {@link DateInfoResp}
     */
    public DateInfoResp getDateInfo(String token, Date date) {
        return null;
    }

    /**
     * 获取时间信息
     *
     * @param token token
     * @param date  格式为"YYYY-MM-DD"
     * @return {@link DateInfoResp}
     */
    public DateInfoResp getDateInfo(String token, String date) {
        return null;
    }

    /**
     * 查询成绩
     *
     * @param token  token
     * @param xh     学号
     * @param dateId 学年Id
     * @return
     */
    public CourseScoreResult<List<CourseScore>> getCourseScoreList(String token, String xh, String dateId) {
        return null;
    }

    /**
     * 获取学年列表
     *
     * @param token token
     * @param xh    学号
     * @return {@link SchoolYearResp}
     */
    public List<SchoolYearResp> getSchoolYearList(String token, String xh) {
        return null;
    }

    /**
     * 获取课程信息
     *
     * @param token  token
     * @param xh     学号
     * @param xnxqid 学年Id
     * @param zc     周次
     * @return {@link CourseInfoResp}
     */
    public List<CourseInfoResp> getCourseInfoList(String token, String xh, String xnxqid, int zc) {
        return null;
    }

    /**
     * 获取用户信息
     *
     * @param token token
     * @param xh    学号
     * @return {@link UserInfoResp}
     */
    public UserInfoResp getUserInfo(String token, String xh) {
        return null;
    }

    /**
     * 获取空教室信息列表
     *
     * @param token
     * @param method
     * @param time
     * @param idleTime
     * @return
     */
    public EmptyClassrommResult<List<List<CampusInfo<List<EmptyClassroom>>>>> getEmptyClassroomList(String token, String method, String time, String idleTime) {
        return null;
    }

    /**
     * 获取校区信息
     *
     * @param token
     * @param method
     * @return
     */
    public List<response.CampusInfo> getCampusList(String token, String method) {
        return null;
    }

    /**
     * 校区教学楼信息
     *
     * @param token
     * @param method
     * @param xqid
     * @return
     */
    public List<TeachBuildInfo> getTeachBiuldList(String token, String method, Integer xqid) {
        return null;
    }
}
