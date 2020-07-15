package com.example.intuitionapp.color

import java.text.FieldPosition

enum class Colors (val position: Int = 0){
    RED(0),
    ORANGE(1),
    YELLOW(2),
    GREEN(3),
    BlUE(4),
    VIOLET(5),
    WHITE(6),
    BLACK(7)

}

data class Color(val mColor: Colors)

fun masColor(randomizerNum: Int) : Color{
    var colorList = ArrayList<Color>()
    colorList.add(Color(Colors.BLACK))
    colorList.add(Color(Colors.WHITE))
    colorList.add(Color(Colors.RED))
    colorList.add(Color(Colors.ORANGE))
    colorList.add(Color(Colors.YELLOW))
    colorList.add(Color(Colors.GREEN))
    colorList.add(Color(Colors.BlUE))
    colorList.add(Color(Colors.VIOLET))

    return colorList.get(randomizerNum)
}