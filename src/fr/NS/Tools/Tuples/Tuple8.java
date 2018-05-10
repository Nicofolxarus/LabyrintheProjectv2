package fr.NS.Tools.Tuples;

public class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> extends Tuple7<T1, T2, T3, T4, T5, T6, T7> {
	private T8 Item8;

	public Tuple8(T1 Item1, T2 Item2, T3 Item3, T4 Item4, T5 Item5, T6 Item6, T7 Item7, T8 Item8) {
		super(Item1, Item2, Item3, Item4, Item5, Item6, Item7);
		this.Item8 = Item8;
	}

	public T8 getItem8() {
		return Item8;
	}

	public void setItem8(T8 item8) {
		Item8 = item8;
	}
}
