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
import com.almerio.newsapp.databinding.FragmentPopularBinding


class PopularFragment : Fragment() {

    lateinit var binding: FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this com.almerio.newsapp.fragment
        binding = FragmentPopularBinding.inflate(inflater, container, false)

        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }
        bindNewsHeadline(binding.newsHeadline, 1)
            return binding.root
    }
}
