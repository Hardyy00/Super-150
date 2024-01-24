package Lec66;

import java.util.HashMap;
import java.util.Map;

public class DSU {

    public class Node{

        int node;
        Node parent;
        int rank;
    }

    Map<Integer,Node> map = new HashMap<>();

    public void create(int v){

        Node node = new Node();
        node.node = v;
        node.parent = node;
        node.rank = 0;

        map.put(v,node);
    }

    public int find(int v){

        Node rn = map.get(v);

        return find(rn).node;

    }

    private Node find(Node  rn){

        if(rn.parent == rn){
            return rn;
        }

        return rn.parent = find(rn.parent);
    }

    public void Union(int e1, int e2){
        Node rv1 = map.get(e1);
        Node rv2 = map.get(e2);

        Node ren1 = find(rv1);
        Node ren2 = find(rv2);

        if(ren1.rank == ren2.rank){
            ren1.parent = ren2;
            ren2.rank++;
        }else if(ren1.rank > ren2.rank){
            ren2.parent = ren1;
        }else{
            ren1.parent = ren2;
        }
    }
}
