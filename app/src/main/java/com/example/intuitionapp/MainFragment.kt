package com.example.intuitionapp

import android.app.Activity
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.intuitionapp.animal.AnimalFragment
import com.example.intuitionapp.color.ColorIIntuitFragment
import com.example.intuitionapp.geametry.GeometryFragment
import com.example.intuitionapp.number.NumberFragment
import kotlinx.android.synthetic.main.main_fragment.*


/*
* Основной фрагмент
* фрагмент управления
* в нем реализованны
* слушатели кнопок
* выбора интуиций
*
*
* */

class MainFragment : Fragment() {






    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        btnColor.setOnClickListener {
            var transaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainContainer, ColorIIntuitFragment())
            transaction.commit()
        }

        btnNumber.setOnClickListener {
            var transaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainContainer, NumberFragment())
            transaction.commit()
        }

        btnAnimal.setOnClickListener {
            var transaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainContainer, AnimalFragment())
            transaction.commit()
        }

        btnGeometry.setOnClickListener {
            var transaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.mainContainer, GeometryFragment())
            transaction.commit()
        }
    }

}