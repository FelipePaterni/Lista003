@SuppressWarnings({ "rawtypes", "unchecked" })
public class Lista003 extends LinearList implements LinearListInterface {

    @Override
    public boolean insertOrd(Node node) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Node[] removeDup() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LinearListInterface invert(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Lista003 repItens(LinearListInterface newList) {
        Lista003 other = (Lista003) newList;

        Lista003 result = new Lista003();

        if (other == null || this.isEmpty())
            return result;

        Node a = this.getHead();

        while (a != null) {

            Node b = other.getHead();
            boolean foundInOther = false;

            while (b != null) {
                if (a.getData().equals(b.getData())) {
                    foundInOther = true;
                    break;
                }
                b = b.getNext();
            }

            if (foundInOther) {

                boolean exists = false;
                Node r = result.getHead();
                while (r != null) {
                    if (r.getData().equals(a.getData())) {
                        exists = true;
                        break;
                    }
                    r = r.getNext();
                }

                if (!exists) {
                    result.insertOrd(new Node<>(a.getData()));
                }
            }

            a = a.getNext();
        }

        return result;
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
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node[] removeInfVal(int limit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
