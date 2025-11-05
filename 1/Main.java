import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Lista003 list = new Lista003();

        for(int i = 0; i<6; i++) {
            int v = sc.nextInt();
            if( v> 0) {
                list.insertOrd(new Node<>(v));
            }
        }
        var curr = list.getHead();
        while(curr != null) {
            System.out.println(curr.getData());
            curr = curr.getNext();
        }

        sc.close();
    }
}
