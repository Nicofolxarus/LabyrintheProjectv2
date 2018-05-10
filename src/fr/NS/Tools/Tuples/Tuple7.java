package fr.NS.Tools.Tuples;

public class Tuple7<T1, T2, T3, T4, T5, T6, T7> extends Tuple6<T1, T2, T3, T4, T5, T6> {
	private T7 Item7;

	public Tuple7(T1 Item1, T2 Item2, T3 Item3, T4 Item4, T5 Item5, T6 Item6, T7 Item7) {
		super(Item1, Item2, Item3, Item4, Item5, Item6);
		this.Item7 = Item7;
	}

	public T7 getItem7() {
		return Item7;
	}

	public void setItem7(T7 item7) {
		Item7 = item7;
	}
}
