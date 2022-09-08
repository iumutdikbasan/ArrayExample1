import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int n = input.nextInt();

        Arrays.sort(list);

        System.out.println(Arrays.toString(list));


        int compare = list[0];
        int compare2 = list[7];

        if(n < compare){
            System.out.println("Girilen sayıdan küçük en yakın sayı : YOK");
            System.out.println("Girilen sayıdan büyük en yakın sayı : " + compare);
        }
        else if(n  > compare && n  < compare2){
            for(int i=0; i<list.length; i++){
                if(list[i]>n ){
                    compare = list[i];
                    System.out.println("Girilen sayıdan küçük en yakın sayı : "+list[i-1]);
                    System.out.println("Girilen sayıdan büyük en yakın sayı : " + compare);
                    break;
                }
            }
        }
        else if(n  > compare2){
            System.out.println("Girilen sayıdan küçük en yakın sayı : "+compare2);
            System.out.println("Girilen sayıdan büyük en yakın sayı : YOK");
        }

    }
}
