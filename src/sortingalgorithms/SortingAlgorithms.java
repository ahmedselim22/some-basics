package sortingalgorithms;
import java.util.Scanner;
public class SortingAlgorithms {
    public static void main(String[] args) { 
        Scanner input =new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("1- unorder array \n2- order array ");
        System.out.println("----------------------------------------");
        System.out.println("enter your choice :");
        int x=input.nextInt();
        int s , in;
        boolean flag=true;
        do{
        switch(x){
            case 1:
            System.out.println("enter array size :");
            s=input.nextInt();
            UnorderArray uoa =new UnorderArray(s);
            SortingUnorderArray suoa = new SortingUnorderArray(s);
                System.out.println("enter array elements : ");
                for (int i = 0; i < s; i++) {
                    in=input.nextInt();
                    uoa.insert(in);
                    suoa.insert(in);
                }
                int a ,b;
                System.out.println("----------------------------------------");
                System.out.println("1- linear search for element \n2- delete element \n3- buble sort \n4- insertion sort \n5- merge sort \n6- shell sort \n7- quick sort \n8- hesp dort\n9- exit  ");
                System.out.println("----------------------------------------");
                System.out.println("enter your choise:");
                a=input.nextInt();
                switch(a){
                    case 1:
                        uoa.display();
                        System.out.println("enter key search :");
                        b=input.nextInt();
                        uoa.searchWithDuplicate(b);
                        uoa.display();
                    break;
                    case 2:
                        uoa.display();
                        System.out.println("enter element to delete :");
                        b=input.nextInt();
                        uoa.deleteElement(b);
                        uoa.display();
                    break;
                    case 3:
                        suoa.display();
                        suoa.bubleSorting();
                        suoa.display();
                    break;
                    case 4:
                        suoa.display();
                        suoa.insertioSorting();
                        suoa.display();
                    case 5:
                        suoa.display();
                        suoa.runMerge();
                        suoa.display();
                    break;
                    case 6:
                        suoa.display();
                        suoa.shellSorting();
                        suoa.display();
                    break;
                    case 7:
                        suoa.display();
                        suoa.quickSort();
                        suoa.display();
                    break;
                    case 8:
                        suoa.display();
                        suoa.runHeap();
                        suoa.display();
                    case 9:
                        flag=false;
                    break;
                    default:
                    System.out.println("error !");
                    flag=false;
                }
            break;
            
            case 2:
            System.out.println("enter array size :");
            s=input.nextInt();
            OrderArray oa =new OrderArray(s);
            System.out.println("enter array elements : ");
                for (int i = 0; i < s; i++) {
                    in=input.nextInt();
                    oa.insert(in);
                }
                System.out.println("1- linear search for element \n 2- binary search for element \n 3- delete element \nenter your choise: ");
                a=input.nextInt();
                switch(a){
                    case 1:
                        oa.display();
                        System.out.println("enter search key :");
                        b=input.nextInt();
                        oa.linearSearchWithDuplicate(b);
                        oa.display();
                    break;
                    case 2:
                        oa.display();
                        System.out.println("enter search key:");
                        b=input.nextInt();
                        oa.binarySearch(b);
                        oa.display();
                    break;
                    case 3:
                        oa.display();
                        System.out.println("enter element to delete :");
                        b=input.nextInt();
                        oa.deleteElement(b);
                        oa.display();
                    break;
                    default:
                        System.out.println("error !");
                        flag=false;
                }
            break;
            default:
                System.out.println("error ! ");
                flag=false;
        }
        
        }while(flag==true);
    }
}
   