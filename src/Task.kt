data class Task(
    val title: String,
    val description: String,
    val priority: Priority = Priority.MEDIUM,
    var isCompleted: Boolean = false
)