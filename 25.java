class ListNode {
    private int number;
    private String name;
    public ListNode(int number,String name){
        this.number=number;
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class list extends ListNode{
    private String newname;
    public list(int number,String name,String newname){
        super(number,name);
        this.newname=newname;
    }

    public static void main(String[] args) {
        list nono=new list(1,"殷家乐","你好");
        System.out.println(nono.getName()+nono.newname);
    }

}