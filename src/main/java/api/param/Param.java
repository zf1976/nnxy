package api.param;

/**
 * @author ant
 * Create by Ant on 2020/4/2 下午11:37
 */
public class Param {

    /**
     * 成绩
     */
    public enum COURSE{
        //成绩默认
        DEFAULT("");
        public String value;

        COURSE(String value){
            this.value =value;
        }
     }
}
