import java.util.Random;

public class GetRandomNum {

    public static int getNumber(int low, int high){

        Random randomNum = new Random();
        int randomNumber = randomNum.nextInt(high - low) + low;
        return randomNumber;
    }
}

