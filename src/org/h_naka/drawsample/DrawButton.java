package org.h_naka.drawsample;

import android.content.Context;
import android.widget.Button;
import android.util.AttributeSet;
//import android.util.Log;

public class DrawButton extends Button {
    
    private int m_process;
    public static final int RECTANGLE_PROCESS = 0;
    public static final int CIRCLE_PROCESS = 1;
    
	public DrawButton(Context context) {
		super(context);
        m_process = RECTANGLE_PROCESS;
    }

	public DrawButton(Context context,AttributeSet attrs) {
		super(context,attrs);
        m_process = RECTANGLE_PROCESS;
	}

    public DrawButton(Context context,AttributeSet attrs,int defStyle) {
		super(context,attrs,defStyle);
        m_process = RECTANGLE_PROCESS;
	}

    public void changeText() {
        String str = "";
        switch(m_process) {
        case RECTANGLE_PROCESS:
            m_process = CIRCLE_PROCESS;
            str = getResources().getString(R.string.rectangle);
            break;
        case CIRCLE_PROCESS:
            m_process = RECTANGLE_PROCESS;
            str = getResources().getString(R.string.circle);
            break;
        }
        setText(str);
    }

    public int getProcess() {
        return m_process;
    }
}
