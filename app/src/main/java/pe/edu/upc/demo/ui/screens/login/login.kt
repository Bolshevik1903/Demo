package pe.edu.upc.demo.ui.screens.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pe.edu.upc.demo.ui.theme.DemoTheme

@Composable
fun Login() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var username = remember { mutableStateOf(TextFieldValue()) }
        var password = remember { mutableStateOf(TextFieldValue()) }

        Text(text = "Login", color = Color.Blue, fontSize = 36.sp)
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = username.value, onValueChange = { username.value = it }, placeholder = { Text(text = "Username") })
        Spacer(modifier = Modifier.height(20.dp))

        TextField(value = password.value, onValueChange = { password.value = it }, placeholder = { Text(text = "Password") }, visualTransformation = PasswordVisualTransformation())

        Box(modifier = Modifier.padding(40.dp,0.dp,40.dp,0.dp)) {
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(50.dp)) {
                Text(text = "Sign in")
            }
        }

        Box(modifier = Modifier.padding(40.dp,0.dp,40.dp,0.dp)) {
            Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(50.dp)) {
                Text(text = "Sign up")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoTheme {
        Login()
    }
}