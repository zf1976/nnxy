package api.response;

import lombok.Data;

/**
 * 学期年份
 * @date 2020/1/16 下午3:15
 */
@Data
public class SchoolYearResp {

    /**
     * 是否是当前学期
     */
    String isdqxq;

    /**
     * 学年名称  2021-2022-2
     */
    String xqmc;

    /**
     * 学年ID  2021-2022-2
     */
    String xnxq01id;


}
