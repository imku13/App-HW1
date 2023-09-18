package com.imregulkurt.apphw1.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}