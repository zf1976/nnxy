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

        // 所有学期，对于查周默认为空
        ALL,

        //当前学期
        CURRENT;

        private String value;

        DATE() {
            this.value="";
        }

        public String getValue() {
            return value;
        }
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

     public enum GRADE{

         //参数1
         JK,
         //参数2
         SM,
         //参数3
         RJ

     }

     public enum CLASS{

         //计科1班
         JK_ONE("计科1.txt"),
         //计科2班
         JK_TWO("计科2.txt"),
         //数媒1班
         SM_ONE("数媒1.txt"),
         //数媒2班
         SM_TWO("数媒2.txt"),
         //软件1班
         RJ_ONE("软件1.txt"),
         //软件2班
         RJ_TWO("软件2.txt"),
         //软件3班
         RJ_THREE("软件3.txt");

         public String value;
         CLASS(String value) {
             this.value=value;
         }
     }
}
