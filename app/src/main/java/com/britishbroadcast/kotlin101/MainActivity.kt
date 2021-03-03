package com.britishbroadcast.kotlin101

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*

//class MainActivity extends AppCompatActivity{ <- Java
class MainActivity : AppCompatActivity() {

    //val -> immutable -> not changeable -> runtime immutability
    //var -> mutable -> changeable
    //lateinit -> letting the compiler know that this variable will be init
    //- ialized before use. If I fail to initialize it before first use,
    // it will cause a runtime exception 'lateinit var not initialized'.
    //lateinit cannot be a val.

    //private lateinit var num: Int = 0
    private lateinit var spanish: WineK

    private var name: String = ""
    private var age: Int = 0
    private var time: Date = Date()
    private var networth: Double = 0.0
    private var height: Float = 0f

    private var list: List<Int> = mutableListOf()
    private var list2 = mutableListOf<Int>()

    private var map: MutableMap<Int, List<Int>> = mutableMapOf()
    private var map2 = mutableMapOf<Int, Int>()

    private var set: MutableSet<Float> = mutableSetOf()
    private var set2 = setOf<Float>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val wineK = WineK(2000, "Rum", "Italy", "Red")

        wineK.apply {
            //String interpolation
            Log.d("TAG_X", "This wine was made in the year $year and was named $name produced in $location and the type is $type")
        }

        val wineSet: MutableSet<WineK> = mutableSetOf()
        wineSet.add(WineK(2000, "Rum", "Italy", "Red"))
        wineSet.add(WineK(2000, "Rum", "Italy", "Red"))

        if (this::spanish.isInitialized)//'this' being the current class
            wineSet.add(spanish)
        else
            Log.d("TAG_X", "Not initialized :-(")

        Log.d("TAG_X", "Set Size: ${wineSet.size}  ${sum(3, 5)}")//String interpolation


    }

    //    fun sum(a: Int, b:Int): Int{
//        return a+b
//    }


    fun sum(a: Int, b: Int): Int = a + b

}
/*
* class MainActivity extends AppCompatActivity {
*
*       private int number;
*
*       @Override
*       public void onCreate(Bundle savedInstance){
*           super.onCreate(savedInstance);
*           setContentView(R.layout.activity_man);
*       }
* }
* */