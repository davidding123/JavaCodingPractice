void topsort () throws CycleFoundException{
  Queue<Vertex> q = new Queue<Vertex>();
  int counter = 0;
  for each Vertex v 
    if(v.indegree == 0) q.enqueue(v);
  while(!q.isEmpty()){
    Vertex v = q.dequeue();
    v.topNum = ++counter;
    for each Vertex w adjacent to v
      if(--w.indegree == 0) q.enqueue(w);
  }
  if(counter != NUM_VERTICES) throw new CycleFoundException();
}
