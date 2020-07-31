package com.frizzle.opengldemo;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.view.View;

import com.frizzle.opengldemo.shape.Triangle;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * author: LWJ
 * date: 2020/7/29$
 * description
 */
public class FGLRender implements GLSurfaceView.Renderer {
    private View mView;
    private Triangle triangle;

    public FGLRender(View view) {
        mView=view;
    }

    @Override
    public void onSurfaceCreated(GL10 gl10, EGLConfig eglConfig) {
        //画布清空为黑色
        GLES20.glClearColor(0,0,0,0);
        triangle = new Triangle();
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int width, int height) {
        triangle.onSurfaceChanged(gl10,width,height);
    }

    @Override
    public void onDrawFrame(GL10 gl10) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT | GLES20.GL_DEPTH_BUFFER_BIT);
        triangle.onDrawFrame(gl10);
    }
}
