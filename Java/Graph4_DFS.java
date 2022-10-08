/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Striver;
import java.util.*;
/**
 *
 * @author Nitish Kumar Maurya
 */
public class Graph4_DFS {
    public static void dfs1(int node,boolean []vis,ArrayList<ArrayList<Integer>>adj,ArrayList<Integer>dfs)
    {
        dfs.add(node);
        vis[node]=true;
        for(Integer it:adj.get(node))
        {
            if(vis[it]==false)
            {
                dfs1(it,vis,adj,dfs);
            }
        }
    }
    public static ArrayList<Integer> dfsOfGraph(int n,ArrayList<ArrayList<Integer>>adj)
    {
        ArrayList<Integer>dfs=new ArrayList<>();
        boolean []visit=new boolean[n+1];
        for(int i=1;i<=n;i++)
        {
            if(visit[i]==false)
            {
                dfs1(i,visit,adj,dfs);
            }
        }
        return dfs;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=7,w=6;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<w;i++)
        {
            int u=sc.nextInt(),v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        ArrayList<Integer>dfs=dfsOfGraph(n,adj);
        for(Integer it:dfs)
        {
            System.out.print(it+" ");
        }
    }
}
