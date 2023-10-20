public class List implements Stack {
    protected Node head;

    protected List() {
        this.head = null;
    }

    public static List emptyStack(){
        return new List();
    }

    @Override
    public void push(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            return;
        } else {
            Node last = getLast();
            last.setNext(newNode);
        }
    }

    @Override
    public int pop() {
        if(head == null){
            return -1;
        }

        if(head.getNext() == null){
            Node temp = head;
            head = null;
            return temp.getValue();
        }

        Node secondLast = getSecondLast();

        Node last = secondLast.getNext();
        secondLast.setNext(null);


        return last.getValue();
    }

    @Override
    public void forEach(ElementAction action) {
        Node current = head;

        while(current != null) {
            action.perform(current.getValue());
            current = current.getNext();
        }
    }

    private Node getLast(){
        Node pointer = this.head;

        if(pointer.getNext() == null){
            return pointer;
        }

        while (pointer.getNext() != null){
            pointer = pointer.getNext();
        }

        return pointer;
    }

    private Node getSecondLast(){
        Node pointer = this.head;

        if(pointer.getNext().getNext() == null){
            return pointer;
        }

        while (pointer.getNext().getNext() != null){
            pointer = pointer.getNext();
        }

        return pointer;
    }
}