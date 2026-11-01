package com.pgl.ssdk;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class ao implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f43246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f43248c;

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f43247b == 222) {
                ak.a(this.f43246a).a();
            }
            byte[] bArr = (byte[]) com.pgl.ssdk.ces.a.meta(this.f43247b, this.f43246a, this.f43248c);
            if (bArr == null || bArr.length <= 0) {
                return;
            }
            new ap(this.f43246a, this.f43247b).a(1, 2, bArr);
        } catch (Throwable unused) {
        }
    }

    public ao(Context context, int i10, Object[] objArr) {
        this.f43246a = context;
        this.f43247b = i10;
        this.f43248c = objArr;
    }
}
