package ca.sheridancollege.koenen.finalproject.bootstrap;

import ca.sheridancollege.koenen.finalproject.entities.Movie;
import ca.sheridancollege.koenen.finalproject.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BootstrapMovies implements CommandLineRunner {
    private final MovieRepository movieRepository;

    @Override
    public void run(String... args) {
        var movieTxn = List.of(
            Movie
                .builder()
                .title("Dune: Part Two")
                .release_year(2024)
                .genre("Science Fiction, Adventure")
                .director("Denis Villeneuve")
                .description("Follow the mythic journey of Paul Atreides as he unites with Chani and the Fremen while on a path of revenge against the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the known universe, Paul endeavors to prevent a terrible future only he can foresee.")
                .posterPath("8b8R8l88Qje9dn9OE8PY05Nxl1X.jpg")
                .backdropPath("87IVlclAfWL6mdicU1DDuxdwXwe.jpg")
                .build(),
            Movie
                .builder()
                .title("The Batman")
                .release_year(2022)
                .genre("Action, Crime, Drama")
                .director("Matt Reeves")
                .description("In his second year of fighting crime, Batman uncovers corruption in Gotham City that connects to his own family while facing a serial killer known as the Riddler.")
                .posterPath("74xTEgt7R36Fpooo50r9T25onhq.jpg")
                .backdropPath("b0PlSFdDwbyK0cf5RxwDpaOJQvQ.jpg")
                .build(),
            Movie
                .builder()
                .title("Blade Runner")
                .release_year(1982)
                .genre("Science Fiction, Drama, Thriller")
                .director("Ridley Scott")
                .description("In the smog-choked dystopian Los Angeles of 2019, blade runner Rick Deckard is called out of retirement to terminate a quartet of replicants who have escaped to Earth seeking their creator for a way to extend their short life spans.")
                .posterPath("63N9uy8nd9j7Eog2axPQ8lbr3Wj.jpg")
                .backdropPath("wfQTVBIQj1wJUe0jV3OZ4zOivIO.jpg")
                .build(),
            Movie
                .builder()
                .title("Forrest Gump")
                .release_year(1994)
                .genre("Comedy, Drama, Romance")
                .director("Robert Zemeckis")
                .description("A man with a low IQ has accomplished great things in his life and been present during significant historic events—in each case, far exceeding what anyone imagined he could do. But despite all he has achieved, his one true love eludes him.")
                .posterPath("arw2vcBveWOVZr6pxd9XTd1TdQa.jpg")
                .backdropPath("qdIMHd4sEfJSckfVJfKQvisL02a.jpg")
                .build(),
            Movie
                .builder()
                .title("Whiplash")
                .release_year(2014)
                .genre("Drama, Music")
                .director("Damien Chazelle")
                .description("Under the direction of a ruthless instructor, a talented young drummer begins to pursue perfection at any cost, even his humanity.")
                .posterPath("7fn624j5lj3xTme2SgiLCeuedmO.jpg")
                .backdropPath("vNXGrknx4GjWLgmuNTftWZluIUl.jpg")
                .build(),
            Movie
                .builder()
                .title("The Shawshank Redemption")
                .release_year(1994)
                .genre("Drama, Crime")
                .director("Frank Darabont")
                .description("Framed in the 1940s for the")
                .posterPath("9cqNxx0GxF0bflZmeSMuL5tnGzr.jpg")
                .backdropPath("kXfqcdQKsToO0OUXHcrrNCHDBzO.jpg")
                .build()
        );

        movieRepository.saveAll(movieTxn);
    }
}
