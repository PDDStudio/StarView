package com.pddstudio.starview;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.graphics.Color;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

import com.pddstudio.starview.opengl.ParticleSystemRenderer;

/**
 * This Class was created by Patrick J
 * on 02.02.16. For more Details and Licensing
 * have a look at the README.md
 */
public class StarView extends GLSurfaceView {

    private ActivityManager activityManager;
    private ConfigurationInfo configurationInfo;
    private boolean supportsEs2;

    public StarView(Context context) {
        super(context);

        if(!isInEditMode()) {

            activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            configurationInfo = activityManager.getDeviceConfigurationInfo();
            supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000;

            if (supportsEs2) {
                // Request an OpenGL ES 2.0 compatible context.
                this.setEGLContextClientVersion(2);

                // Set the renderer to our demo renderer, defined below.
                ParticleSystemRenderer mRenderer = new ParticleSystemRenderer(this);
                this.setRenderer(mRenderer);
                this.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
            } else {
                if(!isInEditMode()) throw new UnsupportedOperationException();
            }

        }

    }

    public StarView(Context context, AttributeSet attrs) {
        super(context, attrs);

        if(!isInEditMode()) {

            activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            configurationInfo = activityManager.getDeviceConfigurationInfo();
            supportsEs2 = configurationInfo.reqGlEsVersion >= 0x20000;

            if (supportsEs2) {
                // Request an OpenGL ES 2.0 compatible context.
                this.setEGLContextClientVersion(2);

                // Set the renderer to our demo renderer, defined below.
                ParticleSystemRenderer mRenderer = new ParticleSystemRenderer(this);
                this.setRenderer(mRenderer);
                this.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
            } else {
                if(!isInEditMode()) throw new UnsupportedOperationException();
            }

        }

    }


}
