package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {

     double result = dividend / divider;
     double multiply = result * divider;

     if(multiply == dividend){
         System.out.println("can be divided completely");
     } else{
         System.out.println("cannot be divided completely");
     }


    }
}
