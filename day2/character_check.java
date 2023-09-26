import java.util.Scanner;
public class character_check {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String getword= scanner.nextLine();
        System.out.println("Enter the character to be checked: ");
        char c=scanner.nextLine().charAt(0);
        boolean found=false;
        int index=-1;
        for(int i=0;i<getword.length();i++){
            if(getword.charAt(i)==c) {
                found = true;
                index = i;
                break;
            }

        }
        index+=1;
        if(found){
            System.out.println("The character is present in the string");
            System.out.println("The character is present at "+index+" position");
        }
        else{
            System.out.println("The is not available in sentence");
        }
    }
}
