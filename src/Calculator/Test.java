package Calculator;

public class Test {

        int x;
        int y;

        @Before
        public void setUp()  {
            x = 8;
            y =2;

        }

        @Before
        public void add(Object Assert) {
            int result = 13;
            Assert.equals(result, CalculationUtils.add(x,y));
        }

        @Before
        public void sub() {
            int result = -2;
            Assert.equals(result, CalculationUtils.sub(x,y));
        }
    }

