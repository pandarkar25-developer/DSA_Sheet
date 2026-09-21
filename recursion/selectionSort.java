public class selectionSort {
    static int[] Sort(int arr[]){
        int index =0;
        for(int i=0;i<arr.length;i++){
            index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index =j;
                }
            }

            int t =arr[index];
            arr[index]= arr[i];
            arr[i] =t;

            
        }

        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,5,37,3,4,56,2,6,9};

        arr =Sort(arr);

        for(int i:arr){
            System.out.print(" "+i);
        }
    }
}
