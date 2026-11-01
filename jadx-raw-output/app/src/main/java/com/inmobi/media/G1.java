package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.inmobi.media.videoPlayer.model.VideoViewPosition;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class G1 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f22709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Af f22714f;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G1(Context context) {
        super(context, null);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f22710b = -1;
        this.f22711c = -1;
        this.f22712d = -1;
        this.f22713e = -1;
    }

    public final void setOnPositionChangeListener(Af af2) {
        this.f22714f = af2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i10 != this.f22710b || i11 != this.f22711c || i14 != this.f22712d || i15 != this.f22713e) {
            this.f22710b = i10;
            this.f22711c = i11;
            this.f22712d = i14;
            this.f22713e = i15;
            Af af2 = this.f22714f;
            if (af2 != null) {
                N7 n10 = ((B7) af2).f22407a;
                VideoViewPosition videoViewPosition = new VideoViewPosition();
                videoViewPosition.setX(i10);
                videoViewPosition.setY(i11);
                videoViewPosition.setWidth(F3.a(i14));
                videoViewPosition.setHeight(F3.a(i15));
                n10.a(new C2977k8(videoViewPosition));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float f10 = this.f22709a;
        if (f10 > 0.0f) {
            float f11 = size;
            float f12 = size2;
            if (f11 / f12 > f10) {
                size = (int) (f12 * f10);
            } else {
                size2 = (int) (f11 / f10);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
