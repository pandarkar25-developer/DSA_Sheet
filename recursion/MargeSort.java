public class MargeSort {

    static void sort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid =(ei+si)/2;
        sort(arr, si, mid);
        sort(arr,mid+1,ei);
        marge(arr,si,mid,ei);

        for(int k:arr){
            System.out.print(k+" ");
        }
        System.err.println();

    }

    static void marge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];

        int i =si;
        int j=mid+1;
        int k =0;

        while (i<=mid && j<=ei) {
            
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        int t =si;
        for(int p:temp){
            
            arr[t++]=p;

            
        }
    }

    public static void main(String[] args) {
        int arr[]={3,5,2,4,1};

        sort(arr, 0, arr.length-1);

    }
}
  