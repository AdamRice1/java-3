package regex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {
    public static void main(String[] args) {

        // 1. What does the following pattern match? (\d){36} explain in a println() statement.

        System.out.println("The following pattern ('\\d'){36} matches : The double backslash matches the backslash as a character, in this instance a lowercase d.  The {36} is a quantifier.");

        // 2. Create a new array of the first names of the TEKmentors.  Use Regex to only grab the first name of every TEKmentor.  Push the values to a new array

        ArrayList<String> tekMentors = new ArrayList<String>();
        String[] TEKmentors = {"Amir Yunas","Mark Bennet", "Rosa Garcia", "Desaree Byers", "Abram Jablonski", "Dylan Fellows", "Emilios Papas", "Jonathan Diamond"};
        for(int i = 0; i < TEKmentors.length; i++){
            Pattern codePattern = Pattern.compile("(?:^|(?:\\.\\s))(\\w+)");
            Matcher codeMatch = codePattern.matcher((TEKmentors[i]));

        while(codeMatch.find()){
            System.out.println("found a code match at index : " + codeMatch.start() + " - " + codeMatch.end());
            System.out.println(codeMatch.group());
            tekMentors.add(codeMatch.group());
        }};
        System.out.println(tekMentors);

        // 3. Find all the occurences of any form of 'book' in the following paragraph. use regex to match the occurences and store the count of books in an int.
        
        int bookCount = 0;
        String bookText = "Books are the keys to knowledge.  I didn't like to read books as a child, but in college I started enjoying learning and reading books. You can borrows books from the library, or you can buy them from the bookstore. I'm not sure if I prefer paperback books or hardcover books.  I'm such a nerd that I even like textbooks.  With the advent of technology, you can even buy digital books, such as kindle-books, nook-books, or other e-books. My personal favorite book format are pdf-books, because I don't have to carry so many books around wherever I go.  All the books are on my ipad or laptop.  When I lived abroad, they would give books to students absolutely free.  Free books for a student of knowledge is like a kid in a candy store.  So wipe the dust off of your books, and remember the slogan from 'reading rainbow' : 'Take a look! It's in a book! Reading Rainbow!";
        System.out.println(bookText);
        Pattern codePattern2 = Pattern.compile("book|Book|books|Books");
        Matcher CodeMatch2 = codePattern2.matcher(bookText);

        while (CodeMatch2.find()){
            bookCount++;
            System.out.println("Found another one!");
        }
        System.out.println(bookCount);
        // 4.a Create an array of all the words besides the word 'sleepy'.  Each word does not have to be a separate element, although you can split it that way if you wish.  We just want an array that everything that is not 'sleepy'.  
        ArrayList<String> sleep = new ArrayList<String>();
        String sleepy = "I felt sleepy because I saw the others were sleepy and because I knew I should feel sleepy, but I wasn't really sleepy.  If you're sleepy and you know it, clap your hands.  Keep on being sleepy until you actually become sleepy";
                String slept = sleepy.replaceAll("sleepy", "");
                 //System.out.println(slept);
                String[] awake = slept.split( " ", 0);
        System.out.println(awake[1]);
        // 4.b combine the array that you just created into a string
        String not_sleepy; //punctuation marks will be here
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < awake.length; i++) {
            sb.append(awake[i]);
        }
        String str = sb.toString();
        System.out.println(str);
        //4.c remove the punctuation marks from the notSleepy string.
        String notSleepy1 = str.replaceAll("," , "");
        System.out.println(notSleepy1);
        String notSleepy2 = notSleepy1.replaceAll("'" , "");
        System.out.println(notSleepy2);
        String notSleepy8 = notSleepy2.replace("." , "");
        System.out.println(notSleepy8);

        //4.d Now replace all the occurences of 'sleepy' with the word 'happy'.  Call the new string happy.  

        String happy = sleepy.replaceAll("sleepy", "happy");
        System.out.println(happy);

        //BONUS : 
        //5. You are looking for unicode arrow symbols in a string.  https://jrgraphix.net/r/Unicode/2190-21FF is a selection of unicode arrow symbols to aid you in your search.  Match all the codes that are arrows, and then print them out to the console.  They should be printing out as the arrow images.

        String[] arrows = {"\u21FD", "\u26F7", "\u21FF", "\u21EF","\u21EC", "\u26F9","\u26FD","\u26D4","\u26A5","\u21FD","\u2190", "\u26A1","\u21BA","\u2196","\u2603","\u21FD"};
    }
}

