import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StatsCalculator{

// declares private double arrays to be used in the calculate methods.
    private double[] values;

//default constructor,
    public  StatsCalculator(){
        this.values = new double[20];
    }

    // overloaded constructor with a parameter of a double array.
    public StatsCalculator(double values[]){
        this.values = values;
    }









// calculates the maximum value of the values array.
  //  @ return: max, an double variable.
    double  calculateMax() {
        double max =values[0];
        for (int i = 1; i < values.length; i++) {
            if(values[i] > max){
                max = values[i];

            }

        }
        return(max);
    }

    // calculates the minimum value in the values array
    // @return: min, a double variable
    public  double calculateMin() {
        double min =values[0];
        for (int i = 1; i < values.length; i++) {
            if(values[i] < min){
                min = values[i];

            }

        }
        return(min);
    }
// calculated the sum of all number in the values array
    // @ return: sum, a double variable

    public  double calculateSum(){
        double runningSum=0;
        for(int i = 0; i < values.length; i++){
            runningSum += values[i];


        }
        return(runningSum);
    }
// calculates the mean of the numbers in the values array
    // @ return: mean, a double variable
    public  double calculateMean(){
        double runningSum=0;
        double mean;
        for(int i = 0; i < values.length; i++){
            runningSum += values[i];


        }
        mean = runningSum/(values.length);
        return(mean);



    }

public double sortedValues[];

// sets sortedValue equal to the values array and then sorts the new array from least to greatest. Leaving values array unchanged
    public  void sortData (){
        int length = values.length;
        this.sortedValues= new double[length];
for(int i =0; i < length; i++){
    sortedValues[i]= values[i];
}





      Arrays.sort(sortedValues);

    }
// prints the values array that the user entered, in the order they entered them in
    public  void print(){
        System.out.println("You entered" );
        for(int i =0; i < values.length; i++){
            System.out.print(values[i]);
            System.out.print(" ");

        }
        System.out.println(" ");
    }
// prints the sortedValue array, which is the numbers the user entered sorted from least to greatest
    public  void printSorted(){
        System.out.println("The sorted array is: " );
        for(int i =0; i < values.length; i++){
            System.out.print(sortedValues[i]);
            System.out.print(" ");

        }
        System.out.println(" ");
    }


// calculates the median value of the values array
    // @ return: median, a double values
    public  double calculateMedian(){
        double median=0;
        int length = values.length;
        if(length%2==0){
            median=(((values[(length/2)-1]+(values[(length/2 )]))/2));

        }
        else{
            median=values[(length/2)];
        }

        return(median);
    }


// calculates the first quartile of the values array
    // @return: Q1, a double variable
    public  double calculateFirstQuartile() {
        int length = values.length;
        double indexOfQ1;
        double Q1 = 0.0;
        if (length % 2 == 1) {
            indexOfQ1 = ((length - 3) / 4.0);

            if (indexOfQ1 % 1 == 0) {

                Q1 = values[(int) indexOfQ1];
            } else {
                int firstPart = (int) (indexOfQ1 - 0.5);
                int secondPart = (int) (indexOfQ1 + 0.5);
                double firstHalf = values[firstPart];
                double secondHalf = values[secondPart];
                Q1 = (firstHalf + secondHalf) / 2;


            }

            return (Q1);
        }

        if (length % 2 == 0) {


            indexOfQ1 = ((length - 2) / 4.0);
            if (indexOfQ1 % 1 == 0) {
                Q1 = values[(int) indexOfQ1];
            }
            else {
                int firstPart = (int) (indexOfQ1 - 0.5);
                int secondPart = (int) (indexOfQ1 + 0.5);

                double firstHalf = values[firstPart];
                double secondHalf = values[secondPart];
                Q1 = (firstHalf + secondHalf) / 2;
            }

            return (Q1);
        }
        return(0);


    }

// calculates the third quartile of the values array
    // @return: Q3, a double variable
    public  double calculateThirdQuartile(){
        int length = values.length;
        double indexOfQ1;
        double indexOfQ3;
        double Q3=0.0;
        if(length%2==1) {
            indexOfQ1= ((length-3)/4.0);
            indexOfQ3=(length-1)-indexOfQ1;

            if(indexOfQ3 % 1 == 0){

                Q3 = values[(int) indexOfQ3];
            }
            else{
                int firstPart= (int) (indexOfQ3-0.5);
                int secondPart = (int) (indexOfQ3+0.5);
                double firstHalf=values[firstPart];
                double secondHalf=values[secondPart];
                Q3=(firstHalf+ secondHalf)/2;



            }

            return(Q3);
        }

        else{
            indexOfQ1= ((length-2)/4.0);
            indexOfQ3=(length-1)-indexOfQ1;
            if(indexOfQ1 % 1 == 0){
                Q3 = values[(int) indexOfQ3];
            }
            else{
                int firstPart= (int) (indexOfQ3-0.5);
                int secondPart = (int) (indexOfQ3+0.5);
                double firstHalf=values[firstPart];
                double secondHalf=values[secondPart];
                Q3=(firstHalf+ secondHalf)/2;
            }

            return(Q3);
        }



    }
    // prints out the min, Q1, median, Q3, and max values of the values array
    public void printFiveNumberSummary(){
        System.out.println("The five number summary is: ");
        System.out.print("Minimum: ");
        System.out.println(calculateMin());
        System.out.print("First quartile: ");
        System.out.println(calculateFirstQuartile());
        System.out.print("Median: ");
        System.out.println(calculateMedian());
        System.out.print("Third quartile: ");
        System.out.println(calculateThirdQuartile());
        System.out.print("Maximum: ");
        System.out.println(calculateMax());


    }









}
