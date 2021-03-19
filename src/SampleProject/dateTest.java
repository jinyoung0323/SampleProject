package SampleProject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateTest {

  public static void main(String[] args) {
    // 현재 날짜
    SimpleDateFormat now = new SimpleDateFormat("yyyy-MM-dd");
    Date time = new Date();
    String today = now.format(time);
    
    System.out.println(time);
    System.out.println(today);
    System.out.println(changeDateType(today));
    
  }
  
  public static int changeDateType(String day) {
    String[] yMd = day.split("-");
    String s = "";

    for (int i = 0; i < yMd.length; i++) {
      s = s.concat(yMd[i]);
    }
    int date = Integer.parseInt(s);
    return date;
  }

}
