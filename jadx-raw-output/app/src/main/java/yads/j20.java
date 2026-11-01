package yads;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class j20 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b20 f78896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj3 f78897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh3 f78898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final db1 f78899d = new db1(new c20());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78900e;

    @Override // yads.yj3
    public final void a(float f10) {
    }

    @Override // yads.yj3
    public final void a(View view, List list) {
    }

    @Override // yads.yj3
    public final void a(jf3 jf3Var) {
    }

    @Override // yads.yj3
    public final void a(xj3 xj3Var) {
        String str;
        int iOrdinal = xj3Var.ordinal();
        if (iOrdinal == 0) {
            str = "firstQuartile";
        } else if (iOrdinal == 1) {
            str = CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "thirdQuartile";
        }
        this.f78897b.a(this.f78896a, str);
    }

    @Override // yads.yj3
    public final void f() {
    }

    @Override // yads.yj3
    public final void g() {
    }

    @Override // yads.yj3
    public final void j() {
    }

    @Override // yads.yj3
    public final void k() {
        this.f78900e = false;
    }

    @Override // yads.yj3
    public final void n() {
    }

    @Override // yads.yj3
    public final void b() {
        this.f78897b.a(this.f78896a, "complete");
    }

    @Override // yads.yj3
    public final void c() {
        this.f78897b.a(this.f78896a, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    @Override // yads.yj3
    public final void d() {
        this.f78897b.a(this.f78896a, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    @Override // yads.yj3
    public final void h() {
        this.f78897b.a(this.f78896a, "creativeView");
    }

    @Override // yads.yj3
    public final void i() {
        this.f78897b.a(new g20(this.f78896a), "creativeRenderingStart");
    }

    @Override // yads.yj3
    public final void l() {
        this.f78897b.a(this.f78896a, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    }

    @Override // yads.yj3
    public final void m() {
        if (!this.f78900e) {
            this.f78900e = true;
            this.f78897b.a(this.f78896a, "start");
        }
        this.f78897b.a(this.f78896a, "clickTracking");
    }

    public j20(b20 b20Var, wj3 wj3Var, mh3 mh3Var) {
        this.f78896a = b20Var;
        this.f78897b = wj3Var;
        this.f78898c = mh3Var;
    }

    @Override // yads.yj3
    public final void a(float f10, long j10) {
        if (this.f78900e) {
            return;
        }
        this.f78900e = true;
        this.f78897b.a(this.f78896a, "start");
    }

    @Override // yads.yj3
    public final void a() {
        this.f78897b.a(this.f78896a, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    }
}
