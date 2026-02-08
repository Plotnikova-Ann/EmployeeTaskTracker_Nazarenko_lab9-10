fun main() {
    println("Тестирование класса Employee ")
    val employee = Employee()
    employee.setFullName("Иванов Иван Иванович")
    employee.setPosition("Разработчик")
    employee.setSalary(-5000)
    employee.setSalary(100000)
    employee.setYearsOfExperience(60)
    employee.setYearsOfExperience(5)
    println("\nИнформация о сотруднике:")
    println("ФИО: ${employee.getFullName()}")
    println("Должность: ${employee.getPosition()}")
    println("Зарплата: ${employee.getSalary()}")
    println("Опыт работы: ${employee.getYearsOfExperience()} лет")
    val task1 = Task(
        title = "Рефакторинг кода",
        description = "Улучшить читаемость кода",
        priority = Priority.HIGH
    )
    val task2 = Task(
        title = "Написание тестов",
        description = "Создать unit-тесты",
        priority = Priority.MEDIUM
    )
    val task3 = task1.copy(
        title = "Рефакторинг кода (копия)",
        priority = Priority.LOW
    )
    println("\n1. Сравнение задач:")
    println("task1 == task2: ${task1 == task2}")
    println("task1 == task3: ${task1 == task3}")
    println("\n2. Хеш-коды:")
    println("task1.hashCode(): ${task1.hashCode()}")
    println("task2.hashCode(): ${task2.hashCode()}")
    println("\n3. toString():")
    println(task1)
    println(task2)
    println("\n4. Копирование с изменениями:")
    val task4 = task2.copy(
        title = "Обновление тестов",
        isCompleted = true
    )
    println("Оригинал: $task2")
    println("Копия: $task4")
    val devDept = DevelopmentDepartment()
    val testDept = TestingDepartment()
    println("\nИнформация об отделах:")
    println("Отдел: ${devDept.departmentName}")
    devDept.printDepartmentGoal()
    println("\nОтдел: ${testDept.departmentName}")
    testDept.printDepartmentGoal()

}

