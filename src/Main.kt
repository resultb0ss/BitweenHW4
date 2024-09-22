fun main() {
    var array: List<String> = arrayListOf("Jan","Feb","Mar","Apr","May")
    println(array.map{ a -> a.length }.sum())
}