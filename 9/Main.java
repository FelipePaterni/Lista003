import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Lista003 l1 = new Lista003();
        Lista003 l2 = new Lista003();

        while (true) {
            int v = sc.nextInt();
            if (v == -1) break;
            l1.append(new Node<>(v));
        }

        while (true) {
            int v = sc.nextInt();
            if (v == -1) break;
            l2.append(new Node<>(v));
        }

        boolean result = l1.equalsList(l2);

        System.out.println(result ? "verdadeiro" : "falso");

        sc.close();
    }
}
