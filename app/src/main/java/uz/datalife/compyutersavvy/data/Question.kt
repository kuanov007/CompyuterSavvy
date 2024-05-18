package uz.datalife.compyutersavvy.data

data class Question (
    val id: Int,
    val class_id: Int,
    val question: String,
    var option: List<String>,
    val correctAnswer:String
)