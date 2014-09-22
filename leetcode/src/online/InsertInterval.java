package online;

import java.util.ArrayList;

public class InsertInterval {
	 public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
	        ArrayList<Interval> res = new ArrayList<Interval>();

		 if(intervals==null&&newInterval!=null){
	            res.add(newInterval);
	            return res;
	        }
	        if(newInterval==null&&intervals!=null){
	            return intervals;
	        }
	       
	        for(Interval each:intervals){
	        	if(each.end<newInterval.start){
	        		res.add(each);
	        	}
	        	if(each.start>newInterval.end){
	        		res.add(each);
	        		newInterval=each;
	        	}
	        	else if(each.end>=newInterval.start||each.start<=newInterval.end){
	        		int nstart=Math.min(each.start, newInterval.start);
	        		int nend= Math.max(each.end, newInterval.end);
	        		newInterval = new Interval(nstart,nend);
	        	}
	        }
	        res.add(newInterval);
	        return res;

	    }

}
