package edu.unicauca.aplimovil.safekids.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import safekids.composeapp.generated.resources.Res
import safekids.composeapp.generated.resources.logo
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.unicauca.aplimovil.safekids.ui.components.BottomNavigationBar

@OptIn(ExperimentalResourceApi::class)
@Composable
fun DocenteScreen(
    onProfileClick: ()->Unit = {},
    onHomeClick: ()->Unit = {},
    onActividadClick: ()->Unit = {}
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE6DDD6)) // fondo beige claro
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            // ENCABEZADO
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .background(Color(0xFF8D8782), shape = RoundedCornerShape(16.dp))
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Docente",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(Res.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(50.dp)
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                // BOTÓN ACTIVIDAD
                Button(
                    onClick = onActividadClick,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(0.dp),
                    elevation = ButtonDefaults.buttonElevation(0.dp),
                    modifier = Modifier.padding(vertical = 8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Box(
                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color(0xFF122379))
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Actividad",
                            color = Color.Red,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }

                // BOTÓN AGENDA
                Button(
                    onClick = { /* Acción para Agenda */ },
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(0.dp),
                    elevation = ButtonDefaults.buttonElevation(0.dp),
                    modifier = Modifier.padding(vertical = 8.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    ) {
                        Box(
                            modifier = Modifier
                                .size(50.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color(0xFF122379))
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Agenda",
                            color = Color.Red,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 16.sp,
                            textDecoration = TextDecoration.Underline
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f)) // Empuja la barra inferior hacia abajo
            BottomNavigationBar(onHomeClick = onHomeClick, onProfileClick = onProfileClick)
        }
    }
}