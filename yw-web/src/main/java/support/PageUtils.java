package support;

import java.util.List;

public class PageUtils {
    private static  int pageSize =10;

    private static int getSize(){
        return pageSize;
    }
    public static int getStart(int pageNo ){
        return (pageNo-1)*pageSize;
    }

    public static <T>PageObject<T> newPageObeject( int  total, List<T> list ){
            PageObject<T> po = new PageObject<>();

            return  po;
    }
}
