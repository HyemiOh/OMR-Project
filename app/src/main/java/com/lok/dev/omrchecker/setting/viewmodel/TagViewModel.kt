package com.lok.dev.omrchecker.setting.viewmodel

import androidx.lifecycle.viewModelScope
import com.lok.dev.commonbase.BaseViewModel
import com.lok.dev.commonmodel.state.mutableResultState
import com.lok.dev.commonutil.onState
import com.lok.dev.coredata.usecase.AddTagUseCase
import com.lok.dev.coredata.usecase.GetTagListUseCase
import com.lok.dev.coredatabase.entity.TagTable
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class TagViewModel @Inject constructor(
    private val getTagListUseCase: GetTagListUseCase,
    private val addTagUseCase: AddTagUseCase
): BaseViewModel() {

    private val _tagListData = mutableResultState<List<TagTable>>()
    val tagListData = _tagListData.asStateFlow()

    fun getTagList() {
        getTagListUseCase.invoke().onState(viewModelScope) {
            _tagListData.value = it
        }
    }

    fun addTag(name:String) {
        val tagTable = TagTable(name = name)
        addTagUseCase.invoke(tagTable)
    }

}