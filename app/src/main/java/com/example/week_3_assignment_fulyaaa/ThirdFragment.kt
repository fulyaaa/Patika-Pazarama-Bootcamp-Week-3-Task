package com.example.week_3_assignment_fulyaaa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.week_3_assignment_fulyaaa.data.ProductModel


class ThirdFragment : Fragment() {

    private lateinit var productName: TextView
    private lateinit var productImage: ImageView
    private lateinit var productQuantity : TextView
    private lateinit var productPrice : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews(view)
    }
    private fun setupViews(view: View) {
        productName = view.findViewById(R.id.productName)
        productImage = view.findViewById(R.id.productImage)
        productQuantity = view.findViewById(R.id.productQuantity)
        productPrice = view.findViewById(R.id.productPrice)

        arguments?.let {
            val productData = it.getString("productModel")

            productData?.let { safeProductData ->
                val product = ProductModel.fromJson(safeProductData)

                productImage.setImageResource(product.image)
                productName.text = product.name
                productQuantity.text = product.quantity
                productPrice.text = product.price
            }
        }
    }

}