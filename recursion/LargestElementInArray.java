import java.util.Arrays;

public class LargestElementInArray {

    int brute(int arr[]){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    int opitamal(int arr[]){
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,2,7,13,9,6,3};

        LargestElementInArray l= new LargestElementInArray();

        System.out.println("Brute Approach"+l.brute(arr));
        System.out.println("Optimal Approach"+l.opitamal(arr));
    }
}
