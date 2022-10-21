import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		//Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tesctCaseSize = Integer.parseInt(br.readLine());
        
        
        int[] result = new int[tesctCaseSize];

        
        for(int k = 0 ; k < tesctCaseSize; k++){
            int n = Integer.parseInt(br.readLine());
            char[][] map = new char[n][n];
            int curRow = 0;
            int curCol = 0;
            for(int i = 0 ; i < n ; i++){
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                for(int j = 0 ; j < n ; j++){
                    map[i][j] = st.nextToken().charAt(0);
                    if(map[i][j]=='X'){
                        curRow=i;
                        curCol=j;
                    }
                }
            }

            result[k] = sol(curRow,curCol,map);

        }


		for(int i = 0; i < tesctCaseSize; i++) {
			System.out.println("#"+(i+1)+" "+result[i]);
		}
	}

    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};


    static int sol(int curX, int curY,char[][] map){

        int tmpX = curX;
        int tmpY = curY;

        int cnt=0;
        for(int i = 0 ; i < 4; i ++){
            int nextX = curX+dx[i];
            int nextY = curY+dy[i];

            while(nextX>=0&&nextX<map.length&&nextY>=0&&nextY<map.length&&map[nextX][nextY]=='L'){
                
                curX=nextX;
                curY=nextY;

                nextX = curX+dx[i];
                nextY = curY+dy[i];
            }

            int nextX2 = nextX+dx[i];
            int nextY2 =nextY+dy[i];
            if(nextX2>=0&&nextX2<map.length&&nextY2>=0&&nextY2<map.length){
                if(map[nextX][nextY]=='H'&&map[nextX2][nextY2]=='H'){
                    cnt++;
                }
            }
            curX=tmpX;
            curY=tmpY;
        }

            return cnt;
    }
}

