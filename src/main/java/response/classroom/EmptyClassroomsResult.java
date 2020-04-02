package response.classroom;

import lombok.Data;

import java.util.List;

/**
 * 空教室result
 * Create by Ant on 2020/2/17 12:08 上午
 * mac
 * @author ant
 */
@Data
public class EmptyClassroomsResult<T> {

    /**
     * 不知道是什么鬼
     */
    private String xnxqid;

    /**
     * result
     */
    private List<T> data;

    /**
     * true false
     */
    private boolean success;
}
