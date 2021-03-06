package br.com.sdiogo.listanoticias.ui.activity

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface NoticiaDAO {

    @Query("SELECT * FROM Noticia ORDER BY id DESC")
    fun buscaTodos(): LiveData<List<Noticia>>

    @Insert(onConflict = REPLACE)
    fun salva(noticia: Noticia)

    @Delete
    fun remove(noticia: Noticia)

    @Query("SELECT * FROM Noticia WHERE id = :id")
    fun buscaPorId(id: Long): LiveData<Noticia?>

    @Insert(onConflict = REPLACE)
    fun salva(noticias: List<Noticia>)

}
