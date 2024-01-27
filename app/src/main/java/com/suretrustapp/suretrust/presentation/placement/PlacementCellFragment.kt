package com.suretrustapp.suretrust.presentation.placement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suretrustapp.suretrust.databinding.FragmentPlacementCellBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import com.suretrustapp.suretrust.presentation.components.PlacementCellInchargeView

class PlacementCellFragment : BaseFragment() {
    private var _binding: FragmentPlacementCellBinding? = null
    private val binding: FragmentPlacementCellBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlacementCellBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            PlacementCellInchargeView()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}