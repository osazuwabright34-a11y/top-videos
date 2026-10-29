# Top Videos

A simple Android application that allows you to browse and play video files stored on your device.

## Features
- Lists video files from device storage using MediaStore
- Plays videos with Media3 ExoPlayer
- Handles modern Android permissions (READ_MEDIA_VIDEO / READ_EXTERNAL_STORAGE)
- Clean Material Design UI

## Building the APK with GitHub Actions

1. This repository is already configured with a GitHub Actions workflow.
2. Go to the **Actions** tab on GitHub.
3. Select the **Build APK** workflow.
4. Click **Run workflow** (or push any change to the `main` branch).
5. Once the workflow completes successfully, download the APK artifact named `top-videos-debug-apk`.
6. Transfer the APK to your phone and install it (you may need to allow installation from unknown sources).

## Requirements
- Android 7.0 (API 24) or higher
- Permission to access videos on the device

## Project Structure
- Kotlin + AndroidX + Material Components + Media3 ExoPlayer
- Gradle Kotlin DSL

Built to be compiled entirely via GitHub Actions without a local development machine.
