import java.util.Calendar;

public class Ex06 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        // 해당 요일 가져오기
        // 1 일요일 2 월요일 3 화요일 4 수요일 5 목요일 6 금요일 7 토요일
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        // 해당 날짜 가져오기
        System.out.println(calendar.get(Calendar.DATE));
        // 해당 월 가져오기 -> 월만 0월 부터 시작
        System.out.println(calendar.get(Calendar.MONTH)+1);
        // 해당 년 가져오기
        System.out.println(calendar.get(Calendar.YEAR));

        // javascript 일정관리 앱 ...쇼핑몰...

        // 해당 월의 마지막 날 가져오기
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
