package edu.unicauca.aplimovil.safekids.data

import edu.unicauca.aplimovil.safekids.PlatformContext
import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Database class with a singleton Instance object.
 */
@Database(
    entities = [
        Item::class,
        Teacher::class,
        Course::class,
        Guardian::class,
        Student::class,
        StudentGuardian::class,
        StudentCourse::class,
        Money::class
    ],
    version = 3,
    exportSchema = false
)
abstract class InventoryDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
    abstract fun teacherDao(): TeacherDao
    abstract fun courseDao(): CourseDao
    abstract fun guardianDao(): GuardianDao
    abstract fun studentDao(): StudentDao
    abstract fun studentGuardianDao(): StudentGuardianDao
    abstract fun studentCourseDao(): StudentCourseDao
    abstract fun moneyDao(): MoneyDao
}

/**
 * Expected function to get the database instance.
 * The actual implementation will be platform-specific.
 */
expect fun getDatabase(context: PlatformContext): InventoryDatabase