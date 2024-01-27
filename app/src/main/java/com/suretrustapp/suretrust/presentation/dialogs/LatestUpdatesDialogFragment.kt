package com.suretrustapp.suretrust.presentation.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.suretrustapp.suretrust.databinding.UpdatesNewsLayoutBinding
import com.suretrustapp.suretrust.domain.StandardResponse
import com.suretrustapp.suretrust.presentation.bases.BaseDialogFragment
import com.suretrustapp.suretrust.presentation.components.NewsAndUpdatesScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class LatestUpdatesDialogFragment : BaseDialogFragment() {
    private var _binding: UpdatesNewsLayoutBinding? = null
    private val binding: UpdatesNewsLayoutBinding get() = _binding!!
    private val viewModel: LatestUpdatesViewModel by viewModels()


    companion object {
        fun newInstance() = LatestUpdatesDialogFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = UpdatesNewsLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launchWhenStarted {
            viewModel.newsData.collectLatest {
                when (val data = it) {
                    is StandardResponse.Failed -> {}

                    StandardResponse.Loading -> {}

                    is StandardResponse.Success -> {
                        binding.composeView.setContent {
                            NewsAndUpdatesScreen(data.data) {
                                dismissAllowingStateLoss()
                            }
                        }
                    }
                }

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}