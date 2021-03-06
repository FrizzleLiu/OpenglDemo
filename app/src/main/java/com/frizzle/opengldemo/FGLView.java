package com.frizzle.opengldemo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * author: LWJ
 * date: 2020/7/29$
 * description
 */
public class FGLView extends GLSurfaceView {
    public FGLView(Context context) {
        super(context);
    }

    public FGLView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //设置opengl的版本
        setEGLContextClientVersion(2);
        setRenderer(new FGLRender(this));
        //设置渲染模式
        // 两种 这里采用按需渲染(需要自己调用渲染)  还有一种RENDERMODE_CONTINUOUSLY表示实时渲染
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
