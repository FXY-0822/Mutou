package graph.bfs;

public class ver {
     private String elem;
     private ver next;
     private int index;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ver(String elem, ver next, int index) {
        this.elem = elem;
        this.next = next;
        this.index = index;
    }

    public ver(){

     }

    public ver(String elem, ver next) {
        this.elem = elem;
        this.next = next;
    }

    public String getElem() {
        return elem;
    }

    public void setElem(String elem) {
        this.elem = elem;
    }

    public ver getNext() {
        return next;
    }

    public void setNext(ver next) {
        this.next = next;
    }
}
