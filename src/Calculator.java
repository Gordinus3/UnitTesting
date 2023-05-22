import java.util.Scanner;

public class Calculator {
    Scanner scan = new Scanner(System.in);
    public double power(int x, int y){
        return Math.pow(x,y);
    }
    public double factorial(int x){
        int num = x;
        if(x==0||x==1){
            return 1;
        }
        else{
            for(int i=1;i<x;i++){
                num = num*i;
            }
            return num;
        }
    }
    public boolean palindrome(String word){
        String reverse ="";
        for(int i=word.length()-1;i>=0;i--){
            reverse = reverse + word.charAt(i);
        }
        if(word.equals(reverse)){
            return true;
        }
        return false;
    }
    public void Sort(int[] arrays){
        for (int i=0; i < arrays.length-1 ;i++){
            for(int j=0 ; j< arrays.length-i - 1; j++){

                if(arrays[j+1] < arrays[j]){
                    int swap = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = swap;
                }
            }
        }
        Display(arrays);
    }
    public void Display(int[] array){
        for (int i=0;i<array.length; i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }
    public Boolean Sorted(int[] array){
        for(int i=0; i< array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.power(3,4));
        System.out.println(calculator.factorial(5));
        System.out.println(calculator.palindrome("racecar"));
        int[] yes = {7,3,5};
        calculator.Sorted(yes);
    }
}
