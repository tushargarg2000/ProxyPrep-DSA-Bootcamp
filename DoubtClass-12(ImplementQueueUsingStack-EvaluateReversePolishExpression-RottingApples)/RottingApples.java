class Solution {
	int getDaysToRot(int[][] grid) {
	    // add your logic here
		int n = grid.length;
		int m = grid[0].length;
		boolean visited[][] = new boolean[n][m];
		Queue<Pair> queue = new LinkedList<>();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(grid[i][j] == 2) {
					queue.add(new Pair(i,j));
					visited[i][j] = true;
				}
			}
		}
		int dx[] = {0,0,1,-1};
		int dy[] = {1,-1,0,0};
		int days = 0;
		while(queue.size() > 0) {
			int level = queue.size();
			while(level-->0) {
				Pair curr = queue.remove();
				for(int i=0;i<4;i++) {
					int x = curr.first + dx[i];
					int y = curr.second + dy[i];
					if(x>=0 && y>=0 && x<n && y<m && visited[x][y] == false && grid[x][y] == 1) {
						queue.add(new Pair(x,y));
						visited[x][y] = true;
					}
				}
			}
			days++;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(grid[i][j] == 1 && visited[i][j] == false) {
					return -1;
				}
			}
		}
		return days-1;
	}
}

class Pair {
	int first, second;
	Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}
}