package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.ko;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw implements View.OnTouchListener {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f11398lh = 10;
    private int fkw;
    private float ouw;
    private float vt;
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno yu;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private RectF f11399le = new RectF();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private long f11400ra = 0;
    private final int pno = 200;
    private final int bly = 3;
    private SoftReference<ViewGroup> tlj = new SoftReference<>(null);

    public ouw(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i10, final ViewGroup viewGroup) {
        this.fkw = f11398lh;
        this.yu = pnoVar;
        if (i10 > 0) {
            this.fkw = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.tlj = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RectF rectF;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF2 = this.f11399le;
                if (rectF2 != null && !rectF2.contains(this.ouw, this.vt)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float fAbs = Math.abs(rawX - this.ouw);
                float fAbs2 = Math.abs(rawY - this.vt);
                int i10 = this.fkw;
                if (fAbs >= i10 && fAbs2 >= i10) {
                    com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2 = this.yu;
                    if (pnoVar2 != null) {
                        pnoVar2.ouw();
                    }
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f11400ra;
                    ko.vt("limittouch", "d:" + jCurrentTimeMillis + " a:" + fAbs + " b:" + fAbs2);
                    if ((jCurrentTimeMillis < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (pnoVar = this.yu) != null) {
                        pnoVar.ouw();
                    }
                }
            }
        } else {
            ViewGroup viewGroup = this.tlj.get();
            if (viewGroup == null) {
                rectF = new RectF();
            } else {
                int[] iArr = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                rectF = new RectF(i11, iArr[1], i11 + viewGroup.getWidth(), iArr[1] + viewGroup.getHeight());
            }
            this.f11399le = rectF;
            this.ouw = motionEvent.getRawX();
            this.vt = motionEvent.getRawY();
            this.f11400ra = System.currentTimeMillis();
        }
        return true;
    }
}
