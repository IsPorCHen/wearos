package com.bignerdranch.android.prakt24_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bignerdranch.android.prakt24_2.databinding.FragmentIncomeDetailsBinding

class IncomeDetailsFragment : Fragment() {

    private var _binding: FragmentIncomeDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIncomeDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = IncomeDetailsFragmentArgs.fromBundle(requireArguments())
        val selectedDate = args.selectedDate

        binding.incomeDetailsTextView.text = "Детали дохода для даты: $selectedDate"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
