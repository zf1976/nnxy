package response.classroom.result;

import lombok.Data;

/**
 * Create by Ant on 2020/2/17 12:18 上午
 * mac
 */
@Data
public class CampusInfo<T>{
    private String jxl;
    private T jsList;
}
