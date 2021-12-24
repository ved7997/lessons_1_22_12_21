package ru.skypro;

public class Main {

    public static void main(String[] args) {
            long lo = 7580;
            int  in = 214748364;
            float fl = 3.4f;
            double le = 1.7;
            char ch = 65535;
            byte by = 127;
            boolean ist = true;
            short sh = 3;// write your code here

        double  box1 = 78.2;
        double  box2 = 82.7;
        double sum = box1 + box2;
        double  su = box2 - box1;
//        double   m = box1 + box2;
        System.out.println("Общий вес двух бойцов " + sum + " кг" );
        System.out.println("Разница между весами бойцов " + su + " кг" );
//        System.out.println("Общий вес двух бойцов " + sum + " кг" );


        int banan = 80;
        int bananKol = 5;

        int milkKol = 2;
        int milk = 105;

        int iceKol = 2 ;
        int ice = 100;

        int eggsKol = 4;
        int eggs = 70;
            double sumSum = ((banan * bananKol) + (milk * milkKol) + (ice * iceKol) + (eggs * eggsKol));
            double sumBrec = sumSum / 1000;
                    System.out.println("Вес завтрака " + sumBrec + " кг");
        int j =0;
        for (int i = 78200;i >=(78200-7000); i = i - 250){
             j = j + 1;

        }
            System.out.println(j - 1 + " Дней, если 250г.");
                int jj =0;
                for (int i = 78200;i >=(78200-7000); i = i - 500) {
                    jj = jj + 1;
                }
                System.out.println(jj - 1 + " Дней, если 500г.");
                System.out.println((j + jj)/2 + " среднее кол-во дней");

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
        System.out.println("Кристина теперь получает " + zpKristinaPov + "рублей. Годовой доход вырос на " + rostKristinaG + "рублей");
    }
}