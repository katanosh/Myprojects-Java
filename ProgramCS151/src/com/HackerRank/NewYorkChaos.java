package com.HackerRank;

public class NewYorkChaos {
	/*
	 *        for (int i = q.length - 1; i > 0; i--) {
            	if (q[i-1] != (i+1)){
                if (q[i-1] == i+1){
                    c++;
                    t = q[i];
                    q[i] = q[i-1];
                    q[i-1] = t;
                } else if (q[i-2] == i+1){
                    c+=2;
                    t = q[i-1];
                    q[i-1] = q[i-2];
                    q[i-2] = t;
                    t = q[i];
                    q[i] = q[i-1];
                    q[i-1] = t;
                } else {
                    System.out.println("Too chaotic");
                }
              }
	 */
	static void minimumChaos_00(int[] q) {
	    int lastIndex = q.length - 1;
	    int swaps = 0;
	    boolean swaped = true;
	    int comps=0;
	    	    
	    // check if the queue is too chaotic
	    for(int i=0; i<q.length; i++)
	    	 if ((q[i] - 1) - i > 2)  {
	    	     System.out.println( "Too chaotic");
	    		 return;
			}
	     // bubble sorting to find the answer
	    /*for(int i=0;i<lastIndex;i++) {
	    	for(int j=0;j<lastIndex;j++) {
	    	    comps += 1;
	    	    if (q[j] > q[j+1]) {
	    	        int t = q[j];
	    	        q[j] = q[j+1];
	    	        q[j+1] = t;
	    	        swaps += 1;
	    	        swaped = true;
	    	    }
	    	}
	    	if (swaped)
	    	  swaped = false;
	    	else
	    	  break;
	    }*/
	    int j=0;
	    while (swaped) {
	    	swaped = false;
	    	for (int i=0; i<lastIndex; i++) {
	    		j = i+1;
	    		if (q[i]>q[j]) {
	    	        int t = q[i];
	    	        q[i] = q[j];
	    	        q[j] = t;
	    	        swaps += 1;
	    	        swaped = true;	
	    		}
	    	}
	    }
	    System.out.println(swaps);
	}
	static void minimumChaos_01(int[] q) {
        int swap = 0;
        int bribes;
        int pos = 0;
        for(int i = q.length-1; i >= 0; i--) {
            int j = 0;

            bribes = q[pos] - (pos++);
            if (bribes > 2) {
                System.out.println("Too chaotic");
                return;
            }
            if (q[i] - 2 > 0){
                j = q[i] - 2;
            }
            
            while(j <= i) {
                if (q[j] > q[i]){
                    swap++;
                }
                j++;
            }
            pos++;
        }
        System.out.println(swap);
	}
	static int minimumChaos(int[] q) {
		int c=0;
		for (int i = q.length - 1; i >= 0; i--) {
	        if (q[i] - (i + 1) > 2) {
	            System.out.println("Too chaotic");
	            c = -1;
	        }else {
	        	for (int j = Math.max(0, q[i] - 2); j < i; j++)
	        		if (q[j] > q[i]) c++;
	        }	
	    }
		return c;		 
	}
	public static void main(String[] args) {
		//int[] q = {2,1,5,3,4};
		int[] q = {1 ,2 ,5 ,3 ,7 ,8 ,6 ,4};
		minimumChaos_00(q);
		
	}

}
