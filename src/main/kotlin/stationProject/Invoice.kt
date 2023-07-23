package stationProject

import java.time.LocalDate

data class Invoice(
    val id: Int,
    val pumpNo: Int,
    val invoiceType: InvoiceType,
    val date: LocalDate,
    val customer: Customer,
    val fuel: Fuel,
    val station: BaseStation
) {

    init {
        if (station.pumpCount < 1) {
            println("Merhaba ${customer.name} ${customer.surname} istasyon doludur.")
        } else {
            val totalPrice = fuel.price
            val messagePrefix = getMessagePrefix(invoiceType)

            if (isPumpAvailable(pumpNo)) {  // pompa boşsa

                when (invoiceType) {
                    InvoiceType.oldCustomerBill -> fuel.price *= 0.9
                    InvoiceType.newCustomerBill -> fuel.price ==fuel.price
                    else -> {//other}
                    }

                }
               val discount= getDiscountText(invoiceType, totalPrice, fuel.price)
                println("$messagePrefix ${customer.name} ${customer.surname} faturanız hazır yakıt ücretiniz ${fuel.price} ")
                Database.invoices.add(this)
                station.pumpCount--

            } else {
                println("merhaba ${customer.name} malesef ${station.name} için $pumpNo numaralı pompa doludur. Lütfen başka bir pompaya gidin")
            }
        }
    }

    private fun getDiscountText(type: InvoiceType, totalPrice: Double, price: Double) {
        when (type) {
            InvoiceType.oldCustomerBill -> {
                println("indiriminiz: ${totalPrice - price}")
            }
            else -> {
                println("Yeni Müşteri olduğunuz için indirim uygulanmamaktadır.")
            }
        }

    }

   private fun getMessagePrefix(type: InvoiceType): String {
       return if (type == InvoiceType.oldCustomerBill) "Sn." else ""
   }



   private fun isPumpAvailable(pumpNo: Int): Boolean =
        Database.invoices.firstOrNull { it.pumpNo == pumpNo } == null


}
enum class InvoiceType {
    oldCustomerBill,
    newCustomerBill
}