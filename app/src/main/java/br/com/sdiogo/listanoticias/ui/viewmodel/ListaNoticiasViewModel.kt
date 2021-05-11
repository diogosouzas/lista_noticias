package br.com.sdiogo.listanoticias.ui.activity

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class ListaNoticiasViewModel(
    private val repository: NoticiaRepository
) : ViewModel() {

    fun buscaTodos() : LiveData<Resource<List<Noticia>?>> {
        return repository.buscaTodos()
    }

}