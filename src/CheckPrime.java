import java.util.*;

public class CheckPrime {

        public static void main(String[] args){
               
                Scanner sc = new Scanner (System.in);

                System.out.println("Enter a number: ");
                int n = sc.nextInt();

                int flag=0;

                if(n<=1)
                        System.out.println("Not Prime");
                else{
                        for(int i=2; i<n/2; i++){
                                if(n%i==0){
                                        flag++;
                                }
                        }
                }

                if(flag==0)
                        System.out.println("Prime");
                else
                        System.out.println("Not Prime");

        }
}
