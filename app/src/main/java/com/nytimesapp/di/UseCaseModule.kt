package com.nytimesapp.di
import com.nytimesapp.repository.NYTimesRepository
import com.nytimesapp.usecase.NYTimesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@InstallIn(ActivityRetainedComponent::class)
@Module
object UseCaseModule {

    /**
     * UseCases
     */
    @Provides
    fun providesDataUseCase(repository: NYTimesRepository): NYTimesUseCase {
        return NYTimesUseCase(repository)
    }
}