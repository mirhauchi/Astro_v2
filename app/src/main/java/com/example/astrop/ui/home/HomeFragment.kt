package com.example.astrop.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.astrop.R
import com.example.astrop.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(requireContext())
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhgWGnuE_0Qr-Oncl-3o4CgxGlkmJVgZF5Yw&usqp=CAU")
            .into(binding.homeAstros)

        Glide.with(requireContext())
            .load("http://s2.dmcdn.net/u/8bnbj1a04YnFjoMYk/200x200")
            .into(binding.homeDailyImg)

        binding.homeAstros.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment2_to_astroTypeFragment)
        }
    }


}