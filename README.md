# SocialSpark
Social Spark App Github repository. It is an easy to use app that suggests small social sparks or actions based on the time of the day to help users stay connected while also making in fun to use.


# Social Spark App
 

**Developer:** Baitumetse Lekubu ST10520899  
**Target User:** Cora (Or any other socially anxious teenagers)
 

## Project Overview
Social Spark is an Android application designed to help users overcome social anxiety by providing timed, actionable social "sparks." The app suggests small, manageable social tasks based on the time of day. The options for time of the day are limited to Morning, Mid-morning, Afternoon, Dinner, and after dinner

## Features
* **Smart Suggestions:** Provides tailored social prompts for Morning,Mid-Morning Afternoon, Dinner, and after-dinner.
* **Input Validation:** Robust error handling for unrecognized or empty inputs.
* **Clean UI:** High-contrast design optimized for accessibility.
* **Reset Functionality:** Easily clear inputs to start a new session.

## Example Inputs & Expected Sparks
To test the app, you can enter the following "times of day":
* **Morning**: "Send a 'Good morning' text to a family member."
* **Mid-morning**: "Reach out to a colleague with a quick 'Thank you'."
* **Afternoon**: "Share a funny meme or interesting link with a friend."
* **Dinner**: "Call a friend or relative for a 5-minute catch-up."
* **After dinner**: "Leave a thoughtful comment on a friend's post." 


## Technical Implementation
* **Language:** Kotlin
* **Architecture:** XML-based Layouts with View-Binding logic in MainActivity.
* **Logging:** Implemented `Log.d` and `Log.i` for session tracking and debugging.
 
* **CI/CD:** Automated builds configured via GitHub Actions (see Actions tab).
 

## Testing
### Manual Test Cases
1. **Scenario:** User enters "Dinner". **Result:** Suggests to call a friend or relative for a catch-up call.
 
2. **Scenario:** User leaves field empty. **Result:** Displays error message "Please enter a time of the day”.
 
3. **Scenario:** User clicks Reset. **Result:** Clears all fields and logs the event.
 
### Automated Build
The project includes a `build.yml` workflow that verifies the project compiles correctly on a remote server.

Please use the YouTube link below that demonstrates the functionality of the App.
* https://youtu.be/ps1G9blwpGc

