package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1763Zq implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC1764Zr A00;

    public ViewOnTouchListenerC1763Zq(ViewOnClickListenerC1764Zr viewOnClickListenerC1764Zr) {
        this.A00 = viewOnClickListenerC1764Zr;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
