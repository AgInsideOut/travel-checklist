package com.aginsideout.travelchecklist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChecklistAdapter(
    private val context: Context,
    private val checklist: List<ChecklistItem>
) : RecyclerView.Adapter<ChecklistAdapter.ChecklistViewHolder>() {

    inner class ChecklistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.itemNameTextView)
        val itemDescription: TextView = itemView.findViewById(R.id.itemDescriptionTextView)
        val itemQuantity: TextView = itemView.findViewById(R.id.itemQuantityTextView)
        val itemCompleted: CheckBox = itemView.findViewById(R.id.itemCompletedCheckBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChecklistViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.checklist_item, parent, false)
        return ChecklistViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ChecklistViewHolder, position: Int) {
        val currentItem = checklist[position]

        holder.itemName.text = currentItem.name
        holder.itemDescription.text = currentItem.description
        holder.itemQuantity.text = currentItem.quantity.toString()
        holder.itemCompleted.isChecked = currentItem.completed

        holder.itemCompleted.setOnCheckedChangeListener { _, isChecked ->
            currentItem.completed = isChecked
        }
    }

    override fun getItemCount(): Int {
        return checklist.size
    }
}