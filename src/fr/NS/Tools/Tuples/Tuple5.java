package fr.NS.Tools.Tuples;

public class Tuple5<T1, T2, T3, T4, T5> extends Tuple4<T1, T2, T3, T4> {
	private T5 Item5;

	public Tuple5(T1 Item1, T2 Item2, T3 Item3, T4 Item4, T5 Item5) {
		super(Item1, Item2, Item3, Item4);
		this.Item5 = Item5;
	}

	public T5 getItem5() {
		return Item5;
	}

	public void setItem5(T5 item5) {
		Item5 = item5;
	}
}
