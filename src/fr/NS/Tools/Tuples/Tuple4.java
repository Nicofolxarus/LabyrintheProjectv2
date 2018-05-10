package fr.NS.Tools.Tuples;

public class Tuple4<T1, T2, T3, T4> extends Tuple3<T1, T2, T3> {
	private T4 Item4;

	public Tuple4(T1 Item1, T2 Item2, T3 Item3, T4 Item4) {
		super(Item1, Item2, Item3);
		this.Item4 = Item4;
	}

	public T4 getItem4() {
		return Item4;
	}

	public void setItem4(T4 item4) {
		Item4 = item4;
	}
}
