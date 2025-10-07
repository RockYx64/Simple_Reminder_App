package com.example.simple_reminder.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.simple_reminder.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class TodoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_todo, container, false)

        val fab = view.findViewById<FloatingActionButton>(R.id.fab_add_todo)
        fab.setOnClickListener {
            Snackbar.make(view, "Add To-Do clicked!", Snackbar.LENGTH_SHORT).show()
        }

        return view
    }
}
