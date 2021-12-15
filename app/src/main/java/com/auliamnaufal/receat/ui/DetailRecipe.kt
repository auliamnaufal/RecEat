package com.auliamnaufal.receat.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.auliamnaufal.receat.R
import com.auliamnaufal.receat.databinding.ActivityDetailRecipeBinding

class DetailRecipe : AppCompatActivity() {

    private lateinit var binding: ActivityDetailRecipeBinding

    companion object {
        const val DATA_RECIPE_DETAIL = ""
        
        const val TITLE_RECIPE_DETAIL = ""
        const val PHOTO_RECIPE_DETAIL = ""
        const val TIME_COOKING_DETAIL = ""
        const val RATING_RECIPE_DETAIL = ""
        const val LEVEL_RECIPE_DETAIL = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        val dataDetailRecipe = intent.getParcelableExtra<>()
    }
    // TODO: 15/12/21 (Menunggu File Object dan File Data untuk bisa diisi...) 
}