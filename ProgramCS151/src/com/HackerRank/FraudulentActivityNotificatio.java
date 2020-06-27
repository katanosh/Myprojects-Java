package com.HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Collections;

public class FraudulentActivityNotificatio {

	   static int activityNotifications_00(int[] expenditure, int d) {
		   int i=0;
		   //int[] tmp= new int[d];
		   PriorityQueue pq = new PriorityQueue();
		   int note = 0, median;
		   while (i<expenditure.length-d) {
			  for (int j = 0; j<d; j++) {
				  //tmp[j] = expenditure[i+j];
				  pq.add(expenditure[i+j]);
			  }
			  //Arrays.sort(tmp, 0, d);
			  /*for (int j=0 ; j<tmp.length; j++) {
				  System.out.println(" j " + j + "----> " + tmp[j]);
			  }*/
			  int m = 0;
			  m = d/2;
			  for (int j=0;j<=m-1; j++)
				  pq.remove();
			  if (d%2 == 0) {
				  //median = tmp[m] + tmp[m-1];
				  median = (int)pq.poll() + (int)pq.poll();
			  } else {
				  median = (int)pq.poll();
			  }
			  
			  if (expenditure[i+d]>=2*median)
				  note++;
			  pq.clear();
			  System.out.println("note "+ note + "Expenditure " + expenditure[i+d] + "median " + median );
			  i++;
			  
		   }
		   return note;
		   
	    }
	   static double countingSortMedian(int[] a, int d) {
		   Integer max = Integer.MIN_VALUE;
		   for (int i=0; i<a.length ; i++) {
			   if (a[i]>max) max = a[i];
		   }
		   int[] c = new int[max+1];
		   int[] b = new int[a.length];
		   for (int i=0; i<c.length ;i++) c[i] =0;
		   for (int i=0; i<a.length ; i++) {
			   c[a[i]]++;
		   }
		   for (int i=1; i<=max ; i++) {
			   c[i] += c[i-1];
		   }
		   for (int i = a.length-1; i>=0;i--) {
			   b[--c[a[i]]] = a[i];
		   }
		   for (int i = 0; i<a.length; i++)
			   a[i] = b[i];
		   int m=d/2;
		   double median=0;
		   if (d%2 == 0) 
			   median =  (a[m] + a[m-1])/2.0;
		   else
			   median = a[m];
		   return median;

	   }
	   static int activityNotifications(int[] expenditure, int d) {
		   int i=0;
		   int[] tmp= new int[d];
		   int note = 0;
		   double median;
		   while (i<expenditure.length-d) {
			  for (int j = 0; j<d; j++) {
				  tmp[j] = expenditure[i+j];
			  }
			  median = countingSortMedian(tmp, d);
			  
			  if (expenditure[i+d]>=2*median)
				  note++;
			  System.out.println("note "+ note + "Expenditure " + expenditure[i+d] + "median " + median );
			  i++;
			  
		   }
		   return note;
		   
	    }

	public static void main(String[] args) {
		//int[] e = {2,3,4,2,3,6,8,4,5};
		//[] e = {10,20,30,40,50};
		int[] e = {1,2,3,4,4};
		System.out.println(activityNotifications(e, 4));

	}

}
