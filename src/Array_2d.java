public class Array_2d {

    public static void main(String[] args){

        int[][] table = {
                {2, 6, 9, 8},
                {1, 5, 4, 9},
                {5, 4, 0, 1}

        };
        System.out.println(table[1][2]);

        for(int i=0; i<table.length; i++ ){
            for(int j = 0; j<table[i].length; j++){
            System.out.print(table[i][j] + " ");
        }
        System.out.println(" ");


        }
    }
}
