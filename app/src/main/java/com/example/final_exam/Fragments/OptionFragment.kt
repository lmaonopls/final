package com.example.final_exam.Fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.final_exam.R

class OptionFragment : Fragment(R.layout.fragment_option) {

    private lateinit var exitButton : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        exitButton = view.findViewById(R.id.exitButton)

        exitButton.setOnClickListener() {

            findNavController().navigate(R.id.action_OptionFragment_to_mainActivity)

        }

    }

}