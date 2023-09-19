package com.imregulkurt.apphw1.ui.home

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.imregulkurt.apphw1.R
import com.imregulkurt.apphw1.common.viewBinding
import com.imregulkurt.apphw1.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.homeButton.setOnClickListener {
            if (binding.homeNameInput.editText?.text?.isEmpty() == true ||
                    binding.homeSurnameInput.editText?.text?.isEmpty() == true) {
                Toast.makeText(activity, "Input fields cannot be empty!", Toast.LENGTH_SHORT).show()
            }
            else {
                val name = binding.homeNameInput.editText?.text.toString()
                val surname = binding.homeSurnameInput.editText?.text.toString()
                val action = HomeFragmentDirections.homeToPersonal(name, surname)
                findNavController().navigate(action)
            }
        }
    }
}