package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		int standard = o1.getScore();
		int object = o2.getScore();
		
		
		if(standard > object) {
			return -1;	//else와 결과를 뒤집기만 하면 반대되는 결과를 만들 수 있다.
			
		}else if(standard == object) {
//			return 0;
			
			String standardName = o1.getName();
			String objectName = o2.getName();
			return standardName.compareTo(objectName);// 같은 점수일 경우 이름으로 오름차순
		}else {
			return 1;
		}	
	}
}
