package br.com.sdiogo.listanoticias.ui.activity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Noticia(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val titulo: String = "",
    val texto: String = ""
)
