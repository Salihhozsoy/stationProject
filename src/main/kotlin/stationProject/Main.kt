package stationProject

import java.time.LocalDate

fun main() {

    println()
    println()


    val shellStation = ShellStation(1, "BayiOne", City.Kayseri, 4, Database.pumper, true)
    val opetStation = OpetStation(2, "BayiTwo", City.Ankara, 4, Database.pumper)


    val customer1 = Customer(1, "Mahir", "Ozdin", "Peugeot")
    val customer2 = Customer(2, "Mustafa", "Genc", "Opel")
    val customer3 = Customer(3, "Apo", "Yuruk", "Getz")
    val customer4 = Customer(4, "Halit", "Birkol", "Peugeot")
    val customer5 = Customer(5, "Safa", "Ilgın", "Mercedes")
    val customer6 = Customer(6, "Mehmet", "Icer", "Audi")

    val gasoline = Fuel(FuelType.Gasoline, 34.0)
    val diesel = Fuel(FuelType.Gasoline, 35.0)
    val gas = Fuel(FuelType.Gasoline, 20.0)


    val invoice = Invoice(1, 4, InvoiceType.oldCustomerBill, LocalDate.of(2023, 7, 23), customer1, gas, shellStation)
    val invoice2 = Invoice(2, 1, InvoiceType.newCustomerBill, LocalDate.of(2023, 7, 23), customer2, diesel, shellStation)
    val invoice3 = Invoice(3, 7, InvoiceType.oldCustomerBill, LocalDate.of(2023, 7, 23), customer3, diesel, opetStation)
    val invoice4 = Invoice(4, 2, InvoiceType.newCustomerBill, LocalDate.of(2023, 7, 23), customer4, diesel, opetStation)
    val invoice5 = Invoice(5, 3, InvoiceType.newCustomerBill, LocalDate.of(2023, 7, 23), customer5, diesel, opetStation)
    val invoice6 = Invoice(6, 3, InvoiceType.oldCustomerBill, LocalDate.of(2023, 7, 23), customer6, diesel, opetStation)


}