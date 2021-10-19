import java.io.*;
import java.util.*;
 
public class gramu {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int n=sc.ni();
        int m=sc.ni();
        int adj[][]=new int[n+1][n+1];
        int u,v;
        for(int i=0;i<m;i++){
            u=sc.ni();
            v=sc.ni();
            adj[u][v]=1;
            adj[v][u]=1;
        }
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<n+1;j++){
                pw.print(adj[i][j]+" ");
            }
            pw.println();
        }
        
        pw.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int ni() {
            return Integer.parseInt(next());
        }
    }
}
