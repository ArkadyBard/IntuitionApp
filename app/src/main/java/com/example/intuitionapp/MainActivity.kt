package com.example.intuitionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

/*
* Приложение Интуиция
* На главном экране 4
* выбора цвет/число
* животное/геометрическая фигура
*
* Данное приложение реализованно
* при помощи фрагментов
* на языке Котлин
* Первая версия 01.07.2029
* Разработчик: Бардамов А.В.
*
* */

class MainActivity : AppCompatActivity() {

    private val manager = supportFragmentManager
    private lateinit var transaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        transaction = manager.beginTransaction()
        transaction.replace(R.id.mainContainer, MainFragment())
        transaction.commit()
    }

    override fun onBackPressed() {
        transaction = manager.beginTransaction()
        transaction.replace(R.id.mainContainer, MainFragment())
        transaction.commit()

    }


}