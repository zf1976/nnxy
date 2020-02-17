package response;

import lombok.Data;

/**
 * 用户信息
 * @date 2020/1/16 下午2:24
 */
@Data
public class LoginUser {
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户所属学院
     */
    private String userdwmc;

    /**
     * 用户类型
     */
    private Integer usertype;

    /**
     * 用户密码
     */
    private String userpasswd;

    /**
     * 用户学号
     */
    private String useraccount;

}
