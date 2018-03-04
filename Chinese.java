package test;

public class Chinese{
	static int num=6;
	String name = "China";
	public Chinese(){
		
	}
	public Chinese(int n){
		num = n;
	}
	public static void main(String[] args){
		Chinese chn = new Chinese();
		Chinese cn = new Chinese();
		System.out.println("chn_num: "+chn.num);
		System.out.println("cn_num: "+cn.num);
		System.out.println("chn_name: "+chn.name);
		System.out.println("cn_name: "+cn.name);
	}
}