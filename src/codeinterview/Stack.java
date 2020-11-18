package codeinterview;

public class Stack {

    /*
     *creating a stack implementation
     */
    private int array[];
    private int top;
    private int capacity;

    public Stack(int capacity){
        this.capacity = capacity;
        this.top = -1;
        array = new int[capacity];
    }

    public static void main(String[] args){

    }

    public void push(int value){
        array[++top] = value;
    }
    public int pop(){
        return array[top--];
    }
    public int peek(){
        return array[top];
    }
}
