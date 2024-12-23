//Space complexity O(N)
//Time complexity O(1)
class Stack { 
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top =-1; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        //Write your code here 
        if(top == -1) {
             return true;
        }
        return false;
    } 

    Stack() 
    { 
        //Initialize your constructor 
    } 
    boolean push(int x) 
    { 
        //Check for stack Overflow
        if(top ==  MAX) {
            System.out.println("Stack Overflow");
            return false;
        }
        //Write your code here
        else {
            a[++top] = x;
            return true;
        }
        
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        if(top == -1) {
            System.out.println( "Stack Underflow");
            return 0;
        }
        //Write your code here
        else {
            int temp = a[top];
            top--;
            return temp;
        }
        
    } 
  
    int peek() 
    { 
        //Write your code here
        return a[top];
    } 

} 



// Driver code 
class Exercise_1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30);    
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
