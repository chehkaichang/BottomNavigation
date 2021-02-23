package com.example.navigation

import android.graphics.Outline
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import kotlinx.android.synthetic.main.fragment_wallet.*


class WalletFragment : Fragment() {
    var pagerAdapter: ViewPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pagerAdapter = ViewPagerAdapter(childFragmentManager)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_wallet, container, false)
    }

    override fun onResume() {
        super.onResume()
        pager!!.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
            }

            override fun onPageScrollStateChanged(state: Int) {
            }
        })

        setupViewPager(pager!!)
        tabs!!.setupWithViewPager(pager)
    }

    private fun setupViewPager(viewPager: ViewPager) {
        pagerAdapter!!.addFragment(ContainerFragment(), getString(R.string.container_textview))
        pagerAdapter!!.addFragment(ExchangeFragment(), getString(R.string.exchange_textview))
        viewPager.adapter = pagerAdapter
    }
}