package com.example.intuitionapp.geametry

import com.example.intuitionapp.R

data class Figure(val name:String, val picGeomId:Int)


fun masOfFigure(randomNum: Int) : Figure{
    var mas = ArrayList<Figure>()
    mas.add(Figure("Треугольник", R.drawable.triangle))
    mas.add(Figure("Прямоугольник", R.drawable.primeangle))
    mas.add(Figure("Квадрат", R.drawable.square))
    mas.add(Figure("Трапеция", R.drawable.trapeciod))
    mas.add(Figure("Параллелограм", R.drawable.paralellogram))

    return mas[randomNum]
}