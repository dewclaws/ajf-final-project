import { MovieDetails } from "@/components/movie";
import Image from "next/image";
import Link from "next/link";

async function getMovie(id: number): Promise<MovieDetails> {
  const response = await fetch(`http://127.0.0.1:8080/api/movies/${id}`, { cache: 'no-store' });

  return response.json();
}

export default async function MovieDetailsPage({ params }: { params: { id: number } }) {
  const movie = await getMovie(params.id);
  const backdropUrl = `https://image.tmdb.org/t/p/w780/${movie.backdropPath}`;
  const posterUrl = `https://image.tmdb.org/t/p/w780/${movie.posterPath}`;

  return (
      <div className="w-2/3 self-center border rounded-xl overflow-hidden">
        <div className="relative h-36 overflow-hidden">
          <Image fill src={backdropUrl} alt="Movie backdrop" className="object-cover blur" />
        </div>
        <div className="bg-white p-6 flex gap-6">
          <Image width={500} height={500} src={posterUrl} alt="Movie poster" className="aspect-[2/3] w-64 rounded-md border" />
          <div className="flex flex-col justify-between">
            <div className="space-y-2">
              <h2 className="text-4xl font-bold">
                {movie.title}
              </h2>
              <div className="flex flex-col justify-center text-sm text-gray-500">
                <div className="flex items-center gap-2">
                  <span className="font-mono text-xl">{movie.release_year}</span>
                  &mdash;
                  <p>{movie.genre}</p>
                </div>
                <ul>
                  <li>
                    Directed by <span className="font-medium">{movie.director}</span>
                  </li>
                </ul>
              </div>
              <p>
                {movie.description}
              </p>
            </div>
            <div className="self-end">
              <Link className="rounded border border-black bg-white hover:bg-black hover:text-white transition-colors px-4 py-2" href="/">Back</Link>
            </div>
          </div>
        </div>
      </div>
  )
}