package Lec67;



import java.util.*;

public class MST01 {

    private HashMap<Integer, HashMap<Integer,Integer>> map = new HashMap<>();

    public MST01(int v){

        for(int i=1;i<=v;i++){

            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int a, int b, int cost){

        map.get(a).put(b,cost);
        map.get(b).put(a,cost);
    }

    class PrimsPair {
        int e1;
        int acqv;
        int cost;

        public PrimsPair(int e1, int acvq, int cost) {
            this.e1 = e1;
            this.acqv = acvq;
            this.cost = cost;
        }

        public String toString() {
            return this.e1 + " " + this.acqv + " @ " + this.cost;
        }
    }

    public void Prims() {

        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                // TODO Auto-generated method stub
                return o1.cost - o2.cost;
            }
        });
        int ans = 0;
        pq.add(new PrimsPair(1, 1, 0));
        HashSet<Integer> visited = new HashSet<>();
        while (!pq.isEmpty()) {

            PrimsPair rp = pq.poll();

            if (visited.contains(rp.e1)) {
                continue;
            }

            visited.add(rp.e1);
            ans = ans + rp.cost;

            for (int nbrs = 1;nbrs<=map.size();nbrs++) {

                if (!visited.contains(nbrs)) {
                    int cost = map.get(rp.e1).get(nbrs);
                    pq.add(new PrimsPair(nbrs, rp.e1, cost));
                }
            }
        }

        System.out.println(ans);
    }


    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n  =  cin.nextInt();
        int m  =  cin.nextInt();

        MST01 ms = new MST01(n);

        for(int i=0;i<m;i++){
            int a = cin.nextInt();
            int b = cin.nextInt();

            ms.addEdge(a,b,1);
        }

        ms.Prims();


    }
}
