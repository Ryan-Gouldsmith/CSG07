package uk.ac.aber.cs221.group07.walktourcreator.views;

import uk.ac.aber.cs221.group07.walktourcreator.R;
import uk.ac.aber.cs221.group07.walktourcreator.activities.WalkScreen;
import uk.ac.aber.cs221.group07.walktourcreator.model.WalkModel;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class EditWalkView extends DialogView{

	private WalkModel walk;
	private LayoutInflater inflater;
	private View layout;
	
	public EditWalkView(WalkScreen context, int viewLayout,WalkModel w) {
		super(context, viewLayout);
		inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layout = inflater.inflate(viewLayout, null); 
		walk = w;
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		
	}
	
	public void editWalk(){
		TextView walkTitle = (TextView)layout.findViewById(R.id.edit_walk_title);
		TextView shortDesc = (TextView)layout.findViewById(R.id.edit_walk_short_description);
		TextView longDesc = (TextView)layout.findViewById(R.id.edit_walk_long_description);
		walk.setTitle(walkTitle.toString());
		walk.setShortDescription(shortDesc.toString());
		walk.setLongDescription(longDesc.toString());
	}

}
