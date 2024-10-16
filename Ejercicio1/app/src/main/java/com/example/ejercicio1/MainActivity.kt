package com.example.ejercicio1

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color


@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = Color(0xFFCDE7B0)
                            ),
                            title = {

                                Row(
                                    Modifier.fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceAround
                                ) {
                                    Icon(
                                        imageVector = Icons.Outlined.ArrowBack,
                                        contentDescription = "back",
                                        tint = Color.Black,
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                    Text(text = "Asignaturas")
                                    Icon(
                                        imageVector = Icons.Outlined.AccountCircle,
                                        contentDescription = "user",
                                        tint = Color.Black,
                                        modifier = Modifier
                                            .size(30.dp)
                                    )
                                }
                            },
                        )
                    },
                    bottomBar = {
                        BottomAppBar(
                            containerColor = Color(0xFFCDE7B0)
                        )
                        {
                            Row(
                                Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            )
                            {
                                Text(
                                    text = "footer"
                                )
                            }
                        }
                    },
                ) { innerPadding ->
                    Column(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(innerPadding)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "image 1")
                        }

                        Box(
                            modifier = Modifier
                                .padding(innerPadding)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "image 2")
                        }

                        Box(
                            modifier = Modifier
                                .padding(innerPadding)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(text = "image 3")
                        }
                    }
                }
            }
        }
    }
}
