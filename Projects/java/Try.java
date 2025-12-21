
// checked exception ----> compile time node exception

//unchecked exception ----> runtime exception


/*
----------------------------------------
syntax:

try{

}
catch(Exception class_name variable){

}
finally{

}

-----------------------------------------
another one :

try{

}

catch(){

}
*/


//finally
//that is block of code that is guaranteed to execute after the try or catch block 

//throw

//it is used to explicitly throw an instance of an exception typically when a specific error condition is meet with the code.

//throws

//it is used to a method signature to declare with checked exception the method might throw informing the caller to handle  the thing.

//once we use return on try block it will not execute the catch block and finally block

//exception handling

//nested try catch block is possible 

public class Try {

    public static void main(String[] args) {

    
    //multiple catch block  
    try{
        int[] a = new int[5];
        a[10] = 10;
    }
    catch(ArithmeticException d){
        d.printStackTrace();
    }
    catch(ArrayIndexOutOfBoundsException f){
        f.printStackTrace();
    }
    catch(Exception e){
        e.printStackTrace();
    }
    finally{
        System.out.println("finally block");
    }    
}
}

//the exception e is a parent class exception we can use it to catch all the exceptions and while using child exceptions 
