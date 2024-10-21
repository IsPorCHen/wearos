package com.bignerdranch.android.prakt24_2

import Adapters.DateAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bignerdranch.android.prakt24_2.databinding.FragmentDateListBinding

class DateListFragment : Fragment() {

    private var _binding: FragmentDateListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDateListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dateList = listOf("2024-10-01", "2024-10-02", "2024-10-03")

        binding.dateRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.dateRecyclerView.adapter = DateAdapter(dateList) { selectedDate ->
            val action = DateListFragmentDirections.actionDateListFragmentToIncomeDetailsFragment(selectedDate)
            findNavController().navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
