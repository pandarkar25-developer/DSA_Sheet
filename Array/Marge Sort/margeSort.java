

public class margeSort {
    static void sort(int arr[],int start,int end){

        if(start>=end){
            return ;
        }

        int mid =start+(end-start)/2;

        sort(arr, start, mid);
        sort(arr, mid+1, end);

        marge(arr, start, mid, end);


    }

    static void marge(int arr[],int start,int mid,int end){

        int p=start;
        int q=mid+1;
        int k=0;

        int temp[] = new int[end-start+1];

        while(p<=mid && q<=end){
            if(arr[p]<arr[q]){
                temp[k++]=arr[p++];
            }else{
                temp[k++]=arr[q++];
            }
        }

        while (p<=mid) {
            temp[k++]=arr[p++];
        }

        while (q<=end) {
            temp[k++]=arr[q++];
        }
        k=0;
        for(int i=start;i<=end;i++){
            arr[i]=temp[k++];
        }

        return;

    }

    public static void main(String[] args) {
        int arr[] = {15,2,8,9,3};
        
        sort(arr, 0, arr.length-1);

        for(int i:arr){
            System.out.print(i+" ,");
        }
    }
}
