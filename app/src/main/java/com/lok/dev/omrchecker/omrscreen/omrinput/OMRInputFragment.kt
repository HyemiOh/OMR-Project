package com.lok.dev.omrchecker.omrscreen.omrinput

import android.view.LayoutInflater
import android.view.ViewGroup
import com.lok.dev.commonbase.BaseFragment
import com.lok.dev.omrchecker.databinding.FragmentOmrInputBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OMRInputFragment @Inject constructor() : BaseFragment<FragmentOmrInputBinding>() {

    override fun createFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentOmrInputBinding.inflate(inflater, container, false)

    override fun initFragment() {
        super.initFragment()


    }

}