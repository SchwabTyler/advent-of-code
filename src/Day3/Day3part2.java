package Day3;

import java.io.*;

/**
 * Created by Tyler on 7/18/2016.
 */
public class Day3part2 {

    public static void main(String args[]) throws FileNotFoundException {
        String text = new String();
        File file = new File("src/Day3/Day3.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        boolean[][] visited = new boolean[2*text.length()][2*text.length()];
        visited[text.length()][text.length()] = true;
        int total=1, x=text.length(), y=text.length(), x2=text.length(), y2=text.length(), i;
        for (i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if (ch=='^'){
                x++;
            } else if (ch=='v'){
                x--;
            } else if (ch=='>'){
                y++;
            } else if (ch=='<'){
                y--;
            }
            if (visited[x][y]==false){
                total++;
                visited[x][y]=true;
            }
            i++;
            ch = text.charAt(i);
            if (ch=='^'){
                x2++;
            } else if (ch=='v'){
                x2--;
            } else if (ch=='>'){
                y2++;
            } else if (ch=='<'){
                y2--;
            }
            if (visited[x2][y2]==false){
                total++;
                visited[x2][y2]=true;
            }
        }
        System.out.println(total);
    }

}
