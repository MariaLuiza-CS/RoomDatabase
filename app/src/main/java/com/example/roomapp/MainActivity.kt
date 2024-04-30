package com.example.roomapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.roomapp.ui.theme.RoomAppTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var productName by rememberSaveable { mutableStateOf("name") }
                    var price by rememberSaveable { mutableStateOf("name") }

                    Column(
                        modifier =Modifier.fillMaxSize()
                    ) {
                        TextField(
                            value = productName,
                            modifier = Modifier.padding(top = 50.dp),
                            onValueChange = {
                                productName = it
                            },
                            label = { Text("Nome") }
                        )
                    }

                    Column(
                        modifier =Modifier.fillMaxSize()
                    ) {
                        TextField(
                            value = price,
                            modifier = Modifier.padding(top = 50.dp),
                            onValueChange = {
                                price = it
                            },
                            label = { Text("Nome") }
                        )
                    }
                }
            }
        }
    }
}

