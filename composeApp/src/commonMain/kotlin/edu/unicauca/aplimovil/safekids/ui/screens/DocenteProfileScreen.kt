package edu.unicauca.aplimovil.safekids.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import safekids.composeapp.generated.resources.Res
import safekids.composeapp.generated.resources.logo
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.unicauca.aplimovil.safekids.ui.components.BottomNavigationBar

@OptIn(ExperimentalResourceApi::class)
@Composable
fun DocenteProfileScreen(
    onProfileClick: () -> Unit = {},
    onHomeClick: () -> Unit = {}
) {

    val tipoDocente = "Profesor"
    val nombre = "Pepito Alvarez"
    val cedula = "1234"

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE6DDD6))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
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

            Spacer(modifier = Modifier.height(24.dp))

            Column(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Información",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF8D8782)
                )

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFE6DDD6))
                        .padding(16.dp)
                ) {
                    Text(text = "Tipo de docente: $tipoDocente", color = Color.Black, fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFE6DDD6))
                        .padding(16.dp)
                ) {
                    Text(text = "Nombre: $nombre", color = Color.Black, fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color(0xFFE6DDD6))
                        .padding(16.dp)
                ) {
                    Text(text = "Cédula: $cedula", color = Color.Black, fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(24.dp))
            }

            Text(
                text = "Cursos registrados",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF8D8782)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Lista de cursos
            Column {
                val courses = listOf("Algebra", "Biologia", "Etica")
                val studentCount = listOf(4, 9, 11)

                courses.forEachIndexed { index, course ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .background(Color(0xFF8D8782), shape = RoundedCornerShape(8.dp))
                            .padding(12.dp)
                    ) {
                        // Cuadro de color
                        Box(
                            modifier = Modifier
                                .size(60.dp) // Aumentamos el tamaño
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color(0xFF122379)) // azul oscuro
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = course,
                                color = Color.White,
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 18.sp // Aumento el tamaño de la fuente
                            )
                            Text(
                                text = "${studentCount[index]} Estudiantes",
                                color = Color.White,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            BottomNavigationBar(onHomeClick = onHomeClick, onProfileClick = onProfileClick)
        }
    }
}