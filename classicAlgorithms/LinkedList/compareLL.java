int compare(Node *list1, Node *list2)  
{     
    // Traverse both lists. Stop when either end of a linked  
    // list is reached or current characters don't match 
    while (list1 && list2 && list1->c == list2->c)  
    {          
        list1 = list1->next; 
        list2 = list2->next; 
    } 
      
    //  If both lists are not empty, compare mismatching 
    //  characters 
    if (list1 && list2)  
        return (list1->c > list2->c)? 1: -1; 
  
    // If either of the two lists has reached end 
    if (list1 && !list2) return 1; 
    if (list2 && !list1) return -1; 
      
    // If none of the above conditions is true, both  
    // lists have reached end  
    return 0; 
} 
