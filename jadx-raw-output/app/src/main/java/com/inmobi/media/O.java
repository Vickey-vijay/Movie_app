package com.inmobi.media;

import android.graphics.RectF;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public final class O implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f23260a;

    public O(U u10) {
        this.f23260a = u10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float fHeight;
        E6 e10;
        M mA = U.a(this.f23260a);
        U u10 = this.f23260a;
        u10.getClass();
        ArrayList arrayList = null;
        if (mA == null) {
            e10 = new E6(0.0f, null, null);
        } else {
            RectF rectF = mA.f23118a;
            if (rectF.isEmpty()) {
                e10 = new E6(0.0f, null, null);
            } else {
                float measuredHeight = u10.f23593a.getMeasuredHeight() * u10.f23593a.getMeasuredWidth();
                if (measuredHeight <= 0.0f) {
                    e10 = new E6(0.0f, null, null);
                } else {
                    ArrayList<RectF> arrayList2 = new ArrayList();
                    int[] iArr = new int[2];
                    u10.f23593a.getLocationInWindow(iArr);
                    Pair pair = new Pair(Float.valueOf(iArr[0]), Float.valueOf(iArr[1]));
                    float fFloatValue = ((Number) pair.component1()).floatValue();
                    float fFloatValue2 = ((Number) pair.component2()).floatValue();
                    for (RectF rectF2 : mA.f23119b) {
                        arrayList2.add(new RectF(rectF2.left - fFloatValue, rectF2.top - fFloatValue2, rectF2.right - fFloatValue, rectF2.bottom - fFloatValue2));
                    }
                    ArrayList<RectF> arrayList3 = mA.f23119b;
                    if (arrayList3.isEmpty()) {
                        fHeight = 0.0f;
                    } else {
                        fHeight = 0.0f;
                        for (RectF rectF3 : arrayList3) {
                            fHeight += rectF3.height() * rectF3.width();
                        }
                    }
                    float fMin = Math.min(fHeight, measuredHeight);
                    RectF rectF4 = new RectF(rectF);
                    float fWidth = rectF4.width();
                    float fHeight2 = rectF4.height();
                    float fA = F3.a(Math.min((Math.max(0.0f, ((fWidth <= 0.0f || fHeight2 <= 0.0f) ? 0.0f : Math.max(0.0f, fWidth * fHeight2)) - fMin) / measuredHeight) * 100.0f, 100.0f));
                    F6 f10 = new F6(Math.max(0.0f, F3.a(rectF.left / J5.b())), Math.max(0.0f, F3.a(rectF.top / J5.b())), Math.max(0, F3.b(rectF.width() / J5.b())), Math.max(0, F3.b(rectF.height() / J5.b())));
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(nj.t.v(arrayList2, 10));
                        for (RectF rectF5 : arrayList2) {
                            arrayList4.add(new F6(Math.max(0.0f, F3.a(rectF5.left / J5.b())), Math.max(0.0f, F3.a(rectF5.top / J5.b())), Math.max(0, F3.b(rectF5.width() / J5.b())), Math.max(0, F3.b(F3.b(rectF5.height()) / J5.b()))));
                        }
                        arrayList = new ArrayList(nj.b0.H0(arrayList4, new P()));
                    }
                    e10 = new E6(fA, f10, arrayList);
                }
            }
        }
        U u11 = this.f23260a;
        if (ck.p.e(e10, u11.f23600h)) {
            return;
        }
        ((Sh) u11.f23596d).a(e10);
        u11.f23600h = e10;
    }
}
