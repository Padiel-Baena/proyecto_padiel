package tema3.EjerciciosMod3;

public class Utils {
    public static double miles2kilometers(double num){
        double change = num * 1.60934;
        return change;
    }
    public static double getTaxes(double money, int taxes){
        double devolver = 0;
        double calculate = (money * taxes)/100;
        devolver = Math.round(calculate*100) / 100.0;
        return devolver;
    }
    public static double getNetPrice(double money, int taxes){
        double devolver = 0;
        double calculate = (money * taxes)/100;
        devolver = money + calculate;
        devolver = Math.round(devolver*100) / 100.0;
        return devolver;
    }
}
