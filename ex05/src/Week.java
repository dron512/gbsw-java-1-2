public enum Week {
    MONDAY(0, "월요일"),
    TUESDAY(1, "화요일"),
    WEDNESDAY(2, "수요일"),
    THURSDAY(3, "목요일"),
    FRIDAY(4, "금요일"),
    SATURDAY(5, "토요일"),
    SUNDAY(6, "일요일");

    private int index;
    private String week;

    Week(int i, String dayweek) {
        this.index = i;
        this.week = dayweek;
    }
}
