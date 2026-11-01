package com.android.cast.dlna.dmc;

import android.content.Intent;
import ck.p;
import fn.c;
import gn.d;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;
import v.b;
import yn.s;

/* JADX INFO: compiled from: DLNACastService.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DLNACastService extends AndroidUpnpServiceImpl {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f6199d = b.f73000b.a("CastService");

    /* JADX INFO: compiled from: DLNACastService.kt */
    public static final class a extends d {
        @Override // fn.a, fn.c
        public s[] q() {
            w.a aVar = w.a.f73245b;
            return new s[]{aVar.l(), aVar.n(), aVar.m(), aVar.k()};
        }
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl
    public c a() {
        return new a();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onCreate() {
        b.f(this.f6199d, "DLNACastService onCreate", null, 2, null);
        super.onCreate();
    }

    @Override // org.fourthline.cling.android.AndroidUpnpServiceImpl, android.app.Service
    public void onDestroy() {
        b.i(this.f6199d, "DLNACastService onDestroy", null, 2, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        p.j(intent, "intent");
        b.f(this.f6199d, "DLNACastService onStartCommand: " + i10 + ", " + i11 + ", " + intent, null, 2, null);
        return super.onStartCommand(intent, i10, i11);
    }
}
