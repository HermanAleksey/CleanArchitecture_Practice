package presentation.presenter

import data.repository.datarepository.DataRepository
import domain.entity.Data
import domain.usecase.getdata.GetDataUseCase


class FakeActivityPresenter(
    val getDataUseCase: GetDataUseCase,
    val dataRepository: DataRepository
) {

    /**
     * using UseCase
     * */
    fun onGetDataClick(): Data {
       return getDataUseCase.execute()
    }

    /**
     * working straight with repository
     * */
    fun onSendDataClick(data: Data) {
        dataRepository.sendData(data)
    }

    /**
     * Presenter can communicate with repository directly,
     * but it also can be done via special useCases
     * **/
}