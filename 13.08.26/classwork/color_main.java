package project13;

import java.util.*;


class Color {
    private String name;
    private int id;
    private boolean favorite;

    public Color(String name, int id, boolean favorite) {
        this.name = name;
        this.id = id;
        this.favorite = favorite;
    }

    public void display() {
        System.out.println("Color name: " + name);
        System.out.println("Color ID: " + id);

        if (favorite) {
            System.out.println("Yes, this is my favorite");
        } else {
            System.out.println("This is not my favorite");
        }

        System.out.println();
    }
}

public class color_main {
    public static void main(String[] args) {
        Color red = new Color("red", 1, true);
        Color blue = new Color("blue", 2, true);
        Color black = new Color("black", 3, true);
        Color yellow = new Color("yellow", 4, false);
        Color pink = new Color("pink", 5, false);

        List<Color> colors = new ArrayList<>();

        colors.add(red);
        colors.add(blue);
        colors.add(black);
        colors.add(yellow);
        colors.add(pink);

        for (Color color : colors) {
            color.display();
        }
    }
}