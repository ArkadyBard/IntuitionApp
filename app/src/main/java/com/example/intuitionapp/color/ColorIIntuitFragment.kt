package com.example.intuitionapp.color

import android.annotation.SuppressLint
import android.app.Activity
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.intuitionapp.R
import com.example.intuitionapp.color.Colors
import kotlinx.android.synthetic.main.intuit_color_fragment.*

/*
* Фрагмент первой интуиции
* Нужно угадать цвет
*
* При помощи кнопки слушателя
* реализована случайная цвеьлвая
* отрисовка, которая угадывается
* пользователем
* при помщи конструкции when
* реализована измнения цвета
*
* в файле colors.kt
* прописаны enum последовательности
* и функция, которая хранит массив
* цветов и возвращает цвет
* по определенному номеру
*
*
* */

class ColorIIntuitFragment : Fragment() {

    companion object {
        fun newInstance() = ColorIIntuitFragment()
    }

    private lateinit var viewModel: ColorIIntuitViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.intuit_color_fragment, container, false)
    }

    @SuppressLint("ResourceAsColor")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ColorIIntuitViewModel::class.java)
        // TODO: Use the ViewModel

        btnPress.setOnClickListener {

            when(masColor((0..7).random())){

                 Color(Colors.RED) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorRed))
                 Color(Colors.ORANGE) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorOrange))
                 Color(Colors.YELLOW) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorYellow))
                 Color(Colors.GREEN) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorGreen))
                 Color(Colors.BlUE) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorBlue))
                 Color(Colors.VIOLET) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorViolet))
                 Color(Colors.WHITE) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorWhite))
                 Color(Colors.BLACK) -> viewColor.setBackgroundColor(resources.getColor
                     (R.color.colorBlack))

            }
        }



    }

}