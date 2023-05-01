package nl.utwente.di.bookQuote;

import java.util.HashMap;

public class Quoter {

    HashMap<String, Double> book_Quotes = new HashMap<>();

    public Quoter(){
        book_Quotes.put("1", 10.0);
        book_Quotes.put("2", 45.0);
        book_Quotes.put("3", 20.0);
        book_Quotes.put("4", 35.0);
        book_Quotes.put("5", 50.0);
    }
    double getBookPrice(String isbn){
        if (book_Quotes.containsKey(isbn)){
            return book_Quotes.get(isbn);
        }
        else {
            return 0.0;
        }
    }
}
