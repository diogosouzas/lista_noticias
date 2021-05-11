package br.com.sdiogo.listanoticias.ui.activity

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VisualizaNoticiaViewModelFactory(
    private val id: Long,
    private val repository: NoticiaRepository
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return VisualizaNoticiaViewModel(id, repository) as T
    }

}