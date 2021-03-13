package Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo02 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat d = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = new Date();
        System.out.println(date);
        String s = d.format(date);
        System.out.println(s);
        String str = "2021年11月11日";
        /*try {
            d.parse(str);
        } catch (ParseException e) {//捕抓异常
            e.printStackTrace();
        }*/
        String D = d.format(str);


    }
}
