void unweigheted(Vertex s){
  for each Vertex v{
    v.dist = INFINITY;
    v.known = false;
  }
  s.dist = 0;
  for(int currDist = 0; currDist < NUM_VERTICES; currDist++){
    for each Vertex v{
      if(!v.known && v.dist == currDist){
        v.known = true;
        for each Vertex w adjacent to v{
          if(w.dist == INFINITY){
            w.dist = currDist + 1;
            w.path = v;
          }
        }
      }
    }
    
    
 void unweighted(Vertex s){
   Queue<Vertex> q = new Queue<Vertex>();
   for each Vertex v 
     v.dist = INFINITY;
   s.dist = 0;
   q.enqueue(s);
   while(!q.isEmpty()){
     Vertex v = q.dequeue();
     for each Vertex w adjacent to v
       if(w.dist == INFINITY){
         w.dist = v.dist + 1;
         w.path = v;
         q.enqueue(w);
       }
   }
 }
    
    
      
 
