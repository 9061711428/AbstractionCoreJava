package abstraction;



abstract class A  // This is an abstract class
{ 
    abstract void m1(); // this is an abstract method
      
  
    void m2() 
    { 
        System.out.println("This is a concrete method."); 
    } 
} 
  
// concrete class B 
class B extends A  
{ 
    // class B must override m1() method 
    // otherwise, compile-time exception will be thrown 
    void m1() { 
        System.out.println("B's implementation of m2."); 
    } 
      
      
} 
  
// Driver class 
public class AbsrAbstraction {

    public static void main(String args[])  
    { 
       B b = new B(); 
        b.m1(); 
       b.m2(); 
    } 
} 
