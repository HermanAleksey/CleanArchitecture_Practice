package domain.usecase.senddata

import domain.entity.Data

interface SendDataUseCase {
    fun execute(data: Data)
}