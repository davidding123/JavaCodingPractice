class Vertex{
  public List adj;
  public boolean known;
  public DistType dist;
  public Vertex path;
}

void dijkstra(Vertex s){
  for each vertex v{
    v.dist = INFINITY;
    v.known = false;
  }
  s.dist = 0;
  while(there is an unknown distance vertex){
    Vertex v = smallest unknown distance vertex;
    v.known = true;
    for each Vertex w adjacent to v
      if(!w.known){
        DistType cvw = cost of edge from v to w;
        if(v.dist + cvw < w.dist){
          decrease(w.dist to v.dist+cvw);
          w.path = v;
        }
      }
  }
}
完美契合稠密图 O(V^2)
  
  
