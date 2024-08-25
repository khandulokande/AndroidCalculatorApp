# Android Calculator Application

The Android Calculator Application is designed to perform basic arithmetic operations such as addition, subtraction, multiplication, and division.

## Overview
#### This is my Personal Project.
The Calculator class is designed to perform basic arithmetic operations such as addition, subtraction, multiplication, and division. This class is ideal for simple mathematical calculations, encapsulating essential features needed for everyday use. The application is built using Android's native development framework and adheres to modern design principles to ensure both functionality and user experience.

## Features

- **Addition**: Add two numbers and get the sum.
- **Subtraction**: Subtract one number from another.
- **Multiplication**: Multiply two numbers together.
- **Division**: Divide one number by another, with error handling for division by zero.
- **Clear Functionality**: A clear button (`C`) to reset the current calculation.
- **Backspace Functionality**: A backspace button to delete the last entered digit.
- **User Interface**: The UI is simple, intuitive, and designed for ease of use.

## Implementation Details

### **MainActivity.java**
   - **Imports**:
     - `androidx.appcompat.app.AppCompatActivity`: Base class for activities that use the support library action bar features.
     - `android.os.Bundle`: Used to pass data between different activities and save the state of the application.
     - `android.view.View`: Provides the ability to handle UI elements such as buttons.
     - `android.widget.Button` and `android.widget.TextView`: Used for the UI components, like buttons and text fields.
     - `android.content.SharedPreferences`: Used to save the state of the application, such as the current calculation.

   - **Layout and UI Components**:
     - A simple layout featuring a TextView to display the results and several buttons (`Button`) for digits and operations.
     - The clear button (`C`) resets the current input, while the backspace button allows users to correct mistakes.

   - **Event Handling**:
     - Each button is linked to a `View.OnClickListener`, ensuring that the appropriate mathematical operation is executed when the user interacts with the UI.

## Skills Utilized

- **Java Programming**: The core logic for the arithmetic operations and event handling is implemented in Java, leveraging object-oriented principles.
- **Android Development**: Expertise in Android SDK, including the use of `AppCompatActivity`, `Bundle`, `SharedPreferences`, and UI components such as `Button` and `TextView`.
- **UI/UX Design**: Focus on creating a user-friendly interface, ensuring that the application is both functional and visually appealing.
- **State Management**: Effective use of `SharedPreferences` to manage the state of the application, providing a seamless user experience.
- **Error Handling**: Implementing checks to handle division by zero and other potential user input errors gracefully.

## Screenshots

Here are some screenshots of the application in action:

### 1. Main Screen
   ![Calculator Main Screen](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj3mszyj_n8qb40T0kN9gp0fkudTA1eXqLcv_Cg6xxXuGtPnQUuxm47WhkLNBV5AiLbdasjVw8U0ftyRBOtZRf_Azq8tgzO5_3ORPm-Jcf0-Md7irOb-VV_rutqqha_n_jUvXdkEYek6bGkMJZWJjhowslDnsh81Zvi6Svl2WzTGqMRikf8XnP48mFCvs2q/w256-h569/Screenshot_20240819_Main.jpg)

### 2. App Icon on Home Screen
   ![App Icon](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh2KZDUSDadRti7NcUo-UUE45TOO73_x3SlH9fuxfgG2ASjbBF82PKq9p5cY0yqlnVCQRGhGdyXMOmQWbBIT-eXPd5mBtbC-zlLxi9Gh5JkQY24w06V8YXJV_J2JqH7nC91Al-mNzOWcBOCqixxdSm6OSOfY7hYXdaxawqd7cXvnjFC6Fc3eCTGikiTit7z/w250-h522/Screenshot_20240819_Icon.jpg)

### 4. Calculator in Use
   ![Calculator Usage](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgxZsYsNkuajldOPSCbUgjXZtMIyDlnUMkmWocQ2PkfF3AFUnUDNalQMP8FusriLlpya_wGebUYnl0ONjWUdW3W5jsi5-0917vPYC2FF3MOWmwXqGtW6aGIZpemFo0ecxgTDvu-a-igQUMoyZqXMBrRe5MrqvoyCWeTfAMRoEm_bNOzHcTW-L9wC5Fpf1Aj/w256-h570/Screenshot_20240819_In_Use.jpg)



## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/khandulokande/AndroidCalculatorApp.git
   ```
2. Open the project in Android Studio.
3. Build and run the application on an emulator or a physical device.

OR

Download and Install APK from [here](https://drive.google.com/file/d/1bur1bE-LiNYcIB9WhQ5pY5yQmW_AA71_/view?usp=sharing).


## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/khandulokande/AndroidCalculatorApp/tree/main/LICENSE) file for details.
