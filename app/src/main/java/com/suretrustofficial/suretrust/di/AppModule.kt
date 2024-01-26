package com.suretrustofficial.suretrust.di

import com.suretrustofficial.suretrust.data.remote.ISureTrustAPI
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import com.suretrustofficial.suretrust.data.repository.RemoteDataRepositoryImpl
import com.suretrustofficial.suretrust.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        val okHttpClient: OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideApi(retrofit: Retrofit): ISureTrustAPI = retrofit.create(ISureTrustAPI::class.java)

    @Provides
    @Singleton
    fun provideRepository(api:ISureTrustAPI): RemoteDataRepository = RemoteDataRepositoryImpl(api)
}