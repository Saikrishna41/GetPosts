package com.techfortyone.getposts.utils

class Resource<out T>(
    val status: STATUS,
    val data: T?,
    val message: String?
) {

    companion object {
        fun <T> success(data: T): Resource<T> {
            return Resource(STATUS.SUCCESS, data, null)
        }

        fun <T> error(data: T?, message: String?): Resource<T> {
            return Resource(STATUS.ERROR, data, message)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(STATUS.LOADING, data, null)
        }
    }
}


enum class STATUS {
    SUCCESS,
    ERROR,
    LOADING
}