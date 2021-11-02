package di

import data.datasource.db.DBNoteSource
import data.datasource.web.WebDataSource
import data.repository.datarepository.impl.WebDataRepository
import data.repository.noterepository.RealNoteRepository
import domain.usecase.getdata.RealGetDataUseCase
import domain.usecase.getnote.RealGetNoteUseCase
import domain.usecase.savenote.RealSaveNoteUseCase
import domain.usecase.senddata.RealSendDataUseCase
import org.koin.dsl.module

val mainModule = module {

    //data
    single { WebDataSource() }

    single { DBNoteSource() }

    single { WebDataRepository(get()) }

    single { RealNoteRepository(get()) }

    //useCase
    single { RealGetDataUseCase(get()) }

    single { RealSendDataUseCase(get()) }

    single { RealSaveNoteUseCase(get()) }

    single { RealGetNoteUseCase(get()) }
}