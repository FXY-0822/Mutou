class ListNode{
    private int number;
    private String name="殷家乐";
    public String getname(){
        return this.name;
    }
}
public class list extends ListNode{
    private String newname="我是";

    public String getname(){
        String movename=super.getname();
        this.newname=newname+movename;
        return newname;
    }

    public static void main(String[] args) {
        list nono=new list();
        System.out.print(nono.getname());
    }

}