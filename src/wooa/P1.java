package wooa;

public class P1 {
	static public int solution(int[] restaurant, int[][] riders, int k) {

		int result=0;
		for(int []rider:riders) {
			
			//정사각형으로도 아예 크고 작은경우는 비교하지않음.
			if(restaurant[0]+k<rider[0]||restaurant[0]-k>rider[0]) {
				continue;
			}
			if(restaurant[1]+k<rider[1]||restaurant[1]-k>rider[1]) {
				continue;
			}
			
			//rider~res 거리.
			double len=Math.sqrt(Math.pow(restaurant[0]-rider[0],2)+Math.pow(restaurant[1]-rider[1],2));
			if(len<=k) {
				result++;
			}
		}
		System.out.println();

        return result;
    }

	public static void main(String[] args) {
		int arr[][]= {{1},{2},{3},{4}};
		String arrs[][]= {{"1"},{"2"},{"3"},{"4"}};
		//solution(new int[5][6]);

	}

}
