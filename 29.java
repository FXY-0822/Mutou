package hello;
class Solution {
	private int a;
	private String name;
	public Solution(int a,String name) {
		this.a=a;
		this.name=name;
	}
	public String toString() {
		return "这是一个Solution类，里面有一个整形a="+this.a+"和一个string的name"+this.name;
	}
	public static void main(String[] args) {
		Solution s=new Solution(1,"小范");
		System.out.print(s);
	}
}