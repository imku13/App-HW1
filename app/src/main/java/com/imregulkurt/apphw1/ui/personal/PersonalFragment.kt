package com.imregulkurt.apphw1.ui.personal

import android.os.Bundle
import android.util.Patterns
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
        val nameText = "Your name: " + args.name
        val surnameText = "Your surname: " + args.surname
        binding.personalName.text = nameText
        binding.personalSurname.text = surnameText

        binding.personalButton.setOnClickListener {
            val emailText = binding.personalEmailInput.text.toString()
            val phoneText = binding.personalPhoneInput.text.toString()
            val isEmailValid: Boolean = emailText.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(emailText).matches()
            val isPhoneValid: Boolean = phoneText.isNotEmpty() && Patterns.PHONE.matcher(phoneText).matches()
            if (isEmailValid && isPhoneValid) {
                val userInfo = UserInfo(
                    id = 1,
                    name = args.name,
                    surname = args.surname,
                    email = emailText,
                    phone = phoneText
                )
                val action = PersonalFragmentDirections.personalToSurvey(userInfo)
                findNavController().navigate(action)
            }
            else {
                Toast.makeText(activity, "Email or phone input is invalid.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}