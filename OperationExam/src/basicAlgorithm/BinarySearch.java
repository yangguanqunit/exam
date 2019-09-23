/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicAlgorithm;

/**
 *
 * @author yangguanqun
 */
public class BinarySearch {
    
    public static void main(String[] args){
        
        
    }
    
    
    public static int BS(int[] l,int key){
        int low=0;
        int high=l.length-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(key==l[mid])
                return mid;
            else if(key<l[mid]){
                high=mid-1;
            }
            else if(key>l[mid]){
                low=mid+1;
            }
        }
        return -1;
    }
    
}
