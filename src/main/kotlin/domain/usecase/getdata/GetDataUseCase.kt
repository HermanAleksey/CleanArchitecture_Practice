package domain.usecase.getdata

import domain.entity.Data

interface GetDataUseCase {
    fun execute(): Data
}