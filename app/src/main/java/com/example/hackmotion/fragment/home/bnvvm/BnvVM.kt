package com.example.hackmotion.fragment.home.bnvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class BnvVM: ViewModel() {

    val selectedMenu: MutableLiveData<Int> = MutableLiveData<Int>()

    fun setSelectedMenu(menuId: Int) {
        selectedMenu.value = menuId
    }

    fun getSelectedMenu(): LiveData<Int?> {
        return selectedMenu
    }
}