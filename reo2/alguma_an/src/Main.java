import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            // System.out.println("Tam = " + args.length);
            String fileProgram = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath()
                    + "../inputs/";
            fileProgram += (args.length >= 1) ? args[0] : "fatorial.alguma";
            InputStream inpStm = new FileInputStream(fileProgram);
            InputStreamReader InpStmReader = new InputStreamReader(inpStm);
            BufferedReader bfReader = new BufferedReader(InpStmReader);

            Lexico lexico = new Lexico();
            lexico.setInput(bfReader);

            Token t = null;
            while ((t = lexico.nextToken()) != null) {
                System.out.println(t.toString());
            }
        } catch (IOException e) {
            System.err.println("Erro ao abrir o código fonte do programa!" + e.getMessage());
        } catch (LexicalError e) {
            System.err.println(e.getMessage() + " em " + e.getPosition());
        } catch (Exception e) {
            System.err.println("Erro:" + e.getMessage());
        }
    }
}