

public class bubbleSort {
    public static int[] sort(int arr[]){

        for(int i=arr.length-1;i>0;i--){
            

            for(int j=0;j<i;j++){

                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[]={10,43,7,8,14,6};

        arr=sort(arr);

        for(int i:arr){
            System.out.print(" "+i);
        }

    }
}
