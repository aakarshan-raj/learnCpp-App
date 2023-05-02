package com.example.learncpp_app

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class ControlStructure : Fragment() {

    lateinit var btn1: ImageButton
    lateinit var btn2: ImageButton
    lateinit var vieww:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vieww = inflater.inflate(R.layout.fragment_control_structure, container, false)
        btn1 = vieww.findViewById(R.id.btn1)
        btn2 = vieww.findViewById(R.id.btn2)
        btn1.setOnClickListener {

            val sharedPreferences =   activity?.getSharedPreferences("data_in_here", AppCompatActivity.MODE_PRIVATE)
            val myEdit = sharedPreferences?.edit()
            myEdit?.putBoolean("four", true)
            myEdit?.apply()
            Toast.makeText(activity,"Book Marked", Toast.LENGTH_LONG).show()

        }
        btn2?.setOnClickListener {
            val nextFragment = Functions()
            val trans: FragmentTransaction = requireFragmentManager().beginTransaction()
            trans.replace(R.id.frame,nextFragment)
            (activity as? AppCompatActivity)?.supportActionBar?.title = getString(R.string.five)
            trans.commit()
        }
        return vieww
    }

}