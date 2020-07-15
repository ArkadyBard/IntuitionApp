package com.example.intuitionapp.animal

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.intuitionapp.R
import kotlinx.android.synthetic.main.animal_fragment.*

class AnimalFragment : Fragment() {

    companion object {
        fun newInstance() = AnimalFragment()
    }

    private lateinit var viewModel: AnimalViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.animal_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AnimalViewModel::class.java)


        btnAnimalShow.setOnClickListener {

            val animal = masAnimals((0..5).random())
            tvAnswerAnimal.text = animal.name
            imAnimal.setImageResource(animal.picId)
        }

    }

}