# Face-Detection-Android-SDK
This is an Android Face Detection, use OpenCV library.
First, you need to download OpenCV SDK for Android.
<a href="https://sourceforge.net/projects/opencvlibrary/files/opencv-android/2.4.11/OpenCV-2.4.11-android-sdk.zip/download">OpenCV</a> 
Instruction for importing SDK to your Android project can be found here : <a href="https://docs.opencv.org/2.4/doc/tutorials/introduction/android_binary_package/O4A_SDK.html">Android SDK</a>
Here, I built a simple Java Class with function to detect all the faces in an image and crop them. Let's get started.

```ruby public static Bitmap[] FaceDetect(Bitmap image) ```

`src` : Input bitmap image

`return` : output array Bitmap images contain all faces.


# Example
Input:

![gannha](https://user-images.githubusercontent.com/44139135/203689229-63e71186-17fc-4852-b085-33c17cf58abd.jpeg)


Output:


![image](https://user-images.githubusercontent.com/44139135/203689270-f4f883a2-2944-4ad0-b60e-1ec02c8e6c72.png)


