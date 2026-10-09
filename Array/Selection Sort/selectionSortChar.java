public class selectionSortChar{

    static char[] sort(char[] arr){

        
        

        for(int i=arr.length-1;i>=0;i--){
            int larg =0;

            for(int j=0;j<=i;j++){

                if(arr[larg]<arr[j]){
                    larg=j;
                }
            }

            char temp =arr[larg];
            arr[larg]=arr[i];
            arr[i]=temp;
            larg=1;
        }
    
        return arr;
    }

    public static void main(String[] args) {
        char arr[] ={'d','b','a','e','c'};
        arr=sort(arr);

        for(char i:arr){
            System.out.print(i+", ");
        }
    }
}