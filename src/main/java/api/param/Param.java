package api.param;

import java.util.Date;

/**
 * @author ant
 * Create by Ant on 2020/4/2 下午11:37
 */
public class Param {

    /**
     * 学期
     */
    public enum DATE {

        /**
         * 所有学期，对于查周默认为空
         */
        ALL,

        /**
         * 当前学期
         */
        CURRENT
     }

     public enum REQUEST{
         //登陆请求头
         AUTH_USER("authUser"),

         //请求头
         CURRENT_TIME("currentTime"),

         //请求头
         COURSE_SCORE("getCjcx"),

         //请求头
         SCHOOL_YEAR("getXnxq"),

         //请求头
         COURSE_INFO("getKbcxAzc"),

         //请求头
         USER_INFO("getUserInfo"),

         //请求头
         EMPTY_CLASSROOM("getKxJscx"),

         //请求头
         CAMPUS("getXqcx"),

         //请求头
         BUILDING_INFO("getJxlcx");

         /**
          * value
          */
         public  String value;

         REQUEST(String value) {
             this.value=value;
         }
     }
}
