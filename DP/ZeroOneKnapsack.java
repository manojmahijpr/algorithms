/**
 * ZeroOneKnapsack
 */
public class ZeroOneKnapsack {


    int P[] = {0, 1, 2, 5, 6};
    int wt[] = {0, 2, 3, 4, 5};
    int cap = 8;

    public static void main(String[] args) {
        ZeroOneKnapsack prob = new ZeroOneKnapsack();
        int V[][] = prob.ZeroOneKnapsackMatrix();
        //System.out.println(V[V.length-1][V[0].length-1]);
        prob.ZeroOneKnapsackSol(V);

    }

    int[][] ZeroOneKnapsackMatrix() {

        int V[][] = new int[P.length][cap+1];

        for(int i=0; i<P.length; i++) {

            for(int w=0;w<=cap; w++) {
                if(i==0 || w==0)
                    V[i][w] = 0;
                else if(wt[i] <= w)
                    V[i][w] = (int) Math.max(V[i-1][w], (V[i-1][w-wt[i]]+P[i]));
                else
                    V[i][w] = V[i-1][w]; 
            }

        }
        return V;
    
    }
    void ZeroOneKnapsackSol(int V[][]) {

        int i=V.length-1;
        int j=V[0].length-1;

        while(i>0 && j>0) {

            if(V[i][j] == V[i-1][j]) {
                i--;
            }
            else {
                System.out.print(P[i] + " , ");
                j=j-wt[i];
                i--;
            }
        }

    }
}