public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    //Задача 1
    byte a = 12;
    short b = 2525;
    int c = 19200393;
    long d = 181283283232L;
    float e = 123.3f;
    double f = 28.1;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом byte равно " + c);
        System.out.println("Значение переменной d с типом byte равно " + d);
        System.out.println("Значение переменной e с типом byte равно " + e);
        System.out.println("Значение переменной f с типом byte равно " + f);

    //Задача 2
    double a = 27.12;
    long b = 987_678_965_549L;
    float c = 2.786f;
    short d = 569;
    int e = 27897;
    byte f = 67;

    //Задача 3
    byte lp = 23;
    byte as = 27;
    byte ea = 30;
    short total = 480;
        System.out.println(total / (lp + as + ea));
        System.out.println("На каждого ученика положено 6 листов бумаги");

    //Задача 4
    byte performanceIn2Minutes = 16;
    byte performance = (byte) (performanceIn2Minutes / 2);
    byte min20 = 20;
    byte perf20min = (byte) (performance * 20);
    byte hour24 = 24;
    int perf24hour = performance * 60 * 24;
    byte days3 = 3;
    int perf3days = perf24hour * 3;
    byte Month = 1;
    int perfMonth = perf24hour * 30;
        System.out.println("За " + min20 + " минут машина произвела " + performance * 20 + "бутылок");
        System.out.println("За " + hour24 + " часа машина произвела " + perf24hour + "бутылок");
        System.out.println("За " + days3 + " дня машина произвела " + perf3days + "бутылок");
        System.out.println("За " + Month + " месяц машина произвела " + perfMonth + "бутылок");

    //Задача 5
    byte totalJar = 120;
    byte white = 2;
    byte black = 4;
    int classCount = totalJar / (white + black);
    int whiteTotal = classCount * white;
    int blackTotal = classCount * black;
        System.out.println("В школе, где " + classCount + " классов, нужно " + whiteTotal + " банок белой краски и " + blackTotal + " банок коричневой краски");

    //Задача 6
    int banana = 5 * 80;
    int milk = 200 / 100 * 105;
    int iceCream = 2 * 100;
    int eggs = 4 * 70;
    int totalCrams = banana + milk + iceCream + eggs;
        System.out.println(totalCrams);
        System.out.println(totalCrams / 1000.0);

    //Задача 7
    byte targetKg = 7;
    int targetGrams = targetKg * 1000;
        System.out.println(targetGrams / 250);
        System.out.println(targetGrams / 500);

    //Задача 8
    double masha = 67_760;
    double denis = 83_690;
    double kristina = 76_230;

    double mashaIncreased = masha * 1.1;
    double denisIncreased = denis * 1.1;
    double kristinaIncreased = kristina * 1.1;

    double mashaSalaryForYear = masha * 12;
    double denisSalaryForYear = denis * 12;
    double kristinaSalaryForYear = kristina * 12;

    double mashaSalaryForYearIncreased = mashaIncreased * 12;
    double denisSalaryForYearIncreased = denisIncreased * 12;
    double kristinaSalaryForYearIncreased = kristinaIncreased * 12;

    double mashaDiff = mashaSalaryForYearIncreased - mashaSalaryForYear;
    double denisDiff = denisSalaryForYearIncreased - denisSalaryForYear;
    double kristinaDiff = kristinaSalaryForYearIncreased - kristinaSalaryForYear;

        System.out.println("Маша теперь получает " + mashaSalaryForYearIncreased + " рублей. Годовой доход вырос на " + mashaDiff + "рублей");
        System.out.println("Денис теперь получает " + denisSalaryForYearIncreased + " рублей. Годовой доход вырос на " + denisDiff + "рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryForYearIncreased + " рублей. Годовой доход вырос на " + kristinaDiff + "рублей");
}