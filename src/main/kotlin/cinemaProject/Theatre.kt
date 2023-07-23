package cinemaProject

import java.time.LocalDate

class Theatre(id: Int, name: String, price: Double, date: LocalDate, actors: List<Actor>, val stageCount: Int) :
    Event(id, name, price, date, actors) {}