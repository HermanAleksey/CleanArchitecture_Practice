package data.datasource.web

import data.datasource.DataSource
import domain.entity.Data

//API
class WebDataSource: DataSource {

    override fun getData(): Data {
        //imagine getting data from Web
        return Data(1,"data from Web")
    }

    override fun sendData(data: Data) {
        //imagine sending data to Web
    }
}