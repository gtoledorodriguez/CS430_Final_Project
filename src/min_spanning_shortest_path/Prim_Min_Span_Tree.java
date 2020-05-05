package min_spanning_shortest_path;

import java.util.Random;

public class Prim_Min_Span_Tree {
	static int v = 5; //Vertices this means the graph has to be a matrix v by v, or a square matrix
	int[][] matrix;
	public Prim_Min_Span_Tree() {
		
		int m[][] = new int[][] { 
			{ 0, 2, 0, 6, 0 }, 
            { 2, 0, 3, 8, 5 }, 
            { 0, 3, 0, 0, 7 }, 
            { 6, 8, 0, 0, 9 }, 
            { 0, 5, 7, 9, 0 }
        };
        matrix = m;
        //primMST(matrix);
	}
	
	public void setMatrix(int m[][]) {
		matrix = m;
	}
	public int[][] getMatrix(){
		return matrix;
	}
	
	public Prim_Min_Span_Tree(int[][] m) {
		matrix = m;
		int v = matrix.length;
		this.v = v;
		//primMST(matrix);
	}
	
	public int extractMin(int[] key, Boolean[] inMST) {
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		
		for(int i = 0; i < v; i++) {
			if(inMST[i]==false && key[i]<min) {
				min = key[i];
				min_index = i;
			}
		}
		return min_index;
	}
	
	public String primMST(int [][] matrix) {
		int p[] = new int[v];
		int key[] = new int[v];
		// p and key make a square matrix of size v by v
		
		Boolean[] inMST = new Boolean[v];
		
		for(int i=0; i<v;i++) {
			key[i]=Integer.MAX_VALUE;
			inMST[i]=false;
		}
		
		key[0]=0;
		p[0]=-1;
		
		for(int i=0; i<v-1;i++) {
			int u = extractMin(key,inMST);
			inMST[u]=true;
			
			for(int j=0; j<v; j++) {
				if(matrix[u][j] != 0 && inMST[j] == false && matrix[u][j] < key[j]) {
					p[j] = u; 
                    key[j] = matrix[u][j];
				}
			}
		}
		
		return printMST(p,matrix);
	}
	
	public String printMST(int p[], int matrix[][]) {
		String str = "Edge \tWeight\n";
		System.out.println("Edge \tWeight");
		
		for(int i=1; i<v; i++) {
			System.out.println(p[i] + " - " + i + "\t" + matrix[i][p[i]]);
			str = str + p[i] + " - " + i + "\t" + matrix[i][p[i]] + "\n";
		}
		
		return str;
	}
	
	public static int[][] randMatrix(){
		Random r = new Random();
		int l = r.nextInt(2*(v-1)) + 5;
		int[][] rm = new int[l][l];
		
		for(int i=0; i<l;i++) {
			for(int j=0; j<l; j++) {
				rm[i][j]= r.nextInt(10);
			}
		}
		
		return rm;
		
	}
	public String toString(int [][] m) {
		int[][] rm = m;
		int l = rm.length;
		String str = "";
		for(int i=0; i<l;i++) {
			for(int j=0; j<l; j++) {
				str = str + rm[i][j] + " ";
			}
			str=str + "\n";
		}
		
		return str;
	}
	public static void main(String[] args) { // For testing purposes
		// TODO Auto-generated method stub
		
        int matrix[][] = new int[][] {
        	
                { 2, 0, 3, 8, 5 }, 
                { 0, 3, 0, 0, 7 }, 
                { 6, 8, 0, 0, 9 }, 
                { 0, 5, 7, 9, 0 }
        };
        
        Prim_Min_Span_Tree t = new Prim_Min_Span_Tree();
        int[][] ma = t.getMatrix();
        System.out.println(t.toString(ma));
        System.out.println();
        
        int [][] m = randMatrix();
        Prim_Min_Span_Tree s = new Prim_Min_Span_Tree(m);
        System.out.println(s.toString(s.getMatrix()));
        
	}

}
