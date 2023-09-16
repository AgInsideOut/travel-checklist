package com.aginsideout.travelchecklist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aginsideout.travelchecklist.databinding.FragmentChooseLocationBinding
import com.aginsideout.travelchecklist.databinding.ChooseLocationFragmentDirections
import androidx.fragment.app.Fragment

class ChooseLocationFragment : Fragment() {
    private lateinit var binding: FragmentChooseLocationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentChooseLocationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize RecyclerView and set up the adapter
        val recyclerView: RecyclerView = binding.locationRecyclerView
        val adapter = LocationAdapter { selectedLocation ->
            // Handle item click here, e.g., navigate to the corresponding list
            val action = ChooseLocationFragmentDirections
                .actionChooseLocationFragmentToListFragment(selectedLocation)

            findNavController().navigate(action.actionId)
        }
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Populate the RecyclerView with data
        val locationList = listOf(
            "Beach areas",
            "Natural areas",
            "Towns and cities",
            "Winter sport areas",
            "Countryside areas"
        )
        adapter.submitList(locationList)

    }
}