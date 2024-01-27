package com.suretrustofficial.suretrust.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Checkbox
import androidx.compose.material.CheckboxDefaults
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.suretrustofficial.suretrust.presentation.auth.RegisterScreenUiEvents
import com.suretrustofficial.suretrust.presentation.auth.RegisterViewModel
import com.suretrustofficial.suretrust.presentation.compose_config.LecendDeca
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryBlue
import com.suretrustofficial.suretrust.presentation.compose_config.PrimaryPurple
import com.suretrustofficial.suretrust.presentation.compose_config.White
import com.suretrustofficial.suretrust.presentation.utils.showToast
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow

@Composable
fun RegisterScreen(
    onRegistrationComplete: () -> Unit,
    navigateToLogin: () -> Unit,
    registerViewModel: RegisterViewModel = hiltViewModel(),
) {
    //todo:
    val context = LocalContext.current

    LaunchedEffect(key1 = Unit) {
        registerViewModel.registerScreenUiEvents.receiveAsFlow().collectLatest { event->
            when (event) {
                is RegisterScreenUiEvents.RegisterSuccess -> {
                    onRegistrationComplete()
                }

                is RegisterScreenUiEvents.ShowToast -> {
                    context.showToast(event.message)
                }
            }
        }
    }

    var terms1 by rememberSaveable {
        mutableStateOf(false)
    }

    var terms2 by rememberSaveable {
        mutableStateOf(false)
    }

    var terms3 by rememberSaveable {
        mutableStateOf(false)
    }

    var terms4 by rememberSaveable {
        mutableStateOf(false)
    }


    var page by rememberSaveable{
        mutableIntStateOf(1)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
                .height(4.dp),
            color = PrimaryBlue,
            backgroundColor = PrimaryBlue.copy(alpha = 0.5f),
            progress = page / 5.0f
        )
        Spacer(modifier = Modifier.height(48.dp))
        when (page) {
            1 -> Column {
                Text(
                    text = "Account Details",
                    fontSize = 24.sp,
                    color = White,
                    fontFamily = LecendDeca
                )
                Spacer(modifier = Modifier.height(18.dp))
                ThemedTextField(
                    fieldLabel = "Email",
                    value = registerViewModel.email,
                    onValueChange = registerViewModel::onEmailChange,
                    error = registerViewModel.emailError,
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
                )
                Spacer(modifier = Modifier.height(16.dp))
                ThemedTextField(
                    fieldLabel = "Password",
                    value = registerViewModel.password,
                    onValueChange = registerViewModel::onPasswordChange,
                    error = registerViewModel.passwordError,
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
                )
            }

            2 -> Column {
                Text(
                    text = "Personal Details",
                    fontSize = 24.sp,
                    color = White,
                    fontFamily = LecendDeca
                )
                Spacer(modifier = Modifier.height(18.dp))
                ThemedTextField(
                    fieldLabel = "Full Name",
                    value = registerViewModel.name,
                    onValueChange = registerViewModel::onNameChange,
                    error = registerViewModel.nameError
                )
                Spacer(modifier = Modifier.height(16.dp))
                ThemedTextField(
                    fieldLabel = "Phone  Number",
                    value = registerViewModel.phone,
                    onValueChange = registerViewModel::onPhoneChange,
                    error = registerViewModel.phoneError,
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    registerViewModel.genders.forEach { option ->
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            RadioButton(
                                selected = (option == registerViewModel.selectedGenderOption),
                                onClick = {registerViewModel.onSelectedGenderOptionChange(option)},
                                colors = RadioButtonDefaults.colors(
                                    selectedColor = PrimaryBlue,
                                    unselectedColor = White.copy(0.6f)
                                )
                            )
                            Text(
                                text = option,
                                fontSize = 12.sp,
                                color = White.copy(0.6f),
                                fontFamily = LecendDeca
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                ThemedTextField(
                    fieldLabel = "Qualification",
                    value = registerViewModel.qualification,
                    onValueChange = registerViewModel::onQualificationChange,
                    error = registerViewModel.qualificationError
                )
            }

            3 -> Column {
                Text(
                    text = "College Details",
                    fontSize = 24.sp,
                    color = White,
                    fontFamily = LecendDeca
                )
                Text(
                    text = "Only for students",
                    fontSize = 14.sp,
                    color = White.copy(alpha = 0.8f),
                    fontFamily = LecendDeca
                )
                Spacer(modifier = Modifier.height(18.dp))
                ThemedTextField(
                    fieldLabel = "College Name",
                    value = registerViewModel.collegeName,
                    onValueChange = registerViewModel::onCollegeNameChange,
                    error = registerViewModel.collegeNameError
                )
                Spacer(modifier = Modifier.height(16.dp))
                ThemedTextField(
                    fieldLabel = "College Place",
                    value = registerViewModel.collegePlace,
                    onValueChange = registerViewModel::onCollegePlaceChange,
                    error = registerViewModel.collegePlaceError
                )
                Spacer(modifier = Modifier.height(16.dp))
                ThemedTextField(
                    fieldLabel = "College District",
                    value = registerViewModel.collegeDist,
                    onValueChange = registerViewModel::onCollegeDistChange,
                    error = registerViewModel.collegeDistError
                )
                Spacer(modifier = Modifier.height(16.dp))
                ThemedTextField(
                    fieldLabel = "College State",
                    value = registerViewModel.collegeState,
                    onValueChange = registerViewModel::onCollegeStateChange,
                    error = registerViewModel.collegeStateError
                )
            }

            4 -> Column {
                Text(
                    text = "Course Name",
                    fontSize = 24.sp,
                    color = White,
                    fontFamily = LecendDeca
                )
                Spacer(modifier = Modifier.height(18.dp))
                CourseDropDown (onValueSelected = registerViewModel::onCourseChange)
            }

            5 -> Column {
                Text(
                    text = "Terms & Conditions",
                    fontSize = 24.sp,
                    color = White,
                    fontFamily = LecendDeca
                )
                Spacer(modifier = Modifier.height(18.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        enabled = true,
                        checked = terms1,
                        onCheckedChange = { terms1 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = PrimaryBlue,
                            uncheckedColor = PrimaryBlue
                        )
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "Student has to turn on video during the entire class.",
                        fontSize = 14.sp,
                        color = White.copy(alpha = 0.8f),
                        fontFamily = LecendDeca
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        enabled = true,
                        checked = terms2,
                        onCheckedChange = { terms2 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = PrimaryBlue,
                            uncheckedColor = PrimaryBlue
                        )
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "Attending 8 Life Skills Training sessions during the four months course is mandatory for all the students.",
                        fontSize = 14.sp,
                        color = White.copy(alpha = 0.8f),
                        fontFamily = LecendDeca
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        enabled = true,
                        checked = terms3,
                        onCheckedChange = { terms3 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = PrimaryBlue,
                            uncheckedColor = PrimaryBlue
                        )
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "Student should not be a full time or part-time employee anywhere.",
                        fontSize = 14.sp,
                        color = White.copy(alpha = 0.8f),
                        fontFamily = LecendDeca
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        enabled = true,
                        checked = terms4,
                        onCheckedChange = { terms4 = it },
                        colors = CheckboxDefaults.colors(
                            checkedColor = PrimaryBlue,
                            uncheckedColor = PrimaryBlue
                        )
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "Students promise that you will learn the course with commitment, regularity and punctuality, for full four months duration, abiding by all the rules and discipline of the SURE TRUST.",
                        fontSize = 14.sp,
                        color = White.copy(alpha = 0.8f),
                        fontFamily = LecendDeca
                    )
                }
                Spacer(modifier = Modifier.height(6.dp))
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            if(page==5){
                Button(
                    onClick = registerViewModel::onRegisterButtonClicked,
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryBlue)
                ) {
                    Text(
                        text = "Register",
                        fontSize = 16.sp,
                        color = Black,
                        fontFamily = LecendDeca
                    )
                }
            }else{
                Button(
                    onClick = {
                        if (page > 1) page--
                    },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryPurple)
                ) {
                    Text(
                        text = "Previous",
                        fontSize = 16.sp,
                        color = Black,
                        fontFamily = LecendDeca
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Button(
                    onClick = {
                        if (page < 5) page++
                    },
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryBlue)
                ) {
                    Text(
                        text = "Next",
                        fontSize = 16.sp,
                        color = Black,
                        fontFamily = LecendDeca
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Already have an account? Login Here",
            fontSize = 14.sp,
            color = White.copy(alpha = 0.8f),
            fontFamily = LecendDeca,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    navigateToLogin()
                },
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun CourseDropDown(
    onValueSelected: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val courses1 = listOf(
        "Robotics Foundation Course",
        "SAP FICO Training",
        "Android App Development",
        "R Programming for Data Science",
        "Robotic Process Automation (RPA)",
        "Digital Marketing",
        "Cybersecurity & Ethical Hacking",
        "Financial Modelling & Valuation",
        "Embedded Systems and Internet of Things",
        "Blockchain Technology - Ethereum & Solana",
        "UI / UX Designing and Project Management",
        "EXCEL Applications for Business - Basic and Intermediate",
        "Industrial Automation",
        "Data Structures & Algorithms",
        "Core Java Programming",
        "Data Structures & Algorithms in Python",
        "VLSI Designing - (Front-End)",
        "Full Stack Development",
        "Salesforce Foundation Course",
        "VLSI Designing - (Back-End)",
        "Python & Machine Learning Basic Applications",
        "SAP Training",
        "Software Testing & Tools",
        "VLSI Designing - (Front-End)",
        "AutoCad & Solidworks for Mechanical Engineers",
        "SQL & Microsoft BI Tools including PowerBi",
        "PCB Designing",
        "Industrial Training for Civil Engineers",
        "Cloud Computing & DevOps - Basic Applications",
        "Computer Vision Algorithm Developer Course",
        "Data Science and Data Analytics -- Basic Applications",
        "SAP S/4 HANA",
        "VLSI Designing Course",
        "Smart Plant 3D Training Course",
        "Data Engineering",
        "Data Structures & Algorithms in C++",
        "Medical Coding Training",
        "SAP ABAP Consultant Training",
    )
    val courses = listOf(
        Course(23, "Robotics Foundation Course"),
        Course(32, "Cybersecurity & Ethical Hacking"),
        Course(35, "Android App Development"),
        Course(37, "Full Stack Development"),
        Course(40, "Core Java Programming"),
        Course(43, "Python & Machine Learning Basic Applications"),
        Course(54, "Digital Marketing"),
        Course(59, "Embedded Systems and Internet of Things"),
        Course(62, "Financial Modelling & Valuation"),
        Course(65, "SQL & Microsoft BI Tools including PowerBi"),
        Course(96, "Data Science and Data Analytics -- Basic Applications"),
        Course(98, "PCB Designing"),
    )
    var selectedIndex by remember { mutableStateOf(0) }
    Box(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.TopStart)) {
        Text(
            text = courses[selectedIndex].courseName,
            color = White,
            fontSize = 14.sp,
            fontFamily = LecendDeca,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .clip(RoundedCornerShape(8.dp))
                .border(width = 1.dp, color = White.copy(0.6f), shape = RoundedCornerShape(8.dp))
                .clickable(onClick = { expanded = true })
                .padding(vertical = 12.dp, horizontal = 6.dp)
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth()
                .background(White.copy(alpha = 0.5f))
        ) {
            courses.forEachIndexed { index, data ->
                DropdownMenuItem(onClick = {
                    selectedIndex = index
                    onValueSelected(courses[selectedIndex].id.toString())
                    expanded = false
                }) {
                    Text(text = data.courseName)
                }
            }
        }
    }
}

data class Course(
    val id: Int,
    val courseName: String
)