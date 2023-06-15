package com.littledir.libs.android.compose

import android.view.ViewGroup
import android.webkit.WebView as BaseView
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun WebView(initialUrl: String) {
    AndroidView(
        factory = {
            BaseView(it).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )

                loadUrl(initialUrl)
            }
        }, update = {
            it.loadUrl(initialUrl)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun WebViewPreview() {
    WebView(initialUrl = "https://www.google.com")
}