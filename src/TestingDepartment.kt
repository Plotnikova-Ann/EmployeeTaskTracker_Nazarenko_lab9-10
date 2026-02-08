class TestingDepartment : Department() {
    override val departmentName: String = "Отдел тестирования"
    override fun printDepartmentGoal() {
        println("Цель отдела '$departmentName': Находить все баги")
    }
}