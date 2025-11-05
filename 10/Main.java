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

        Node curr = pares.getHead();
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }

        curr = impares.getHead();
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }

        sc.close();
    }
}
