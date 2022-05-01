package com.pec_acm.moviedroid.data.api

import com.pec_acm.moviedroid.model.MovieDetail
import com.pec_acm.moviedroid.model.MovieListResponse
import com.pec_acm.moviedroid.model.TVDetail
import com.pec_acm.moviedroid.model.TvListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TMDBApi {

    @GET("movie/top_rated")
    suspend fun getTopMovies(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<MovieListResponse>

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<MovieListResponse>

    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<MovieListResponse>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<MovieListResponse>

    @GET("search/movie")
    suspend fun searchMovie(
        @Query("query")
        query: String,
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<MovieListResponse>


    @GET("tv/top_rated")
    suspend fun getTopTvShows(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<TvListResponse>

    @GET("tv/popular")
    suspend fun getPopularTvShows(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<TvListResponse>

    @GET("tv/now_playing")
    suspend fun getNowPlayingTvShows(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<TvListResponse>

    @GET("tv/upcoming")
    suspend fun getUpcomingTvShows(
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<TvListResponse>

    @GET("search/tv")
    suspend fun searchTvShow(
        @Query("query")
        query: String,
        @Query("api_key")
        apiKey : String = ApiInstance.API_KEY
    ) : Response<TvListResponse>

    @GET("movie/{movie_id}")
    suspend fun movieDetailByID(
        @Query("api_key")
        apiKey: String = ApiInstance.API_KEY,
       @Path("movie_id") movie_id : Int
    ) : Response<MovieDetail>

    @GET("tv/{tv_id}")
    suspend fun tvShowByID(
        @Query("api_key")
        apiKey: String = ApiInstance.API_KEY,
        @Path("tv_id") tv_id : Int
    ) : Response<TVDetail>
}