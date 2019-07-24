public class FieldState {

    private int resGame; //1 - win, 2 - drow, 0 - not end of game

    private int resWin; //1 - string, 2 - column, 3 - diagonal

    private int resString; // number of string

    private int resColumn; // number of column

    private int resDiagonal; // 1 - left, 2 -right

    public FieldState() {
        this.resGame = 2; // if not ((not end of game) or (win)) = default 2 = drow
        this.resWin = 0;
        this.resString = -1;
        this.resColumn = -1;
        this.resDiagonal = 0;
    }

    public boolean isWin(){
        return (resGame == 1);
    }

    public boolean isDrow(){
        return (resGame == 2);
    }

    public boolean isNotEnd(){
        return (resGame == 0);
    }

    public boolean isString(){
        return (resWin == 1);
    }

    public boolean isColumn(){
        return (resWin == 2);
    }

    public boolean isDiagonal(){
        return (resWin == 3);
    }

    public int getResString() {
        return resString;
    }

    public int getResColumn() {
        return resColumn;
    }

    public int getResDiagonal() {
        return resDiagonal;
    }

    public void setResGame(int resGame) {
        this.resGame = resGame;
    }

    public void setResWin(int resWin) {
        this.resWin = resWin;
    }

    public void setResString(int resString) {
        this.resString = resString;
    }

    public void setResColumn(int resColumn) {
        this.resColumn = resColumn;
    }

    public void setResDiagonal(int resDiagonal) {
        this.resDiagonal = resDiagonal;
    }

    public void printFieldState(){
        if (isNotEnd())
            System.out.println("game is not end");
        else
        if (isDrow())
            System.out.println("Drow");
        else
        if (isWin()){
            if (isString())
                System.out.println("Win in string number " + resString);
            else
            if (isColumn())
                System.out.println("Win in column number " + resColumn);
            else
            if (resDiagonal == 1)
                System.out.println("Win in left diagonal");
            else System.out.println("Win in right diagonal");
        }
        System.out.println();
    }



}
