package edu.unicauca.aplimovil.safekids.data

import edu.unicauca.aplimovil.safekids.PlatformContext

/**
 * App container for Dependency injection.
 */
interface AppContainer {
    val itemsRepository: ItemsRepository
    val teachersRepository: TeachersRepository
    val coursesRepository: CoursesRepository
    val guardiansRepository: GuardiansRepository
    val studentsRepository: StudentsRepository
    val studentGuardiansRepository: StudentGuardiansRepository
    val studentCoursesRepository: StudentCoursesRepository
    val moneyRepository: MoneyRepository
}

/**
 * [AppContainer] implementation that provides instance of [OfflineItemsRepository]
 */
class AppDataContainer(private val platformContext: PlatformContext) : AppContainer {
    /**
     * Implementation for [ItemsRepository]
     */
    override val itemsRepository: ItemsRepository by lazy {
        OfflineItemsRepository(getDatabase(platformContext).itemDao())
    }

    override val teachersRepository: TeachersRepository by lazy {
        OfflineTeachersRepository(getDatabase(platformContext).teacherDao())
    }

    override val coursesRepository: CoursesRepository by lazy {
        OfflineCoursesRepository(getDatabase(platformContext).courseDao())
    }

    override val guardiansRepository: GuardiansRepository by lazy {
        OfflineGuardiansRepository(getDatabase(platformContext).guardianDao())
    }

    override val studentsRepository: StudentsRepository by lazy {
        OfflineStudentsRepository(getDatabase(platformContext).studentDao())
    }

    override val studentGuardiansRepository: StudentGuardiansRepository by lazy {
        OfflineStudentGuardiansRepository(getDatabase(platformContext).studentGuardianDao())
    }

    override val studentCoursesRepository: StudentCoursesRepository by lazy {
        OfflineStudentCoursesRepository(getDatabase(platformContext).studentCourseDao())
    }

    override val moneyRepository: MoneyRepository by lazy {
        OfflineMoneyRepository(getDatabase(platformContext).moneyDao())
    }
}