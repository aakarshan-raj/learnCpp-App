package com.example.learncpp_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

class VariablesData : Fragment() {

    lateinit var vieww: View
    lateinit var btn1: Button
    lateinit var btn2: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vieww =  inflater.inflate(R.layout.fragment_variables_data, container, false)


        btn1 = vieww.findViewById(R.id.btn1)
        btn2 = vieww.findViewById(R.id.btn2)
        btn1.setOnClickListener {
            Toast.makeText(activity, "Completed", Toast.LENGTH_LONG).show()
        }
        btn2?.setOnClickListener {
            val nextFragment = OperatorsExpression()
            val trans: FragmentTransaction = requireFragmentManager().beginTransaction()
            trans.replace(R.id.frame,nextFragment)
            (activity as? AppCompatActivity)?.supportActionBar?.title = getString(R.string.three)
            trans.commit()
        }

        return vieww
    }


}

