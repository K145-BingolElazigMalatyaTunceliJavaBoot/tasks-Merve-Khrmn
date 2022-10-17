public class Sedan extends Cars implements MonthlyRentable {
    private int multiple;

    @Override
    public int monthlyRent(int day) {
        super.setDailyRentPrice(100);
        return super.getMonthlyRentPrice() * day * multiple;
    }
    @Override
    public int dailyRent(int day) {
        return day * super.getDailyRentPrice() * multiple;
    }
}
