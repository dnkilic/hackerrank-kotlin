package algorithms;

public class SmartNumber {

    public static boolean isSmartNumber(int num) {
        int val = (int) Math.sqrt(num);
        if(num == val * val)
            return true;
        return false;
    }
}
