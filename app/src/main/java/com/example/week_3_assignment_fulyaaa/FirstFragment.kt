package com.example.week_3_assignment_fulyaaa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.week_3_assignment_fulyaaa.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    private val binding get() = _binding!!
    lateinit var drySkinButton: TextView
    lateinit var combinationSkinButton: TextView
    lateinit var oilySkinButton: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        drySkinButton = binding.drySkinButton
        combinationSkinButton = binding.combinationSkinButton
        oilySkinButton = binding.oilySkinButton
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        drySkinButton.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("dry")
            findNavController().navigate(action)
        }
        combinationSkinButton.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("combination")
            findNavController().navigate(action)
        }
        oilySkinButton.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("oily")
            findNavController().navigate(action)
        }
    }
}
