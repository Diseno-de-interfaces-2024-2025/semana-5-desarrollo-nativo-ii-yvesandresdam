package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme
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
                            }
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
                    //modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(innerPadding)
                            //.width(300.dp),
                       // horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                                //.height(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Historia",
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                //.fillMaxWidth()
                                .background(Color.Cyan)
                                .height(100.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.imagen_clase),
                                contentDescription = "Clase",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            //.height(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Matematicas",
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                //.fillMaxWidth()
                                .background(Color.Cyan)
                                .height(100.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.imagen_patio),
                                contentDescription = "Clase",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            //.height(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Historia",
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                //.fillMaxWidth()
                                .background(Color.Cyan)
                                .height(100.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.imagen_clase),
                                contentDescription = "Clase",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            //.height(20.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Matematicas",
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                //.fillMaxWidth()
                                .background(Color.Cyan)
                                .height(100.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(R.drawable.imagen_patio),
                                contentDescription = "Clase",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                    }


                }
            }
        }
    }
}
