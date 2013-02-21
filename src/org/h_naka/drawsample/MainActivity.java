package org.h_naka.drawsample;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {
    private DrawView m_drawView;
    private DrawProcess m_drawProcess;
    private DrawButton m_drawButton;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

        initInstance();
        setButtonEvent();
    }

    public DrawView getDrawView() {
        return m_drawView;
    }

    public DrawButton getDrawButton() {
        return m_drawButton;
    }
    
    private void initInstance() {
        m_drawView = (DrawView)findViewById(R.id.drawView);
        m_drawProcess = new DrawProcess(this);
        m_drawButton = (DrawButton)findViewById(R.id.drawButton);
    }

    private void setButtonEvent() {
        m_drawButton.setOnClickListener(m_drawProcess);
    }
}
