package SlidingWindow;

import java.util.HashMap;

public class CountNoOfNiceSubarray {
    //Approach-1-using HashMap
    public static int numberOfSubarraysApproach1(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int count = 0;
        
        int res = 0;
        
        map.put(0,1);
        
        for(int i = 0;i<nums.length ; i++){
            
            
            if( nums[i]%2 != 0 ) count++;
            
            
            res += map.getOrDefault( count - k , 0 );
            
            map.put( count , map.getOrDefault( count , 0 ) + 1 );
                
                
        }
        
        return res;
        
    }

    //Approach-2-using SlidingWindow
    public static int numberOfSubarraysApproach2(int[] nums, int k) {
        
        int i = 0 , j = 0;
        
        int count = 0;
        
        int res = 0 , final_ans = 0 ;
        
         count += nums[0]%2;
        
        for (   ; j<nums.length; ){
            
           
            
            if(count == k)
            {
                res++;
                
                j++;

                count += j<nums.length ? nums[j]%2 : 0;
            }
            else if(count>k){
                
                final_ans += res;
                
                count -= nums[i]%2;
                
                if(count==k) res = 0;
                
                i++;
            }
            else{
                
                j++;
                
                count += j<nums.length ? nums[j]%2 : 0;
            
            }
            
            
            
            
        }
        
        while( count == k )
        {
            final_ans += res;
            
            count-=nums[i]%2;
            
            i++;
        }
        
        return final_ans;
        
    }
}
