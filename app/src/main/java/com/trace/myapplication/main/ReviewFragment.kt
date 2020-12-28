package com.trace.myapplication.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.trace.myapplication.R
import com.trace.myapplication.databinding.FragmentReviewBinding

class ReviewFragment: Fragment() {
    companion object{
        const val TAG = "ReviewFragment"
    }
    private lateinit var _vBinding: FragmentReviewBinding
    private val vBinding
        get() = _vBinding

    private val parent by lazy{requireActivity()}

    private var isListFragment = true

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _vBinding = FragmentReviewBinding.inflate(inflater, container, false)
        return vBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setBuildingInfo()
        setReviewList()

        vBinding.btnToEditTest.setOnClickListener{
            findNavController().navigate(R.id.editReview1Fragment)
        }
        vBinding.btnToReviewDetailTest.setOnClickListener{
            setUserReview()
        }
    }

    private fun setBuildingInfo(){
    }

    private fun setReviewList(){
        parent.supportFragmentManager.beginTransaction()
            .add(R.id.frame_under_building_info, ReviewListFragment())
            .addToBackStack(null)
            .commit()
    }

    private fun setUserReview(){
        parent.supportFragmentManager.beginTransaction()
            .add(R.id.frame_under_building_info, UserReviewFragment())
            .addToBackStack(null)
            .commit()
    }
}