package graph.bfs;

import java.util.*;

public class test {
    public static boolean[] isempty=new boolean[100];
    public static void main(String[] args) {
        System.out.println("你好，请输入顶点数");
        Scanner in=new Scanner(System.in);
        int vernum = in.nextInt();
        graph graph=new graph();
        graph.setVernum(vernum);
        for (int i = 0; i <vernum ; i++) {
            System.out.println("输入当前顶点元素");
            graph.setArr(i,in.next());
        }

        System.out.println("请输入边数");
        int edgenum=in.nextInt();
        graph.setEdgenum(edgenum);
        for (int i = 0; i <edgenum ; i++) {
            String prev=in.next();
            String flov=in.next();
            ver Pre = GetVer(prev,graph);
            if (Pre==null) {
                System.out.println("没有找到此顶点,请重新输入边");
                i--;
                continue;
            }
            ver flo=new ver(flov,null);
            int i1 = GetIndex(flo, graph);
            flo.setIndex(i1);
            flo.setNext(Pre.getNext());
            Pre.setNext(flo);

            //下面是无向图
            ver flov1 = GetVer(flo.getElem(), graph);
            ver prev1=new ver(Pre.getElem(),Pre.getNext(),Pre.getIndex());
            prev1.setNext(flov1.getNext());
            flov1.setNext(prev1);
        }

        for (int i = 0; i <graph.getVernum() ; i++) {
            System.out.print(graph.getArr()[i].getElem());
            ver posi;
            posi=graph.getArr()[i].getNext();
            while (posi!=null){
                System.out.print("-->"+posi.getElem());
                posi=posi.getNext();
            }
            System.out.println();
        }

        BFS(graph,graph.getArr()[0]);
    }
    public static ver GetVer(String name,graph graph){
        for (int i = 0; i<graph.getVernum(); i++) {
            if (graph.getArr()[i].getElem().equals(name))
                return graph.getArr()[i];
        }
        return null;
    }
    private static int  GetIndex(ver flo,graph graph){
        for (int i = 0; i <graph.getVernum() ; i++) {
            if (graph.getArr()[i].getElem().equals(flo.getElem()))
                return graph.getArr()[i].getIndex();
        }
        return 0;
    }
    public static void BFS(graph graph,ver start){
        Queue<ver> queue=new LinkedList<>();
        queue.offer(start);
        isempty[start.getIndex()]=true;
        while (!queue.isEmpty()){
            ver port = queue.poll();
            ver ver = GetVer(port.getElem(), graph);
            assert ver != null;
            ver next = ver.getNext();
            while (next!=null){
                if (!isSeen(next)){
                    queue.offer(next);
                    isempty[next.getIndex()]=true;
                }

                next=next.getNext();
            }

            System.out.println(port.getElem());
        }
    }
    public static boolean isSeen(ver vertex){
        return isempty[vertex.getIndex()];
    }
}
