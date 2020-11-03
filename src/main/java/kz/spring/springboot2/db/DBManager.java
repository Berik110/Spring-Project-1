package kz.spring.springboot2.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Articles> allArticles = new ArrayList<>();

    static {
        allArticles.add(
                new Articles(1L, "hello")
        );
    }

    private static Long id=2L;

    //1
    public static ArrayList<Articles> getAllArticles(){
        return allArticles;
    }

    //2
    public static Articles getArticle(Long id){
        for (Articles art: allArticles) {
            if (art.getId() == id){
                return art;
            }
        }
        return null;
    }

    //3
    public static void addArticle(Articles article){
        allArticles.add(article);
    }
}
