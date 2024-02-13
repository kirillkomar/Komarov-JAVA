import java.util.Scanner;
public class Zadanieone
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Введите число a");
	    int a = sc.nextInt();
		System.out.println("Введите число b");
	    int b = sc.nextInt();
	    if(a>b) {System.out.println("a>b");
	    }
	    else if(a<b) {System.out.println("a<b");
	    }
	    else {System.out.println("a=b");
	    }
	   int summa = a+b;
	    System.out.println("Сумма a и b=" + summa);
	    int raznost = a-b;
	    System.out.println("Разность a и b=" + raznost);
	    int ymnozh = a*b;
	    System.out.println("Произведение a и b=" + ymnozh);
	    double deli = a/b;
	    System.out.println("Частное a и b=" + deli);
	}
}
