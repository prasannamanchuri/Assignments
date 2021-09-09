package com.capgemeni.assignment1;

import java.util.HashMap;
import java.util.Map;
public class StudMarks {

	public static void main(String[] args) {
		Map<String,Map<String,Integer>> map=new HashMap<String,Map<String,Integer>>() {{
			put("A",new HashMap<String,Integer>() {{
				put("Subject1",10);
				put("Subject2",30);
				put("Subject3",7);
			}});
			put("B",new HashMap<String,Integer>() {{
				put("Subject1",20);
				put("Subject2",30);
				put("Subject3",40);
			}});
			put("C",new HashMap<String,Integer>() {{
				put("Subject1",5);
				put("Subject2",10);
				put("Subject3",20);
			}});
			
		}};
		int subjSum=0,subjAvg=0,studAvg=0;
		Map<String,Integer> subjectMarks=new HashMap<String,Integer>();
		Map<String,Integer> studMarks=new HashMap<String,Integer>();
		Map<String,Integer> AvgMarks=new HashMap<String,Integer>();
		for(Map.Entry<String,Map<String,Integer>> entry:map.entrySet()) {
			Map<String,Integer> values=entry.getValue();
			int studSum=0;
			for(Map.Entry<String, Integer> entry1:values.entrySet()) {
				if(subjectMarks.get(entry1.getKey())!=null) {
					subjectMarks.put(entry1.getKey(), subjectMarks.get(entry1.getKey())+entry1.getValue());
				}else {
					subjectMarks.put(entry1.getKey(), entry1.getValue());
				}
				subjSum+=entry1.getValue();
				studSum+=entry1.getValue();
			}
			studMarks.put(entry.getKey(), studSum);
			AvgMarks.put(entry.getKey(), studSum/values.size());
		}
		subjAvg=subjAvg/subjectMarks.size();
		for(Map.Entry<String, Integer> entry:studMarks.entrySet()) {
			studAvg+=entry.getValue();
		}
		studAvg=studAvg/studMarks.size();
		System.out.println("Total Student Marks"+studMarks);
		System.out.println("Average Student Marks"+AvgMarks);
		System.out.println("Total Subject Marks"+subjectMarks);
		System.out.println("SubjSum->"+subjSum+",subjAvg->"+subjSum/subjectMarks.size()+",StudAvg->"+studAvg);
	}
}
	