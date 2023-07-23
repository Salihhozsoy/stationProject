package stationProject

class ShellStation(
    id: Int,
    name: String,
    city: City,
    pumpCount: Int,
    pumpers: List<Pumper>,
    val isRestArea: Boolean
) :
    BaseStation(id, name, city, pumpCount, pumpers) {}