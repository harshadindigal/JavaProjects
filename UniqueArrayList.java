import java.util.ArrayList;

public class UniqueArrayList extends ArrayList<String>{
	@Override
	public boolean add(String s){
		if(this.contains(s)){
			return false;
		}
		this.add(this.size(), s);	
		return true;
	}
}
