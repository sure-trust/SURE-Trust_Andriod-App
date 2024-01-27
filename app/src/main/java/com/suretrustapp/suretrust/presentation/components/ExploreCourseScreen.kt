package com.suretrustapp.suretrust.presentation.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.suretrustapp.suretrust.presentation.compose_config.LecendDeca
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryBlue
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryPurple
import com.suretrustapp.suretrust.presentation.compose_config.SlateDark
import com.suretrustapp.suretrust.presentation.compose_config.White
import com.suretrustapp.suretrust.presentation.explore.ExploreCourseViewModel
import com.suretrustapp.suretrust.presentation.helper_screens.WebViewActivity

@Composable
@Preview
fun ExploreCourseScreen(
    viewModel: ExploreCourseViewModel = hiltViewModel()
) {

    val medCourseList by viewModel.medCourseState.collectAsState()
    val nonMedCourseList by viewModel.nonMedCourseState.collectAsState()

    var tabSelected by rememberSaveable {
        mutableStateOf(TabOptions.TECHNICAL)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Technical",
                    fontFamily = LecendDeca,
                    fontSize = 20.sp,
                    color = if (tabSelected == TabOptions.TECHNICAL) PrimaryBackground else White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f)
                        .clip(RoundedCornerShape(20.dp))
                        .background(if (tabSelected == TabOptions.TECHNICAL) PrimaryBlue else Color.Transparent)
                        .padding(vertical = 4.dp)
                        .clickable {
                            if (tabSelected != TabOptions.TECHNICAL) {
                                tabSelected = TabOptions.TECHNICAL
                            }
                        }
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = "Medical",
                    fontFamily = LecendDeca,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                    color = if (tabSelected == TabOptions.MEDICAL) PrimaryBackground else White,
                    modifier = Modifier.weight(1f)
                        .clip(RoundedCornerShape(20.dp))
                        .background(if (tabSelected == TabOptions.MEDICAL) PrimaryBlue else Color.Transparent)
                        .padding(vertical = 4.dp)
                        .clickable {
                            if (tabSelected != TabOptions.MEDICAL) {
                                tabSelected = TabOptions.MEDICAL
                            }
                        }
                )
            }
            Spacer(modifier = Modifier.height(36.dp))
            LazyColumn {
                items(if (tabSelected == TabOptions.TECHNICAL) nonMedCourseList else medCourseList) {
                    CourseCardView(
                        couseId = it.id,
                        courseName = it.course_name,
                        courseDetails = it.prerequisites
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                }
            }
        }
    }
}

@Composable
@Preview
fun CourseCardView(
    couseId: Long = -1L,
    courseName: String? = "Course Name",
    courseDetails: String? = "Course description"
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(width = 1.dp, color = PrimaryPurple, shape = RoundedCornerShape(8.dp))
            .background(SlateDark)
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = courseName ?: "Unknown",
                    fontFamily = LecendDeca,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Start,
                    color = White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = courseDetails ?: "NOT FOUND",
                    fontFamily = LecendDeca,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Start,
                    color = White,
                    modifier = Modifier.alpha(0.5f)
                )
            }
            Text(
                text = "Explore",
                fontFamily = LecendDeca,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = White,
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(PrimaryBlue)
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .clickable {
                        Log.d("COURSELOGLOG","https://www.suretrustforruralyouth.com/courses/${couseId}" )
                        WebViewActivity.openWebView(
                            context,
                            "https://www.suretrustforruralyouth.com/courses/${couseId}",
                            courseName ?: "Explore Course"
                        )
                    }
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
    }
}

enum class TabOptions {
    MEDICAL,
    TECHNICAL
}