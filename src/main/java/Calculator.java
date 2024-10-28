public class Calculator {

        public static void main(String[] args) {

            Calculator c1 = new Calculator();
            System.out.println(c1.add(5,6));
            System.out.println(c1.sub(10,3));
            System.out.println(c1.mul(34,27));
            System.out.println(c1.div(47,4));

        }

        public int add(int a, int b){
            return a+b;
        }

        public int sub(int a, int b){
            return a-b;
        }

        public int mul(int a, int b){
            return a*b;
        }

        public float div(int a, int b){
            return a/b;
        }

    }

