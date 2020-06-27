package com.LeetCode;

import java.util.*;

public class CircleArrayLoop {
    Map<Integer, Integer>mapR;
    Map<Integer, Integer>mapL;
    public boolean circularArrayLoop(int[] nums) {
        
        mapR = new HashMap<>();
        mapL = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > 0)mapR.put(i, (i + nums[i]) % nums.length);
            else mapL.put(i, (nums.length + ((i + nums[i]) % nums.length)) % nums.length);
        }
        for (Map.Entry<Integer, Integer> entry : mapR.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        	
        
        boolean []vis = new boolean[nums.length];
        boolean []rec = new boolean[nums.length];
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] >= 0 && dfs(mapR, i, vis, rec,nums[i]))return true;
            else if(dfs(mapL, i, vis, rec,nums[i]))return true;
        } 
        return false;
    }
    public boolean dfs(Map<Integer, Integer>map, int idx, boolean[] vis, boolean[] rec, int num)
    {
        if(!map.containsKey(idx))return false;
        
        if(rec[idx]) {
        	System.out.println("rec: " + idx);
        	return !(map.get(idx) == idx);
        }
        
        if(vis[idx]) {
        	System.out.println("vis: " + idx);
        	return false;
        }
        
        rec[idx] = true;
        vis[idx] = true;
        
        if(dfs(map, map.get(idx), vis, rec, num))return true;
        
        rec[idx] = false;
        
        return false;
    }
	public static void main(String[] args) {
		CircleArrayLoop cal = new CircleArrayLoop();
		int[] a = {2, -1, 1, 2, 2};
		if (cal.circularArrayLoop(a))
			System.out.println("Circle");
		else
			System.out.println("No Circle");
	}

}
