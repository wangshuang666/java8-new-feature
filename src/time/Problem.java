package time;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Problem {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Future<Date>> list = new ArrayList<>();
        for (int i = 0; i <100; i++) {
            //submit有返回值 execute不能有返回值
            Future<Date> submit = executorService.submit(() -> sdf.parse("2021-04-18"));
            //放到集合里的目的是运行出下面的错误
            list.add(submit);
        }
        for (Future<Date> dateFuture : list) {
            System.out.println(dateFuture.get());
        }

        executorService.shutdown();
    }
}
