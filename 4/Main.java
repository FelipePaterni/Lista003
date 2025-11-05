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

        Lista003 inter = l1.repItens(l2);

        Node curr = inter.getHead();
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}
