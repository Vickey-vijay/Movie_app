package com.inmobi.media;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.inmobi.media.AbstractC3320y2;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3320y2 extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj.g f25767a;

    public abstract Ua d();

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3320y2(Context context) {
        super(context);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f25767a = kotlin.b.a(new bk.a() { // from class: b7.lc
            @Override // bk.a
            public final Object invoke() {
                return AbstractC3320y2.a(this.f5046b);
            }
        });
    }

    public final Ua getLandingPageHandler() {
        return (Ua) this.f25767a.getValue();
    }

    public static final Ua a(AbstractC3320y2 abstractC3320y2) {
        return abstractC3320y2.d();
    }
}
