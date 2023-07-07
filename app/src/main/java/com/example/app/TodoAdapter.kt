package com.example.app


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(var todos:List<Todo>):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>()
{
    inner class TodoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo_layout,parent,false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val todoItem = todos[position]

        val titleTextView = holder.itemView.findViewById<TextView>(R.id.tvTitle)
        val checkbox = holder.itemView.findViewById<CheckBox>(R.id.cbDone)

        titleTextView.text = todoItem.title
        checkbox.isChecked = todoItem.isCompleted
    }

    override fun getItemCount(): Int {
       return todos.size
    }
}