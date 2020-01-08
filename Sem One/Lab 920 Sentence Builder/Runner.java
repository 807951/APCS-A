
/**
 * makes random sentence
 *
 * @author (Arin Gadre)
 * @version (920)
 */
public class Runner
{
    public static void main(String[] args){
        SentenceBuilder sb = new SentenceBuilder();
        sb.loadSentence();
        System.out.println(sb.getSentence());
    }
}
