package cinemaProject

import java.time.LocalDate

open class Event(var id: Int, var name: String, var price: Double, var date: LocalDate, var actors: List<Actor>) {}