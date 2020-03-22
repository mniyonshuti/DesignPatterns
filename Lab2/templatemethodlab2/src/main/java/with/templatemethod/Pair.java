package with.templatemethod;

import java.util.Comparator;

public class Pair<K,V> implements Comparable {
	private K k;
	private V v;
	
	public Pair(K k, V v) {
		this.k = k;
		this.v = v;
	}
	public K getK() {
		return k;
	}
	public void setK(K k) {
		this.k = k;
	}
	public V getV() {
		return v;
	}
	public void setV(V v) {
		this.v = v;
	}
	
	@Override
	public String toString() {
		return "("+ k + ","+ v+")";
	}
	@Override
	public int compareTo(Object o) {
		Pair<String , Integer> p1 = (Pair)o;
		String s1 = (String)p1.k;
		String s2 = (String)this.k;
		return s2.compareTo(s1);
	}

//	
//	
	//@Override
//	public int compare(Object o1, Object o2) {
//		Pair p1 = (Pair)o1;
//		Pair p2 = (Pair)o2;
//		String s1 = (String)p1.k;
//		String s2 = (String)p2.k;
//		return s1.compareTo(s2);
//	}
	
	

}
