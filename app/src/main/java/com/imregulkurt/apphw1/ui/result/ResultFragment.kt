package com.imregulkurt.apphw1.ui.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs
import com.imregulkurt.apphw1.R
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args by navArgs<ResultFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}