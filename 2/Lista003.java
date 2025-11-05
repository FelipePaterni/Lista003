import java.util.*;

@SuppressWarnings({"rawtypes","unchecked"})
public class Lista003 extends LinearList implements LinearListInterface {

    @Override
    public boolean insertOrd(Node node) {
        if(node == null) return false;

        Node head = getHead();
        int value = (int) node.getData();
        if(head == null) {
            insert(node);
            return true;
        }

        Node curr = head;
        while (curr != null) {
            int currVal = (int) curr.getData();
			if(currVal == value) return false;
           
            curr = curr.getNext();
        }
        append(node);
        return true;
    }

    @Override
    public Node[] removeDup() {
        if(isEmpty()) return new Node[0];

        List<Node> removed = new ArrayList<>();
        Set<Object> seen = new HashSet<>();

        Node curr = getHead();

        while(curr != null) {
            Object value = curr.getData();
            Node next = curr.getNext();
            if(seen.contains(value)) {
                Node prev = curr.getPrev();
                Node nxt = curr.getNext();

                if(prev != null) prev.setNext(nxt);
                else super.remove();

                if(nxt != null);
                nxt.setPrev(prev);
                curr.setNext(null);
                curr.setPrev(null);
            } else {
                seen.add(value);
            }
            curr = next;
        }
        return removed.toArray(new Node[0]);
    }

    @Override
    public LinearListInterface invert(int start, int end) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface repItens(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface union(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node[] removeSupVal(int limit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface merge(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node[] removeInfVal(int limit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean equalsList(LinearListInterface list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LinearListInterface[] divide() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Node getHead() {
        return super.getHead(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Node pop() {
        return super.pop(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Node remove() {
        return super.remove(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void insertAt(int position, Node node) {
        super.insertAt(position, node); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void append(Node node) {
        super.append(node); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void insert(Node node) {
        super.insert(node); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int hashCode() {
        return super.hashCode(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void printList() {
        super.printList(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
