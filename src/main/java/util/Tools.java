package util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import response.SchoolYearResp;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ant
 * Create by Ant on 2020/4/4 上午11:22
 */
public class Tools {

    public static final Logger LOG = LoggerFactory.getLogger(Tools.class);

    public static String getCurrentSchoolYear(String token,String xh){
         List<SchoolYearResp> schoolYears = ApiServiceFactory.getService()
                                                             .getSchoolYearResult(token, xh);

         schoolYears = schoolYears.stream()
                                  .filter(year->{
                                     return "1".equals(year.getIsdqxq());
                                  })
                                  .collect(Collectors.toList());

        return schoolYears.get(0).getXnxq01id();
    }

    private static List<List<String>> getAllXhs() throws IOException {
        final File dir = new File(new File("").getCanonicalPath()+"/xh");
        final List<List<String>> collections = new ArrayList<>();
        if (dir.isDirectory()){

            final File[] files = dir.listFiles();
            List<String> xhs = null;
            assert files != null;

            for (File file : files){
                xhs=new ArrayList<String>();
                final FileInputStream fis = new FileInputStream(file);
                final BufferedInputStream bis = new BufferedInputStream(fis);
                int length;
                final byte[] bytes = new byte[1024];
                while((length=bis.read(bytes))!=-1){
                    final String xh = new String(bytes, 0, length);
                    xhs.add(xh);
                }
                collections.add(xhs);
            }
        }

        return collections;
    }

    public static List<String> getXhs(){
        return null;
    }

    public static void main(String[] args) {
        try {
            final List<String> list = getAllXhs().get(1);
            System.out.println(list.get(1));
            System.out.println(getAllXhs().size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
