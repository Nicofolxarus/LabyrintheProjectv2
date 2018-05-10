package fr.NS.Tools.Tuples;

public class Tuple6<T1, T2, T3, T4, T5, T6> extends Tuple5<T1, T2, T3, T4, T5> {
	private T6 Item6;

	public Tuple6(T1 Item1, T2 Item2, T3 Item3, T4 Item4, T5 Item5, T6 Item6) {
		super(Item1, Item2, Item3, Item4, Item5);
		this.Item6 = Item6;
	}

	public T6 getItem6() {
		return Item6;
	}

	public void setItem6(T6 item6) {
		Item6 = item6;
	}
}
