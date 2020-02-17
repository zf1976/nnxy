package api.response;

import lombok.Data;

/**
 * 周信息
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
    private String e_time;

    /**
     * 本周开始时间
     */
    private String s_time;

    /**
     * 学年学期名称
     */
    private String xnxqh;

}
