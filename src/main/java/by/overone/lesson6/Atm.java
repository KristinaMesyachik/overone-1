package by.overone.lesson6;

import java.util.Scanner;

public class Atm {
    private int count20;
    private int count50;
    private int count100;
    private int totalCash;
    private static final Scanner scan = new Scanner(System.in);

    public Atm() {
        System.out.println("Ввод количества купюр номиналом 20, находящихся в банкомате:");
        do {
            if (count20 < 0) {
                System.out.println("Некорректный ввод, повторите попытку:");
            }
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку:");
                scan.next();
            }
            this.count20 = scan.nextInt();
        } while (count20 < 0);

        System.out.println("Ввод количества купюр номиналом 50, находящихся в банкомате:");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку:");
                scan.next();
            }
            this.count50 = scan.nextInt();
        } while (count50 < 0);

        System.out.println("Ввод количества купюр номиналом 100, находящихся в банкомате:");
        do {
            while (!scan.hasNextInt()) {
                System.out.println("Некорректный ввод, повторите попытку:");
                scan.next();
            }
            this.count100 = scan.nextInt();
        } while (count100 < 0);

        this.totalCash = count20 * 20 + count50 * 50 + count100 * 100;
    }

    public Atm(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        this.totalCash = count20 * 20 + count50 * 50 + count100 * 100;
    }

    public int getCount20() {
        return count20;
    }

    public void setCount20(int count20) {
        this.count20 = count20;
    }

    public int getCount50() {
        return count50;
    }

    public void setCount50(int count50) {
        this.count50 = count50;
    }

    public int getCount100() {
        return count100;
    }

    public void setCount100(int count100) {
        this.count100 = count100;
    }

    public int getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(int totalCash) {
        this.totalCash = totalCash;
    }

    public void increaseCount20(int count20) {
        this.count20 += count20;
        this.totalCash += count20 * 20;
    }

    public void increaseCount50(int count50) {
        this.count50 += count50;
        this.totalCash += count50 * 50;
    }

    public void increaseCount100(int count100) {
        this.count100 += count100;
        this.totalCash += count100 * 100;
    }

    public boolean outputCash(int sum) {
        if (sum <= 800 && sum >= 20 && sum != 30 && sum <= this.totalCash && sum % 10 == 0) {
            int[] nominal = {20, 50, 100};
            int[] count = new int[3];
            int index = 0;

            if (sum >= 100) {
                if ((sum % 100 == 10 || sum % 100 == 30 || sum % 100 == 70) && this.count50 == 0) {
                    System.out.println("В банкомате недостаточно купюр для выдачи");
                    return false;
                } else if (sum % 100 == 10 || sum % 100 == 30) {
                    count[index] = (sum - 50) / nominal[index];
                    count[index + 1]++;
                    if (count[index] >= 5) {
                        count[index + 2] = count[index] / 5;
                        count[index] = count[index] - count[index + 2] * 5;
                    }
                } else if (sum % 100 == 60 || sum % 100 == 80) {
                    count[index + 1]++;
                    sum = sum - 50;
                    count[index] = (sum - 50) / nominal[index];
                    count[index + 1]++;
                    if (count[index] >= 5) {
                        count[index + 2] = count[index] / 5;
                        count[index] = count[index] - count[index + 2] * 5;
                    }
                } else {
                    index = 2;
                    while (index != -1) {
                        count[index] = sum / nominal[index];
                        sum %= nominal[index];
                        index--;
                    }
                }
            } else {
                index = 1;
                while (index != -1) {
                    count[index] = sum / nominal[index];
                    sum %= nominal[index];
                    index--;
                }
            }


            if (count[0] > this.count20 || count[1] > this.count50 || count[2] > this.count100) {
                System.out.println("В банкомате недостаточно купюр для выдачи");
                return false;
            } else {

                for (int i = 0; i < count.length; i++) {
                    System.out.printf("Номинал в %d руб. = %d куп.\n", nominal[i], count[i]);
                }
            }
            return true;
        } else System.out.println("Операция не проведена");
        return false;
    }
}
