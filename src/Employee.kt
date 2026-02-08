class Employee {
    private var fullName: String = ""
    private var position: String = ""
    private var salary: Int = 0
    private var yearsOfExperience: Int = 0
    fun getFullName(): String = fullName
    fun getPosition(): String = position
    fun getSalary(): Int = salary
    fun getYearsOfExperience(): Int = yearsOfExperience
    fun setFullName(name: String) { fullName = name }
    fun setPosition(pos: String) { position = pos }
    fun setSalary(newSalary: Int) {
        if (newSalary < 0) {
            println("Внимание: Зарплата не может быть отрицательной!")
        } else {
            salary = newSalary
        }
    }
    fun setYearsOfExperience(experience: Int) {
        if (experience > 50) {
            println("Опыт работы ограничен 50 годами! Установлено значение: 50")
            yearsOfExperience = 50
        } else if (experience < 0) {
            println("Опыт работы не может быть отрицательным! Установлено значение: 0")
            yearsOfExperience = 0
        } else {
            yearsOfExperience = experience
            fun generateReport(): String {
                return """
            Отчёт по сотруднику:
            ФИО: $fullName
            Должность: $position
            Зарплата: $salary руб.
            Опыт работы: $yearsOfExperience лет
        """.trimIndent()

            }
        }
        }
    }
