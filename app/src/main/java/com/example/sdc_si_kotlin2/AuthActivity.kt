package com.example.sdc_si_kotlin2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.sdc_si_kotlin2.ui.login.LoginFragment

class AuthActivity : AppCompatActivity(R.layout.activity_auth) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        if (savedInstanceState == null) {
            // Use the recommended KTX extension for fragment transactions.
            // It's cleaner and less error-prone.
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                // Use add<> for the first fragment; 'replace' is for swapping fragments.
                add<LoginFragment>(R.id.fragment_container)
            }
        }
    }
}


