package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3089ok;
import java.util.HashMap;
import java.util.Timer;

/* JADX INFO: renamed from: com.inmobi.media.ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3089ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2995l1 f25007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f25008b;

    public final boolean a(byte b10, long j10) {
        ck.p.i("ok", "TAG");
        if (this.f25008b.containsKey(Byte.valueOf(b10))) {
            a(b10);
        }
        try {
            Timer timer = new Timer("ok");
            this.f25008b.put(Byte.valueOf(b10), timer);
            timer.schedule(new C3064nk(this, b10), j10);
            return true;
        } catch (InternalError e10) {
            ck.p.i("ok", "TAG");
            e10.toString();
            return false;
        }
    }

    public C3089ok(AbstractC2995l1 abstractC2995l1) {
        ck.p.j(abstractC2995l1, "timeOutInformer");
        this.f25007a = abstractC2995l1;
        this.f25008b = new HashMap();
    }

    public final void b(final byte b10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b7.x9
            @Override // java.lang.Runnable
            public final void run() {
                C3089ok.a(this.f5252b, b10);
            }
        });
    }

    public static final void a(C3089ok c3089ok, byte b10) {
        c3089ok.f25007a.a(b10);
    }

    public final void a(byte b10) {
        ck.p.i("ok", "TAG");
        Timer timer = (Timer) this.f25008b.get(Byte.valueOf(b10));
        if (timer != null) {
            timer.cancel();
            this.f25008b.remove(Byte.valueOf(b10));
        }
    }
}
