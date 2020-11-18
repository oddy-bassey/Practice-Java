package codeinterview;

public class MyArrays {

    public static void main(String[] args){
        int [][] data = {{1,2,3,4,5}, {6,7,8,3,6}, {43,56}, {3}, {23,54,75,87,23,65,98}};
        System.out.println("Displaying array contents\n");

        for(int i=0; i<data.length; i++){

            for(int j=0; j<data[i].length; j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
