import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.Scanner;

public class Vault {
    public static int m,n,ans;
    public int dx[] = {1,2,2,1} ;
    public int dy[] = {2,1,-1,-2} ;
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Vault vault = new Vault();
        System.out.print("请输入棋盘的列数：");
        m = in.nextInt();
        System.out.print("请输入棋盘的行数：");
        n = in.nextInt();
        vault.dfs(0,0);
        System.out.println("马的行进路线共有："+ans+"条");
    }
    public void dfs(int x,int y){
        if(x == m && y == 0)
        {
            ans ++ ;
        }
        int i ;
        int tx = 0 ;
        int ty = 0 ;
        for (i = 0 ; i< 4 ;i++)
        {
            tx = x + dx[i] ;
            ty = y + dy[i] ;
            if(tx >m  || tx <0 || ty >n || ty<0)
                continue ;
            else
            {
                dfs(tx,ty);
            }

        }
    }
}
