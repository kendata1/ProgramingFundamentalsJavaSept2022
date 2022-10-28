package MidExam;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class P01_TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        BigDecimal biscuitsInOtherFactory = new BigDecimal(scanner.nextLine());

        BigDecimal biscuitsInOurFactory = new BigDecimal(((biscuitsPerDay * workersCount) * 20) + (biscuitsPerDay * workersCount) * 0.75 * 10);

        System.out.printf("You have produced %.0f biscuits for the past month.%n", biscuitsInOurFactory);



        if (biscuitsInOurFactory.compareTo(biscuitsInOtherFactory) > 0){
            BigDecimal difference = biscuitsInOurFactory.subtract(biscuitsInOtherFactory);
            BigDecimal diffPercent = new BigDecimal ((difference.divide(biscuitsInOtherFactory));
            System.out.printf("You produce %.2f percent more biscuits.",diffPercent);
        } else {
            BigDecimal difference = biscuitsInOtherFactory.subtract(biscuitsInOurFactory);
            BigDecimal diffPercent = new BigDecimal ((difference.divide(biscuitsInOtherFactory));
            System.out.printf("You produce %.2f percent more biscuits.",diffPercent);
        }
    }
}
