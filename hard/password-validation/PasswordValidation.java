/*import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static void main(String[] args) {
        final var input = new Scanner(System.in);
        final var password = input.nextLine();
        input.close();
        final var isStrong = password.length() > 6
           && Pattern.matches(".*\\d.*\\d.*", password)
           && Pattern.matches("(.*[!@#$%&*].*){2,}", password);
	        
        System.out.println(isStrong ? "Strong" : "Weak");
    }
}
*/
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
        int n = Code.display(s1);
        if(n==1){
         System.out.println("Strong");
        }else{
         System.out.println("Weak");
        }
  }
}
class Code {
 
    public static int display(String password){
if(password.matches(".[0-9]{1,}.") && password.matches(".[!@#$%&]{1,}.*") && password.length()>=7 )
 {
 return 1;
 }
 else
{
  return -1;
 }
  }
}
