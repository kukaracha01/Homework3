public class Main {
    public static void main(String[] args) {
       byte theSmallest = 127;
       System.out.println("Значение переменной theSmallest с типом byte равно " + theSmallest);
       short nextAfterTheSmallest = 32767;
       System.out.println("Значение переменной nextAfterTheSmallest с типом short равно " + nextAfterTheSmallest);
       int theThirdYoungest = 32768;
       System.out.println("Значение переменной theThirdYoungest с типом int равно " + theThirdYoungest);
       long theRemainingOne = 77L;
       System.out.println("Значение переменной theRemainingOne с типом long равно " + theRemainingOne);
       float startWithADot = 12.33F;
       System.out.println("Значение переменной startWithADot с типом float равно " + startWithADot);
       double endWithADot = 4.74858965654;
       System.out.println("Значение переменной endWithADot с типом double равно " + endWithADot);

       short a = -159;
       double b = 2.786;
       float c = 27.12f;
       byte d = 67;
       int e = 569;
       short f = 27897;
       long g = 987678965549L;

       byte theFirstNumberOfStudents = 23;
       byte theSecondNumberOfStudents = 27;
       byte theThirdNumberOfStudents = 30;
       short totalAmountOfPaper = 480;
       int numberOfSheetsPerStudent = totalAmountOfPaper / (theFirstNumberOfStudents + theSecondNumberOfStudents + theThirdNumberOfStudents);
       System.out.println("На каждого ученика рассчитано " + numberOfSheetsPerStudent + " листов бумаги");


    }
}