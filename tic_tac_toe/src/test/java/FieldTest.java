import org.junit.Test;

public class FieldTest {

    private strings[] test1 =
            {strings.X,strings.X,strings.O,strings.X,
            strings.O,strings.X,strings.X,strings.X,
            strings.O,strings.X,strings.O,strings.X,
            strings.O,strings.O,strings.O,strings.X};

    private strings[] test2 =
            {strings.X,strings.X,strings.O,strings.X,
                    strings.O,strings.X,strings.X,strings.O,
                    strings.O,strings.X,strings.O,strings.X,
                    strings.O,strings.O,strings.O,strings.X};

    private strings[] test3 =
            {strings._,strings._,strings.O,strings.X,
                    strings._,strings._,strings.X,strings._,
                    strings.O,strings._,strings.O,strings.X,
                    strings._,strings.O,strings._,strings.X};

    private strings[] test4 =
            {strings._,strings._,strings.X,strings.O,
                    strings._,strings._,strings.O,strings._,
                    strings.X,strings.O,strings.O,strings.X,
                    strings.O,strings.X,strings._,strings.X};

    private strings[] test5 =
            {strings._,strings._,strings.X,strings.X,
                    strings._,strings._,strings.X,strings._,
                    strings.X,strings.X,strings.O,strings.X,
                    strings.X,strings.X,strings._,strings.X};

    private strings[] test6 =
            {strings._,strings._,strings.X,strings.O,
                    strings._,strings._,strings.X,strings.O,
                    strings.X,strings.O,strings.O,strings.O,
                    strings.X,strings.X,strings._,strings.O};

    private strings[] test7 =
            {strings._,strings._,strings.X,strings.X,
                    strings._,strings._,strings.X,strings.X,
                    strings.O,strings.O,strings.O,strings.O,
                    strings.X,strings.X,strings._,strings.O};
    @Test
    public void test1Field(){
        Field f = new Field(4, test1 );
        f.printField();
        f.checkField().printFieldState();
    }

    @Test
    public void test2Field(){
        Field f = new Field(4, test2 );
        f.printField();
        f.checkField().printFieldState();
    }

    @Test
    public void test3Field(){
        Field f = new Field(4, test3 );
        f.printField();
        f.checkField().printFieldState();
    }

    @Test
    public void test4Field(){
        Field f = new Field(4, test4 );
        f.printField();
        f.checkField().printFieldState();
    }

    @Test
    public void test5Field(){
        Field f = new Field(4, test5 );
        f.printField();
        f.checkField().printFieldState();
    }

    @Test
    public void test6Field(){
        Field f = new Field(4, test6 );
        f.printField();
        f.checkField().printFieldState();
    }

    @Test
    public void test7Field(){
        Field f = new Field(4, test7 );
        f.printField();
        f.checkField().printFieldState();
    }
}
