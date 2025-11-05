import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Lista003 l1 = new Lista003();

        while (true) {
            int v = sc.nextInt();
            if (v == -1) break;
            l1.append(new Node<>(v));
        }

        int limit = sc.nextInt();
        l1.removeSupVal(limit);

        Node curr = l1.getHead();
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }

        sc.close();
    }
}
