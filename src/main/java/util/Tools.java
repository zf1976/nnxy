package util;


import response.SchoolYearResp;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ant
 * Create by Ant on 2020/4/4 上午11:22
 */
public class Tools {
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
}
