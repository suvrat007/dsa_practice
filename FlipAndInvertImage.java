package Grind75;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        // flip

        for (int row = 0; row < n; row++) {
            int i =0;
            int j = n-1;
            while(i<j){
                int temp = image[row][i];
                image[row][i] = image[row][j];
                image[row][j]= temp;

                if (image[row][i]==1){
                    image[row][i]=0;
                }else{
                    image[row][i]=1;
                }

                if (image[row][j]==1){
                    image[row][j]=0;
                }else{
                    image[row][j]=1;
                }
                i++;
                j--;
            }
            if (i == j) {
                if (image[row][i] == 1) {
                    image[row][i] = 0;
                } else {
                    image[row][i] = 1;
                }
            }
        }

        return image;
    }
}
