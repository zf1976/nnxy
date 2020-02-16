package response.classroom.result;

import lombok.Data;

/**
 * Create by Ant on 2020/2/17 12:08 上午
 * mac
 */
@Data
public class EmptyClassrommResult<T> {
    private String xnxqid;
    private T  data;
}
