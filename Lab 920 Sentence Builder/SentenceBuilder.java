
/**
 * Makes sentence builder method
 * @author (Arin Gadre)
 * @version (920)
 * public void loadSentences()
public String getSentence()

public String getNounPhrase()
public String getPrepositionalPhrase()
public String getVerbPhrase()

noun phrase = determiner + adjective + noun
verb phrase = adverb + verb
prepositional phrase = preposition + determiner + adjective + noun

noun phrase + verb phrase + preposition phrase

 */
import java.util.Random;
public class SentenceBuilder
{
    private String[] nouns = {"snake ", "lollipop ", "cake ", "rock ", "child ", "tree ", "spoon "};
    private String[] verbs = {"runs ", "eats ", "jumps ", "throws ", "makes ", "puts "};
    private String[] adjectives = {"funny ", "silly ", "sad ", "stupid ", "smart ", "happy "};
    private String[] adverbs = {"quietly ", "slowly ", "smoothly ", "often ", "never ", "very "};
    private String[] determiners = {"the ", "my ", "your ", "his ", "hers ", "our ", "their ", "Jeff's ", "Kanye's "};
    private String[] prepositions = {"over ", "near ", "on top of ", "behind ", "next to ", "inside of ", "under "};
    private String nounPhrase;
    private String prepositionPhrase;
    private String verbPhrase;
    private String randomSentence;

    public String getRandomNoun(){
        Random n = new Random();
        int a = n.nextInt(nouns.length);
        return nouns[a];
    }

    public String getRandomVerb(){
        Random v = new Random();
        int a = v.nextInt(verbs.length);
        return verbs[a];
    }

    public String getRandomAdjective(){
        Random adj = new Random();
        int a = adj.nextInt(adjectives.length);
        return adjectives[a];
    }

    public String getRandomAdverb(){
        Random adv = new Random();
        int a = adv.nextInt(adverbs.length);
        return adverbs[a];
    }

    public String getRandomDeterminer(){
        Random d = new Random();
        int a = d.nextInt(determiners.length);
        return determiners[a];
    }

    public String getRandomPreposition(){
        Random p = new Random();
        int a = p.nextInt(prepositions.length);
        return prepositions[a];
    }

    public String getNounPhrase(){
        nounPhrase = getRandomDeterminer() + getRandomAdjective() + getRandomNoun();
        return nounPhrase;
    }

    public String getPrepositionalPhrase(){
        prepositionPhrase = getRandomPreposition() + getRandomDeterminer() + 
        getRandomAdjective() + getRandomNoun();
        return prepositionPhrase;
    }

    public String getVerbPhrase(){
        verbPhrase = getRandomVerb() + getRandomAdverb();
        return verbPhrase;
    }

    public void loadSentence(){
        randomSentence = getNounPhrase() + getVerbPhrase() + getPrepositionalPhrase();
    }

    public String getSentence(){
        return randomSentence;
    }
}
