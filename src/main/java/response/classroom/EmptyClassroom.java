package response.classroom;

import lombok.Data;

/**
 * 获取空教室信息
 * Create by Ant on 2020/2/16 10:39 下午
 * mac
 * @author ant
 */
@Data
public class EmptyClassroom {

    /**
     *教室ID，暂不明与jsh关系
     */
    private String jsid;

    /**
     * 所在楼id
     */
    private String jzwid;

    /**
     * 教室名称
     */
    private String jsmc;

    /**
     * 座位数
     */
    private Integer zws;

    /**
     *  校区名称
     */
    private String xqmc;

    /**
     * 教室号？意义未知
     */
    private String jsh;

    /**
     * 所在楼名称
     */
    private String jzwmc;

    /**
     * 未知，值与zws保持一致
     */
    private Integer yxzws;
}
