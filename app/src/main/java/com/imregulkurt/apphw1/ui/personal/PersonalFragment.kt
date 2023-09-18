package com.imregulkurt.apphw1.ui.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.FragmentPersonalBinding

class PersonalFragment : Fragment() {

    private val binding by viewBinding(FragmentPersonalBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}