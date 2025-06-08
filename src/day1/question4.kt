package day1

fun main()
{
    var cup1 = "small"
    var cup2 = "large"
    println("Before:cup1 = $cup1,cup2=$cup2")
    if (cup1 !=cup2) {
        val temp = cup1
        cup1 = cup2
        cup2 = temp
    }
    else
    {
        println("Both cups are already the same size.")
    }
    println("after : cup1 = $cup1 , cup2=$cup2  and the cups swapped successfully !!!!!!" )

}