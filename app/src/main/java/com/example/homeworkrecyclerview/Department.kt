package com.example.homeworkrecyclerview

data class Department(val title: String) {
    companion object {
        fun getMockDepartments() = listOf(
            Department("Fitness Department"),
            Department("Action Department"),
            Department("Comedy Department")
        )
    }
}