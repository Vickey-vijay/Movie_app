package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2933id implements InterfaceC3061nh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2957jd f24555a;

    @Override // com.inmobi.media.InterfaceC3061nh
    public final boolean a() {
        long userTouchResetTime = this.f24555a.f24602a.f24670b.f22692a.f25028b.getRendering().getUserTouchResetTime();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f24555a.f24603b;
        return j10 != 0 && jElapsedRealtime - j10 < userTouchResetTime;
    }

    public C2933id(C2957jd c2957jd) {
        this.f24555a = c2957jd;
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final boolean c() {
        return !this.f24555a.f24602a.f24670b.f22692a.f25028b.getRendering().getAutoRedirectionEnforcement() || a();
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final long getViewTouchTimestamp() {
        return this.f24555a.f24603b;
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final void a(String str) {
        ck.p.j(str, "api");
        Map mapA = AbstractC2939ik.a(this.f24555a.f24602a.f24673e.f22517a);
        Wj wj2 = Wj.f23753a;
        Wj.b("BlockAutoRedirection", mapA, EnumC2735ak.SDK);
    }
}
