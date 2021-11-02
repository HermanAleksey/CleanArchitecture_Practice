package data.repository.datarepository

import domain.entity.Data

interface DataRepository {

    fun getData(): Data

    fun sendData(data: Data)
}