package com.example.codelab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codelab2.ui.theme.Codelab2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Optional: Enables edge-to-edge experience
        setContent {
            Codelab2Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = { BottomNavigation() }
                ) { innerPadding ->
                    MainScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// Main screen content
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Greeting(name = "Android")
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar()
        Spacer(modifier = Modifier.height(16.dp))
        AlignYourBodyElement()
        Spacer(modifier = Modifier.height(16.dp))
        FavoriteCollectionCard()
        Spacer(modifier = Modifier.height(16.dp))
        AlignYourBodyRow()
        Spacer(modifier = Modifier.height(16.dp))
        FavoriteCollectionsGrid()
    }
}

// Greeting Composable
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        style = MaterialTheme.typography.headlineMedium,
        modifier = modifier
    )
}

// Search Bar - Modifiers
@Composable
fun SearchBar(modifier: Modifier = Modifier) {
    // Placeholder for SearchBar implementation
    Text("Search Bar", modifier = modifier)
}

// Align Your Body Element - Alignment
@Composable
fun AlignYourBodyElement(modifier: Modifier = Modifier) {
    // Placeholder for AlignYourBodyElement implementation
    Text("Align Your Body", modifier = modifier)
}

// Favorite Collection Card - Material Surface
@Composable
fun FavoriteCollectionCard(modifier: Modifier = Modifier) {
    // Placeholder for FavoriteCollectionCard implementation
    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Text("Favorite Collection Card", modifier = Modifier.padding(16.dp))
    }
}

// Align Your Body Row - Arrangements
@Composable
fun AlignYourBodyRow(modifier: Modifier = Modifier) {
    // Placeholder for AlignYourBodyRow implementation
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Row Item 1")
        Text("Row Item 2")
        Text("Row Item 3")
    }
}

// Favorite Collections Grid - LazyColumn
@Composable
fun FavoriteCollectionsGrid(modifier: Modifier = Modifier) {
    // Example data
    val itemsList = List(6) { index -> "Grid Item $index" }

    LazyColumn(modifier = modifier) {
        items(itemsList) { item ->
            Text(item, modifier = Modifier.padding(8.dp))
        }
    }
}

// Bottom Navigation - Material
@Composable
private fun BottomNavigation(modifier: Modifier = Modifier) {
    // Placeholder for BottomNavigation implementation
    BottomAppBar(
        modifier = modifier
    ) {
        Text("Bottom Navigation")
    }
}

// Preview Composables
@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun GreetingPreview() {
    Codelab2Theme {
        Greeting("Android")
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun SearchBarPreview() {
    Codelab2Theme {
        SearchBar(modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun AlignYourBodyElementPreview() {
    Codelab2Theme {
        AlignYourBodyElement(modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionCardPreview() {
    Codelab2Theme {
        FavoriteCollectionCard(modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun AlignYourBodyRowPreview() {
    Codelab2Theme {
        AlignYourBodyRow(modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun FavoriteCollectionsGridPreview() {
    Codelab2Theme {
        FavoriteCollectionsGrid(modifier = Modifier.padding(8.dp))
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF5F0EE)
@Composable
fun BottomNavigationPreview() {
    Codelab2Theme {
        BottomNavigation(modifier = Modifier.padding(top = 24.dp))
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun MainScreenPortraitPreview() {
    Codelab2Theme {
        MainScreen(modifier = Modifier.fillMaxSize())
    }
}

@Preview(widthDp = 640, heightDp = 360)
@Composable
fun MainScreenLandscapePreview() {
    Codelab2Theme {
        MainScreen(modifier = Modifier.fillMaxSize())
    }
}
