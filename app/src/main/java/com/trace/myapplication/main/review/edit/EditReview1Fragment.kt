package com.trace.myapplication.main.review.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.trace.myapplication.R
import com.trace.myapplication.databinding.FragmentEditReview1Binding

class EditReview1Fragment: Fragment() {
    private lateinit var _vBinding: FragmentEditReview1Binding
    private val vBinding
        get() = _vBinding

    private val parent by lazy{requireActivity()}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _vBinding = FragmentEditReview1Binding.inflate(inflater, container, false)
        return vBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setBtn()
    }

    private fun setBtn(){
        vBinding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_editReview1Fragment_to_editReview2Fragment)
        }
    }
}