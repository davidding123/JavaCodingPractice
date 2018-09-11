Prim算法基本与Dijkstra算法相同
先从一个已知的顶点开始，选取未知点中距离已知点最近的点，然后将这个最近的点标记为已知，重复步骤直到所有点都被标记为已知

Kruskal算法 连续选择最小权的边，当所选的边不产生圈的时候就选取改变，否则舍弃。
ArrayList<Edge> kruskal(List<Edge> edges, int numVertices){
  DisjSets ds = new DisjSets(numVertices);
  PriorityQueue<Edge> pq = new PriorityQueue<>(edges);
  List<edge> mst = new ArrayList<>();
  while(mst.size() != numVertices - 1){
    Edge e = pq.deleteMin(); //Edge e = (u, v)
    SetType uset = ds.find(e.get(u));
    SetType vset = ds.find(e.get(v));
    if(uset != vset){
      mst.add(e);
      ds.union(uset, vset);
     }
     }
     return mst;
     }
