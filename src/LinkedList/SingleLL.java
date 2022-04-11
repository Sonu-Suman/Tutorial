package LinkedList;

public class SingleLL {
    private Node head;

    public void insertHead(int data){
        if (head==null){
            head = new Node(data);
        } else {
            Node temp = new Node(data);

            temp.next = head;
            head = temp;
        }
    }

    public void print() {
        Node temp = head;

        while(temp!=null){
            if(temp.next==null){
                System.out.print(temp.data);
                break;
            }
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        SingleLL ll = new SingleLL();
        ll.insertHead(5);
        ll.insertHead(9);
        ll.insertHead(7);

        ll.print();
    }
}
