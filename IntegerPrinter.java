 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String x = Integer.toBinaryString(value);
        return x;
    }

    public String printIntegerAsOctal(int value){
        String y = Integer.toOctalString(value);
        return y;
    }

    public String printIntegerAsHexadecimal(int value){
        String z = Integer.toHexString(value);
        return z;
    }

    public static void main(String[] args){

    }
}
