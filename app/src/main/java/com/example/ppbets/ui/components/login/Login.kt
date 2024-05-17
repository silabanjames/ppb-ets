package com.example.ppbets.ui.components.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ppbets.R

@Composable
fun LoginPage(
    onLoginClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        val (nrp, setNrp) = rememberSaveable {
            mutableStateOf("")
        }
        val (password, setPassword) = rememberSaveable {
            mutableStateOf("")
        }

        Image(
            modifier = Modifier.size(180.dp),
            painter = painterResource(id = R.drawable.logo_its),
            contentDescription = null
        )
        LoginTextField(
            value = nrp,
            onValueChange = setNrp,
            labelText = "NRP",
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(8.dp))
        LoginTextField(
            value = password,
            onValueChange = setPassword,
            labelText = "Password",
            modifier = Modifier.fillMaxWidth()
        )
        Row(
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "Forgot Password?")
            }
        }
        Spacer(modifier = Modifier.size(8.dp))
        Button(
            onClick = onLoginClick,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(text = "Login")
        }

    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun LoginPagePreview() {
    LoginPage({})
}