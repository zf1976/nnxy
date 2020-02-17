package impl;


import http.ApiHttpInterface;
import response.*;
import okhttp3.OkHttpClient;
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
 */
public class ApiServiceIpml implements ApiService{

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
        return executeCall(INTERFACE.getDateInfo(token,"getCurrentTime",new SimpleDateFormat("YYYY-MM-DD").format(date)));
    }



    public DateInfoResp getDateInfo(String token, String date) {
        return executeCall(INTERFACE.getDateInfo(token,"getCurrentTime",date));
    }


    public CourseScoreResult<List<CourseScore>> getCourseScoreList(String token, String xh, String dateId) {
        return null;
    }


    public List<SchoolYearResp> getSchoolYearList(String token, String xh) {
        return null;
    }


    public List<CourseInfoResp> getCourseInfoList(String token, String xh, String xnxqid, int zc) {
        return null;
    }


    public UserInfoResp getUserInfo(String token, String xh) {
        return null;
    }


    public EmptyClassrommResult<List<List<CampusInfoForEmptyClassroom<List<EmptyClassroom>>>>> getEmptyClassroomList(String token, String method, String time, String idleTime) {
        return null;
    }

    public List<CampusInfo> getCampusList(String token, String method) {
        return null;
    }


    public List<TeachBuildInfo> getTeachBiuldList(String token, String method, Integer xqid) {
        return null;
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
