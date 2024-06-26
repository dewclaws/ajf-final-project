import { MovieDetails } from "./index";
import Image from 'next/image';
import Link from "next/link";

export function MovieListing({ details }: { details: MovieDetails }) {
  const posterUrl = `https://image.tmdb.org/t/p/w780/${details.posterPath}`;

  return (
      <li>
        <Link href={`/movies/${details.id}`} className="flex flex-col space-y-2">
          <Image width={500} height={500} src={posterUrl} alt="Movie poster" className="aspect-[2/3] w-full rounded-md border"/>
          <h4 className="font-bold">
            {details.title}
            <p className="text-xs font-normal text-neutral-400">{details.release_year}</p>
          </h4>
        </Link>
      </li>
  )
}