package com.almerio.newsapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.almerio.newsapp.data.DataNews
import com.almerio.newsapp.adapter.NewsAdapter
import com.almerio.newsapp.bindNewsHeadline
import com.almerio.newsapp.databinding.FragmentTopBinding


class TopFragment : Fragment() {

    lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this com.almerio.newsapp.fragment
        binding = FragmentTopBinding.inflate(inflater, container, false)

        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }
       bindNewsHeadline(binding.newsHeadline, 2)
        return binding.root
    }
}