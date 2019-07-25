import java.util.ArrayList;

public class Field {

    private int N; // field N on N

    private FieldState fieldState = new FieldState();

    private final strings[] array = {strings.X,strings.O};

    private ArrayList<Cell> field = new ArrayList<Cell>();

    public Field(int N){
        this.N = N;
        for (int i = 0; i < N*N; i ++)
            field.add(new Cell(strings._));
    }

    public Field(int N, strings[] array){
        this.N = N;
        for (int i = 0; i < N*N; i ++){
            field.add(new Cell(array[i]));
        }
    }

    public int getN() {
        return N;
    }

    public void printField() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(field.get(i * N + j).getValue() + " ");
            System.out.println();
        }
    }

    public FieldState checkField() {
        for (int i = 0; i < N; i++) { //check - endOfGame?
            for (int j = 0; j < N; j++) {
                if (field.get(i * N + j).getValue() == strings._)
                    fieldState.setNotEndOfGame();  // mb end of game
            }
        }
        for (int k = 0; k < array.length; k++){ // twice, for X and for O

            for (int i = 0; i < N; i++) { //check columns and strings
                boolean col = true;
                boolean str = true;
                for (int j = 0; j < N; j++) {

                    if (field.get(i * N + j).getValue() != array[k])
                        str = false;

                    if (field.get(j * N + i).getValue() != array[k])
                        col = false;
                }
                if (str){
                    fieldState.setWin(); // win
                    fieldState.setString(); // in string
                    fieldState.setResString(i+1); // number i+1
                } else
                if (col){
                    fieldState.setWin(); // win
                    fieldState.setColumn(); // in column
                    fieldState.setResColumn(i+1); // number i+1
                }
            }
            //check diagonals
            boolean first = true;
            boolean second = true;
            for (int i = 0; i < N; i++) {

                if (field.get(i* N + i).getValue() != array[k])
                    first = false;

                if (field.get((N - i - 1) * N + i).getValue() != array[k])
                    second = false;

            }
            if (first){
                fieldState.setWin(); // win
                fieldState.setDiagonal();  // in diagonal
                fieldState.setLeftDiagonal(); // left
            } else
            if (second){
                fieldState.setWin(); // win
                fieldState.setDiagonal(); // in diagonal
                fieldState.setRightDiagonal(); // right
            }
        }
        return fieldState;
    }
}