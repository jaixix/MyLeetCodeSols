import java.util.*;
import java.io.*;
public class StackAsArray{
    static final int max = 1000;
    int arr [] = new int[max];
    int top;
    StackAsArray(){
        top=-1;
    }

    boolean isEmpty(){
            return (top<0);
    }

    boolean push(int data){
        if((top>=max)-1){
            System.out.println("Stack Overflow!!!");
            return false;
        }

        else{
            arr[++top] = data;
            System.out.println(data+" pushed to Stack");
        }
        return true;
    }

    int pop(){
        // int popped = Integer.MIN_VALUE;
        if(top<0){
            System.out.println("Stack Underflow!!!");
            return -1;
        }

        else{
            System.out.print("Popped Element : ");
            return (arr[top--]);
        }
    }

    int peek(){
        if(top<0)
            return -1;
        else{
            System.out.print("Peeked Element : ");
            return arr[top];
        }
    }

    public static void main(String[] args){
        StackAsArrays saa = new StackAsArray();
        System.out.println(saa.isEmpty());
        saa.push(1);
        saa.push(2);
        saa.push(3);
        saa.push(4);
        System.out.println(saa.pop());
        System.out.println(saa.pop());
        System.out.println(saa.peek());
        System.out.println(saa.isEmpty());
    }
}