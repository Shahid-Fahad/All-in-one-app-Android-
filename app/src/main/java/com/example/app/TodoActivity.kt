package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.app.databinding.ActivityMainBinding
import com.example.app.databinding.ActivityTodoBinding

class TodoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTodoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding  = ActivityTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var TodoList = mutableListOf(
            Todo("Morning Exersize",false),
            Todo("Breakfast",true),
            Todo("Contest",true),
            Todo("Android Development",true),
            Todo("Lunch",false)
        )
        val adapter = TodoAdapter(TodoList)

        binding.td.adapter=adapter
        binding.td.layoutManager=LinearLayoutManager(this)

        binding.btadd.setOnClickListener {
            val title = binding.etnew.text.toString()
            val todo = Todo(title = title,false)
            TodoList.add(todo)
            adapter.notifyItemInserted(TodoList.size-1)

        }

    }
}