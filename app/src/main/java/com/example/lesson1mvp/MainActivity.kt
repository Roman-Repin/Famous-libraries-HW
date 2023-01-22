package com.example.lesson1mvp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.lesson1mvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private val presenter = MainPresenter(this)

    private var _vb: ActivityMainBinding? = null

    private val vb
        get() = _vb!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)
        presenter.initButton()

        vb.btnCounter1.setOnClickListener { presenter.firstCounterClick() }
        vb.btnCounter2.setOnClickListener { presenter.secondCounterClick() }
        vb.btnCounter3.setOnClickListener { presenter.thirdCounterClick() }
    }

    override fun setFirstButtonText(text: String) {
        vb.btnCounter1.text = text
    }

    override fun setSecondButtonText(text: String) {
        vb.btnCounter2.text = text
    }

    override fun setThirdButtonText(text: String) {
        vb.btnCounter3.text = text
    }
}