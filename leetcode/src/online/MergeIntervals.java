package online;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {

	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

		if(intervals==null||intervals.size()<=1){
			return intervals;
		}
		
		Collections.sort(intervals, new IntervalComparator());
		ArrayList<Interval> res = new ArrayList<Interval>();
		Interval pre= intervals.get(0);
		
		for(int i=1;i<intervals.size();i++){
			Interval cur = intervals.get(i);
			
			if(pre.end>=cur.start){
				Interval merge = new Interval(pre.start,Math.max(pre.end,cur.end));
			    pre=merge;
			}
			else {
				res.add(pre);
				pre=cur;
			}
		}
		res.add(pre);
		return res;
	}
	class IntervalComparator implements Comparator<Interval>{
		public int compare(Interval l1,Interval l2){
			return l1.start-l2.start;
		}
		
	}
}






