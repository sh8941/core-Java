/*
 * Threre are two ways to compare Strings, first with "==" operator and second String.equal(String) method. But there are little different in both ways.
 * "==" Operator return true if reference of both strings are same otherwise return false;
 * String.equals(String) method return true if Both Strings values are same.
 */
public class ComparisonOfStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("Hello");
        String str4 = "Hello";
        // Comparing with the help of "==" operator

        System.out.println(str1 == str2); // return false because both of them are different reference
        System.out.println(str1 == str3); // return false because both of them same value but different reference
        System.out.println(str1 == str4); // return true because duplicate are not allow in SCP

        // Comparing with the help of String.equals method

        System.out.println(str1.equals(str2)); // return false because they have different values
        System.out.println(str1.equals(str3)); // return true because they have same values
        System.out.println(str1.equals(str4)); // return true because they have same values
    }
}
