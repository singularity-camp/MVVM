package kz.assylkhanov.mvvm.di.example

import org.koin.core.qualifier.named
import org.koin.dsl.module

/**
 * @author a.asylkhanov
 */
val exampleModule = module {
    // Instruction to create class without Params
    factory<ClassWithoutParams> { ClassWithoutParams() }

    // Instruction to create class with Params
    factory { ClassWithParams(get()) }

    // Instruction to create class with Several Params
    single<ClassWithSeveralParams> {
        ClassWithSeveralParams(
            param1 = get(),
            param2 = get(),
        )
    }

    factory { (screenName: String) ->
        AnalyticsSender(
            screenName = screenName,
            param = get()
        )
    }

    single<Database> { RealmDatabase() }

    factory(named(STUDENT_AIDAR)) {
        Student(
            name = "Aidar"
        )
    }

    factory(named(STUDENT_AIJAN)) {
        Student(
            name = "Aijan"
        )
    }

    factory {
        Student(name = "Unknown")
    }

//    viewModel {
//        MainViewModel()
//    }

}

val modulesOfMyApplication = listOf(exampleModule)

const val STUDENT_AIDAR = "STUDENT_AIDAR"
const val STUDENT_AIJAN = "STUDENT_AIJAN"

