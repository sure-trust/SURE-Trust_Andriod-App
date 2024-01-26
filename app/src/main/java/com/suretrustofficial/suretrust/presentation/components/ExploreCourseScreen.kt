package com.suretrustofficial.suretrust.presentation.components

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.suretrustofficial.suretrust.presentation.compose_config.LecendDeca
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBlue
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryPurple
import com.suretrustofficial.suretrust.presentation.compose_config.SlateDark
import com.suretrustofficial.suretrust.presentation.compose_config.White

@Composable
@Preview
fun ExploreCourseScreen() {

    var tabSelected by remember {
        mutableStateOf(TabOptions.TECHNICAL)
    }

    var dummyList = listOf(
        CourseDetail(
            id = 1L,
            name = "Android Development",
            details = "B.tech 3rd and 4th year",
            trainers = listOf(
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer")
            )
        ),
        CourseDetail(
            id = 1L,
            name = "Android Development",
            details = "B.tech 3rd and 4th year",
            trainers = listOf(
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer")
            )
        ),
        CourseDetail(
            id = 1L,
            name = "Android Development",
            details = "B.tech 3rd and 4th year",
            trainers = listOf(
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer")
            )
        ),
        CourseDetail(
            id = 1L,
            name = "Android Development",
            details = "B.tech 3rd and 4th year",
            trainers = listOf(
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer")
            )
        ),
        CourseDetail(
            id = 1L,
            name = "Android Development",
            details = "B.tech 3rd and 4th year",
            trainers = listOf(
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer")
            )
        ),
        CourseDetail(
            id = 1L,
            name = "Android Development",
            details = "B.tech 3rd and 4th year",
            trainers = listOf(
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer")
            )
        ),
        CourseDetail(
            id = 1L,
            name = "Android Development",
            details = "B.tech 3rd and 4th year",
            trainers = listOf(
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer"),
                TrainerDetail(name = "Subhadip Das", about = "Professional Android developer")
            )
        )
    )

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
                items(dummyList) {
                    CourseCardView(
                        couseId = it.id,
                        courseName = it.name,
                        courseDetails = it.details
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
    courseName: String = "Course Name",
    courseDetails: String = "Course description"
) {
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
                    text = courseName,
                    fontFamily = LecendDeca,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    color = White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = courseDetails,
                    fontFamily = LecendDeca,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center,
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
                    .clickable { }
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
    }
}

data class CourseDetail(
    val id: Long,
    val name: String,
    val details: String,
    val trainers: List<TrainerDetail>
)


data class TrainerDetail(
    val name: String,
    val about: String
)

enum class TabOptions {
    MEDICAL,
    TECHNICAL
}