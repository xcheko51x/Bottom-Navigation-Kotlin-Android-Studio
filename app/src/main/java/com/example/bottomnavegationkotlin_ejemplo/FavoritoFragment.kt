package com.example.bottomnavegationkotlin_ejemplo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavegationkotlin_ejemplo.databinding.FragmentFavoritoBinding
import com.example.bottomnavegationkotlin_ejemplo.databinding.FragmentInicioBinding

class FavoritoFragment : Fragment(R.layout.fragment_favorito) {

    private lateinit var binding: FragmentFavoritoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentFavoritoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFavoritoBinding.inflate(layoutInflater)
        binding.tvTexto.text = "Fragment Favortio"

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorito, container, false)
    }
}