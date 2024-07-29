import org.omg.Messaging.SyncScopeHelper;

public class prime {

    public static void main(String[] args) {
        int a=10;
        int flag=0;
        for(int i=2;i<a/2;i++){
            if(a%i==0){
               System.out.println("Not prime number");
               flag=1;
               break;
            }
        }
        if(flag==0){
            System.out.println("It's a prime number");
        }
    }
}
