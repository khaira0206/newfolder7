package Array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Interval{
	
	int start, end;
	
	public Interval(int start, int end){
		
		this.start = start;
		this.end = end;
	}
}
public class merge_Intervals {

	public List<Interval> merge(List<Interval> intervals) {
	    if (intervals.size() <= 1)
	        return intervals;
	    
	    // Sort by ascending starting point using an anonymous Comparator
	    intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
	    
	    List<Interval> result = new LinkedList<Interval>();
	    int start = intervals.get(0).start;
	    int end = intervals.get(0).end;
	    
	    for (Interval interval : intervals) {
	        if (interval.start <= end) // Overlapping intervals, move the end if needed
	            end = Math.max(end, interval.end);
	        else if(interval.start >= end){                     // Disjoint intervals, add the previous one and reset bounds
	            result.add(new Interval(start, end));
	            start = interval.start;
	            end = interval.end;
	        }
	    }
	    
	    // Add the last interval
	    result.add(new Interval(start, end));
	    return result;
	}
	public static void main(String args[]){
		
		Interval inter1 = new Interval(1, 3);
		Interval inter2 = new Interval(2, 6);
		Interval inter3 = new Interval(8, 10);
		Interval inter4 = new Interval(15, 18);
		
		List<Interval> intervals = new ArrayList<Interval>();
		intervals.add(inter1);
		intervals.add(inter2);
		intervals.add(inter3);
		intervals.add(inter4);
		
		merge_Intervals mi = new merge_Intervals();
		intervals = mi.merge(intervals);
		
		
		for (Interval interval : intervals) {
			System.out.print("["+interval.start+" "+ interval.end +"] ");
		}
	}
}
