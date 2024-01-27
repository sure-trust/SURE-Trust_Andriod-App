package com.suretrustapp.suretrust.presentation.components

import androidx.annotation.Keep
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.suretrustapp.suretrust.presentation.compose_config.Green
import com.suretrustapp.suretrust.presentation.compose_config.LecendDeca
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryPurple
import com.suretrustapp.suretrust.presentation.compose_config.White


@Composable
@Preview
fun GuidelineView(
    onBackPressed: () -> Unit = {}
) {
    val list = listOf(
        GuidelineModel(
            head = "Choice of any song either for singing/dancing",
            body = "Competition can be patriotic, devotional , philosophical or something meaningful. There should be some message in whatever you submit for any event. Even if it is a filmy song, please check for above parameters. Decency cannot be compromised under any circumstances."
        ),
        GuidelineModel(
            head = "Dresscode",
            body = "Lease be very conscious of what you are wearing when you are presenting yourself. What we wear reflects a lot about our personality. Groom very well, do not wear shorts. Wear dresses which are completely covered and modest."
        ),
        GuidelineModel(
            head = "Choice of images for painting",
            body = "Again,please choose good images that can convey meaningful messages or just nature or decent portrait is fine. You cannot draw or paint pictures which are not suitable enough to showcase it for a larger audience."
        ),
        GuidelineModel(
            head = "Timing",
            body = "1min video where you are presenting , painting, any other skill etc. if you want to show more contents then it should be in fast forward mode for painting. For singing/dancing actual 1 min will do. Social service you can show for 2 mins"
        ), GuidelineModel(
            head = "Gmail",
            body = "Post your videos and all the presentation to suretrustlifeskills99@gmail.com incase you are not able to upload it in the form itself."
        ),
        GuidelineModel(
            head = "Subject line",
            body = "Talent show name / skill name/ social service title should be mentioned"
        ),
        GuidelineModel(
            head = "Presentation format",
            body = "Introduce your name, Univ degree, suretrust course, title of your presentation and then go ahead with your video. If you are writing an article/ story / poem then you need to have these details in your presentation document itself"
        ),
        GuidelineModel(
            head = "Photo",
            body = "You need to also send your small passport size photo which can be taken at home itself. 3.5 by 3.5 cm . It should be a decent formal and a well groomed one. Also your photo file should be saved under your full name. so when you upload your photo from PC then your file should have your name. When we collect your photos in our drive, it will be easy for us to match your name to your photo. Please follow all these instructions."
        ),
        GuidelineModel(
            head = "File name",
            body = "All your photo image, audio and video files should start with full name and course at suretrust Eg. Lakshmi Suresh_ Datascience"
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .padding(horizontal = 16.dp)
    ) {
        item {
            Spacer(modifier = Modifier.height(16.dp))
            Icon(
                imageVector = Icons.Filled.Close,
                contentDescription = null,
                tint = White,
                modifier = Modifier.size(20.dp).clickable {
                    onBackPressed()
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "LST Guidelines",
                fontFamily = LecendDeca,
                fontSize = 32.sp,
                color = PrimaryPurple,
                textAlign = TextAlign.Start,
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Greetings to one and all!. We at suretrust encourage you to post your skills & talent. However, while posting your talent/skill as an image or video please make sure that you follow the guidelines given below.",
                fontFamily = LecendDeca,
                fontSize = 14.sp,
                color = White,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(32.dp))
        }

        items(list) {
            GuidelineCardView(
                headline = it.head,
                body = it.body
            )
        }

        item {
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Anything you present, just make sure that you as presenters are well groomed. And what you are presenting is equally modest and decent. How you conduct yourselves even casually projects a lot about your inner personality. This is personality branding and networking too. Face is the index of mind. Your display picture in whats app /mobile or email also needs to align itself to a certain code of conduct. I understand these are extremely personal but since media is the medium through which, all of us get connected predominantly, you need to take utmost care in maintaining your profile in the most professional manner.",
                fontFamily = LecendDeca,
                fontSize = 14.sp,
                color = White,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
}

@Keep
data class GuidelineModel(
    val head: String,
    val body: String
)

@Composable
@Preview
fun GuidelineCardView(
    headline: String = "This is the heading",
    body: String = "This is the body. This is the body. This is the body. This is the body. This is the body. This is the body. This is the body"
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = headline,
            fontFamily = LecendDeca,
            fontSize = 18.sp,
            color = Green,
            textAlign = TextAlign.Start,
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = body,
            fontFamily = LecendDeca,
            fontSize = 14.sp,
            color = White,
            textAlign = TextAlign.Start,
            modifier = Modifier.alpha(0.5f)
        )
        Spacer(modifier = Modifier.height(32.dp))
    }
}