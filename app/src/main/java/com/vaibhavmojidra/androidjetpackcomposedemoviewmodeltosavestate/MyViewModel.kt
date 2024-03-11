package com.vaibhavmojidra.androidjetpackcomposedemoviewmodeltosavestate

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    val count= mutableStateOf(0)

    fun increaseCount(){
        count.value+=1
    }
}