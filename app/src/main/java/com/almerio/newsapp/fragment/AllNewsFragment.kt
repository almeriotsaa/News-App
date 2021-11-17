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
import com.almerio.newsapp.databinding.FragmentAllNewsBinding


class AllNewsFragment : Fragment() {

    lateinit var binding: FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this com.almerio.newsapp.fragment
        binding = FragmentAllNewsBinding.inflate(inflater, container, false)

        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }
        bindNewsHeadline(binding.newsHeadline, 0)
        return binding.root
    }


}