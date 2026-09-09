import java.util.Calendar;

public class Ex07 {
    public static void main(String[] args) {

        // 0 남자 1 여자


        Week today = null;
        Calendar calendar = Calendar.getInstance();
        int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayofweek) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;
        }
        System.out.println(today);
        if(today == Week.SUNDAY){
            System.out.println("놀기");
        }else{
            System.out.println("공부");
        }
    }
}
