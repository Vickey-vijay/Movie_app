package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.os.Handler;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RelativeLayout f18361b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f18368i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18362c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18363d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18364e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18365f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18366g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18367h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f18369j = new b(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.j f18360a = new com.fyber.inneractive.sdk.util.j(4, new c());

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    public final void a() {
        boolean z10;
        String str;
        IAlog.a("IAVisibilityTracker: onCheckVisibility", new Object[0]);
        float f10 = this.f18363d / 100.0f;
        com.fyber.inneractive.sdk.util.j jVar = this.f18360a;
        Object objPoll = jVar.f18585a.poll();
        if (objPoll == null) {
            objPoll = jVar.f18586b.a();
        }
        Rect rect = (Rect) objPoll;
        RelativeLayout relativeLayout = this.f18361b;
        float fWidth = (relativeLayout.getParent() != null && relativeLayout.isShown() && relativeLayout.hasWindowFocus() && relativeLayout.getGlobalVisibleRect(rect)) ? (rect.width() * rect.height()) / (relativeLayout.getWidth() * relativeLayout.getHeight()) : 0.0f;
        this.f18360a.f18585a.offer(rect);
        this.f18362c = fWidth;
        if (fWidth >= f10) {
            float f11 = this.f18364e * 1000.0f;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f18365f;
            if (f11 >= jCurrentTimeMillis - j10 || j10 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        IAlog.a("BannerVisibilityTracker | visible = %s, minVis = %f", Boolean.valueOf(z10), Float.valueOf(f10));
        if (!z10 || !this.f18366g) {
            if (this.f18366g) {
                float f12 = this.f18362c;
                if (f12 < f10) {
                    this.f18365f = 0L;
                } else if (f12 >= f10 && this.f18365f == 0) {
                    this.f18365f = System.currentTimeMillis();
                }
                Handler handler = com.fyber.inneractive.sdk.util.r.f18607b;
                handler.removeCallbacks(this.f18369j);
                handler.postDelayed(this.f18369j, 50L);
                return;
            }
            return;
        }
        if (this.f18368i == null || this.f18367h) {
            return;
        }
        this.f18367h = true;
        IAlog.a("BannerVisibilityTracker | firing viewable", new Object[0]);
        l lVar = this.f18368i.f18374a;
        lVar.getClass();
        try {
            com.fyber.inneractive.sdk.flow.x xVar = lVar.f15333b;
            if (xVar == null || ((q0) xVar).f15747b == null || (str = ((com.fyber.inneractive.sdk.response.f) ((q0) xVar).f15747b).f18455x) == null || str.trim().length() <= 0) {
                return;
            }
            IAlog.e("%sfiring banner mrc visibility impression!", IAlog.a(lVar));
            IAlog.d("MRC_VISIBILITY_IMPRESSION", new Object[0]);
            z0.b(str);
        } catch (Exception unused) {
        }
    }

    public d(com.fyber.inneractive.sdk.response.f fVar, RelativeLayout relativeLayout, g gVar) {
        this.f18361b = relativeLayout;
        this.f18368i = gVar;
    }
}
