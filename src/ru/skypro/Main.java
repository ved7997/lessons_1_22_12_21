package ru.skypro;

public class Main {
    public static void main(String[] args){
    //Задание №1
    long lo = 7580;
    int  in = 214748364;
    float fl = 3.4f;
    double le = 1.7;
    char ch = 65535;
    byte by = 127;
    boolean ist = true;
    short sh = 3;

    //Задание №2
    double  firstBoxer = 78.2;
    double  firstBoxer2 = 82.7;
    double sum = firstBoxer + firstBoxer2;
    double  sub = firstBoxer2 - firstBoxer;
        System.out.println("Общий вес двух бойцов " + sum + " кг" );
        System.out.println("Разница между весами бойцов " + sub + " кг" );

    int bananas = 80;
    int countOfBananas = 5;

    int milk = 105;
    int countOfMilk = 2;

    int ice = 100;
    int countOfice = 2;

    int eggs = 70;
    int countOfeggs = 4;

    double sumSum = ((bananas * countOfBananas) + (milk * countOfMilk) + (ice * countOfice) + (eggs * countOfeggs));
    double sumBrec = sumSum / 1000;
                    System.out.println("Вес завтрака " + sumBrec + " кг");

    //Задание №4
    int dietDays250 =  7000 / 250;
    int dietDays500 =  7000 / 500;
    int averageDays = (dietDays250 + dietDays500) / 2;
            System.out.println(dietDays250 + " Дней, если 250г.");
            System.out.println(dietDays500 + " Дней, если 500г.");
            System.out.println(averageDays + " среднее кол-во дней");

    //Задание №5
    double zpMasha = 67760;
    double zpDenis = 83690;
    double zpKristina = 76230;
    double zpMashaG = 67760 * 12;
    double zpDenisG = 83690 * 12;
    double zpKristinaG = 76230 * 12;
    double zpMashaPov = zpMasha * 1.1;
    double zpDenisPov = zpDenis + (zpDenis * 0.1);
    double zpKristinaPov = zpKristina * 1.1;
    double zpMashaPovG = zpMashaPov * 12;
    double zpDenisPovG = zpDenisPov * 12;
    double zpKristinaPovG = zpKristinaPov * 12;
    double rostMashaG = zpMashaPovG - zpMashaG;
    double rostDenisG = zpDenisPovG - zpDenisG;
    double rostKristinaG = zpKristinaPovG - zpKristinaG;
        System.out.println("Маша теперь получает " + zpMashaPov + "рублей. Годовой доход вырос на " + rostMashaG + "рублей");
        System.out.println("Денис теперь получает " + zpDenisPov + "рублей. Годовой доход вырос на " + rostDenisG + "рублей");
        System.out.println("Денис теперь получает " + zpKristinaPov + "рублей. Годовой доход вырос на " + rostKristinaG + "рублей");

        }
}