
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



//exception handling
public class Try {

    public static void main(String[] args) {
        try{
            int[] a = new int[5];
            a[10] = 10;
        }
        catch(Exception e){
            e.printStackTrace();
        }

        int d=50*2;
        System.out.println(d);
    }
    
}


