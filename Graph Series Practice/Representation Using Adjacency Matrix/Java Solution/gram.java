import java.io.*;
class gram{
    public static void main(String args[]){
        int n=3,m=3;
        int adj[][]=new int[n+1][n+1];
        
        adj[1][2]=1;
        adj[2][1]=1;

        adj[2][3]=1;
        adj[3][2]=1;

        adj[1][3]=1;
        adj[3][1]=1;

        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
            System.out.print(adj[i][j]+" ");
        }
        System.out.println();
        }
        
    }
}
