import java.time.LocalDate;

public class LocalDateandTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate Tomorrow = date.plusDays(1);
        System.out.println("Today date:"+date);
        System.out.println("Yesterday date:" + yesterday);
        System.out.println("Tomorrow date:" + Tomorrow);

    }   
}