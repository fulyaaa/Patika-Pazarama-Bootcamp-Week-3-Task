package com.example.week_3_assignment_fulyaaa.data

import android.media.Image
import android.os.Parcelable
//import com.example.week_3_assignment_fulyaaa.ProductUserModel
import com.example.week_3_assignment_fulyaaa.R
import com.google.gson.Gson
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductModel(
    val image: Int,
    val name:String,
    val quantity: String,
    val price: String,
):Parcelable{
    fun toJson(): String {
        return Gson().toJson(this)
    }
    companion object {
        fun fromJson(jsonValue: String): ProductModel {
            return Gson().fromJson(jsonValue, ProductModel::class.java)
        }
    }
}

val mockProductData = mutableListOf<ProductModel>(
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