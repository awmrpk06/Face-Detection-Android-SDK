package com.jfacedetection;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.highgui.HighGui;

import java.awt.image.BufferedImage;

public class JFaceDetection{
	static int numberofFaces = 0;
	public static Mat[] FaceDetect(Mat src) {
		
		String xmlFile = "xml/lbpcascade_frontalface.xml";
		CascadeClassifier cc = new CascadeClassifier(xmlFile);
		
		MatOfRect faceDetection = new MatOfRect();
		cc.detectMultiScale(src, faceDetection);
		System.out.println(String.format("Detected faces: %d", faceDetection.toArray().length));
		
		Rect rectCrop=null;
		Mat[] image_face = new Mat[faceDetection.toArray().length];
		int i  = 0;
		for (Rect rect : faceDetection.toArray()) {			
		    rectCrop = new Rect(rect.x, rect.y, rect.width, rect.height);
		    image_face[i] = new Mat(src, rectCrop);
		    i = i + 1;
		}
		numberofFaces = i;
		return image_face;
	}
	
	public static void main(String[] args) {
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		String imgFile = "images/gannha.jpeg";
		Mat src = Imgcodecs.imread(imgFile);
		Mat[] output = new Mat[10];
		output =  FaceDetect(src);
		int i  = 0;
		for (Mat img : output ) {
			Imgcodecs.imwrite("images/"+ Integer.toString(i)+ "image.jpg",img);
			i = i + 1;
		
		}
		
		System.out.println("Image Detection Finished");
		
	}
}

