public class bubleSort {
    int[] Sort(int arr[]){
        
        for(int i=(arr.length)-1;i>=0;i--){
        
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int t =arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] =t;
                }
            }

            

            
        }

        return arr;
    }

    public static void main(String a[]){
        int s[] = {5,2,4,1,3};
        bubleSort b = new bubleSort();
        s =b.Sort(s);


        for(int i:s){
            System.out.print(" "+i);
        }
    }
}
