import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 3;
        int y = 4;
        int sum = x * y ;
        System.out.println(sum);

        String a = "questo numero è ";
        System.out.println(a + x);


        String[] cities = {"Milano","Roma","Venezia","Padova", "Firenze"};
        String c = "Genova";
        cities[2] = c;
        System.out.println(cities);

        System.out.println("Iserisci una parola:");
        String b = scanner.nextLine();

        System.out.println("Iserisci una seconda parola:");
        String d = scanner.nextLine();

        System.out.println("Iserisci una terza parola:");
        String e = scanner.nextLine();

        System.out.println(b + " " + d + " " + e);
        System.out.println(e + " " + d + " " + b);

        //Perimetro rettangolo
        System.out.println("inserisci la base");
        int base = scanner.nextInt();

        System.out.println("inserisci l'altezza");
        int altezza = scanner.nextInt();

        int perimetro = (base + altezza) *2;
        System.out.println( "Il perimetro è: " + perimetro);

        System.out.println("inserisci un numero:");
        int num = scanner.nextInt();


        int num1 = 2;

        int pariDispari = num % num1;
        System.out.println(pariDispari);


    }
}