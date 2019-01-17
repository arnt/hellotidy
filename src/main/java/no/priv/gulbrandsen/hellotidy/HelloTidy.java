package no.priv.gulbrandsen.hellotidy;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;

class HelloTidy {
    public static void main(String[] args) {
        for(String name : args) {
            try {
                Jsoup.parse(new File(name), "utf8").html(System.out);
            } catch(IOException e) {
                System.err.println("Unable to read/parse: " + name);
            }
        }
    }
};
