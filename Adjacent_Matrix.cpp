// Adjacent matrix in cpp
//Output
/*Enter number of nodes: 3
Enter edge (-1 -1 to exit): 1
0
Enter edge (-1 -1 to exit): 1
1
Enter edge (-1 -1 to exit): 2
1
Enter edge (-1 -1 to exit): 3
0
Enter edge (-1 -1 to exit): 1
1
Enter edge (-1 -1 to exit): 1
0
0 1 0 
1 1 1 
0 1 0  */

//Solution

#include <iostream>
using namespace std;

int vertArr[10][10]; // the adjacency matrix initially 0 
int count = 0;
void Graph(int n) {      // creating function graph with parameter n
   int i, j;
   for(i = 0; i < n; i++) {     //loop traversing
      for(j = 0; j < n; j++) {
         cout << vertArr[i][j] << " ";
      }
      cout << endl;
   }
}

void add_edge(int u, int v)         //creating function add-edge with parameter 
{ // function to add edge into the matrix
    vertArr[u][v] = 1;
    vertArr[v][u] = 1;
}
int main(int argc, char *argv[])      //main function
{
    int nodes, max_edges, u, v;

    cout << "Enter number of nodes: ";
    cin >> nodes;
    max_edges = nodes * (nodes - 1);
    for (int i = 0; i < max_edges; i++)
    {
        cout << "Enter edge (-1 -1 to exit): ";
        cin >> u >> v;
        if ((u == -1) && (v == -1))
            break;
        add_edge(u, v);
    }
    Graph(nodes);
    return 0;
}
