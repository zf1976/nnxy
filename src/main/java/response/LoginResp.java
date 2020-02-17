package response;

import lombok.Data;

/**
 * 登陆用户
 * @date 2020/1/16 下午2:23
 */
@Data
public class LoginResp {

    /**
     * 是否登陆成功 1 0
     */
    private boolean success;

    /**
     * 令牌
     */
    private String token;

    /**
     * 登陆用户
     */
    private LoginUser user;

    /**
     * 用户类别 已知学生身份为2
     */
    private Integer usertype;

    /**
     * 用户真实姓名
     */
    private String userrealname;

    /**
     * 用户所属学院名称
     */
    private String userdwmc;

}
