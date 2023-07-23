package cinemaProject

import java.util.*

object Database {

    val tickets = mutableListOf<Ticket>()

    val actors = mutableListOf(

        Actor(1, "Mustafa", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(2, "salih", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(3, "akın", Date(), Gender.MALE, Countries.ALBANIA),
        Actor(4, "fıdı", Date(), Gender.MALE, Countries.ANDORRA),
        Actor(5, "osman", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(6, "berkay", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(7, "seyfo", Date(), Gender.MALE, Countries.AFGHANISTAN),
        Actor(8, "özsoy", Date(), Gender.MALE, Countries.AFGHANISTAN)

    )
}