package String;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(no14(arr));
    }

    public static boolean no14(int[] arr){

        boolean has1 = false;
        boolean has4 = false;

        for(int n:arr){
            if(n==1){
                has1=true;
            }

            if(n==4){
                has4=true;
            }
        }

        return !has1 || !has4;
    }
}
