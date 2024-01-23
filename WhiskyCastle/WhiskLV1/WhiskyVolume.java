package WhiskLV1;

import java.util.Scanner;



public class WhiskyVolume {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Whisky[] whiskies = new Whisky[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name of the whisky" + (1 + i));
            String name = scanner.nextLine();
            System.out.print("Enter the volume of the whisky" + (1 + i));
            double vol = scanner.nextDouble();
            System.out.print("Enter the score" + (1 + i));
            int score = scanner.nextInt();
            scanner.nextLine();

            whiskies[i] = new Whisky(name, score, vol);
        }
        WhiskySorter WVS = new WhiskySorter(whiskies,0);
        WVS.printSortedWhiskiesByScore();
    }
}
