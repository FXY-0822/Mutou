package hello;
class Solution {
	private int a;
	private String name;
	public Solution(int a,String name) {
		this.a=a;
		this.name=name;
	}
	public String toString() {
		return "����һ��Solution�࣬������һ������a="+this.a+"��һ��string��name"+this.name;
	}
	public static void main(String[] args) {
		Solution s=new Solution(1,"С��");
		System.out.print(s);
	}
}