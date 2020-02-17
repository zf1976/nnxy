package http;

import response.CampusInfoForEmptyClassroom;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import response.*;

import java.util.List;

/**
 * Create by Ant on 2020/2/16 2:09 下午
 * mac
 */
public interface ApiHttpInterface {

    @GET("/app.do")

    Call<LoginResp> login(@Query("method")String method,
                          @Query("xh")String xh,
                          @Query("pwd")String pwd);

    @GET("/app.do")
    Call<CourseScoreResult<List<CourseScore>>> getScore(@Header("token")String token,
                                                        @Query("method")String method,
                                                        @Query("xh")String xh);
    @GET("/app.do")
    Call<List<SchoolYearResp>> getSchoolYear(@Header("token")String token,
                                                             @Query("method")String method,
                                                             @Query("xh")String xh);
    @GET("/app.do")
    Call<DateInfoResp> getDateInfo(@Header("token")String token,
                                   @Query("method")String method,
                                   @Query("currDate")String currDate);

    @GET("/app.do")
    Call<List<CourseInfoResp>> getCourseInfo(@Header("token")String token,
                                             @Query("method")String method,
                                             @Query("xh") String xh,
                                             @Query("xnxqid") String xnxqid,
                                             @Query("zc") Integer zc);
    @GET("/app.do")
    Call<UserInfoResp> getUserInfo(@Header("token")String token,
                                   @Query("method")String method,
                                   @Query("xh")String xh);

    @GET("/app.do")
    Call<List<CampusInfo>> getCampusInfo(@Header("token")String token,
                                         @Query("method")String method);

    @GET("/app.do")
    Call<EmptyClassrommResult<List<CampusInfoForEmptyClassroom<List<EmptyClassroom>>>>> getEmptyInfo(@Header("token")String token,
                                                                                                 @Query("method")String method,
                                                                                                 @Query("time")String time,
                                                                                                 @Query("idleTime")String idleTime);
    @GET
    Call<List<TeachBuildInfo>> getTeachingBuildingInfo(@Header("token")String token,
                                                       @Query("method")String method,
                                                       @Query("xqid")Integer xqid);

}
