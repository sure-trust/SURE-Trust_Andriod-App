package com.suretrustapp.suretrust.data.local

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.suretrustapp.suretrust.data.remote.models.CourseItem
import splitties.preferences.Preferences

object PreferenceHelper : Preferences("sure_trust_data") {
    var authToken by StringOrNullPref(PreferenceKey.AUTH_TOKEN, null)
    var localMedCourseList by StringOrNullPref(PreferenceKey.MED_COURSE_KEY, null)
    var localNonMedCourseList by StringOrNullPref(PreferenceKey.NON_MED_COURSE_KEY, null)
}

object PreferenceKey {
    const val AUTH_TOKEN = "auth_token"
    const val MED_COURSE_KEY = "med_course_list_key"
    const val NON_MED_COURSE_KEY = "non_med_course_list_key"
}

object PreferenceTypeConvertor {
    fun courseToStringList(courseList: List<CourseItem>): String? {
        return Gson().toJson(courseList)
    }

    fun stringToCourseModelList(courseList: String?): List<CourseItem> {
        val myDataModelListType = object : TypeToken<List<CourseItem>>() {}.type
        return Gson().fromJson(courseList, myDataModelListType)
    }
}