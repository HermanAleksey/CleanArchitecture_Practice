package domain.usecase.getdata

import data.repository.datarepository.DataRepository
import domain.entity.Data

class RealGetDataUseCase(
    private val repository: DataRepository
): GetDataUseCase {

    override fun execute(): Data {
        return repository.getData()
    }
}