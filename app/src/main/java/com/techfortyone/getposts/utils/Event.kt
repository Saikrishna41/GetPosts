package com.techfortyone.getposts.utils

open class Event<out T>(private val content: T) {

    var hasBeenHandled = false
        private set // allow external read but not write
    /**
     * returns the content and prevents using it again
     */
    fun getContentIfHandled() : T? {
        return if (hasBeenHandled) {
            null
        }
        else {
            hasBeenHandled = true
            content
        }
    }

    /**
     * returns content even it has already been handled
     */
    fun peekContent() : T = content
}