package compareandcomparate;
public class students implements Comparable<students>{
	String name;
	int id;
	int marks;
	public students(String name, int id, int marks) {
		
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return name+" "+id+" "+marks;
	}
	@Override
	public int compareTo(students anotherstudents) {
		int x=this.id;
		int y=anotherstudents.id;
		  return (x < y) ? -1 : ((x == y) ? 0 : 1);
	}
	

}
