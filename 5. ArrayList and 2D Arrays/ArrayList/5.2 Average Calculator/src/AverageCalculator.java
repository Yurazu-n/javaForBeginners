import java.util.ArrayList;

public class AverageCalculator
{
    public static double getAverageOf (ArrayList<Integer> numbers)
    {
        double result = 0;

        for (int number: numbers){
            result += number;
        }
        return result/numbers.size();
    }
}