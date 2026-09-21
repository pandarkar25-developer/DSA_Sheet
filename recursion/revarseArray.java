public class revarseArray {
    public int[] rev(int arr[],int f,int l){

        if(f>=l){
            return arr;
        }

        arr[f]+=arr[l];
        arr[l] = arr[f]-arr[l];
        arr[f]-=arr[l];

        rev(arr, f+1, l-1);

        return arr;
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        revarseArray ra = new revarseArray();

        arr =ra.rev(arr, 0, arr.length-1);

        for(int i:arr){
            System.out.print(" "+i);
        }
    }
}
