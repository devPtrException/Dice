package com.rough.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
	override fun onCreate(savedInstanceState : Bundle?)
	{
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		Toast.makeText(this, "Click on the roll button to roll Dice.", Toast.LENGTH_LONG).show()
		
		
		
		
		btnRoll.setOnClickListener {
			tvDice.text = (1..7).random().toString()
		}
	}
}
