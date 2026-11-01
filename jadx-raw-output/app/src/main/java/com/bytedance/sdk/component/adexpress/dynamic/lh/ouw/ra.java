package com.bytedance.sdk.component.adexpress.dynamic.lh.ouw;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes8.dex */
public final class ra implements View.OnTouchListener {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f11404lh = 10;
    private int fkw;
    private float ouw;
    private float vt;
    private com.bytedance.sdk.component.adexpress.dynamic.lh.pno yu;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private RectF f11405le = new RectF();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private long f11406ra = 0;
    private final int pno = 200;
    private final int bly = 3;
    private SoftReference<View> tlj = new SoftReference<>(null);

    public ra(com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar, int i10, final ViewGroup viewGroup) {
        this.fkw = f11404lh;
        this.yu = pnoVar;
        if (i10 > 0) {
            this.fkw = i10;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.lh.ouw.ra.1
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindViewById = viewGroup.findViewById(2097610746);
                    ra.this.tlj = new SoftReference(viewFindViewById);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        RectF rectF;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar;
        com.bytedance.sdk.component.adexpress.dynamic.lh.pno pnoVar2;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF2 = this.f11405le;
                if (rectF2 != null && !rectF2.contains(this.ouw, this.vt)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float fAbs = Math.abs(rawX - this.ouw);
                float fAbs2 = Math.abs(rawY - this.vt);
                int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), Math.abs(rawX - this.ouw));
                int i10 = f11404lh;
                if (fAbs >= i10 && fAbs2 >= i10) {
                    if (rawX > this.ouw && iVt > this.fkw && (pnoVar2 = this.yu) != null) {
                        pnoVar2.ouw();
                    }
                } else if ((System.currentTimeMillis() - this.f11406ra < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (pnoVar = this.yu) != null) {
                    pnoVar.ouw();
                }
            }
        } else {
            View view2 = this.tlj.get();
            if (view2 == null) {
                rectF = new RectF();
            } else {
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                int i11 = iArr[0];
                rectF = new RectF(i11, iArr[1], i11 + view2.getWidth(), iArr[1] + view2.getHeight());
            }
            this.f11405le = rectF;
            this.ouw = motionEvent.getRawX();
            this.vt = motionEvent.getRawY();
            this.f11406ra = System.currentTimeMillis();
        }
        return true;
    }
}
