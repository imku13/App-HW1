package com.imregulkurt.apphw1.ui.personal

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.imregulkurt.apphw1.R
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.FragmentPersonalBinding

class PersonalFragment : Fragment(R.layout.fragment_personal) {

    private val binding by viewBinding(FragmentPersonalBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}