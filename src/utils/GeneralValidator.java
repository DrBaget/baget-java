package utils;

public class GeneralValidator {
    public static boolean checkCount(int count, int min, int max){
        return count <= max && count > min;
    };
}
