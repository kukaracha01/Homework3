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

       byte numberOfBottle = 16;
       byte numberOfMinutes = 2;
       long workingHours = 20L;
       long numberOfBottleAfterWork = workingHours * numberOfBottle / numberOfMinutes;
       System.out.println("За " + workingHours + " минут машина произвела " + numberOfBottleAfterWork + " штук бутылок");
       byte minutePerHour = 60;
       byte hoursPerDay = 24;
       workingHours = minutePerHour * hoursPerDay;
       numberOfBottleAfterWork = workingHours * numberOfBottle / numberOfMinutes;
       System.out.println("За " + workingHours + " минут машина произвела " + numberOfBottleAfterWork + " штук бутылок");
       byte days = 3;
       workingHours = workingHours * days;
       numberOfBottleAfterWork = workingHours * numberOfBottle / numberOfMinutes;
       System.out.println("За " + workingHours + " минут машина произвела " + numberOfBottleAfterWork + " штук бутылок");
       byte daysPerMonth = 30;
       workingHours = minutePerHour * hoursPerDay * daysPerMonth;
       numberOfBottleAfterWork = workingHours * numberOfBottle / numberOfMinutes;
       System.out.println("За " + workingHours + " минут машина произвела " + numberOfBottleAfterWork + " штук бутылок");

       byte totalCansOfPaintNeeded = 120;
       byte cansOfWhitePaintForOneClass = 2;
       byte cansOfBrownPaintForOneClass = 4;
       int numberOfClasses = totalCansOfPaintNeeded / (cansOfWhitePaintForOneClass + cansOfBrownPaintForOneClass);
       int cansOfWhitePaintForSchool = numberOfClasses * cansOfWhitePaintForOneClass;
       int cansOfBrownPaintForSchool = numberOfClasses * cansOfBrownPaintForOneClass;
       System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + cansOfWhitePaintForSchool + " банок белой краски и " + cansOfBrownPaintForSchool + " банок коричневой краски");

       byte numberOfBananas = 5;
       byte weightOfOneBananaGr = 80;
       short amountOfMilkMl = 200;
       byte milkWeightIn100MlGr = 105;
       byte milk100Ml = 100;
       byte numberOfIceCreamBriquettes = 2;
       byte weightOfOneIceCreamBriquetteGr = 100;
       byte numberOfEggs = 4;
       byte weightOfOneEggGr = 70;
       int weightOfBreakfastGr = (numberOfBananas * weightOfOneBananaGr) + (amountOfMilkMl * milkWeightIn100MlGr / milk100Ml) + (numberOfIceCreamBriquettes * weightOfOneIceCreamBriquetteGr) + (numberOfEggs * weightOfOneEggGr);
       System.out.println("Вес спортзавтрака равен " + weightOfBreakfastGr + " грамм");
       short numberOfGrInOneKg = 1000;
       float weightOfBreakfastKg = (float) weightOfBreakfastGr / numberOfGrInOneKg;
       System.out.println("Вес спортзавтрака равен " + weightOfBreakfastKg + " килограмма");

       numberOfGrInOneKg = 1000;
       byte weightToResetKg = 7;
       short minWeightLossPerDayGr = 250;
       short maxWeightLossPerDayGr = 500;
       int maxNumberOfDayForReset = (weightToResetKg * numberOfGrInOneKg) / minWeightLossPerDayGr;
       System.out.println("Максимально для сброса веса нужно " + maxNumberOfDayForReset + " дней");
       int minNumberOfDayForReset = (weightToResetKg * numberOfGrInOneKg) / maxWeightLossPerDayGr;
       System.out.println("Минимально для сброса веса нужно " + minNumberOfDayForReset + " дней");
       int daysOnAverageForReset = (minNumberOfDayForReset + maxNumberOfDayForReset) / 2;
       System.out.println("В среднем для сброса веса нужен " + daysOnAverageForReset + " день");



    }
}