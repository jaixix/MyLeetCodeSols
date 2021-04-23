public class StackAsLinkedList{
    Node top;
    static class Node(){
        int data;
        Node next;
        Node(int data){this.data=data;}
    }

    boolean isEmpty(){
        return (top==null);
    }

    void push(int data){
        Node newNode = new Node(data);
        if(top==null){
            top = newNode;
        }
        else{
            Node temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println(data+" pushed to Stack!!!");
    }

    int pop(){
        int popped = Integer.MIN_VALUE;
        if(top==null){
            System.out.println("Stack underflow!!!");
            return -1;
        }
        else{
            popped = top.data;
            top = top.next;
            System.out.println("Popped item : ");
        }
        return popped;
    }

    int peek(){
        if(top==null){
            System.out.println("Stack is Empty!!!");
            return -1;
        }
        else{
            System.out.println("Peeked item : ");
            return top.data;
        }
    }

    public static void main(String[] args){
        StackAsLinkedList sal = new StackAsLinkedList();
        System.out.println(sal.isEmpty());
        sal.push(1);
        sal.push(2);
        sal.push(3);
        sal.push(4);
        System.out.println(sal.pop());
        System.out.println(sal.pop());
        System.out.println(sal.peek());
        System.out.println(sal.isEmpty());
    }
}