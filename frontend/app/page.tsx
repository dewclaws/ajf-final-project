import { MovieDetails, MovieListing } from "@/components/movie";

async function getMovies(): Promise<MovieDetails[]> {
  const response = await fetch('http://127.0.0.1:8080/api/movies', { cache: 'no-store' });

  return response.json();
}

export default async function Home() {
  const movies = await getMovies();

  return (
      <main className="p-12 space-y-6">
        <h1 className="text-4xl font-bold">All Movies</h1>
        <ul className="grid grid-cols-8 gap-4">
          {movies.map((movie) => (
              <MovieListing details={movie} key={movie.id}/>
          ))}
        </ul>
      </main>
  );
}
