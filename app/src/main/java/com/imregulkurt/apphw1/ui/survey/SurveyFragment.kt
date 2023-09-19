package com.imregulkurt.apphw1.ui.survey

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.imregulkurt.apphw1.R
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.data.model.ResultInfo
import com.imregulkurt.apphw1.databinding.FragmentSurveyBinding

class SurveyFragment : Fragment(R.layout.fragment_survey) {

    private val binding by viewBinding(FragmentSurveyBinding::bind)
    private val args by navArgs<SurveyFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameText = "Your name: " + args.userInfo.name
        val surnameText = "Your surname: " + args.userInfo.surname
        binding.surveyName.text = nameText
        binding.surveySurname.text = surnameText

        binding.surveyButton.setOnClickListener {
            val question1Text = binding.surveyQ1Input.editText?.text.toString()
            val question2Text = binding.surveyQ2Input.editText?.text.toString()
            val question3Text = binding.surveyQ3Input.editText?.text.toString()
            val question1TextValid: Boolean = question1Text.isNotEmpty()
            val question2TextValid: Boolean = question2Text.isNotEmpty()
            val question3TextValid: Boolean = question3Text.isNotEmpty()
            if (question1TextValid && question2TextValid && question3TextValid) {
                val emailText = args.userInfo.email
                val phoneText = args.userInfo.phone
                val resultInfo = ResultInfo(
                    id = 1,
                    name = args.userInfo.name,
                    surname = args.userInfo.surname,
                    email = emailText,
                    phone = phoneText,
                    question1 = question1Text,
                    question2 = question2Text,
                    question3 = question3Text
                )
                val action = SurveyFragmentDirections.surveyToResult(resultInfo)
                findNavController().navigate(action)
            }
            else {
                Toast.makeText(activity, "Question fields cannot be empty!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}