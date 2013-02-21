package org.h_naka.drawsample;

import android.view.View;
import android.view.View.OnClickListener;
//import android.util.Log;

public class DrawProcess implements OnClickListener {
    private MainActivity m_activity;
    
    public DrawProcess(MainActivity activity) {
        m_activity = activity;
    }

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.drawButton) {
            onDrawButtonClicked();
        }
	}

    private void onDrawButtonClicked() {
        m_activity.getDrawButton().changeText();
        m_activity.getDrawView().invalidate();
    }
}
