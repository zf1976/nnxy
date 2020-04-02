package response.classroom;

import lombok.Data;

import java.util.List;

/**
 * @author ant
 * Create by Ant on 2020/2/17 2:03 下午
 * mac
 */
@Data
public class EmptyClassroomsInfo<T>{

        /**
         * 教学楼名称
         */
        private String jxl;

        /**
         * 教学楼信息列表
         */
        private List<T> jsList;

}
