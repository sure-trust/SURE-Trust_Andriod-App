package com.suretrustofficial.suretrust.presentation.components

import android.content.Intent
import android.net.Uri
import androidx.annotation.Keep
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.suretrustofficial.suretrust.R
import com.suretrustofficial.suretrust.presentation.compose_config.LecendDeca
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBlue
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryPurple
import com.suretrustofficial.suretrust.presentation.compose_config.SlateDark
import com.suretrustofficial.suretrust.presentation.compose_config.White

@Composable
@Preview
fun AboutSectionMembersListScreen() {

    val sectionMembers = listOf(
        MemberSection(
            title = "Board Of Trustees",
            members = listOf(
                MemberCardModel(
                    name = "Ms. Krithika Ram",
                    image = R.drawable.ic_kritika,
                    about = "Medha is an Indian non-profit organization, working passionately for more than a decade to ...",
                    socialURL = ""
                ),
                MemberCardModel(
                    name = "Ms. Vandana Nagesh",
                    image = R.drawable.ic_vandana,
                    about = "Co-Founder and Director-SURE Trust ; General Manager HR. Life Slimming and Cosmetic Clinic ...",
                    socialURL = "https://www.linkedin.com/in/vandana-nagesh-5a0025a/"
                ),
                MemberCardModel(
                    name = "Sri Chandramohan, CA",
                    image = R.drawable.ic_chandramohan,
                    about = "Director and Group President Finance and Investment, TAFE (Tractor and Farm Equipment ...",
                    socialURL = "https://www.linkedin.com/in/chandramohan-sitaraman-8017a11/"
                ),
                MemberCardModel(
                    name = "Prof. Radhakumari Challa",
                    image = R.drawable.ic_radha_mam,
                    about = "Executive Director and Founder - SURE Trust; Retd Professor-Dept of Management & ...",
                    socialURL = "https://www.linkedin.com/in/prof-radhakumari-challa-a3850219b/"
                ),
                MemberCardModel(
                    name = "Mr. Ramachandran Parthasarathy\n",
                    image = R.drawable.ic_sri_raman,
                    about = "Hon Advisor & Chair- Advisory Committee India Vision Institute & Eye wear Consultant. Formerly ...",
                    socialURL = "https://www.linkedin.com/in/ramachandran-p-ram-5109b05/"
                ),
                MemberCardModel(
                    name = "Mr. Amar Vivek Aggarwal",
                    image = R.drawable.ic_amar,
                    about = "Founding partner-Avsai Legal; and Legal Practitioner-practicing Attorney for more than 31yrs ...",
                    socialURL = ""
                ),
                MemberCardModel(
                    name = "Mr. Sai Krishnakanth Prasad",
                    image = R.drawable.ic_kk,
                    about = "Manager Wipro -- Digital Operations and Platforms, Gurgaon, Haryana, India",
                    socialURL = "https://www.linkedin.com/in/saikrishnakanthprasad-kk/"
                ),
                MemberCardModel(
                    name = "Dr. SSR Kumar",
                    image = R.drawable.ic_ssr_kumar,
                    about = "Board of Director, Nanotechnology Executive, & Entrepreneur",
                    socialURL = "https://www.linkedin.com/in/kumar-challa-4a30284/"
                ),
            )
        ),
        MemberSection(
            title = "Governing Council (Senior Executive Members)",
            members = listOf(
                MemberCardModel(
                    name = "V.J.Ramanan",
                    image = R.drawable.ic_ramnan,
                    about = "Undergraduate in Electronics from Bangalore University, Graduate in Computer Science from...",
                    socialURL = "https://www.linkedin.com/in/ramananvaidya/"
                ),
                MemberCardModel(
                    name = "Dr. Pravir Sharma",
                    image = R.drawable.ic_dr_pravir_sharma,
                    about = "MBBS, DPM, M.Sc in General Psychiatry, FRC Psych Professional Memberships: Fellow of the ...",
                    socialURL = "https://www.linkedin.com/in/dr-pravir-sharma-psychiatrist-00787bb7/"
                ),
                MemberCardModel(
                    name = "Dr. C. Muralikrishna Kumar",
                    image = R.drawable.ic_muralikrishna,
                    about = "Former Senior Advisor, NITI Aayog. During his career spanning over 34 years, Dr. C.M Kumar ...",
                    socialURL = "https://www.linkedin.com/in/muralikrishna-kumar-c-9b735a41/"
                )
            )
        ),
        MemberSection(
            title = "Governing Council (Executive Members)",
            members = listOf(
                MemberCardModel(
                    name = "Mrs. Sai Sudha Nunna",
                    image = R.drawable.ic_saisudha,
                    about = "Co-Founder & COO, Smartnerd Future Communities, India.",
                    socialURL = ""
                ),
                MemberCardModel(
                    name = "Mrs. Vijayalakshmi",
                    image = R.drawable.ic_vijayalakshmi,
                    about = "ABA Therapist Behaviour Enrichment, Duba",
                    socialURL = ""
                ),
                MemberCardModel(
                    name = "Mr. Sai Anukaran",
                    image = R.drawable.ic_lawyer,
                    about = "Dual-Qualified lawyer (England & Wales, India)",
                    socialURL = ""
                )
            )
        ),
        MemberSection(
            title = "Board Of Advisors",
            members = listOf(
                MemberCardModel(
                    name = "Sri. Sujith K.R",
                    image = R.drawable.ic_sujith,
                    about = "Sri Sujith is currently working as Scientist- E, Indira Gandhi Centre for Atomic Research, Kalpakkam, India, after gaining overall 12 year...",
                    socialURL = ""
                ),
                MemberCardModel(
                    name = "Sri. Meiappan Palaniappan",
                    image = R.drawable.ic_meiappan,
                    about = "MCA, PGDBA in Financial Management Services from Symbiosis Institute, Pune, Project ...",
                    socialURL = "https://www.linkedin.com/in/meiappan/"
                ),
                MemberCardModel(
                    name = "Sri. R Krishnamurthy",
                    image = R.drawable.ic_krishnamurthy,
                    about = "Currently practicing as a Registered Valuer for Asset Class - Securies or Financial Assets • Was Finance controller of group with multiple subsidiaries and having experience in Active Business partnering • Managing Audits (Internal and Statutory ) • Treasury and Forex operations • Part of the CSR trust...",
                    socialURL = "https://www.linkedin.com/in/krishnamurthy-r-99b79062/"
                )
            )
        )
    )

    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(PrimaryBackground)
            .padding(horizontal = 12.dp, vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "Birth of The SURE Trust",
                fontFamily = LecendDeca,
                fontSize = 24.sp,
                color = White
            )
            Spacer(modifier = Modifier.height(32.dp))
            Image(
                painterResource(R.drawable.ic_satya_sai_baba),
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(
                        width = 1.dp,
                        color = PrimaryBlue,
                        shape = RoundedCornerShape(
                            50
                        )
                    ),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(56.dp))
            Text(
                text = "A narration by The Founded",
                fontFamily = LecendDeca,
                fontSize = 18.sp,
                color = White
            )
            Text(
                text = "Prof. Radhakumari",
                fontFamily = LecendDeca,
                fontSize = 18.sp,
                color = PrimaryPurple
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = context.getString(R.string.long_about_text),
                fontFamily = LecendDeca,
                fontSize = 14.sp,
                color = White,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp).alpha(0.5f)
            )
        }
        items(sectionMembers) {
            Spacer(modifier = Modifier.height(56.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = it.title,
                    fontFamily = LecendDeca,
                    fontSize = 16.sp,
                    color = White,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(16.dp))
                LazyRow {
                    items(it.members) {
                        MemberCardView(
                            name = it.name,
                            about = it.about,
                            image = it.image,
                            url = it.socialURL
                        )
                    }
                }
            }
        }
    }

}

