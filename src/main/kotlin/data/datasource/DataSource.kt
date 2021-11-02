package data.datasource

import domain.entity.Data

interface DataSource {

    fun getData(): Data

    fun sendData(data: Data)
}