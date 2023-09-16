package com.aginsideout.travelchecklist

data class ChecklistItem(
    var name: String,
    var description: String,
    var quantity: Int,
    var completed: Boolean
)