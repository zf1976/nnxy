package response;

import lombok.Data;

/**
 *
 * @date 2020/1/16 下午2:59
 */
@Data
public class CourseScoreResult<T> {
    private boolean success;
    private T result;
}
