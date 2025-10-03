package com.example.sdc_si_kotlin2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val loginBtn: MaterialButton = view.findViewById(R.id.btn_bottom_login)
        val registerLink: TextView = view.findViewById(R.id.tv_bottom_register)

        loginBtn.setOnClickListener {
            findNavController().navigate(R.id.action_welcome_to_login)
        }

        registerLink.setOnClickListener {
            findNavController().navigate(R.id.action_welcome_to_register)
        }
    }
}
