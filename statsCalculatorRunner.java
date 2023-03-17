public class statsCalculatorRunner {
    public static void main(String[] args) {
        double data[]={1.0,2.0,3.0,4.0,5.0,6.0};
        statsCalculator myCalc = new statsCalculator(data);
        myCalc.print();
        myCalc.sortData();
        myCalc.printSorted();
        myCalc.printFiveNumberSummary();
        System.out.println("\nThe mean is " + myCalc.calculateMean());






    }
}
