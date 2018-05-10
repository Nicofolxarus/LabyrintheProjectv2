package fr.NS.Tools.Tuples;

public class Tuple1<T1> extends Tuple {
	private T1 Item1;

	public Tuple1(T1 Item1) {
		this.Item1 = Item1;
	}

	public T1 getItem1() {
		return Item1;
	}

	public void setItem1(T1 item1) {
		Item1 = item1;
	}
}
