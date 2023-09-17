package com.murali.neat_root_suraj.Rvword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.murali.neat_root_suraj.R
import com.murali.neat_root_suraj.databinding.ActivityMainBinding
import com.murali.neat_root_suraj.execes.Model

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    var dataList = ArrayList<Model>()
        for (i in 1 .. 3){
            dataList.add(Model(R.drawable.boy,"AlienOne"))
            dataList.add(Model(R.drawable.woman,"AlienTwo"))

        }

        var adapter = com.murali.neat_root_suraj.execes.Adapter(dataList)
        binding.rvView.adapter = adapter
//        binding.rvView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,true)
        binding.rvView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)




    }
}


















//        val arrayState : Array<String> = arrayOf("uttarPradesh","Bihar","Odisha","Goa","Karnataka","Mumbai","Haryana","Delhi")

//        val adapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,arrayState)
//        val adapter : ArrayAdapter<String> = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,arrayState)
//        binding.spinner.adapter = adapter
//
//        binding.spinner.onItemSelectedListener  = object  : AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(
//                parent: AdapterView<*>?,
//                view: View?,
//                position: Int,
//                id: Long
//            ) {
//              val selectItem : String  = arrayState[position]
//                Toast.makeText(this@MainActivity, "Selected state $selectItem", Toast.LENGTH_SHORT).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//
//            }
//
//        }
//    }
//}