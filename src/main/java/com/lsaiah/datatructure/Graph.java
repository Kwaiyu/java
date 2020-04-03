package com.lsaiah.datatructure;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//邻接矩阵
public class Graph {
    public ArrayList<String> vertexList;//存储节点
    public int [][]edges;//邻接矩阵，用来存储边
    public int numofEdges;//边的数目
    //初始化矩阵
    public  Graph(int n) {
        vertexList=new ArrayList<String>(n);
        edges=new int[n][n];
        numofEdges=0;
    }
    //得到节点的个数
    public int getNumofVertex() {
        return vertexList.size();
    }
    //得到边的个数
    public int getNunofEdges() {
        return numofEdges;
    }
    //返回两个节点之间的权值
    public int getWeight(String temp1,String temp2) {
        int i=vertexList.indexOf(temp1);
        int j=vertexList.indexOf(temp2);
        return edges[i][j];
    }
    //插入节点
    public void InsertVertex(String vertex) {
        vertexList.add(vertex);
    }
    //插入边
    public void InsertEdge(int v1,int v2,int weight) {
        edges[v1][v2]=weight;
        edges[v2][v1]=weight;
        numofEdges++;
    }
    public void deleteEdge(int v1,int v2) {
        edges[v1][v2]=0;
        numofEdges--;
    }
}
//利用堆栈的方式实现图的深度遍历
class Traversing
{
    public String DFS(String startnode,ArrayList<String> vertexList,int [][]edges) {
        if (!vertexList.contains(startnode)) {
            System.out.print("输入节点不在该图内");
            return null;
        }
        int startindex=vertexList.indexOf(startnode);
        int numOfNodes=vertexList.size();
        boolean[]visted=new boolean[numOfNodes];
        StringBuilder resultBuilder=new StringBuilder();
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(startindex);
        visted[startindex]=true;
        while (!stack.isEmpty()) {
            int v=stack.pop();
            resultBuilder.append(vertexList.get(v)+",");
            for(int i=0;i<numOfNodes;i++)
            {
                //当edges[v][i]的值不为0，不为最大，且没有被访问时，将其压入栈中
                if((edges[v][i]!=0)&&(edges[v][i]!=Integer.MAX_VALUE)&&!visted[i])
                {
                    stack.push(i);
                    visted[i]=true;
                }
            }
        }
        return resultBuilder.length()>0?resultBuilder.substring(0,resultBuilder.length()-1):null;
    }
    //利用队列的方式实现图的广度遍历
    public String BFS(String startnode,ArrayList<String> vertexList,int [][]edges) {
        if (!vertexList.contains(startnode)) {
            System.out.print("输入节点不在该图内");
            return null;
        }
        StringBuilder resultBuilder=new StringBuilder();
        boolean []visited=new boolean[vertexList.size()];
        int startIndex=vertexList.indexOf(startnode);
        Queue<Integer>queue=new LinkedList<Integer>();
        queue.offer(startIndex);
        visited[startIndex]=true;
        while (!queue.isEmpty()) {
            int v=queue.poll();
            resultBuilder.append(vertexList.get(v)+",");
            for(int i=0;i<vertexList.size();i++)
            {
                if((edges[v][i]!=0) &&( edges[v][i]!=Integer.MAX_VALUE)&&!visited[i])
                {
                    queue.offer(i);
                    visited[i]=true;
                }
            }
        }
        return resultBuilder.length()>0?resultBuilder.substring(0,resultBuilder.length()-1):null;
    }
}

class Test {
    public static void main(String[] args) {
        //构建邻接矩阵
        Graph tuGraph=new Graph(6);
        //插入节点
        tuGraph.InsertVertex("V1");
        tuGraph.InsertVertex("V2");
        tuGraph.InsertVertex("V3");
        tuGraph.InsertVertex("V4");
        tuGraph.InsertVertex("V5");
        tuGraph.InsertVertex("V6");
        //插入边
        tuGraph.InsertEdge(0, 1, 1);
        tuGraph.InsertEdge(0, 2, 1);
        tuGraph.InsertEdge(1, 3, 1);
        tuGraph.InsertEdge(1, 4, 1);
        tuGraph.InsertEdge(2, 5, 1);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                System.out.print(tuGraph.edges[i][j]+"  ");
            }
            System.out.println();
        }
        //深度遍历邻接矩阵
        Traversing depthTraversing=new Traversing();
        String resultStringDFS=depthTraversing.DFS("V1", tuGraph.vertexList, tuGraph.edges);
        System.out.println(resultStringDFS);
        //广度遍历邻接矩阵
        String resultStringBFS=depthTraversing.BFS("V1", tuGraph.vertexList, tuGraph.edges);
        System.out.println(resultStringBFS);
    }
}