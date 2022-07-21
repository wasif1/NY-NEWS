package com.nytimesapp.di
import com.nytimesapp.network.ApiService
import com.nytimesapp.repository.NYTimesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object RepositoryModule {

    /**
     * Repositories
     */
    @Provides
    fun providesRepo(apiService: ApiService): NYTimesRepository {
        return NYTimesRepository(apiService = apiService)
    }
}