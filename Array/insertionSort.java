package Array;

public class insertionSort {
    static int[] sort(int[] arr){
        for(int k=arr.length-1;k>0;k--){
            for(int i=1;i<arr.length;i++){
                int j=i;
                int temp=arr[j];

                    while(j>0 && arr[j]<arr[j-1]){
                        arr[j]=arr[j-1];
                        j--;
                    } 

                    arr[j] =temp;
            
           

            
        }
        }
        

        return arr;
    }

    public static void main(String[] args) {
        int arr[]={10,43,7,57,8,14,6};

        arr=sort(arr);

        for(int i:arr){
            System.out.print(" "+i);
        }
    
    }
}
