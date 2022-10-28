package com.comp.myapp.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class ProductEditViewModel() : ViewModel() {

    private val _productName = MutableStateFlow("qsd")
    val productName = _productName.asStateFlow()

    fun onProductNameChange(it: String) {
        _productName.value = it
    }

    init
    {
        System.out.println("ProductEditViewModel");
    }

}