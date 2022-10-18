package com.example.week_3_assignment_fulyaaa

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.week_3_assignment_fulyaaa.data.*
import com.example.week_3_assignment_fulyaaa.databinding.FragmentSecondBinding


class SecondFragment : Fragment(), ProductListener {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    private lateinit var rvProductList: RecyclerView
    private val args by navArgs<SecondFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvProductList = binding.rvProductList
        setupAdapter()
    }

    private fun setupAdapter() {
            val product = args.product

            if (product == "dry") {
                rvProductList.adapter = ProductAdapter(mockProductDataDry, this@SecondFragment)
            } else if (product == "combination") {
                rvProductList.adapter =
                    ProductAdapter(mockProductDataCombination, this@SecondFragment)
            } else {
                rvProductList.adapter = ProductAdapter(mockProductDataOily, this@SecondFragment)
            }


        rvProductList.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

    }

    override fun onClicked(product: ProductModel) {

        val action =
            SecondFragmentDirections.actionSecondFragmentToThirdFragment(
                product
            )
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}