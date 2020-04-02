
package response.user;

import lombok.Data;

/**
 * 学生信息
 * @author ant
 */
@Data
public class UserInfoResp {
    /** 辅修专业*/
    private String fxzy;

    /** 学号*/
    private String xh;

    /** 姓名*/
    private String xm;

    /** */
    private String dqszj;

    /** 用户类型*/
    private String usertype;

    /** 院系名称*/
    private String yxmc;

    /** 学制*/
    private String xz;

    /** 班级*/
    private Object bj;

    /** 电话*/
    private String dh;

    /** 电子邮箱*/
    private String email;

    /** 入学年份*/
    private String rxnf;

    /** 性别*/
    private String xb;

    /** 高考考号*/
    private String ksh;

    /** 年级*/
    private Long nj;

    /** QQ号码*/
    private String qq;

    /** 专业名称*/
    private String zymc;
}
