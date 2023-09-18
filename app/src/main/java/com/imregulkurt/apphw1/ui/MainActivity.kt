package com.imregulkurt.apphw1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
