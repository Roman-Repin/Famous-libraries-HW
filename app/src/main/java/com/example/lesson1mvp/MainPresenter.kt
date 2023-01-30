package com.example.lesson1mvp

class MainPresenter(
    private val view: MainView
) {
    private val model: CountersModel = CountersModel(0,0,0)

    fun firstCounterClick() {
        val value = model.incrementFirst().toString()
        view.setFirstButtonText(value)
    }

    fun secondCounterClick() {
        val value = model.incrementSecond().toString()
        view.setSecondButtonText(value)
    }

    fun thirdCounterClick() {
        val value = model.incrementThird().toString()
        view.setThirdButtonText(value)
    }

    fun initButton(){
        view.setFirstButtonText(model.first.toString())
        view.setSecondButtonText(model.second.toString())
        view.setThirdButtonText(model.third.toString())
    }
}