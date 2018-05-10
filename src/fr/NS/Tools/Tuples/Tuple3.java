package fr.NS.Tools.Tuples;

public class Tuple3<T1, T2, T3> extends Tuple2<T1, T2> {
	private T3 Item3;

	public Tuple3(T1 Item1, T2 Item2, T3 Item3) {
		super(Item1, Item2);
		this.Item3 = Item3;
	}

	public T3 getItem3() {
		return Item3;
	}

	public void setItem3(T3 item3) {
		Item3 = item3;
	}
}
