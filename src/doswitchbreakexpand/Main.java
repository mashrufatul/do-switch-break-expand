package doswitchbreakexpand;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        char choice, ignore;
        do {
            System.out.println("1.if");
            System.out.println("2.switch");
            System.out.println("3.for");
            System.out.println("4.while");
            System.out.println("5.do while");
            System.out.println("choose one:");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            System.out.println("\n");
            switch (choice) {
                case '1':
                    System.out.println("the if: \n");
                    System.out.println("if(condition)statement;");
                    System.out.println("else statement");
                    break;
                case '2':
                    System.out.println("the switch: \n");
                    System.out.println("switch(expression) {");
                    System.out.println("case constant:");
                    System.out.println("statement sequence");
                    System.out.println("  break;");
                    System.out.println("//....");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("the for: \n");
                    System.out.println("for(init;con;ite;)");
                    System.out.println("statement");
                    break;
                case '4':
                    System.out.println("the while: \n");
                    System.out.println("while (condition) statement");
                    break;
                case '5':
                    System.out.println("the do while: \n");
                    System.out.println("do{");
                    System.out.println("statement;");
                    System.out.println("}while(cond)");
                    break;
            }
        } while (choice <= '1' | choice <= '5');
    }

}

