public class Loader {

    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));

        /*int variable = 7;
        variable = (variable > 10) ? (variable -= 10) : (variable += 10);
        System.out.println(variable);*/
    }

    public static String decode(char ch) {
        switch (ch) {
            case 'h':
                return "Hello";
            case 'i', 'm', 'k':
                return "I can decode";
            case 'b':
                return "Bye";
            case default:
                return "I don't know these symbols";
        }
    }

}
