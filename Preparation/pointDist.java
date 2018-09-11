//brute force
for(i = 0; i < numPointsInStrip; i++){
  for(j = i + 1; j < numPointsInStrip; j++){
    if(dist(pi, pj) < min) min = dist(pi, pj);
  }
}

//Points are all in the strip and sorted by y-coordinate
for(i = 0; i < numPointsInStrip; i++){
  for(j = i + 1; j < numPointsInStrip; j++){
    if(pi and pj's y-coordinate differ more than threshold) 
       break;
    else
       min = Math.min(min, dist(pi, pj);
                      }
                      }
