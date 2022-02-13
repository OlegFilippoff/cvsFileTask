package ru.netology;

public class BonusService {
    // подготавливаем данные:
    long amount = 1000;
    boolean registered = true;
    long expected = 30;

    public long calculate(long amount, boolean registered) {
        int percent = registered ? 3 : 1;
        long bonus = amount * percent / 100;
        long limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}

