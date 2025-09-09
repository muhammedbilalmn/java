public class Diff {
        public static void main(String[] args){

//        if we are using the premitive datatypes we don't be able to see the changes we are adding to the specific data variable
//        eg:
            int a = 100;
            int b = a;
            a = 200;
            System.out.println("a -"+ a +"& b -"+ b );

            Person alex = new Person("alex");
            Person mariam = alex;

            System.out.println("before changing the name");
            System.out.println(alex.name+ ""+ mariam.name);
// if we change the mariam name it also affect the same
            alex.name = "Alexander";

            System.out.println("after changing the name");
            System.out.println(alex.name+ ""+ mariam.name);

        }
        static class Person{
            String name;

            Person(String name){
                this.name = name;
            }
        }
}
