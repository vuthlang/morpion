package hitema.java.morpion;

import hitema.java.morpion.tools.DisplayConsole;

import java.util.Scanner;

public class Morpion {
    public static void main(String[] args) {

        String rep;

        while (true) {
            Scanner sc = new Scanner(System.in);
            int row, column, nb= 0;

            System.out.println("Saisir un nombre de lignes et colonnes : ");
            rep = sc.nextLine();

            if (rep.equals(""))
                break;

            try {
                nb = Integer.parseInt(rep);

                if(nb < 3 || nb > 9){
                    throw new Exception("Le nombre doit être compris entre 3 et 9");
                }
            } catch (NumberFormatException e) {
                System.err.println("Entrez une valeur numérique ");
                continue;
            } catch (Exception e){
                System.err.println(e.getMessage());
                continue;
            }

            row = column = nb;
            DisplayConsole console = new DisplayConsole(row, column);
            String board = console.displayGrid();
            System.out.println(board);
        }
        System.out.println("Fin du jeu");
    }
}
