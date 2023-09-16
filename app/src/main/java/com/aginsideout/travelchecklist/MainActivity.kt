package com.aginsideout.travelchecklist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ChecklistAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Create a sample checklist
        val checklist = listOf(
            ChecklistItem("Item 1", "Description 1", 2, false),
            ChecklistItem("Item 2", "Description 2", 1, false),
            // Add more checklist items here
        )

        adapter = ChecklistAdapter(this, checklist)
        recyclerView.adapter = adapter
    }
}

