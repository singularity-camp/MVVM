package kz.assylkhanov.mvvm.di.example

class ClassWithParams(
    private val params: ClassWithoutParams,
) {

    fun execute() {
        params.execute()
    }
}
