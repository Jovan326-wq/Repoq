package com.example.a2801

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a2801.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {
    private var _binding: FragmentBlank1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlank1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnCalculate.setOnClickListener {
            val a = binding.etNumberA.text.toString().toDouble()
            val w = 4 * a
            binding.tvResult.setText("Результат: " + w)
        }
        binding.btnClear.setOnClickListener {
            binding.etNumberA.setText("")
            binding.tvResult.setText("Результат: ")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}