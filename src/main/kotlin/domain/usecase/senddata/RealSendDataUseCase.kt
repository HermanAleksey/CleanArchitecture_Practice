package domain.usecase.senddata

import data.repository.datarepository.DataRepository
import domain.entity.Data

class RealSendDataUseCase(
    private val repository: DataRepository
) : SendDataUseCase {
    override fun execute(data: Data) {
        repository.sendData(data)
    }
}