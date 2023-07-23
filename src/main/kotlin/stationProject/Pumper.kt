package stationProject


class Pumper(val id: Int, val name: String, val surname: String, val gender: Cinsiyet) {

}

enum class Cinsiyet {
    Man,
    Woman
}