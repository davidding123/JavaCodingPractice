int find(int parent[], int i) 
    { 
        if (parent[i] == -1) 
            return i; 
        return find(parent, parent[i]); 
    } 
  
    // A utility function to do union of two subsets 
    void Union(int parent[], int x, int y) 
    { 
        int xset = find(parent, x); 
        int yset = find(parent, y); 
        parent[xset] = yset; 
    } 
  
  
    // The main function to check whether a given graph 
    // contains cycle or not 
    int isCycle( Graph graph) 
    { 
        // Allocate memory for creating V subsets 
        int parent[] = new int[graph.V]; 
  
        // Initialize all subsets as single element sets 
        for (int i=0; i<graph.V; ++i) 
            parent[i]=-1; 
  
        // Iterate through all edges of graph, find subset of both 
        // vertices of every edge, if both subsets are same, then 
        // there is cycle in graph. 
        for (int i = 0; i < graph.E; ++i) 
        { 
            int x = graph.find(parent, graph.edge[i].src); 
            int y = graph.find(parent, graph.edge[i].dest); 
  
            if (x == y) 
                return 1; 
  
            graph.Union(parent, x, y); 
        } 
        return 0; 
    } 
