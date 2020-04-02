package response.campus;

import lombok.Data;

/**
 * 校区信息
 * Create by Ant on 2020/2/16 10:37 下午
 * mac
 * @author ant
 */
@Data
public class CampusInfo {

    /**
     *校区id
     */
    private Integer xqid;

    /**
     * 校区名称
     */
    private String xqmc;

}
