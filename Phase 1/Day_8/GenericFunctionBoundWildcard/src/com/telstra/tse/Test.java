package com.telstra.tse;
import java.util.List;

public class Test {

	//is find the sum of all the elements in the given list
	//what type of list: Upper Bound : Numbers(Integers/Double/Byte/Long/Short)
	
	public static Number sumOfList(List<? extends Number> Nlist) {
		double s  = 0.0;
		for(Number n:Nlist) {
			s+=n.doubleValue();
		}
		return s;
	}
	
	//LowerBound example: Number
	public static Number sumOfListA(List<? super Double> ilist) {
		double s = 0.0;
		for(Object n:ilist) {
			s+= ((Number) n).doubleValue();
		}
		return s;
	}
	
	//UnBounded example works with object class method : General methods like size()
	public static Number printList(List<?> list) {
		for(Object e:list) {
			System.out.println(e);
		}
		return list.size();
	}
	
	//<extends Comparable<T>> means that <T> is having upperbound of Comparable<T> objects.
	//All wrapper classes and under defined class which implements Comparable<T> can be passed
	//and returned
	public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
		T max = x;
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		return max;
	}
}
