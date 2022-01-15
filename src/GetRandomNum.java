import java.util.Random;

public class GetRandomNum {
    private static int low;
    private static int high;

    static {
        low = 70;
        high = 99;
    }

    public static int getNumber(){

        Random randomNum = new Random();
        System.out.println();
        int randomNumber = randomNum.nextInt(high-low) + low;
        System.out.println(randomNumber);
        return randomNumber;
    }
}

