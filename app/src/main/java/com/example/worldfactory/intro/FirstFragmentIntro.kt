package com.example.worldfactory.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.worldfactory.databinding.FragmentFirstIntroBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragmentIntro : Fragment() {

    private var _binding: FragmentFirstIntroBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstIntroBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    //    binding.buttonFirst.setOnClickListener {
    //        findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
    //    }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}