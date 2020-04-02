package response;

import lombok.Data;

/**
 * 周信息
 * @author ant
 * @date 2020/1/16 下午2:39
 */
@Data
public class DateInfoResp {

    /**
     * 当前周次
     */
    private Integer zc;

    /**
     * 本周结束时间
     */
    private String eTime;

    /**
     * 本周开始时间
     */
    private String sTime;

    /**
     * 学年学期名称
     */
    private String xnxqh;

}
