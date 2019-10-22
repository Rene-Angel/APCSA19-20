
/**
 * @author Rene-Angel Jaime
 * @version (10.21.19)
 */
public class StringUtil
{
    public static void main()
    {
       System.out.println("This should say '2 be or not 2 be'");
       System.out.println(apcsReplaceAll("to be or not to be","to","2"));
       System.out.println();
       
       System.out.println("This should say 'advanced calculus'");
       System.out.println(apcsReplaceAll("advanced calculus","math","science"));
       System.out.println();
       
       System.out.println("This should say 'gonegonegone'");
       System.out.println(apcsReplaceAll("gogogo","go","gone"));
       System.out.println();
       
       System.out.println("This should say 'baa'");
       System.out.println(apcsReplaceAll("aaaaa","aaa","b"));
       System.out.println();     
    }
    public static String apcsReplaceAll(String str, String oldStr, String newStr)
    {
       String newString = str;  //Make a copy of the string (Avoids a y penalty)
       // Find the position (psn) of the first oldStr
       int psn = str.indexOf(oldStr);
       // Create a loop that keeps going until we no longer have to replace stuff
       while (psn != -1){
           return newStr;
       }
       return str;
    }
}
