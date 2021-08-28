package com.telstra.tse;

public class Date {
	private int dd;
	private int mm;
	private int yyyy;
	public Date(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}
	
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}

	@Override
	public int hashCode() {
		return(dd^mm^yyyy);
	}

	@Override
	public boolean equals(Object obj) {
		
		Date D = (Date) obj;
		return(dd==D.dd && mm==D.mm && yyyy==D.yyyy);
	}

}
