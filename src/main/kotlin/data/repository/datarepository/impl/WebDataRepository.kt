package data.repository.datarepository.impl

import data.datasource.DataSource
import data.repository.datarepository.DataRepository
import domain.entity.Data

class WebDataRepository(
    val dataSource: DataSource
): DataRepository {
    override fun getData(): Data {
       return dataSource.getData()
    }

    override fun sendData(data: Data) {
        dataSource.sendData(data)
    }
}