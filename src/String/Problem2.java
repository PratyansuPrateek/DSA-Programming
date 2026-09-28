package String;

public class Problem2 {
    public static void main(String[] args) {
        int[] arr = {1,7,1,7};
        System.out.println(has77(arr));
    }

    public static boolean has77(int[] arr){

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==7 && arr[i+1]==7){
                return true;
            }

            if(i+2 < arr.length && arr[i]==7 && arr[i+2]==7){
                return true;
            }
        }

        return false;
    }
}
