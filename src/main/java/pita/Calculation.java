package pita;

public class Calculation {
    public int factorial(int number){
        int factorial = 1;
        while (number>0){
            factorial = factorial*number;
            number--;
        }

        return factorial;

    }

}
