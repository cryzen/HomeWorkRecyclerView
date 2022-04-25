package com.example.homeworkrecyclerview

data class Employee(
    val id: Long,
    val fullName: String,
    val photoUrl: String,
    val department: String
) {
    companion object {
        fun getMockEmployees() = listOf(
            Employee(
                0,
                "Dwayne Johnson",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Dwayne_Johnson_2%2C_2013.jpg/274px-Dwayne_Johnson_2%2C_2013.jpg",
                "Fitness department"
            ),
            Employee(
                1,
                "Tom Cruise",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/33/Tom_Cruise_by_Gage_Skidmore_2.jpg/220px-Tom_Cruise_by_Gage_Skidmore_2.jpg",
                "Action department"
            ),
            Employee(
                2,
                "Jim Carrey",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Jim_Carrey_2008.jpg/274px-Jim_Carrey_2008.jpg",
                "Comedy department"
            ),
            Employee(
                3,
                "Emily Blunt",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Emily_Blunt_SAG_Awards_2019.png/280px-Emily_Blunt_SAG_Awards_2019.png",
                "Adventures department"
            ),
            Employee(
                4,
                "Emilia Clarke",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1e/Emilia_Clarke_Vogue.png/250px-Emilia_Clarke_Vogue.png",
                "Game of Thrones department"
            ),
            Employee(
                5,
                "Ryan Reynolds",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/14/Deadpool_2_Japan_Premiere_Red_Carpet_Ryan_Reynolds_%28cropped%29.jpg/220px-Deadpool_2_Japan_Premiere_Red_Carpet_Ryan_Reynolds_%28cropped%29.jpg",
                "Comedy department"
            ),
            Employee(
                6,
                "Emma Stone",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Emma_Stone_at_Maniac_UK_premiere_%28cropped%29.jpg/220px-Emma_Stone_at_Maniac_UK_premiere_%28cropped%29.jpg",
                "Bad girls Department"
            ),
            Employee(
                7,
                "Robert John Downey Jr.",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Robert_Downey_Jr_2014_Comic_Con_%28cropped%29.jpg/250px-Robert_Downey_Jr_2014_Comic_Con_%28cropped%29.jpg",
                "Avengers Department"
            )
        )
    }
}