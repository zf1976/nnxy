package response;

import lombok.Data;

/**
 * 某教学楼信息
 * Create by Ant on 2020/2/16 10:42 下午
 * mac
 * @author ant
 */
@Data
public class BuildingInfo {

    /**
     * 教学楼id
     */
    private String jzwid;

    /**
     * 教学楼名称
     */
    private String jzwmc;
}
