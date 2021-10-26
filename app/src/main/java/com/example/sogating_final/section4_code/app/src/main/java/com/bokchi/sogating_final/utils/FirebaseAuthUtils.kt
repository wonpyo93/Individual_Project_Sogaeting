package com.bokchi.sogating_final.utils

import com.google.firebase.auth.FirebaseAuth

class FirebaseAuthUtils {

    companion object {

        private lateinit var auth : FirebaseAuth

        fun getUid() : String {

            auth = FirebaseAuth.getInstance()

            return auth.currentUser?.uid.toString()

        }

    }

}