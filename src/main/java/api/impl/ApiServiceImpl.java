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
import util.Tools;
import java.io.IOException;
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

    private static String id="";

    @Override
    public LoginResp login(String xh, String pwd) {
        id=xh;
        return executeCall(INTERFACE.login(Param.REQUEST.AUTH_USER.value,xh,pwd));
    }

    @Override
    public DateInfoResp getDateInfo(String token, Param.DATE date) {
        if (date==Param.DATE.CURRENT){
            String dateId = Tools.getCurrentSchoolYear(token,id);
            return executeCall(INTERFACE.getDateInfo(token,Param.REQUEST.CURRENT_TIME.value,dateId));
        }
        return executeCall(INTERFACE.getDateInfo(token,Param.REQUEST.CURRENT_TIME.value,""));
    }


    @Override
    public CourseScoreResult<CourseScore> getCourseScoreResult(String token, String xh, Param.DATE dateId) {

        if (dateId == Param.DATE.CURRENT) {
            String date = Tools.getCurrentSchoolYear(token, xh);
            return executeCall(INTERFACE.getScore(token, Param.REQUEST.COURSE_SCORE.value, xh, date));
        }
        return executeCall(INTERFACE.getScore(token, Param.REQUEST.COURSE_SCORE.value, xh,""));
    }

    @Override
    public List<SchoolYearResp> getSchoolYearResult(String token, String xh) {
        return executeCall(INTERFACE.getSchoolYear(token,Param.REQUEST.SCHOOL_YEAR.value, xh));
    }

    @Override
    public List<CourseInfoResp> getCourseResult(String token, String xh, String xnxqid, int zc) {
        return executeCall(INTERFACE.getCourseInfo(token, Param.REQUEST.COURSE_INFO.value, xh, xnxqid, zc));
    }

    @Override
    public UserInfoResp getUserInfo(String token, String xh) {
        return executeCall(INTERFACE.getUserInfo(token,Param.REQUEST.USER_INFO.value,xh));
    }

    @Override
    public EmptyClassroomsResult<EmptyClassroomsInfo<EmptyClassroom>> getEmptyClassroomResult(String token, String time, String idleTime) {
        return executeCall(INTERFACE.getEmptyInfo(token,Param.REQUEST.EMPTY_CLASSROOM.value,time,idleTime));
    }

    @Override
    public List<CampusInfo> getCampusResult(String token) {
        return executeCall(INTERFACE.getCampusInfo(token,Param.REQUEST.CAMPUS.value));
    }

    @Override
    public List<BuildingInfo> getBuildingResult(String token, int xqid) {
        return executeCall(INTERFACE.getBuildingList(token,Param.REQUEST.BUILDING_INFO.value,xqid));
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
