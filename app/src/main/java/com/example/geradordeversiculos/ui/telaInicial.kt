package com.example.geradordeversiculos.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.geradordeversiculos.infra.MotivationConstants
import com.example.geradordeversiculos.R
import com.example.geradordeversiculos.infra.SecurityPreferences
import com.example.geradordeversiculos.databinding.ActivityTelaInicialBinding

class telaInicial : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityTelaInicialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener(this)

        supportActionBar?.hide()

        verifyUserName()
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save) {
            handleSave()
        }
    }

    private fun verifyUserName(){
        val name = SecurityPreferences(this).getString(MotivationConstants.KEY.USER_NAME)
        if(name != ""){
            startActivity(Intent(this, MainActivity:: class.java))
            finish()
        }
    }

    private fun handleSave() {



        val name = binding.editName.text.toString()
        if (name != "") {

            SecurityPreferences(this).storesTRING(MotivationConstants.KEY.USER_NAME,name)

            startActivity(Intent(this, MainActivity:: class.java))
            finish()
        } else {
            Toast.makeText(this, R.string.validation_mandatory_name, Toast.LENGTH_SHORT).show()
        }
    }
}