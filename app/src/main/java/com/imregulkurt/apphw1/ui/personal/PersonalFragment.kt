package com.imregulkurt.apphw1.ui.personal

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.imregulkurt.apphw1.R
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.data.model.UserInfo
import com.imregulkurt.apphw1.databinding.FragmentPersonalBinding

class PersonalFragment : Fragment(R.layout.fragment_personal) {

    private val binding by viewBinding(FragmentPersonalBinding::bind)
    private val args by navArgs<PersonalFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameText = "Name you entered: " + args.name
        val surnameText = "Surname you entered: " + args.surname
        binding.personalName.text = nameText
        binding.personalSurname.text = surnameText

        binding.personalButton.setOnClickListener {
            val emailText = binding.personalEmailInput.text.toString()
            val phoneText = binding.personalPhoneInput.text.toString()
            Toast.makeText(activity, emailText, Toast.LENGTH_SHORT).show()

            // val userInfo = UserInfo(
            //     1,
            //     args.name,
            //     args.surname,
            //     emailText,
            //     phoneText
            // )
            // val action = PersonalFragmentDirections.personalToSurvey(userInfo)
            // findNavController().navigate(action)
        }
    }
}