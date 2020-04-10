package api.intercepter;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * @author ant
 * Create by Ant on 2020/4/10 下午5:31
 */
public class ApiIntercepter implements Interceptor {
    private static Logger LOG= LoggerFactory.getLogger(ApiIntercepter.class);
    @Override
    public Response intercept(Chain chain) throws IOException {
        final Request request = chain.request();
        LOG.info("===============================================================");
        LOG.info("请求方法：{}",request.method());
        LOG.info("请求URL：{}",request.url());
        LOG.info("===============================================================");
        final Response response = chain.proceed(request);
        LOG.info("Response Message：{}",response.message());
        return response;
    }
}
