package com.techfortyone.getposts.data.remote

import com.techfortyone.getposts.data.model.Photos
import retrofit2.Response
import javax.inject.Inject

class PhotoApiServiceImpl @Inject constructor(private val photosApiService: PhotosApiService) :
    PhotoApiServiceHelper {
    override suspend fun getPostsWithPhotos(): Response<Photos> {
        return photosApiService.getPostsWithPhotos()
    }
}