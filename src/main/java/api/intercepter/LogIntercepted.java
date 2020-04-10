package api.intercepter;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

/**
 * @author ant
 * Create by Ant on 2020/4/10 下午5:31
 */
public class LogIntercepted implements Interceptor {
    private static Logger LOG= LoggerFactory.getLogger(LogIntercepted.class);
    @Override
    public Response intercept(Chain chain) throws IOException {
        final Request request = chain.request();
        final Response response = chain.proceed(request);
        LOG.info("|------------------------------------------------------------|");
        LOG.info("|request time：{}",new Date());
        LOG.info("|request method：{}",request.method());
        LOG.info("|request URL：{}",request.url());
        LOG.info("|request address：{}", InetAddress.getLocalHost().getHostAddress());
        LOG.info("|localhost：{}",InetAddress.getLocalHost().getHostName());
        LOG.info("|is https：{}",request.isHttps());
        LOG.info("|isSuccessful：{}",response.isSuccessful());
        LOG.info("|response message：{}",response.message());
        LOG.info("|response:{}",response.toString());
        LOG.info("|------------------------------------------------------------|\n");
        return response;
    }
}
