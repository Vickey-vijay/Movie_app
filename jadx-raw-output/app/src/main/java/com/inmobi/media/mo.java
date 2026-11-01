package com.inmobi.media;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.mo;
import com.safedk.android.internal.partials.InMobiNetworkBridge;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Je f24850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2898h3 f24851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bk.a f24853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public lo f24854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f24855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f24856g;

    public static final void a(mo moVar) {
        ck.p.i("mo", "TAG");
        String str = moVar.f24850a.f22929a;
        moVar.a();
        bk.a aVar = moVar.f24853d;
        if (aVar != null) {
            aVar.invoke();
        }
        moVar.f24853d = null;
    }

    public mo(Je je2, C2898h3 c2898h3, long j10, bk.a aVar) {
        ck.p.j(je2, "mNetworkRequest");
        ck.p.j(c2898h3, "mWebViewClient");
        this.f24850a = je2;
        this.f24851b = c2898h3;
        this.f24852c = j10;
        this.f24853d = aVar;
        this.f24855f = new Handler(Looper.getMainLooper());
    }

    public final void b() {
        try {
            Context context = Ji.f22951a;
            if (context != null) {
                lo loVar = new lo(context);
                loVar.setWebViewClient(this.f24851b);
                loVar.getSettings().setJavaScriptEnabled(true);
                loVar.getSettings().setCacheMode(2);
                this.f24854e = loVar;
            }
            lo loVar2 = this.f24854e;
            if (loVar2 != null) {
                Je je2 = this.f24850a;
                String strA = Se.a(je2.f22929a, je2.f22932d);
                Map mapJ = this.f24850a.f22930b;
                if (mapJ == null) {
                    mapJ = kotlin.collections.a.j();
                }
                InMobiNetworkBridge.webviewLoadUrl(loVar2, strA, mapJ);
            }
            if (this.f24852c > 0) {
                Runnable runnable = new Runnable() { // from class: b7.o9
                    @Override // java.lang.Runnable
                    public final void run() {
                        mo.a(this.f5105b);
                    }
                };
                this.f24855f.postDelayed(runnable, this.f24852c);
                this.f24856g = runnable;
            }
        } catch (Exception e10) {
            ck.p.i("mo", "TAG");
            e10.getMessage();
        }
    }

    public final void a() {
        Runnable runnable = this.f24856g;
        if (runnable != null) {
            this.f24855f.removeCallbacks(runnable);
        }
        this.f24856g = null;
        try {
            Result.a aVar = Result.Companion;
            lo loVar = this.f24854e;
            if (loVar != null && !loVar.f24792a) {
                loVar.stopLoading();
                loVar.removeAllViews();
                loVar.destroy();
            }
            Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        this.f24854e = null;
    }
}
