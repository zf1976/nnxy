package response.course;

import lombok.Data;

import java.util.List;

/**
 *
 * @author ant
 * @date 2020/1/16 下午2:59
 */
@Data
public class CourseScoreResult<T> {
    private boolean success;
    private List<T> result;
}
