package Demo01;
import java.util.Calendar;
import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date t = cal.getTime();
        System.out.println(t);
        cal.add(Calendar.DATE,48);
        cal.add(Calendar.WEEK_OF_MONTH,-1);
        cal.set(Calendar.DAY_OF_WEEK,5);
        Date time = cal.getTime();
        System.out.println(time);



    }
}
