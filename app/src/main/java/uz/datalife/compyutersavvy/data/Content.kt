package uz.datalife.compyutersavvy.data

import java.io.Serializable

data class Content(
    val id: Int,
    val name: String,
    val clazzId: Int,
    val favorite: Boolean = false
) : Serializable