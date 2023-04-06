package hitema.java.morpion.tools;
import hitema.java.morpion.modeles.Square;
/**
 * Class that render the board game
 */
public class DisplayConsole {

    private int nbCases;
    private int caseSize;

    public DisplayConsole(){
        this(3, 4);
    }

    public DisplayConsole(int nbCases){
        this(nbCases, 4);
    }
    public DisplayConsole(int nbCases, int caseSize){
        setNbCases(nbCases);
        setCaseSize(caseSize);
    }

      public String displayGrid(){
      StringBuilder grid = new StringBuilder();

        // Print the numbers on top border
        grid.append(" ");
        for (int i = 0; i < getNbCases(); i++) {
            for (int j = 0; j < getNbCases(); j++) {
                grid.append(" ");
            }
            grid.append(i);
        }
        grid.append("\n");

        // Print the layout on top border
        grid.append("  +");
        for (int i = 0; i < getNbCases(); i++) {
            for (int j = 0; j < getCaseSize(); j++) {
                grid.append("-");
            }
            grid.append("+");
        }
        grid.append("\n");

        // Print each row
        for (int i = 0; i < getNbCases(); i++) {
            grid.append(i + " |"); // Print the numbers for each row
            // Print the contents of the row
            for (int j = 0; j < getNbCases(); j++) {
                // Print the contents of the cell
                for (int k = 0; k < getCaseSize(); k++) {
                    grid.append(" ");
                }
                grid.append("|");
            }
            grid.append("\n");

            // Print the separator between rows
            if (i < getNbCases() - 1) {
                grid.append("  +");
                for (int j = 0; j < getNbCases(); j++) {
                    for (int k = 0; k < getCaseSize(); k++) {
                        grid.append("-");
                    }
                    grid.append("+");
                }
                grid.append("\n");
            }
        }

        // Print the numbers on the bottom border
        grid.append("  +");
        for (int i = 0; i < getNbCases(); i++) {
            for (int j = 0; j < getCaseSize(); j++) {
                grid.append("-");
            }
            grid.append("+");
        }
        grid.append("\n");

        return grid.toString();
    }

    public int getNbCases() {
        return nbCases;
    }
    public int getCaseSize() {
        return caseSize;
    }
    public void setNbCases(int nbCases) { this.nbCases = nbCases; }
    public void setCaseSize(int caseSize) {
        this.caseSize = caseSize;
    }
}
