package com.example.intuitionapp.animal

import com.example.intuitionapp.R

data class Animals(val name: String, val picId: Int)

fun masAnimals(randNum: Int) : Animals{
    var animalList = ArrayList<Animals>()

    animalList.add(Animals("Кошка", R.drawable.cat))
    animalList.add(Animals("Собака", R.drawable.dog))
    animalList.add(Animals("Корова", R.drawable.cow))
    animalList.add(Animals("Лошадь", R.drawable.hourse))
    animalList.add(Animals("Свинья", R.drawable.pig))
    animalList.add(Animals("Кролик", R.drawable.rabbit))

    return animalList.get(randNum)
}