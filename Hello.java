public enum Day{
	Sunday("星期日"),Monday("星期一"),Tuesday("星期二"),Wednesday("星期三"),Thursday("星期四"),Friday("星期五"),Saturday("星期六");
	private String name;
	private Day(String name){
		this.name=name;
	}
	@Override
	public String toString(){
		return this.name;
	}
}
public class Hello{
	public static void main(String[] args) {
		System.out.println(Day.Sunday);
		System.out.print(Day.Monday);
	}
}