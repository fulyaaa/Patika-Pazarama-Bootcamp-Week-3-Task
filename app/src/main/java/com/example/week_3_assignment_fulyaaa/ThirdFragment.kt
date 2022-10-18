package com.example.week_3_assignment_fulyaaa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.example.week_3_assignment_fulyaaa.data.ProductModel
import com.example.week_3_assignment_fulyaaa.databinding.FragmentSecondBinding
import com.example.week_3_assignment_fulyaaa.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private var _binding : FragmentThirdBinding? = null
    private val binding get() = _binding!!
    private lateinit var productName: TextView
    private lateinit var productImage: ImageView
    private lateinit var productQuantity: TextView
    private lateinit var productPrice: TextView
    private val args by navArgs<ThirdFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews(view)
    }

    private fun setupViews(view: View) {
        productImage = binding.productImage
        productName = binding.productName
        productQuantity = binding.productQuantity
        productPrice = binding.productPrice

        productImage.setImageResource(args.productDetails.image)
        productName.text = args.productDetails.name
        productQuantity.text = args.productDetails.quantity
        productPrice.text = args.productDetails.price
    }
}


