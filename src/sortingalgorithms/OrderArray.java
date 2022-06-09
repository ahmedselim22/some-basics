package sortingalgorithms;

public class OrderArray {
    private int array[];
    private int actual=0;
    
    public OrderArray(int size){
        array=new int[size];
    }

    public void insert(int value){
        if(checkIfValid()==true){
            int i = 0;
            for( ; i<actual ; i++){
                if(array[i]>=value){
                    break;
                }
            }
            for (int c = actual; c > i ; c--) {
                array[c]=array[c-1];
            }
            array[i]=value;
            actual++;
        }
        else{
            System.out.println("array is complete");
        }
    }
    public boolean checkIfValid(){
        return actual != array.length;
    }
    
    public void display(){
        for (int i = 0; i < actual ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.print("\n");
    }
    
    
    public int linearSearchWithNoDuplicate(int value){
        for (int i =0 ; i < actual; i++) {
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
    
    public void linearSearchWithDuplicate(int value){
        int counter=0 ;
        for (int i =0 ; i < actual; i++) {
            if(array[i]==value){
                counter++;
            }
        }
        System.out.println("element founded "+counter+" times");
    }
    
    public void deleteElement(int element){
        int c=linearSearchWithNoDuplicate(element);
        if(c==-1){
            System.out.println("not found !");
        }
        else{
            for(int i=c ; i<actual-1 ; i++){
                array[i]=array[i+1];
            }
            actual--;
        }
    }
    
    public void binarySearch(int value){
        int min=0 , max=actual-1 ,mid;
        while(true){
            mid=(min+max)/2;
            if(array[mid]==value){
                System.out.println("founded at index "+mid);
                break;
            }
            if(min>max){
                System.out.println("not founded !");
                break;
            }
            else if(value>array[mid]){
                    min=mid+1;
                }
            else if(value<array[mid]){
                    max=mid-1;
                }
            else{
                min++;
                max--;
            }
        }
    }
    
}
