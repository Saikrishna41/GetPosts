package com.techfortyone.getposts.data.remote

import com.techfortyone.getposts.data.model.Photos
import retrofit2.Response
import retrofit2.http.GET

interface PhotoApiServiceHelper {
    @GET("photos/")
    suspend fun getPostsWithPhotos() : Response<Photos>
}