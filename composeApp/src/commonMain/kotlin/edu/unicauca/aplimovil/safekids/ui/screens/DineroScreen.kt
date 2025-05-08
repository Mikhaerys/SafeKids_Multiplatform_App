package edu.unicauca.aplimovil.safekids.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AttachMoney
import androidx.compose.material.icons.filled.Block
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
import safekids.composeapp.generated.resources.logo_pse
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.unicauca.aplimovil.safekids.ui.components.BottomNavigationBar

@OptIn(ExperimentalResourceApi::class)
@Composable
fun DineroScreen(
    onProfileClick: () -> Unit = {},
    onHomeClick: () -> Unit = {}
) {

    var showDialog by remember { mutableStateOf(false) }
    var showBlockDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(top = 50.dp)
            .padding(12.dp)
    ) {
        // Encabezado
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFF6C6C6C), RoundedCornerShape(12.dp))
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Acudiente",
                    color = Color.White,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(Res.drawable.logo),
                    contentDescription = "Logo",
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Sección DINERO
        Text(
            text = "DINERO",
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF202B7F), RoundedCornerShape(12.dp))
                .padding(vertical = 8.dp),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(12.dp))

        // Botones
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = { showDialog = true },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFDFF6DD))
            ) {
                Icon(Icons.Default.AttachMoney, contentDescription = "Recargar", tint = Color(0xFF28A745))
                Spacer(Modifier.width(4.dp))
                Text("Recargar", color = Color(0xFF28A745))
            }

            Button(
                onClick = { showBlockDialog = true},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFE0E0))
            ) {
                Icon(Icons.Default.Block, contentDescription = "Bloquear", tint = Color(0xFFDC3545))
                Spacer(Modifier.width(4.dp))
                Text("Bloquear", color = Color(0xFFDC3545))
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Gastos
        Text(
            text = "Gastos",
            color = Color(0xFF202B7F),
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFEEEEEE), RoundedCornerShape(20.dp))
                .padding(vertical = 6.dp),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Lista de gastos
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .background(Color(0xFFE0DCDC), RoundedCornerShape(12.dp))
                .padding(8.dp)
        ) {
            items(6) { index ->
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(vertical = 4.dp)
                        .background(Color(0xFFB8B0AB), RoundedCornerShape(12.dp)),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "Gasto ${index + 1}",
                        modifier = Modifier.padding(start = 16.dp),
                        color = Color.White
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        BottomNavigationBar(onHomeClick = onHomeClick, onProfileClick = onProfileClick)
    }

    // 🟢 Diálogo para recargar con método PSE
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            confirmButton = {},
            dismissButton = {},
            title = {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.logo_pse),
                        contentDescription = "PSE Logo",
                        modifier = Modifier.size(80.dp),
                        tint = Color.Unspecified
                    )
                }
            },
            text = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Por favor, seleccione el método de pago",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF202B7F)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Serás redirigido a la plataforma de pagos PSE para completar la transacción.",
                        textAlign = TextAlign.Center,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.height(24.dp))

                    Image(
                        painter = painterResource(Res.drawable.logo_pse),
                        contentDescription = "PSE Logo",
                        modifier = Modifier.size(100.dp)
                    )
                }
            },
            containerColor = Color(0xFFFDF4EF),
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
        )
    }

    if (showBlockDialog) {
        AlertDialog(
            onDismissRequest = { showBlockDialog = false },
            confirmButton = {
                TextButton(
                    onClick = {
                        // Acción de confirmación de bloqueo
                        showBlockDialog = false
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                ) {
                    Text("Estoy seguro", color = Color.Black)
                }
            },
            dismissButton = {},
            title = {
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(Res.drawable.logo_pse),
                        contentDescription = "Block Logo",
                        modifier = Modifier.size(80.dp),
                        tint = Color(0xFFDC3545)
                    )
                }
            },
            text = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "¿Estás seguro de bloquear la tarjeta?",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF202B7F),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(
                        text = "Esta acción impedirá que se realicen compras con la tarjeta hasta que la desbloquees.",
                        textAlign = TextAlign.Center,
                        color = Color.Gray
                    )
                }
            },
            containerColor = Color(0xFFFDF4EF),
            modifier = Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(16.dp))
        )
    }

}