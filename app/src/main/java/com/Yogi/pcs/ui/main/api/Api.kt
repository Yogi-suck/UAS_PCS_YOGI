package com.Yogi.pcs.ui.main.api

import com.Yogi.pcs.ui.main.data.model.DetailUserResponse
import com.Yogi.pcs.ui.main.data.model.User
import retrofit2.Call
import com.Yogi.pcs.ui.main.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 6bb140c9269ee28ca2a4699d6852aca5e93697c9")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 6bb140c9269ee28ca2a4699d6852aca5e93697c9")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 6bb140c9269ee28ca2a4699d6852aca5e93697c9")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 6bb140c9269ee28ca2a4699d6852aca5e93697c9")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>

}