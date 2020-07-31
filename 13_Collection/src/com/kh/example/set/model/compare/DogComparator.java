package com.kh.example.set.model.compare;

import java.util.Comparator;

import com.kh.example.set.model.vo.Dog;

public class DogComparator implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		double standard = o1.getWeight();
		double object = o2.getWeight();
		
		if(standard > object) {
			return 1;
		}else if(standard == object) {
//			return 0; 몸무게만 비교
			return o1.getName().compareTo(o2.getName()); //이름까지 비교해서 정렬
		}else {
			return -1;
		}
		
		
	}

}
