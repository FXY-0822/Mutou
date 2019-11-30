class ListNode {
    private String student="";
    private int score=0;
    public ListNode(String student,int score){
        this.student=student;
        this.score=score;
    }
    public int getScore(){
    return score;
    }
    public String getStudent(){
        return student;
    }
}
public class list extends ListNode{
    int ex=0;
    public list(String student,int score,int ex){
        super(student,score);
        this.ex=ex;
    }
    public int getScore(){
        return ex+super.getScore();
    }

    public static void main(String[] args) {
        ListNode[] staff=new ListNode[3];
        list boss=new list("殷家乐",90,10);
        staff[0]=boss;
        staff[1]=new ListNode("第二个",90);
        staff[2]=new ListNode("第三个",80);
        for (ListNode e:staff
             ) {
            System.out.println(e.getStudent()+"   "+e.getScore());

        }
    }

}