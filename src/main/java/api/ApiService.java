package api;

import api.param.Param;
import response.*;
import response.campus.CampusInfo;
import response.classroom.EmptyClassroomsInfo;
import response.classroom.EmptyClassroomsResult;
import response.classroom.EmptyClassroom;
import response.course.CourseInfoResp;
import response.course.CourseScore;
import response.course.CourseScoreResult;
import response.user.LoginResp;
import response.user.UserInfoResp;

import java.util.Date;
import java.util.List;

/**
 * Create by Ant on 2020/2/16 1:54 下午
 * mac
 * @author ant
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
     * @return DateInfoResp
     */
    DateInfoResp getDateInfo(String token, Date date);

    /**
     * 获取时间信息
     *
     * @param token token
     * @param date 格式为"YYYY-MM-DD"
     * @return DateInfoResp
     */
    DateInfoResp getDateInfo(String token, String date);

    /**
     * 查询成绩
     * @param token token
     * @param xh 学号
     * @param dateId 格式为"YYYY-MM-DD"
     * @return CourseScoreResult<CourseScore>
     */
    CourseScoreResult<CourseScore> getCourseScoreList(String token, String xh, String dateId);

    /**
     * 查询成绩
     *
     * @param token token
     * @param xh 学号
     * @param dateId 格式为"YYYY-MM-DD"
     * @return CourseScoreResult<CourseScore>
     */
    CourseScoreResult<CourseScore> getCourseScoreList(String token, String xh, Param.COURSE dateId);


    /**
     * 获取学年列表
     *
     * @param token token
     * @param xh 学号
     * @return List<SchoolYearResp>
     */
    List<SchoolYearResp> getSchoolYearList(String token, String xh);

    /**
     * 获取课程信息列表
     *
     * @param token token
     * @param xh 学号
     * @param xnxqid 学年Id
     * @param zc 周次
     * @return List<CourseInfoResp>
     */
    List<CourseInfoResp> getCourseInfoList(String token, String xh, String xnxqid, int zc);

    /**
     * 获取用户信息
     *
     * @param token token
     * @param xh 学号
     * @return UserInfoResp
     */
    UserInfoResp getUserInfo(String token, String xh);

    /**
     * 获取空教室信息列表
     * @param token token
     * @param time 格式"YYYY-MM-DD",非必填，默认返回当前日期空闲教室
     * @param idleTime 有allday,am,pm,night,0102(意为第一小节-第二小节,也可以是任意取值，
     *                 当取值为0104的时候与am等效)5种取值，默认值allday
     * @return EmptyClassroomsResult<EmptyClassroomsInfo<EmptyClassroom>>
     */
    EmptyClassroomsResult<EmptyClassroomsInfo<EmptyClassroom>> getEmptyClassroomList(String token, String time, String idleTime);

    /**
     * 获取校区信息
     * @param token token
     * @return List<BuildingInfo>
     */
    List<CampusInfo> getCampusList(String token);

    /**
     * 校区教学楼信息
     * @param token token
     * @param xqid 校区id
     * @return List<BuildingInfo>
     */
    List<BuildingInfo> getBuildingList(String token, int xqid);

}
