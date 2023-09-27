public class HundredthPrime {
   public static void main(String[] args) {
      int oddCounter = 0;
      int currentNumber = 1;

      while (oddCounter != 100){
         currentNumber++;
         for (int divisor = 2; divisor <= currentNumber; divisor++){
            if (divisor == currentNumber){
               oddCounter++;
               break;
            }
            if (currentNumber % divisor == 0){
               break;
            }
         }
      }
      System.out.println(currentNumber);
   }
}