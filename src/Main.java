import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Film> filmler = new ArrayList<>();

        // 5 farklı film nesnesi ekleniyor
        filmler.add(new Film("The Prestige", 2006, "Drama", 8.5));;
        filmler.add(new Film("Whiplash", 2014, "Drama", 8.5));
        filmler.add(new Film("The Pianist", 2002, "Biography", 8.5));
        filmler.add(new Film("Parasite", 2019, "Thriller", 8.5));
        filmler.add(new Film("Amélie", 2001, "Romance", 8.3));

        System.out.println("IMDb'ye Göre : ");
        filmler.sort(Comparator.comparingDouble(Film::getImdbPuani).reversed());
        filmler.forEach(System.out::println);

        System.out.println("\nYayın Yılına Göre : ");
        filmler.sort(Comparator.comparingInt(Film::getYayinYili));
        filmler.forEach(System.out::println);

        System.out.println("\nDram Filmleri ----");
        filmFiltrele(filmler, "Drama");
    }

    // Belirli bir türe göre filtreleme yapan metod
    public static void filmFiltrele(List<Film> filmler, String tur) {
        for (Film film : filmler) {
            if (film.getTur().equalsIgnoreCase(tur)) {
                System.out.println(film);
            }
        }
    }
}