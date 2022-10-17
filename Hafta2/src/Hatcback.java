public class Hatcback extends Cars{
    @Override
    public int dailyRent(int day) {
        return day * super.getDailyRentPrice();
    }

}

