package com.imregulkurt.apphw1.ui.survey

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.imregulkurt.apphw1.R
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.FragmentSurveyBinding


class SurveyFragment : Fragment(R.layout.fragment_survey) {

    private val binding by viewBinding(FragmentSurveyBinding::bind)
    private val args by navArgs<SurveyFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameText = "Name you entered: " + args.userInfo.name
        val surnameText = "Surname you entered: " + args.userInfo.surname
        binding.surveyName.text = nameText
        binding.surveySurname.text = surnameText
    }
}