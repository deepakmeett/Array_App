package Practice.Inter;

//We can achieve 100% abstraction with the help of interface
// Unfortunately we can not extend multiple class in JAVA that's why we use implement keyword
//We can achieve loose coupling

public interface A { // In interface we declare name as interface  
    
    void show(); //We declare simple method not method body
    
    int a = 10;//We can declare variable as well.
}
 interface C extends A{
    
}

class B implements A { //If we take property of interface in normal method then we write implement instead of extend
    
    public void show(){ //And we have to define all methods inside normal class which are in interface
        System.out.println( a );
    }
    
    public static void main(String[] args) {
        //We can not instantiate object of interface class. We can only declare reference of interface
        A a = new B();
    }
}
