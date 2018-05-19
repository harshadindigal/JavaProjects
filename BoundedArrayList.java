import java.util.ArrayList;

public class BoundedArrayList extends ArrayList<String> {
	private int max;

	public BoundedArrayList(int s) {
		this.max = s;
	}

	public boolean add(String s) {
		if (this.size() >= max) {
			return false;
		}
		this.add(this.size(), s);
		return true;
	}

}
