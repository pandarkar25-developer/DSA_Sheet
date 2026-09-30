
public class linearSearch {
    public static void main(String[] args) {
        int arr[]={3,6,1,7,9,1,5,74,12};
        int key =9;
        for(int i:arr){
            if(i==key){
                System.out.println("key found");
                return ;
            }
        }

        System.out.println("key not found");
    }
}
