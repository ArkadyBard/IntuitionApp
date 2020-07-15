package com.example.intuitionapp.number

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.intuitionapp.R
import kotlinx.android.synthetic.main.number_fragment.*
import java.lang.Exception
import java.lang.NullPointerException

/*
* Интуиция угадай номер
* Пользователь вводит диапазон
* После по нажатию кнопки
* создается случайное число,
* которое необходимо угадать
* игроку. В случае некорректного
* ввода исх. диапазон 0..10
* 
*
* */

class NumberFragment : Fragment() {

    var num = 0
    var randNum = 0

    companion object {
        fun newInstance() = NumberFragment()
    }

    private lateinit var viewModel: NumberViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.number_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NumberViewModel::class.java)


        btnEnterNum.setOnClickListener {
            val str = edtRangeNum.text.toString()


            try {
                num = str.toInt()
            }catch (e:Exception){

                num = 10
                Toast.makeText(context!!.applicationContext,
                "Диапазон не задан, или задан не верно, " +
                        "Исх диапазон 10", Toast.LENGTH_LONG
                ).show()
            }




            randNum = if (num < 0 || num == 0){
                kotlin.random.Random.nextInt(0, 10)
            } else{
                kotlin.random.Random.nextInt(0, num)
            }

            tvRandNum.text = randNum.toString()
        }
    }

}