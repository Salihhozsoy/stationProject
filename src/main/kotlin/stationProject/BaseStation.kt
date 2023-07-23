package stationProject

open class BaseStation (var id:Int, var name:String, var city:City, var pumpCount:Int, var pumpers:List<Pumper>){

}

enum class City{
    Ankara,
    Istanbul,
    Kayseri,
    Mugla,
    İzmir

}
