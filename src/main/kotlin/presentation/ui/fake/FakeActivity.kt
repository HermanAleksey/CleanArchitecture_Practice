package presentation.ui.fake

import data.datasource.web.WebDataSource
import data.repository.datarepository.impl.WebDataRepository
import domain.entity.Data
import domain.usecase.getdata.RealGetDataUseCase
import presentation.presenter.FakeActivityPresenter

class FakeActivity : FakeView{

    /**---------skipped part with DI---------**/
    private val presenter: FakeActivityPresenter = FakeActivityPresenter(
        getDataUseCase = RealGetDataUseCase(WebDataRepository(WebDataSource())),
        dataRepository = WebDataRepository(WebDataSource())
    )

    /**---------skipped part with MVP---------**/

    override fun OnGetDataClick() {
        val data = presenter.onGetDataClick()
        displayReceivedData(data)
    }

    override fun OnSendDataClick() {
        val data = getDataFromField()
        presenter.onSendDataClick(data)
    }

    private fun displayReceivedData(data: Data){
        println(data)
    }

    private fun getDataFromField(): Data{
        return Data(54,"data from field")
    }
}