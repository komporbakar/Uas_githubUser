package id.arifnurrohman.githubuser.api

import id.arifnurrohman.githubuser.data.model.DetailUserResponse
import id.arifnurrohman.githubuser.data.model.User
import id.arifnurrohman.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface  Api {
    @GET("search/users")
    @Headers("Authorization: token 27c4a9281c9911b5857e31cb6531f3866b9f9aef")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 27c4a9281c9911b5857e31cb6531f3866b9f9aef")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 27c4a9281c9911b5857e31cb6531f3866b9f9aef")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 27c4a9281c9911b5857e31cb6531f3866b9f9aef")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}