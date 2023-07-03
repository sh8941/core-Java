/*
 * String is a collection of characters, It's behave as a Object in Java.
 * Two types of String in Java. which known as immutable and mutable.
 * Immutable is type of String which known as non-changeable String in java. class -> String
 * Mutable is type of String which known as changeable String in Java. class -> StringBuilder, StringBuffer
 * String Object can be create in Java in three ways ->
 1. String str = "value";
 2. String str = new String("value");
 3. String str = new String(charArray[]);
 * If we have constructed a String object using first of above method, so object will be created in 'String Const pool' which is a area inside of heap, in this area duplicate are not allow, if you try to construct so it reference copy to another variable.
 * If we have constructed a String Object using second or third method of above so, it will construct in heap and you can create a duplicate.
 * isequalto (==) operator return true if refrence of both are same otherwise false.
 */

 // public class
public class TypeOfString{
    public static void main(String[] args) {
        String str = "String";  // This object allocated in String Const Pool
        System.out.println(str);
        String str2 = "String"; // This object allocated in String Const Pool
        System.out.println(str2);
        // both of above are same refrence because duplicate are not allow in SCP
        System.out.println(str==str2);
        String str3 = new String("String3");  // This object allocated in heap memory
        System.out.println(str3);
        String str4 = new String("String3");  // This object allocated in heap memory
        System.out.println(str4);
        // beacuse duplicate are allow in heap memory so both reference are different
        System.out.println(str3==str4);
    }
}