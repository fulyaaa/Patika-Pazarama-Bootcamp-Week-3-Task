package com.example.week_3_assignment_fulyaaa.data

import android.os.Parcelable
import com.example.week_3_assignment_fulyaaa.R
import com.google.gson.Gson
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProductModel(
    val image: Int,
    val name: String,
    val quantity: String,
    val price: String,
) : Parcelable {
    fun toJson(): String {
        return Gson().toJson(this)
    }

    companion object {
        fun fromJson(jsonValue: String): ProductModel {
            return Gson().fromJson(jsonValue, ProductModel::class.java)
        }
    }
}

val mockProductDataDry = mutableListOf<ProductModel>(
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Serum",
        "300 ml",
        "18,00 $"

    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream",
        "80 ml",
        "15,30 $"
    ),
    ProductModel(
        R.drawable.hand_cream_blue,
        "Freshly Face Wash",
        "120 ml",
        "10,00 $"
    ),
    ProductModel(
        R.drawable.blue_soap,
        "Body Shoap",
        "250 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Serum",
        "300 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream",
        "80 ml",
        "15,30 $"
    ),
    ProductModel(
        R.drawable.hand_cream_blue,
        "Freshly Face Wash",
        "120 ml",
        "10,00 $"
    ),
    ProductModel(
        R.drawable.blue_soap,
        "Body Shoap",
        "250 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Cream",
        "300 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream",
        "80 ml",
        "15,30 $"
    )
)


val mockProductDataCombination = mutableListOf<ProductModel>(
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Serum2",
        "300 ml",
        "18,00 $"

    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream2",
        "80 ml",
        "15,30 $"
    ),
    ProductModel(
        R.drawable.hand_cream_blue,
        "Freshly Face Wash",
        "120 ml",
        "10,00 $"
    ),
    ProductModel(
        R.drawable.blue_soap,
        "Body Shoap",
        "250 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Serum",
        "300 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream",
        "80 ml",
        "15,30 $"
    ),
    ProductModel(
        R.drawable.hand_cream_blue,
        "Freshly Face Wash",
        "120 ml",
        "10,00 $"
    ),
    ProductModel(
        R.drawable.blue_soap,
        "Body Shoap",
        "250 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Cream",
        "300 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream",
        "80 ml",
        "15,30 $"
    )


)


val mockProductDataOily = mutableListOf<ProductModel>(
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Serum3",
        "300 ml",
        "18,00 $"

    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream3",
        "80 ml",
        "15,30 $"
    ),
    ProductModel(
        R.drawable.hand_cream_blue,
        "Freshly Face Wash",
        "120 ml",
        "10,00 $"
    ),
    ProductModel(
        R.drawable.blue_soap,
        "Body Shoap",
        "250 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Serum",
        "300 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream",
        "80 ml",
        "15,30 $"
    ),
    ProductModel(
        R.drawable.hand_cream_blue,
        "Freshly Face Wash",
        "120 ml",
        "10,00 $"
    ),
    ProductModel(
        R.drawable.blue_soap,
        "Body Shoap",
        "250 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.opened_pink_cosmetic_serum,
        "Sii Peeling Cream",
        "300 ml",
        "18,00 $"
    ),
    ProductModel(
        R.drawable.pink_cosmetic_cream,
        "Met Night Cream",
        "80 ml",
        "15,30 $"
    )
)