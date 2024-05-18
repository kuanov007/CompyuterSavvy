package uz.datalife.compyutersavvy.data

import java.io.Serializable

data class Lecture(
    val id: Int,
    val name: String,
    val text: String,
    val clazzId: Int,
    val favorite: Boolean = false
): Serializable
