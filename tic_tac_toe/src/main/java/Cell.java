public class Cell {

    private strings value;

    public Cell(strings value){
        this.value = value;
    }

    public boolean isEmpty(){
        return (value == strings._);
    }

    public strings getValue() {
        return value;
    }

    public void setValue(strings name) {
        this.value = name;
    }
}
