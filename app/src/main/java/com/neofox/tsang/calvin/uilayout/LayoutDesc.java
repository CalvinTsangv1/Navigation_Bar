package com.neofox.tsang.calvin.uilayout;

/**
 * Created by user on 15/4/2018.
 */

public class LayoutDesc {

    public static final float NO_VALUE = Float.NEGATIVE_INFINITY;

    public int format;
    public float x, t, b, w, h;
    public String contentTransfromMatricesString;
    public float offsetInFlow = NO_VALUE;
    public boolean floatsInFlow = false;
    public float offsetToHorizontalKeylineT = NO_VALUE;
    public float offsetToHorizontalKeylineB = NO_VALUE;

    LayoutDesc(int format, float x, float t, float b, float w, float h) {
        this.format = format;
        this.x = x;
        this.t = t;
        this.b = b;
        this.w = w;
        this.h = h;
    }
}
