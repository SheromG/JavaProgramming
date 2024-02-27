import java.math.BigInteger;  
import java.security.NoSuchAlgorithmException;  
import java.security.MessageDigest;  
import java.util.Scanner;

public class Main  
{  
    public static void main(String argvs[]) throws NoSuchAlgorithmException  
    {  
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a message: ");
        String first = input.nextLine();
        System.out.println("Message 1: " + first);
        
        System.out.print("Enter a message: ");
        String second = input.nextLine();
        System.out.println("Message 2: " + second + "\n");
        
        String str = first + " " + second;
        
        String hash = getMd5(str);  

        System.out.println("The MD5 hash for " + str + " is: " + hash);  
    }  
    public static String getMd5(String var)  
    {  
        try   
        {  
            MessageDigest message = MessageDigest.getInstance("MD5");  
            byte[] array = message.digest(var.getBytes());   
            BigInteger bi = new BigInteger(1, array);  
            String hash = bi.toString(16);  
            
            while (hash.length() < 32)   
            {  
                hash = "0" + hash;  
            }  
            return hash;  
        }  
        catch (NoSuchAlgorithmException variable)   
        {  
        throw new RuntimeException(variable);  
        }  
    } 
} 