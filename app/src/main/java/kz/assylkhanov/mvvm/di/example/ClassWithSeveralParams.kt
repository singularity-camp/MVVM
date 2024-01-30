package kz.assylkhanov.mvvm.di.example

class ClassWithSeveralParams(
    private val param1: ClassWithoutParams,
    private val param2: ClassWithParams
) {
    fun execute() {
        param1.execute()
        param2.execute()
    }
}
