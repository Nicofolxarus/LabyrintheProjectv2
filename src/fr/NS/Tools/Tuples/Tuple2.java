package fr.NS.Tools.Tuples;

public class Tuple2<T1, T2> extends Tuple1<T1> {
	private T2 Item2;

	public Tuple2(T1 Item1, T2 Item2) {
		super(Item1);
		this.Item2 = Item2;
	}

	public T2 getItem2() {
		return Item2;
	}

	public void setItem2(T2 item2) {
		Item2 = item2;
	}
}
