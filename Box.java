public class Box {

    /* 
    * Create a method that return a name into a special box
    * @parameter String name
    * @return special box
    */
    public static void specialBox(String name) {
        int nameLenght = name.length();
        String topAndBottom = "+";
        for (int i = 1; i <= nameLenght; i++) {
            topAndBottom+= "-";
        }
        topAndBottom+= "+";
        System.out.println(topAndBottom);
        System.out.println("|" + name + "|");
        System.out.println(topAndBottom);
    }


    public static void main(String[] args) {
        specialBox("Dave");
        specialBox("Marco");
    }

}