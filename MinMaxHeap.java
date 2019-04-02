
/**
 * Write a description of class MinMaxHeap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.Math;

public class MinMaxHeap<E extends Comparable<? super E>> extends HW8_AbstractClass<E>

{
    // instance variables - replace the example below with your own
    public void buildheap(E[] list){

    }

    public  E findMin(){
        return MMHeap[0];
    }

    public  E findMax(){
        if(MMHeap[1].compareTo(MMHeap[2])<0){
            return MMHeap[1];
        }
        else{
            return MMHeap[2];
        }
    }

    public void deleteMin(){
        MMHeap[0]=MMHeap[number];
        number--;
        siftDown(0);
    }

    public void siftDown(int pos){
            int i = pos;
            if(MMHeap[4*i+3] == null){
                break;
            }
            if( MMHeap[4*i+3].compareTo(MMHeap[pos])<0){
                E temp = MMHeap[pos];
                MMHeap[pos] = MMHeap[4*i+3];
                MMHeap[4*i+3] = temp;
                siftDown(4*i+3);
            }
            if( MMHeap[4*i+4].compareTo(MMHeap[pos])<0){
                E temp = MMHeap[pos];
                MMHeap[pos] = MMHeap[4*i+4];
                MMHeap[4*i+4] = temp;
                siftDown(4*i+4);
            }
            if( MMHeap[4*i+5].compareTo(MMHeap[pos])<0){
                E temp = MMHeap[pos];
                MMHeap[pos] = MMHeap[4*i+5];
                MMHeap[4*i+5] = temp;
                siftDown(4*i+5);
            }
            if( MMHeap[4*i+6].compareTo(MMHeap[pos])<0){
                E temp = MMHeap[pos];
                MMHeap[pos] = MMHeap[4*i+6];
                MMHeap[4*i+6] = temp;
                siftDown(4*i+6);
            }
        
    }

    public void deleteMax(){
        if(MMHeap[1].compareTo(MMHeap[2])<0){
            MMHeap[1] = MMHeap[number];
            siftdown(1);
        }
        else{
            MMHeap[2] = MMHeap[number];
            siftdown(2);

    }

    public void insert(E key){

    }

    public MinMaxHeap()
    {
        // initialise instance variables

    }

    //minOrMaxLevel accepts an integer that represents the position of the node in the array
    //returns 0 if position is on a minimum level
    //returns 1 if position is on a maximum level
    //working
    public static int minOrMaxLevel(int pos){
        return (int) (Math.floor(Math.log(pos+1)/Math.log(2))%2);
    }

    //isLeaf method provided by Dr. McCauley
    // Return true if pos a leaf position, false otherwise
    public boolean isLeaf(int pos)
    { 
        return (pos >= number/2) && (pos < number); 
    }

    //leftChild method provided by Dr. McCauley
    // Return position for left child of pos
    public int leftChild(int pos) {
        if (pos >= number/2) return -1;
        return 2*pos + 1;
    }

    //rightChild method provided by Dr. McCauley
    // Return position for right child of pos
    public int rightChild(int pos) {
        if (pos >= (number-1)/2) return -1;
        return 2*pos + 2;
    }

    public int smallestGrandChild(){
        int small = 3;
        if (MMHeap[4].compareTo(MMHeap[3])<0){
            small = 4;
        }
        if (MMHeap[5].compareTo(MMHeap[4])<0){
            small = 5;
        }
        if (MMHeap[6].compareTo(MMHeap[5])<0){
            small = 6;
        }
        return small;

    }

    public static void main(String[] args){
        int[] MMHeap = new int[]{-9,110,5,12,33,4,10};
        System.out.println("Should print 4 "+MMheap.smallestGrandChild());
        
        
        int[] nums = new int[10];
        for (int i=0; i<10; i++){
            nums[i] = i;
        }

        System.out.println(minOrMaxLevel(5));  //0
        System.out.println(minOrMaxLevel(9));  //1
        System.out.println(minOrMaxLevel(10)); //1
        System.out.println(minOrMaxLevel(1));  //1
        System.out.println(minOrMaxLevel(0));  //0
    }
}
