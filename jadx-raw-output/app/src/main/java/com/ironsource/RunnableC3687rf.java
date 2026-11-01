package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
class RunnableC3687rf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f30630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3481g5 f30631b;

    public CallableC3410c6 a(C3481g5 c3481g5, String str, long j10) {
        return new CallableC3410c6(c3481g5, str, j10);
    }

    public Message a() {
        return new Message();
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C8 c10 = new C8(this.f30631b.b().getParent(), this.f30631b.b().getName());
        Message messageA = a();
        messageA.obj = c10;
        String strA = a(c10.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.f30630a.sendMessage(messageA);
        } else {
            C3499h5 c3499h5Call = a(new C3481g5(c10, this.f30631b.e(), this.f30631b.a(), this.f30631b.c(), this.f30631b.f(), this.f30631b.d()), strA, 3L).call();
            messageA.what = c3499h5Call.b() == 200 ? 1016 : c3499h5Call.b();
            this.f30630a.sendMessage(messageA);
        }
    }

    public RunnableC3687rf(C3481g5 c3481g5, Handler handler) {
        this.f30631b = c3481g5;
        this.f30630a = handler;
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
