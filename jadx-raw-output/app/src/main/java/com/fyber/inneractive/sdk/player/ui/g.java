package com.fyber.inneractive.sdk.player.ui;

import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.v;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends TextureView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f18075a;

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44970p, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        s sVar = (s) v.a(this.f18075a);
        if (sVar instanceof i) {
            sVar = ((i) sVar).f18076y;
        }
        if (sVar != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(sVar.f18131t.f18583a, 1073741824);
            i11 = View.MeasureSpec.makeMeasureSpec(sVar.f18131t.f18584b, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public g(s sVar) {
        super(sVar.getContext());
        this.f18075a = new WeakReference(sVar);
    }
}
