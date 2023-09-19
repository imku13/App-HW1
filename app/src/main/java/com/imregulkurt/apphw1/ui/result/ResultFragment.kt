package com.imregulkurt.apphw1.ui.result

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.imregulkurt.apphw1.R
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {

    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args by navArgs<ResultFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameText = args.resultInfo.name
        val surnameText = args.resultInfo.surname
        val emailText = args.resultInfo.email
        val phoneText = args.resultInfo.phone
        val question1Text = args.resultInfo.question1
        val question2Text = args.resultInfo.question2
        val question3Text = args.resultInfo.question3

        binding.resultDataName.text = nameText
        binding.resultDataSurname.text = surnameText
        binding.resultDataEmail.text = emailText
        binding.resultDataPhone.text = phoneText
        binding.resultDataQ1.text = question1Text
        binding.resultDataQ2.text = question2Text
        binding.resultDataQ3.text = question3Text

        binding.resultButton.setOnClickListener {
            val action = ResultFragmentDirections.resultToHome()
            findNavController().navigate(action)
        }
    }
}