package Calculator;

public class Test {

        int x;
        int y;

        @Before
        public void setUp()  {
            x = 8;
            y = 2;

        }

        @Before
        public void add(Object Assert) {
            int result = 10;
            Assert.equals("8 + 2must be equals 10" , result , CalculationUtils.add(x,y));
        }

        @Before
        public void sub() {
            int result = 6;
            Assert.equals(result, CalculationUtils.sub(x,y));
        }
    }

