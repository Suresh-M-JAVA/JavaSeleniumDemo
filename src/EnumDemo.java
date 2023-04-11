
enum level{
	BEGINNER("B"), INTERMEDIATE("I"), ADVANCED("A");
private String abbr;
	level(String ab) {
		abbr=ab;
	}
	public String getabbr() {
		return abbr;
	}
}
public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		level l1= level.BEGINNER;
		level l2 = level.ADVANCED;
		level l3 = level.INTERMEDIATE;
		System.out.println(l1);
		System.out.println(l1.getabbr());
		System.out.println(l1.compareTo(l2));
		System.out.println(l1.toString());
		System.out.println(l1.compareTo(l2));
		System.out.println(l1.name());
	}

}
