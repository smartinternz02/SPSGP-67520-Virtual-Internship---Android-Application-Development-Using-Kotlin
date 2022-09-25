package dhrubajit.com.dhrubajit.singletons

object DecimalFormatter {
    fun format(num :Float?): String{
        return String.format("%.2f", num)
    }
}