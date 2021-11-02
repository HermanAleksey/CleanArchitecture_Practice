import di.mainModule
import org.koin.core.context.startKoin

class Main {
    fun main(args: Array<String>) {
        startKoin {
            modules(mainModule)
        }
    }
}