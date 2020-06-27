package com.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Test1 {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> a_ = (ArrayList<Integer>) a;
        ArrayList<Integer> b_ = (ArrayList<Integer>) b;
        
        int i = 0;
        int suma=0;
        int sumb=0;
        while ( i<a_.size() || i<b_.size()) {
        	if (a_.get(i) > b_.get(i))
        		suma++;
        	else if (a_.get(i) < b_.get(i))
        		sumb++;
        	i++;
        }
        res.add(0,suma);
        res.add(1,sumb);
        		
        return (res);

    }

    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //    .map(Integer::parseInt)
          //  .collect(toList());

        //List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //    .map(Integer::parseInt)
        //    .collect(toList());
    	List <Integer> a = new ArrayList<Integer>();
    	a.add(2);
    	a.add(4);
    	a.add(8);
    	
    	List <Integer> b = new ArrayList<Integer>();
    	b.add(2);
    	b.add(5);
    	b.add(7);
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0));
        System.out.println(result.get(1));

        /*bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}


