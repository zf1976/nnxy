package api.response;

import lombok.Data;

/**
 * 课程成绩
 * @date 2020/1/16 下午2:53
 */
@Data
public class CourseScore {

    /**
     * 未知
     */
    private String bz;

    /**
     * 特殊情况通报，例如“作弊”“缺考”
     */
    private String cjbsmc;

    /**
     * 必修 课程类别名称
     */
    private String kclbmc;

    /**
     * 总成绩
     */
    private float zcj;

    /**
     * 学生姓名
     */
    private String xm;

    /**
     * 学期名称
     */
    private String xqmc;

    /**
     * 公共基础课
     */
    private String kcxzmc;

    /**
     * "College students career development and guidance",  课程英文名称
     */
    private String kcywmc;

    /**
     *  "正常考试",  考试性质名称,目前遇见的情况有正常考试，补考（x），重修（x），分别意为补考
     */
    private String ksxzmc;

    /**
     * "大学生职业发展与就业指导",  课程名称
     */
    private String kcmc;

    /**
     * "xf": 1  学分
     */
    private float xf;

}
