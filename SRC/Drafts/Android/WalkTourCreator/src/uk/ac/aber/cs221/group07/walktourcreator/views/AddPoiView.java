package uk.ac.aber.cs221.group07.walktourcreator.views;

import uk.ac.aber.cs221.group07.walktourcreator.R;
import uk.ac.aber.cs221.group07.walktourcreator.services.RouteRecorder;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.view.View;

/**
 * 
 * @author HarryBuckley
 *
 */
public class AddPoiView extends PopupView{

	/**
	 * displays an place description input popup, 
	 * and gives it a link to the RouteRecorder 
	 */
	public AddPoiView(RouteRecorder recorder,Activity owner){
		super(null, owner, R.layout.popup_finish_walk);
	}
	/**
	 * creates a PointOfInterst out of the given
	 * data (from text fields) and add the point the the WalkModel 
	 * The parameter v, is the object that called the method.
	 */
	public void submit(View v){
		
	}
	/**
	 * uses ImageHandler to open the photoLibrary,
	 * the selected photo is then added to the PointOfInterest. 
	 * The parameter v, is the object that called the method.
	 */
	public void getPhotoFromLibrary(View v){
		
	}
	/**
	 * uses ImageHandler to open the camera app,
	 * the taken photo is then added to the PointOfInterest. 
	 * The parameter v, is the object that called the method. 
	 */
	public void getPhotoFromCamera(View v){
		
	}


}
