class DevelopmentDepartment : Department() {
    override val departmentName: String = "Отдел разработки"
    override fun printDepartmentGoal() {
        println("Цель отдела '$departmentName': Писать чистый код")
        fun generateReport(): String {
            return """
            Отчёт по отделу:
            Название: $departmentName
            Тип: Разработка
            Цель: Создание программного обеспечения
        """.trimIndent()
        }
    }
}
