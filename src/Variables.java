/**
 * class name: Variables.java
 * author: Abeselom Ghebrekristos_______
 * date: 05/26/2022
 * version: 
 * description: This program will display summary of primitive data types.
 * source: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * direction: 1) read the source material
 *            2) summary of primitive data types: byte, short, int, long, float,
 *            double, boolean, char (2 lines per each type)
 *
 */
public class Variables
{
    public static void main(String[] args)
    {
        System.out.println("Byte is a an 8-bit signed two's complement intege with");
        System.out.println("a maximum and minimum value of 128 and -128 respevtivily.");
        
        System.out.println("Short is a an 16-bit signed two's complement integer with a minimum and maximum value of -32768 & -128 respevtivily.");
        System.out.println("You can use a short to save memory in large arrays");
        
        System.out.println("int is a 32-bit intiger by default which has a minimum value of -231 and a maximum value of 231-1.");
        System.out.println("In Java SE 8 and later, int can be used to unsigned 32-bit integer which has a minimum value of 0 & a maximum value of 232-1.");
        
        System.out.println("The long data type is a 64-bit two's complement integer with a minimum value of -263 and a maximum value of 263-1.");
        System.out.println("In Java SE 8 and later, int can be used to unsigned 64-bit integer which has a minimum value of 0 & a maximum value of 264-1.");
        
        System.out.println("float is a single-precision 32-bit IEEE 754 floating point.");
        System.out.println("use float if you need to save memory in large arrays of floating point numbers.")
        
        System.out.println("double is a double-precision 64-bit IEEE 754 floating point");
        System.out.println("it is used for decimal values, this data type is generally the default choice.");
        
        System.out.println("The boolean data type has only two possible values: true and false.");
        System.out.println("it is used to flag true/false conditions from a data.");
        
        System.out.println("The char data type is a single 16-bit Unicode character.");
        System.out.println("It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).");
        
        
        
    }

}
