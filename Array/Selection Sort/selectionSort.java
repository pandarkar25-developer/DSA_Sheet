public class selectionSort{

    static int[] sort(int[] arr){

        
        

        for(int i=arr.length-1;i>=0;i--){
            int larg =0;

            for(int j=0;j<=i;j++){

                if(arr[larg]<arr[j]){
                    larg=j;
                }
            }

            int temp =arr[larg];
            arr[larg]=arr[i];
            arr[i]=temp;
            larg=1;
        }
    
        return arr;
    }

    public static void main(String[] args) {
        int arr[] ={2,5,3,1,7,6,4};
        arr=sort(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}