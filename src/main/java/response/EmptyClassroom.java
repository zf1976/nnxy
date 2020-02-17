package response;

import lombok.Data;

/**
 * 获取空教室信息
 * Create by Ant on 2020/2/16 10:39 下午
 * mac
 */
@Data
public class EmptyClassroom {
    private String jsid;
    private String jzwid;
    private String jsmc;
    private Integer zws;
    private String xqmc;
    private String jsh;
    private String jzwmc;
    private Integer yxzws;
}
