# Face-Detection-Android-SDK
This is an Android Face Detection, use OpenCV library.
First, you need to download OpenCV SDK for Android.
<a href="https://sourceforge.net/projects/opencvlibrary/files/opencv-android/2.4.11/OpenCV-2.4.11-android-sdk.zip/download">OpenCV</a> 
Instruction for importing SDK to your Android project can be found here : <a href="https://docs.opencv.org/2.4/doc/tutorials/introduction/android_binary_package/O4A_SDK.html">Android SDK</a>
Here, I built a simple Java Class with function to detect all the faces in an image and crop them. Let's get started.

![image](https://user-images.githubusercontent.com/44139135/203688270-8099f403-d25d-411b-a682-d94b553630ef.png)

`src` : Input Mat image

`return` : output array Mat images contain all faces.
Mat can be converted to BitMap :

![image](https://user-images.githubusercontent.com/44139135/203688518-6341b7bf-7edf-4b58-ac39-ab50d95c6ca9.png)


