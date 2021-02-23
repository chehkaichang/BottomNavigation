package com.example.navigation

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : FragmentActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.rl_vote_container, WalletFragment()).commit()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window: Window = window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            )
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.TRANSPARENT
        }

        initView()
        initListener()
    }

    private fun initView() {
        iv_vote_phone.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
        iv_vote_chat.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
        iv_vote_explore.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
        iv_vote_wallet.setColorFilter(ContextCompat.getColor(applicationContext,R.color.choose_item))
        tv_vote_phone.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
        tv_vote_chat.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
        tv_vote_explore.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
        tv_vote_wallet.setTextColor(ContextCompat.getColor(applicationContext,R.color.choose_item))
    }

    private fun initListener() {
        ll_vote_phone.setOnClickListener(this)
        ll_vote_chat.setOnClickListener(this)
        ll_vote_explore.setOnClickListener(this)
        ll_vote_wallet.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.ll_vote_phone -> {
                iv_vote_phone.setColorFilter(ContextCompat.getColor(applicationContext,R.color.choose_item))
                iv_vote_chat.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_explore.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_wallet.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_phone.setTextColor(ContextCompat.getColor(applicationContext,R.color.choose_item))
                tv_vote_chat.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_explore.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_wallet.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))

                val manager = supportFragmentManager
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.rl_vote_container, PhoneFragment()).commit()
            }
            R.id.ll_vote_chat -> {
                iv_vote_chat.setColorFilter(ContextCompat.getColor(applicationContext,R.color.choose_item))
                iv_vote_phone.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_explore.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_wallet.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_chat.setTextColor(ContextCompat.getColor(applicationContext,R.color.choose_item))
                tv_vote_phone.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_explore.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_wallet.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                val manager = supportFragmentManager
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.rl_vote_container, ChatFragment()).commit()
            }
            R.id.ll_vote_explore -> {
                iv_vote_explore.setColorFilter(ContextCompat.getColor(applicationContext,R.color.choose_item))
                iv_vote_phone.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_chat.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_wallet.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_explore.setTextColor(ContextCompat.getColor(applicationContext,R.color.choose_item))
                tv_vote_phone.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_chat.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_wallet.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                val manager = supportFragmentManager
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.rl_vote_container, ExploreFragment()).commit()
            }
            R.id.ll_vote_wallet -> {
                iv_vote_wallet.setColorFilter(ContextCompat.getColor(applicationContext,R.color.choose_item))
                iv_vote_phone.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_chat.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                iv_vote_explore.setColorFilter(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_wallet.setTextColor(ContextCompat.getColor(applicationContext,R.color.choose_item))
                tv_vote_phone.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_chat.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                tv_vote_explore.setTextColor(ContextCompat.getColor(applicationContext,R.color.black))
                val manager = supportFragmentManager
                val transaction = manager.beginTransaction()
                transaction.replace(R.id.rl_vote_container, WalletFragment()).commit()
            }
        }
    }
}