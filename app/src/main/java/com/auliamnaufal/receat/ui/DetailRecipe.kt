package com.auliamnaufal.receat.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.auliamnaufal.receat.R
import com.auliamnaufal.receat.databinding.ActivityDetailRecipeBinding

class DetailRecipe : AppCompatActivity() {

    private lateinit var binding: ActivityDetailRecipeBinding

    companion object {
        const val TITLE_RECIPE_DETAIL = "title"
        const val PHOTO_RECIPE_DETAIL = "photo"
        const val TIME_COOKING_DETAIL = "time"
        const val RATING_RECIPE_DETAIL = "rate"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_recipe)
    }
}