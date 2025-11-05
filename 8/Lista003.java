@SuppressWarnings({ "rawtypes", "unchecked" })
public class Lista003 extends LinearList implements LinearListInterface {

    @Override
    public boolean insertOrd(Node node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Node[] removeDup() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface invert(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface repItens(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface union(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node[] removeSupVal(int limit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface merge(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
    }

    @Override
    public Node[] removeInfVal(int limit) {
    if (isEmpty()) return new Node[0];

    Node curr = getHead();
    int count = 0;

    // primeiro conta quantos serão removidos
    while (curr != null) {
        int v = (int) curr.getData();
        if (v < limit) count++;
        curr = curr.getNext();
    }

    if (count == 0) return new Node[0];

    Node[] removed = new Node[count];
    int idx = 0;

    curr = getHead();
    while (curr != null) {
        int v = (int) curr.getData();
        Node next = curr.getNext();

        if (v < limit) {
            Node prev = curr.getPrev();

            if (prev == null) {
                // removendo head
                super.remove();
            } else {
                prev.setNext(next);
                if (next != null) next.setPrev(prev);
            }

            curr.setNext(null);
            curr.setPrev(null);
            removed[idx++] = curr;
        }

        curr = next;
    }

    return removed;
}

    @Override
    public boolean equalsList(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface[] divide() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node getHead() {
        return super.getHead(); // Generated from
                                // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty(); // Generated from
                                // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Node pop() {
        return super.pop(); // Generated from
                            // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Node remove() {
        return super.remove(); // Generated from
                               // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void insertAt(int position, Node node) {
        super.insertAt(position, node); // Generated from
                                        // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void append(Node node) {
        super.append(node); // Generated from
                            // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @SuppressWarnings("uncheked")
    @Override
    public void insert(Node node) {
        super.insert(node); // Generated from
                            // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from
                                 // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from
                              // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from
                                  // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from
                                 // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void printList() {
        super.printList(); // Generated from
                           // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
