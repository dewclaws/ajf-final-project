export interface MovieDetails {
    id: number;
    title: string;
    release_year: number;
    genre: string;
    director: string;
    description: string;
    posterPath: string;
    backdropPath: string;
}

export { MovieListing } from './listing';