@Composable
fun MemberCardView(
    image: Int,
    name: String,
    about: String,
    url: String
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .width(280.dp)
            .height(240.dp)
            .padding(horizontal = 4.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(width = 1.dp, color = White, shape = RoundedCornerShape(8.dp))
            .background(SlateDark)
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(24.dp))
        Image(
            contentDescription = null,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop,
            painter = painterResource(image),
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = name,
            fontFamily = LecendDeca,
            fontSize = 14.sp,
            color = White,
            textAlign = TextAlign.Center
        )
        Text(
            text = about,
            fontFamily = LecendDeca,
            fontSize = 10.sp,
            color = White,
            textAlign = TextAlign.Center,
            modifier = Modifier.alpha(0.5f)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Image(
            painter = painterResource(R.drawable.ic_linkedin),
            contentDescription = null,
            modifier = Modifier.size(24.dp).clickable {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(context, browserIntent, null)
            }
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Composable
fun PlacementCellInchargeView() {

    val sectionMembers = listOf(
        MemberCardModel(
            name = "Ms. Vandana Nagesh",
            image = R.drawable.ic_vandana,
            about = "Co-Founder and Director-SURE Trust ; General Manager HR. Life Slimming and Cosmetic Clinic ...",
            socialURL = "https://www.linkedin.com/in/vandana-nagesh-5a0025a/"
        ),
        MemberCardModel(
            name = "Sri. Anurag Midha",
            image = R.drawable.ic_anurag,
            about = "Head, Semiconductor Division - INFOSYS",
            socialURL = "https://www.linkedin.com/in/anurag-midha-5823208/"
        ),

        MemberCardModel(
            name = "Sri Chandramohan, CA",
            image = R.drawable.ic_chandramohan,
            about = "Director and Group President Finance and Investment, TAFE (Tractor and Farm Equipment ...",
            socialURL = "https://www.linkedin.com/in/chandramohan-sitaraman-8017a11/"
        ),
        MemberCardModel(
            name = "Sri. Saravana Kumar D",
            image = R.drawable.ic_saravana,
            about = "Senior Technical Director / Lead Solution Architect - Bounteous India",
            socialURL = "https://www.linkedin.com/in/saravana-kumar-dharmarajan-43624411/"
        ),
        MemberCardModel(
            name = "Mr. Ramachandran Parthasarathy",
            image = R.drawable.ic_sri_raman,
            about = "Hon Advisor & Chair- Advisory Committee India Vision Institute & Eye wear Consultant. Formerly ...",
            socialURL = "https://www.linkedin.com/in/ramachandran-p-ram-5109b05/"
        ),
        MemberCardModel(
            name = "Sri. Pritam Sahoo",
            image = R.drawable.ic_pritam,
            about = "Technology Lead - Global Partners at Google",
            socialURL = "https://www.linkedin.com/in/pritam-sahoo-77a438a/"
        ),
        MemberCardModel(
            name = "Mr. Kushal S O",
            image = R.drawable.ic_dummy,
            about = "Associate Machine Learning at Sprinklr",
            socialURL = "https://www.linkedin.com/in/kushalso/"
        ),
        MemberCardModel(
            name = "Ms Dhara Jhinzuvadia",
            image = R.drawable.ic_dhara,
            about = "Senior Executive - TCS",
            socialURL = ""
        ),
        MemberCardModel(
            name = "Ms. Bhoomika S Bidari",
            image = R.drawable.ic_bhomika,
            about = "Design and Verification Engineer at AMD-Xilinx",
            socialURL = "https://www.linkedin.com/in/bhoomika-s-bidari-5a9b69160/"
        ),
        MemberCardModel(
            name = "Mr. Sai Anukaran",
            image = R.drawable.ic_lawyer,
            about = "Dual-Qualified lawyer (England & Wales, India)",
            socialURL = ""
        )
    )

    LazyRow {
        items(sectionMembers) {
            MemberCardView(
                name = it.name,
                about = it.about,
                image = it.image,
                url = it.socialURL
            )
        }
    }

}

@Keep
data class MemberSection(
    val title: String,
    val members: List<MemberCardModel>
)

@Keep
data class MemberCardModel(
    val name: String,
    val image: Int,
    val about: String,
    val socialURL: String
)