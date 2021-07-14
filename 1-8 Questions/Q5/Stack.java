class Stack
{ int top;
int[] s=new int[10];
Stack()
{
 top=-1;
}
public void push(int x)
{
 if(top==9)
 {
 throw new ArithmeticException("Stack is full");
 }
 else
 s[++top]=x;
}
public int pop()
{
 if(top==-1)
{
 throw new ArithmeticException("Stack is empty");
 }
 else
 return s[top--];
}
public static void main(String args[])
{
 Stack obj=new Stack();
 System.out.println("Filling first stack");
 try{
 for(int i=0;i<20;i++)
 {
 obj.push(i);
 }
 }
 catch(ArithmeticException e)
 {
 System.out.println(e.getMessage());
 }
 System.out.println("First stack is ");
 try{
 for(int j=0;j<10;j++)
{
 System.out.println(obj.pop());
 }
 }
 catch(ArithmeticException e)
 {
 System.out.println(e.getMessage());
 }
 Stack obj1=new Stack();
 System.out.println("Filling second stack");
 try{
 for(int i=15;i<35;i++)
 obj1.push(i);
 }
 catch(ArithmeticException e)
 {
 System.out.println(e.getMessage());
 }
 System.out.println("Second stack is ");
 try{
 for(int j=0;j<20;j++)
 {
 System.out.println(obj1.pop());
}
 }
 catch(ArithmeticException e)
 {
 System.out.println(e.getMessage());
 }
}