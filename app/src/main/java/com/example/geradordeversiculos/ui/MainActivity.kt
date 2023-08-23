package com.example.geradordeversiculos.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.geradordeversiculos.infra.VerseConstants
import com.example.geradordeversiculos.R
import com.example.geradordeversiculos.data.Mock
import com.example.geradordeversiculos.infra.SecurityPreferences
import com.example.geradordeversiculos.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var categoryID = VerseConstants.FILTER.FORTIFICATION

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNewPhrase.setOnClickListener(this)
        binding.imageFortification.setOnClickListener(this)
        binding.imageGratitude.setOnClickListener(this)
        binding.imageWisdom.setOnClickListener(this)
        binding.imageHope.setOnClickListener(this)
        binding.imageCourage.setOnClickListener(this)
        binding.imageHumility.setOnClickListener(this)


        handdleUserName()
        handleFilter(R.id.image_fortification)
        handleNextPhrase()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_new_phrase) {
            handleNextPhrase()
        } else if (view.id in listOf( R.id.image_fortification, R.id.image_gratitude, R.id.image_wisdom, R.id.image_hope
        , R.id.image_courage, R.id.image_humility)){
            handleFilter(view.id)
        }
        if(view.id == R.id.image_fortification){
            binding.textChoosetype.text = getString(R.string.VerseTypeFortification)
            handleNextPhrase()
        }
        if(view.id == R.id.image_gratitude){
            binding.textChoosetype.text = getString(R.string.VerseTypeGratitute)
            handleNextPhrase()
        }
        if(view.id == R.id.image_wisdom){
            binding.textChoosetype.text = getString(R.string.VerseTypeWisdom)
            handleNextPhrase()
        }
        if(view.id == R.id.image_hope){
            binding.textChoosetype.text = getString(R.string.VerseTypeHope)
            handleNextPhrase()
        }
        if(view.id == R.id.image_courage){
            binding.textChoosetype.text = getString(R.string.VerseTypeCourage)
            handleNextPhrase()
        }
        if (view.id == R.id.image_humility){
            binding.textChoosetype.text = getString(R.string.VerseTypeHumility)
            handleNextPhrase()
        }

    }

    private fun handleNextPhrase(){
        binding.textPhrase.text = Mock().getPhrase(categoryID, Locale.getDefault().language)
    }

    private fun handleFilter(id: Int){

        binding.imageFortification.setColorFilter(ContextCompat.getColor(this, R.color.black)) // 1
        binding.imageWisdom.setColorFilter(ContextCompat.getColor(this, R.color.black)) // 2
        binding.imageHope.setColorFilter(ContextCompat.getColor(this, R.color.black)) // 3
        binding.imageGratitude.setColorFilter(ContextCompat.getColor(this, R.color.black)) // 4
        binding.imageCourage.setColorFilter(ContextCompat.getColor(this, R.color.black)) // 5
        binding.imageHumility.setColorFilter(ContextCompat.getColor(this, R.color.black)) // 6


        when (id) {
            R.id.image_fortification -> {
                binding.imageFortification.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = VerseConstants.FILTER.FORTIFICATION
            }
            R.id.image_gratitude -> {
                binding.imageGratitude.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = VerseConstants.FILTER.GRATITUDE
            }
            R.id.image_wisdom -> {
                binding.imageWisdom.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = VerseConstants.FILTER.WISDOM
            }
            R.id.image_hope -> {
                binding.imageHope.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = VerseConstants.FILTER.HOPE
            }
            R.id.image_courage -> {
                binding.imageCourage.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = VerseConstants.FILTER.COURAGE
            }
            R.id.image_humility -> {
                binding.imageHumility.setColorFilter(ContextCompat.getColor(this, R.color.white))
                categoryID = VerseConstants.FILTER.HUMILITY
            }
        }
    }

    private fun handdleUserName() {

        val name = SecurityPreferences(this).getString(VerseConstants.KEY.USER_NAME)
        binding.textUserName.text = "Olá, $name!"
    }
}