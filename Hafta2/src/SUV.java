public class SUV extends Cars implements MonthlyRentable {
    @Override
    public int monthlyRent(int day) {
        super.setDailyRentPrice(100);
        return super.getMonthlyRentPrice() * day ;
    }
    @Override
    public int dailyRent(int day) {
        return day * super.getDailyRentPrice();
    }
}
