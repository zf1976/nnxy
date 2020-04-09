package util;


import api.param.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import response.SchoolYearResp;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ant
 * Create by Ant on 2020/4/4 上午11:22
 */
public final class Tools {

    public static final Logger LOG = LoggerFactory.getLogger(Tools.class);

    private static Map<String,List<String>> map;

    private static int number;

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

    private static void initAllXhs() throws IOException {
        final File dir = new File(new File("").getCanonicalPath()+"/xh");
        if(map == null){
            map=new HashMap<>();
        }else {
            return;
        }
        List<String> xhList = null;
        if (dir.isDirectory()){
            final File[] files = dir.listFiles();
            assert files != null;
            number=0;
            for (File file : files){
                try (final FileInputStream fis = new FileInputStream(file);
                     final BufferedInputStream bis = new BufferedInputStream(fis)){

                    int length;
                    final byte[] bytes = new byte[1024];
                    length=bis.read(bytes);
                    final String replace = new String(bytes,0,length);
                    final String [] xhs = replace.split("\n");
                    xhList = new ArrayList<String>(Arrays.asList(xhs));
                    number+=xhList.size();
                    map.put(file.getName(),xhList);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        LOG.info("查询年级专业总人数：{}",number);
    }

    private static List<String> getClassHx(Param.CLASS clazz) throws IOException {
        if (map == null){
            initAllXhs();
        }
        return map.get(clazz.value);
    }

    public static List<String> getGradeHx(Param.GRADE grade) throws IOException {
        if (map == null){
            initAllXhs();
        }
        switch (grade){
            case JK:
                final List<String> jkGrade = map.get(Param.CLASS.JK_ONE.value);
                jkGrade.addAll(map.get(Param.CLASS.JK_TWO.value));
                return jkGrade;

            case RJ:
                final List<String> rjGrade = map.get(Param.CLASS.RJ_ONE.value);
                rjGrade.addAll(map.get(Param.CLASS.RJ_TWO.value));
                rjGrade.addAll(map.get(Param.CLASS.RJ_THREE.value));
                return rjGrade;

            case SM:
                final List<String> smGrade = map.get(Param.CLASS.SM_ONE.value);
                smGrade.addAll(map.get(Param.CLASS.SM_TWO.value));
                return smGrade;

            default:
                return null;
        }

    }
}
