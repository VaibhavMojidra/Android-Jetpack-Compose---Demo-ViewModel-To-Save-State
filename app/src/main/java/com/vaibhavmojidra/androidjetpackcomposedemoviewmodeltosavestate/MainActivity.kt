package com.vaibhavmojidra.androidjetpackcomposedemoviewmodeltosavestate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.vaibhavmojidra.androidjetpackcomposedemoviewmodeltosavestate.ui.theme.AndroidJetpackComposeDemoViewModelToSaveStateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val myViewModel= viewModel<MyViewModel>()
            AndroidJetpackComposeDemoViewModelToSaveStateTheme {
                val count=myViewModel.count
                MainScreenComposable(count.value){
                    myViewModel.increaseCount()
                }
            }
        }
    }
}


@Composable
fun MainScreenComposable(currentCount:Int,updateCount:()->Unit){
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            updateCount()
        }) {
            Text(text = "Count is $currentCount")
        }
    }
}
