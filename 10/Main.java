import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lista003 list = new Lista003();

        while (true) {
            int v = sc.nextInt();
            if (v == -1) break;
            list.append(new Node<>(v));
        }

        Lista003[] result = list.divide();
        Lista003 pares = result[0];
        Lista003 impares = result[1];

        // imprimir pares
        Node curr = pares.getHead();
        boolean first = true;
        while (curr != null) {
            if (!first) System.out.print(",");
            System.out.print(curr.getData());
            first = false;
            curr = curr.getNext();
        }
        System.out.println();

        // imprimir impares
        curr = impares.getHead();
        first = true;
        while (curr != null) {
            if (!first) System.out.print(",");
            System.out.print(curr.getData());
            first = false;
            curr = curr.getNext();
        }
        System.out.println();

        sc.close();
    }
}
