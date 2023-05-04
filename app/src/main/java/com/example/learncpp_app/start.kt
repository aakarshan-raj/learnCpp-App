package com.example.learncpp_app

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction


class start : Fragment() {
    lateinit var vi:View
    lateinit var btn:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        vi =  inflater.inflate(R.layout.fragment_start, container, false)
        val arrayAdapter:ArrayAdapter<*>
        val data = ArrayList<String>()
        val get = activity?.getSharedPreferences("data_in_here", AppCompatActivity.MODE_PRIVATE)
        val one = get?.getBoolean("one",false)
        val two = get?.getBoolean("two",false)
        val three = get?.getBoolean("three",false)
        val four = get?.getBoolean("four",false)
        val five = get?.getBoolean("five",false)
        val six = get?.getBoolean("six",false)
        val seven = get?.getBoolean("seven",false)
        val eight = get?.getBoolean("eight",false)
        val nine = get?.getBoolean("nine",false)
        val ten = get?.getBoolean("ten",false)
        val eleven = get?.getBoolean("eleven",false)
        val twelve = get?.getBoolean("twelve",false)
        val thirteen = get?.getBoolean("thirteen",false)
        val fourteen = get?.getBoolean("fourteen",false)
        val fifteen = get?.getBoolean("fifteen",false)
        val sixteen = get?.getBoolean("sixteen",false)
        if(one == true){
            data.add(getString(R.string.one))

        }
        if (two == true){
            data.add(getString(R.string.two))
        }
        if(three == true){
            data.add(getString(R.string.three))
        }
        if(four == true){
            data.add(getString(R.string.four))
        }
        if (five == true){
            data.add(getString(R.string.five))
        }
        if(six == true){
            data.add(getString(R.string.six))
        }
        if(seven == true){
            data.add(getString(R.string.seven))
        }
        if (eight == true){
            data.add(getString(R.string.eight))
        }
        if(nine == true){
            data.add(getString(R.string.nine))
        }
        if(ten == true){
            data.add(getString(R.string.ten))
        }
        if (eleven == true){
            data.add(getString(R.string.eleven))
        }
        if(twelve == true){
            data.add(getString(R.string.twelve))
        }
        if(thirteen == true){
            data.add(getString(R.string.thirteen))
        }
        if (fourteen == true){
            data.add(getString(R.string.fourteen))
        }
        if(fifteen == true){
            data.add(getString(R.string.fifteen))
        }
        if(sixteen == true){
            data.add(getString(R.string.sixteen))
        }
        val list_data = vi.findViewById<ListView>(R.id.list)
        arrayAdapter = ArrayAdapter(activity as AppCompatActivity,android.R.layout.simple_list_item_1,data)
        list_data.adapter = arrayAdapter
        btn = vi.findViewById(R.id.reset)
        btn.setOnClickListener {
            val sharedPreferences =   activity?.getSharedPreferences("data_in_here", AppCompatActivity.MODE_PRIVATE)

            val mEditor = sharedPreferences?.edit()
            mEditor?.putBoolean("one", false)
            mEditor?.putBoolean("two",false)
            mEditor?.putBoolean("three",false)
            mEditor?.putBoolean("four",false)
            mEditor?.putBoolean("five",false)
            mEditor?.putBoolean("six",false)
            mEditor?.putBoolean("seven",false)
            mEditor?.putBoolean("eight",false)
            mEditor?.putBoolean("nine",false)
            mEditor?.putBoolean("ten",false)
            mEditor?.putBoolean("eleven",false)
            mEditor?.putBoolean("twelve",false)
            mEditor?.putBoolean("thirteen",false)
            mEditor?.putBoolean("fourteen",false)
            mEditor?.putBoolean("fifteen",false)
            mEditor?.putBoolean("sixteen",false)
            mEditor?.apply()
            val nextFragment = start()
            val trans: FragmentTransaction = requireFragmentManager().beginTransaction()
            trans.replace(R.id.frame,nextFragment)
            (activity as? AppCompatActivity)?.supportActionBar?.title = "Progress"
            trans.commit()

        }
        return vi
    }


}