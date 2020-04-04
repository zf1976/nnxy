package api;

import response.classroom.EmptyClassroomsInfo;
import response.campus.CampusInfo;
import response.classroom.EmptyClassroomsResult;
import response.classroom.EmptyClassroom;
import response.course.CourseInfoResp;
import response.course.CourseScore;
import response.course.CourseScoreResult;
import response.user.LoginResp;
import response.user.UserInfoResp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import response.*;

import java.util.List;

/**
 * Create by Ant on 2020/2/16 2:09 下午
 * mac
 * @author ant
 */
public interface ApiHttpInterface {

    /**
     * 登陆
     *
     * @param method 请求头
     * @param xh 学号
     * @param pwd 密码
     * @return Call<LoginResp>
     */
    @GET("/app.do")
    Call<LoginResp> login(@Query("method")String method,
                          @Query("xh")String xh,
                          @Query("pwd")String pwd);

    /**
     * 成绩
     *
     * @param token token
     * @param method 请求头
     * @param xh 学号
     * @param nxnxqid 学年id
     * @return Call<CourseScoreResult<CourseScore>>
     */
    @GET("/app.do")
    Call<CourseScoreResult<CourseScore>> getScore(@Header("token")String token,
                                                  @Query("method")String method,
                                                  @Query("xh")String xh,
                                                  @Query("xnxqid") String nxnxqid);

    /**
     * 学年列表
     *
     * @param token  token
     * @param method  请求头
     * @param xh 学号
     * @return Call<List<SchoolYearResp>>
     */
    @GET("/app.do")
    Call<List<SchoolYearResp>> getSchoolYear(@Header("token")String token,
                                             @Query("method")String method,
                                             @Query("xh")String xh);

    /**
     * 获取所提交的日期的时间、周次、学年等信息
     *
     * @param token token
     * @param method 请求头
     * @param currDate 格式为"YYYY-MM-DD"，必填，留空调用成功，但返回值均为null
     * @return Call<DateInfoResp>
     */
    @GET("/app.do")
    Call<DateInfoResp> getDateInfo(@Header("token")String token,
                                   @Query("method")String method,
                                   @Query("currDate")String currDate);

    /**
     * 课程信息
     *
     * @param token token
     * @param method 请求头
     * @param xh 学号
     * @param xnxqid 格式为"YYYY-YYYY-X"，非必填，不包含时返回当前日期所在学期课表
     * @param zc 必填（不知道什么鬼）周id
     * @return Call<List<CourseInfoResp>>
     */
    @GET("/app.do")
    Call<List<CourseInfoResp>> getCourseInfo(@Header("token")String token,
                                             @Query("method")String method,
                                             @Query("xh") String xh,
                                             @Query("xnxqid") String xnxqid,
                                             @Query("zc") Integer zc);

    /**
     * 用户信息
     *
     * @param token token
     * @param method 请求头
     * @param xh 学号
     * @return all<UserInfoResp>
     */
    @GET("/app.do")
    Call<UserInfoResp> getUserInfo(@Header("token")String token,
                                   @Query("method")String method,
                                   @Query("xh")String xh);

    /**
     * 教学楼信息
     *
     * @param token token
     * @param method 请求头
     * @return Call<List<CampusInfo>>
     */
    @GET("/app.do")
    Call<List<CampusInfo>> getCampusInfo(@Header("token")String token,
                                         @Query("method")String method);

    /**
     * 空教室
     *
     * @param token token
     * @param method 请求头
     * @param time 格式"YYYY-MM-DD",非必填，默认返回当前日期空闲教室
     * @param idleTime 有allday,am,pm,night,0102(意为第一小节-第二小节,也可以是任意取值，
     *                 当取值为0104的时候与am等效)5种取值，默认值allday
     * @return Call<EmptyClassroomsResult<EmptyClassroomsInfo<EmptyClassroom>>>
     */
    @GET("/app.do")
    Call<EmptyClassroomsResult<EmptyClassroomsInfo<EmptyClassroom>>> getEmptyInfo(@Header("token")String token,
                                                                                  @Query("method")String method,
                                                                                  @Query("time")String time,
                                                                                  @Query("idleTime")String idleTime);

    /**
     * 教学楼
     *
     * @param token token
     * @param method 请求头
     * @param xqid 校区id
     * @return Call<List<BuildingInfo>>
     */
    @GET("/app.do")
    Call<List<BuildingInfo>> getBuildingList(@Header("token")String token,
                                             @Query("method")String method,
                                             @Query("xqid")Integer xqid);

}
