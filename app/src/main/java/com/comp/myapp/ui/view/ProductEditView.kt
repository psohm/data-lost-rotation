//package com.comp.myapp.ui.view
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.widthIn
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.Divider
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.comp.myapp.businesslogic.Preferences
//import com.comp.myapp.businesslogic.Tools
//import com.comp.myapp.businesslogic.helper.AppDatabase
//import com.comp.myapp.businessobjects.invoice.myapp
//import com.comp.myapp.businessobjects.invoice.Product
//import java.text.DateFormat
//import java.util.Date
//
//
//class ProductEditView : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            val myappDb = AppDatabase.getAppDatabase(application)
//            val productDao = myappDb.productDao()
//
//            val allProducts = productDao.getNonDeleted()
//
//            ProductEdit(allProducts)
//        }
//    }
//}
//
//
//@Composable
//fun ProductEdit(products: List<Product>) {
//    LazyColumn(
//        verticalArrangement = Arrangement.spacedBy(12.dp)
//    ) {
//        items(products) { product ->
//            ProductCard(product)
//            Divider(color = Color.Gray, thickness = 1.dp)
//        }
//    }
//}
//
//
//@Composable
//fun ProductEditCard(product: Product) {
//
//    Column(modifier = Modifier.padding(4.dp)
//        .fillMaxWidth()
//    ) {
//
//        var name by remember { mutableStateOf("") }
//        var nameHasError by remember { mutableStateOf(false) }
//        var nameLabel by remember { mutableStateOf("Enter your name") }
//
//        var email by remember { mutableStateOf("") }
//        var emailHasError by remember { mutableStateOf(false) }
//        var emailLabel by remember { mutableStateOf("Enter your email address") }
//
//        Column {
//            TextField(
//                value = name,
//                isError = nameHasError,
//                label = { Text(text = nameLabel) },
//                modifier = Modifier.padding(10.dp),
//                onValueChange = { value -> name = value }
//            )
//            TextField(
//                value = email,
//                isError = emailHasError,
//                label = { Text(text = emailLabel) },
//                modifier = Modifier.padding(10.dp),
//                onValueChange = { value -> email = value },
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
//            )
//            Button(onClick = {}) {
//                Text("Submit")
//            }
//        }
//    }
//
//}
//
//
//object ProductDataSample {
//    val productSample = listOf(
//        Product("article 1", 10.5, null, 20.0, null),
//        Product("article 2", 22.5, null, 12.2, null),
//    )
//}
//
//@Preview(showSystemUi = true)
//@Composable
//fun PreviewProductEdit() {
//    ProductEdit(ProductDataSample.productSample)
//}