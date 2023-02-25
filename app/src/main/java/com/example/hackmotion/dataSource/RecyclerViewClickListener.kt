package com.example.hackmotion.dataSource

import android.view.View
import com.example.hackmotion.fragment.model.Call

interface RecyclerViewClickListener {
    fun onItemCallClicked(view: View, call: Call)
}