package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C3534j5 implements C7 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f29241e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static C3534j5 f29242f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerC3517i5 f29243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f29244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Thread f29245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f29246d;

    public static synchronized C3534j5 a(String str, V7 v10, JSONObject jSONObject) {
        if (f29242f == null) {
            f29242f = new C3534j5(str, v10, jSONObject);
        }
        return f29242f;
    }

    private Thread b(C8 c10, String str, int i10, int i11, Handler handler) {
        if (i10 <= 0) {
            i10 = this.f29244b.optInt("connectionTimeout", 5);
        }
        if (i11 <= 0) {
            i11 = this.f29244b.optInt("readTimeout", 5);
        }
        boolean zOptBoolean = this.f29244b.optBoolean(C3462f4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C3481g5(c10, str, (int) timeUnit.toMillis(i10), (int) timeUnit.toMillis(i11), zOptBoolean, b()), handler);
    }

    public synchronized void d() {
        f29242f = null;
        HandlerC3517i5 handlerC3517i5 = this.f29243a;
        if (handlerC3517i5 != null) {
            handlerC3517i5.a();
            this.f29243a = null;
        }
    }

    public boolean c() {
        Thread thread = this.f29245c;
        return thread != null && thread.isAlive();
    }

    private C3534j5(String str, V7 v10, JSONObject jSONObject) {
        this.f29246d = str;
        this.f29243a = new HandlerC3517i5(v10.a());
        this.f29244b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    @Override // com.ironsource.C7
    public void a(Oc oc2) {
        this.f29243a.a(oc2);
    }

    private Thread a(C3481g5 c3481g5, Handler handler) {
        return new Thread(new RunnableC3687rf(c3481g5, handler));
    }

    @Override // com.ironsource.C7
    public void a(C8 c10, String str, int i10, int i11, Handler handler) {
        b(c10, str, i10, i11, handler).start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f29246d, "temp");
    }

    @Override // com.ironsource.C7
    public void a(C8 c10, String str, int i10, int i11) {
        b(c10, str, i10, i11, this.f29243a).start();
    }

    @Override // com.ironsource.C7
    public void a(C8 c10, String str) {
        int iOptInt = this.f29244b.optInt("connectionTimeout", 5);
        int iOptInt2 = this.f29244b.optInt("readTimeout", 5);
        boolean zOptBoolean = this.f29244b.optBoolean(C3462f4.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread threadA = a(new C3481g5(c10, str, (int) timeUnit.toMillis(iOptInt), (int) timeUnit.toMillis(iOptInt2), zOptBoolean, b()), this.f29243a);
        this.f29245c = threadA;
        threadA.start();
    }

    public String a() {
        return this.f29246d;
    }
}
