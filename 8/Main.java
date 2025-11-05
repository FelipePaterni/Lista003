import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Lista003 list = new Lista003();

        // lê lista
        while (true) {
            int v = sc.nextInt();
            if (v == -1) break;
            list.append(new Node<>(v));
        }

        // lê limite
        int limit = sc.nextInt();

        list.removeInfVal(limit);

        Node curr = list.getHead();
        while (curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }

        sc.close();
    }
}
