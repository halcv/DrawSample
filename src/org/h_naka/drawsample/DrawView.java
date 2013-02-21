package org.h_naka.drawsample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;

public class DrawView extends View {
    private MainActivity m_activity;
    private Paint paint;
    
	public DrawView(Context context) {
		super(context);
        m_activity = (MainActivity)context;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

	public DrawView(Context context,AttributeSet attrs) {
		super(context,attrs);
        m_activity = (MainActivity)context;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
	}
	
	public DrawView(Context context,AttributeSet attrs,int defStyle) {
		super(context,attrs,defStyle);
        m_activity = (MainActivity)context;
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
	}

    protected void onDraw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        
        if (m_activity.getDrawButton().getProcess() == DrawButton.RECTANGLE_PROCESS) { // 四角形の描画
            paint.setColor(Color.argb(255,255,255,0));
            canvas.drawRect(100,200,width - 100,width,paint);
        } else { // 円の描画
            paint.setColor(Color.argb(255,0,255,255));
            canvas.drawCircle((float)(width / 2.0),(float)((height / 2.0) - 100),(float)((width / 2.0) - 100.0),paint);
        }
    }
}