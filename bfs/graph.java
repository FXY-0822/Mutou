package graph.bfs;

public class graph {
    private int vernum;
    private int edgenum;
    private ver[] arr=new ver[1000];
    public graph() {
    }
    public graph(int vernum, int edgenum, ver[] arr) {
        this.vernum = vernum;
        this.edgenum = edgenum;
        this.arr = arr;
    }

    public int getVernum() {
        return vernum;
    }

    public void setVernum(int vernum) {
        this.vernum = vernum;
    }

    public int getEdgenum() {
        return edgenum;
    }

    public void setEdgenum(int edgenum) {
        this.edgenum = edgenum;
    }

    public ver[] getArr() {
        return arr;
    }

    public void setArr(int i,String elem) {
        ver veri=new ver(elem,null,i);
        this.arr[i]=veri;
    }


}
