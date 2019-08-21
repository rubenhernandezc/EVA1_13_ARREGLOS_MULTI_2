/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RubenAlonso
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][][] aiExtremo = new int[7][5][3][8][10];
        for (int i = 0; i < aiExtremo.length; i++) {
            for (int j = 0; j < aiExtremo[i].length; j++) {
                for (int k = 0; k < aiExtremo[i][j].length; k++) {
                    for (int l = 0; l < aiExtremo[i][j][k].length; l++) {
                        for (int m = 0; m < aiExtremo[i][j][k][l].length; m++) {
                            aiExtremo[i][j][k][l][m] = (int)(Math.random() * 100);
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < aiExtremo.length; i++) {
            for (int j = 0; j < aiExtremo[i].length; j++) {
                for (int k = 0; k < aiExtremo[i][j].length; k++) {
                    for (int l = 0; l < aiExtremo[i][j][k].length; l++) {
                        for (int m = 0; m < aiExtremo[i][j][k][l].length; m++) {
                            System.out.println("[" + aiExtremo[i][j][k][l][m] + "]");
                        }
                    }
                }
            }
        }
    }    
}
