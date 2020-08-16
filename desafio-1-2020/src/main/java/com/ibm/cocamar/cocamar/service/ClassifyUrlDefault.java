package com.ibm.cocamar.cocamar.service;

import java.io.FileNotFoundException;

import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.watson.language_translator.v3.model.IdentifyOptions;
import com.ibm.watson.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.visual_recognition.v3.model.ClassifiedImages;
import com.ibm.watson.visual_recognition.v3.model.ClassifyOptions;

public class ClassifyUrlDefault {
	
	public static void main(String[] args) throws FileNotFoundException {

	    Object IamOptions = ((Object) new IdentifyOptions.Builder ())
	        .apiKey ("{")
	        .build();

	    VisualRecognition service = new VisualRecognition("2018-03-19", (Authenticator) IamOptions);

	    ClassifyOptions ClassifyOptions = new ClassifyOptions.Builder ()
	        .url("https: //watson-developer-cloud.github.io/doc-tutorial-downloads/visual-recognition/640px-IBM_VGA_90X8941_on_PS55.jpg")
	        .build();
	    ClassifiedImages result = service.classify(ClassifyOptions).execute().getResult();
	    System.out.println(
	        "\n******** Classify with the General model ********\n" + result
	            + "\n******** END Classify with the General model ********\n");
	  }

	

}
