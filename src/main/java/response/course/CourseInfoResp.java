
package response.course;

import lombok.Data;

/**
 * 课程信息
 * @author ant
 */
@Data
public class CourseInfoResp {
    /** 教师姓名 */
    private String jsmc;

    /** 教室名称*/
    private String jssj;

    /** 结束时间*/
    private String jsxm;

    /** 开始时间*/
    private String kcmc;

    /** 开课周次，有三种已知格式1)a-b、2)a,b,c、3)a-b,c-d*/
    private String kcsj;

    /** 课程时间，格式x0a0b，意为星期x的第a,b节上课*/
    private String kkzc;

    /** 课程名称*/
    private String kssj;

    /** 1时本课单周上，2时双周上*/
    private String sjbz;
}
