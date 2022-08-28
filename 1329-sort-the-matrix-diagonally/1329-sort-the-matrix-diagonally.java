class Solution {
   public int[][] diagonalSort(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> diagonals = sortedDiagonals(mat);

        for (int i = 0; i < mat.length; ++i)
            for (int j = 0; j < mat[0].length; ++j)
                mat[i][j] = diagonals.get(i - j).poll();

        return mat;
    }

    private Map<Integer, PriorityQueue<Integer>> sortedDiagonals(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> diagonals = new HashMap<>();

        for (int i = 0; i < mat.length; ++i)
            for (int j = 0; j < mat[0].length; ++j)
                diagonals.computeIfAbsent(i - j, param -> new PriorityQueue<>()).add(mat[i][j]);

        return diagonals;
    }

}