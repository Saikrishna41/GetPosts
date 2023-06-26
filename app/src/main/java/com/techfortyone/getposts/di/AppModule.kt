package com.techfortyone.getposts.di

import android.util.Config
import com.techfortyone.getposts.utils.BASE_URL
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import javax.inject.Singleton

/***
 * The @Module annotation in Dagger is used to mark a class as a module, which is responsible for defining
 * how to construct and provide instances of objects that can be injected into other classes.
 * Modules serve as a way to centralize the configuration and binding logic required for dependency injection.
 */
@Module
object AppModule {
    /***
     * The @Provides annotation is used to annotate methods inside a Dagger module class.
     * These methods are responsible for creating and providing instances of objects that can be injected into other classes.
     * The methods annotated with @Provides specify how to construct and provide instances of specific types.
     * When Dagger encounters a request for a specific type, it looks for a corresponding @Provides method in the modules it knows about, and invokes that method to obtain the instance.
     */
    @Provides
    @Singleton
    fun provideBaseUrl() = BASE_URL

    @Provides
    @Singleton
    fun provideOkhttpClient(baseurl: String) = if (Config.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder().addInterceptor(loggingInterceptor).build()
    } else {
        OkHttpClient.Builder().build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(baseurl: String, okHttpClient: OkHttpClient) =
        Retrofit.Builder().baseUrl(baseurl).client(okHttpClient).build()


}