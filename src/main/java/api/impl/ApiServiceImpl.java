package api.impl;


import api.ApiService;
import api.ApiHttpInterface;
import api.param.Param;
import response.*;
import okhttp3.OkHttpClient;
import response.campus.CampusInfo;
import response.classroom.EmptyClassroomsInfo;
import response.classroom.EmptyClassroomsResult;
import response.classroom.EmptyClassroom;
import response.course.CourseInfoResp;
import response.course.CourseScore;
import response.course.CourseScoreResult;
import response.user.LoginResp;
import response.user.UserInfoResp;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Create by Ant on 2020/2/16 1:55 下午
 * mac
 * @author ant
 */
public class ApiServiceImpl implements ApiService {

    private static ApiHttpInterface INTERFACE;

    static {
            Retrofit retrofit= new Retrofit.Builder()
                    .baseUrl("http://jw.nnxy.cn")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(new OkHttpClient()).build();
            INTERFACE=retrofit.create(ApiHttpInterface.class);
    }

    public LoginResp login(String xh, String pwd) {
        return executeCall(INTERFACE.login("authUser",xh,pwd));
    }

    public DateInfoResp getDateInfo(String token, Date date) {
        return executeCall(INTERFACE.getDateInfo(token,"getBuildingList",new SimpleDateFormat("yyyy-MM-DD").format(date)));
    }

    public DateInfoResp getDateInfo(String token, String date) {
        return executeCall(INTERFACE.getDateInfo(token,"getCurrentTime",date));
    }

    public CourseScoreResult<CourseScore> getCourseScoreList(String token, String xh, String dateId) {
        return executeCall(INTERFACE.getScore(token,"getCjcx",xh,dateId));
    }

    public CourseScoreResult<CourseScore> getCourseScoreList(String token, String xh, Param.COURSE dateId) {
        return executeCall(INTERFACE.getScore(token,"getCjcx",xh,dateId.value));
    }

    public List<SchoolYearResp> getSchoolYearList(String token, String xh) {
        return executeCall(INTERFACE.getSchoolYear(token,"getXnxq",xh));
    }

    public List<CourseInfoResp> getCourseInfoList(String token, String xh, String xnxqid, int zc) {
        return executeCall(INTERFACE.getCourseInfo(token,"getKbcxAzc",xh,xnxqid,zc));
    }

    public UserInfoResp getUserInfo(String token, String xh) {
        return executeCall(INTERFACE.getUserInfo(token,"getUserInfo",xh));
    }

    public EmptyClassroomsResult<EmptyClassroomsInfo<EmptyClassroom>> getEmptyClassroomList(String token, String time, String idleTime) {
        return executeCall(INTERFACE.getEmptyInfo(token,"getKxJscx",time,idleTime));
    }

    public List<CampusInfo> getCampusList(String token) {
        return executeCall(INTERFACE.getCampusInfo(token,"getXqcx"));
    }

    public List<BuildingInfo> getBuildingList(String token, int xqid) {
        return executeCall(INTERFACE.getBuildingList(token,"getJxlcx",xqid));
    }

    <T> T executeCall(Call<T> call){
            try {
              return  call.execute().body();
            } catch (IOException e) {
                e.printStackTrace();
            }
       return null;
    }
}
