package presentation.ui.fake

import data.repository.datarepository.DataRepository
import data.repository.datarepository.impl.WebDataRepository
import domain.entity.Data
import domain.usecase.getdata.GetDataUseCase
import domain.usecase.getdata.RealGetDataUseCase
import org.koin.java.KoinJavaComponent.inject
import presentation.presenter.FakeActivityPresenter

class FakeActivity : FakeView {

    private val getDataUseCase by inject<GetDataUseCase>(RealGetDataUseCase::class.java)

    private val dataRepository by inject<DataRepository>(WebDataRepository::class.java)

    private val presenter: FakeActivityPresenter = FakeActivityPresenter(
        getDataUseCase = getDataUseCase,
        dataRepository = dataRepository
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

    private fun displayReceivedData(data: Data) {
        println(data)
    }

    private fun getDataFromField(): Data {
        return Data(54, "data from field")
    }
}