import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        double pow=Math.ceil(Math.log10(num));
        // System.out.println(pow);
        int sum=0;
        int temp=num;
        while(num>0){
            int rem=num%10;
            sum+=Math.pow(rem,pow);
            // System.out.println(sum);
            num/=10;
        }
        String result=(temp==sum)?"Number is Armstrong":"Number is not an Armstrong";
        System.out.println(result);
    }
}
