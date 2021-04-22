import java.lang.reflect.Array;
import java.util.HashMap;

public class Tennis {
    public static final HashMap<Integer, String> scoreMap = createMap();
    private static HashMap<Integer, String> createMap() {
        HashMap<Integer, String> scoreMap = new HashMap<Integer, String>();
        scoreMap.put(0, "0");
        scoreMap.put(1, "15");
        scoreMap.put(2, "30");
        scoreMap.put(3, "40");
        return scoreMap;
    }

    // TODO
    public static String[] score (int[] points) {
        int joueur1 = 0;
        int joueur2 =0;
        String[] resultat = {"0", "0"};
        for ( int pts: points){
            if (pts == 1) {
                joueur1++;
            } else {
                joueur2++;
            }
        }
        if(joueur1 > 3 && joueur2 > 3) {
            if(joueur1 == joueur2) return new String[]{"40", "40"};
            return joueur1>joueur2 ? new String[]{"40a", "40"} : new String[]{"40", "40a"};
        }
        resultat[0] = scoreMap.get(joueur1);
        resultat[1] = scoreMap.get(joueur2);
        return resultat;
    }

    public static String[] match(int[] scores) {
        int player1 = 0;
        int player2 = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 1) {
                player1++;
            } else {
                player2++;
            }
        }

        // calcul des scores des joueurs 1 et 2
        String score1 = "0";
        String score2 = "0";
        if (player1 < 3) {
            score1 = String.valueOf(player1 * 15);
        } else {
            score1 = "40";
        }
        if (player2 < 3) {
            score2 = String.valueOf(player1 * 15);
        } else {
            score2 = "40";
        }

        // calcul de l'avantage
        if (player1 >= 3 && player2 >= 3 && player1 != player2) {
            if (player1 > player2) {
                score1 = "advantage";
            } else {
                score2 = "advantage";
            }
        }

        return new String[]{score1, score2};
    }
}