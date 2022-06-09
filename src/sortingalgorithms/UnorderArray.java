package sortingalgorithms;
public class UnorderArray {
    private int array[];
    private int actual;
    
    public UnorderArray(int size){
        array=new int [size];
        actual=0;
    }
    
    public void insert(int value){
        if(checkIfValid()==true){
        array[actual]=value;
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
    public int searchWithNoDuplicate(int value){
        for (int i =0 ; i < actual; i++) {
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
    
    public void searchWithDuplicate(int value){
        int counter=0 ;
        for (int i =0 ; i < actual; i++) {
            if(array[i]==value){
                counter++;
            }
        }
        System.out.println("element founded "+counter+" times");
    }
    
    public void deleteElement(int element){
        int c=searchWithNoDuplicate(element);
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
}
