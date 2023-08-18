package com.example.geradordeversiculos.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.geradordeversiculos.infra.MotivationConstants
import com.example.geradordeversiculos.R
import com.example.geradordeversiculos.data.Mock
import com.example.geradordeversiculos.infra.SecurityPreferences
import com.example.geradordeversiculos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var categoryID = MotivationConstants.FILTER.ALL

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageAll.setOnClickListener(this)
        binding.imageHappy.setOnClickListener(this)
        binding.imageSunny.setOnClickListener(this)


        handdleUserName()
        handleFilter(R.id.image_all)
        handleNextPhrase()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            var s = ""
            handleNextPhrase()
        } else if (view.id in listOf( R.id.image_all, R.id.image_happy, R.id.image_sunny)){
            handleFilter(view.id)
        }
    }

    private fun handleNextPhrase(){
        binding.textPhrase.text = Mock().getPhrase(categoryID)
    }

    private fun handleFilter(id: Int){

        binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple)) // 1
        binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple)) // 2
        binding.imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.dark_purple)) // 3

        when (id) {
            R.id.image_all -> {
                binding.imageAll.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = MotivationConstants.FILTER.ALL
            }
            R.id.image_happy -> {
                binding.imageHappy.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = MotivationConstants.FILTER.HAPPY
            }
            R.id.image_sunny -> {
                binding.imageSunny.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = MotivationConstants.FILTER.SUNNY
            }
        }
    }

    private fun handdleUserName() {

        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        binding.textUserName.text = "Olá, $name!"
    }
}