package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import e5.m;
import g5.g;
import g5.k0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k3.k;
import p3.f;
import p3.i;

/* JADX INFO: loaded from: classes9.dex */
@TargetApi(18)
public class DefaultDrmSession<T extends i> implements DrmSession<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final List<DrmInitData.SchemeData> f19118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.c<T> f19119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f19120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b<T> f19121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, String> f19125h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g<f> f19126i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f19127j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.d f19128k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final UUID f19129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DefaultDrmSession<T>.e f19130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f19131n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f19132o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public HandlerThread f19133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession<T>.c f19134q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public T f19135r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public DrmSession.DrmSessionException f19136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public byte[] f19137t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte[] f19138u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.c.a f19139v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.c.d f19140w;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface a<T extends i> {
        void a(DefaultDrmSession<T> defaultDrmSession);

        void onProvisionCompleted();

        void onProvisionError(Exception exc);
    }

    public interface b<T extends i> {
        void a(DefaultDrmSession<T> defaultDrmSession);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        public final boolean a(Message message, Exception exc) {
            d dVar = (d) message.obj;
            if (!dVar.f19142a) {
                return false;
            }
            int i10 = dVar.f19145d + 1;
            dVar.f19145d = i10;
            if (i10 > DefaultDrmSession.this.f19127j.getMinimumLoadableRetryCount(3)) {
                return false;
            }
            long jB = DefaultDrmSession.this.f19127j.b(3, SystemClock.elapsedRealtime() - dVar.f19143b, exc instanceof IOException ? (IOException) exc : new UnexpectedDrmSessionException(exc), dVar.f19145d);
            if (jB == -9223372036854775807L) {
                return false;
            }
            sendMessageDelayed(Message.obtain(message), jB);
            return true;
        }

        public void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objB = defaultDrmSession.f19128k.b(defaultDrmSession.f19129l, (com.google.android.exoplayer2.drm.c.d) dVar.f19144c);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                    objB = defaultDrmSession2.f19128k.a(defaultDrmSession2.f19129l, (com.google.android.exoplayer2.drm.c.a) dVar.f19144c);
                }
            } catch (Exception e10) {
                boolean zA = a(message, e10);
                objB = e10;
                if (zA) {
                    return;
                }
            }
            DefaultDrmSession.this.f19130m.obtainMessage(message.what, Pair.create(dVar.f19144c, objB)).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                DefaultDrmSession.this.p(obj, obj2);
            } else {
                if (i10 != 1) {
                    return;
                }
                DefaultDrmSession.this.l(obj, obj2);
            }
        }
    }

    public void o(int i10) {
        if (i10 != 2) {
            return;
        }
        n();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f19142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f19143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f19144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f19145d;

        public d(boolean z10, long j10, Object obj) {
            this.f19142a = z10;
            this.f19143b = j10;
            this.f19144c = obj;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire() {
        g5.a.f(this.f19132o >= 0);
        int i10 = this.f19132o + 1;
        this.f19132o = i10;
        if (i10 == 1) {
            g5.a.f(this.f19131n == 2);
            HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
            this.f19133p = handlerThread;
            handlerThread.start();
            this.f19134q = new c(this.f19133p.getLooper());
            if (q(true)) {
                f(true);
            }
        }
    }

    public final void f(boolean z10) {
        if (this.f19124g) {
            return;
        }
        byte[] bArr = (byte[]) k0.i(this.f19137t);
        int i10 = this.f19122e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f19138u == null || t()) {
                    r(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            g5.a.e(this.f19138u);
            g5.a.e(this.f19137t);
            if (t()) {
                r(this.f19138u, 3, z10);
                return;
            }
            return;
        }
        if (this.f19138u == null) {
            r(bArr, 1, z10);
            return;
        }
        if (this.f19131n == 4 || t()) {
            long jG = g();
            if (this.f19122e != 0 || jG > 60) {
                if (jG <= 0) {
                    k(new KeysExpiredException());
                    return;
                } else {
                    this.f19131n = 4;
                    this.f19126i.b(new p3.b());
                    return;
                }
            }
            g5.m.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jG);
            r(bArr, 2, z10);
        }
    }

    public final long g() {
        if (!k.f62192d.equals(this.f19129l)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) g5.a.e(p3.k.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final DrmSession.DrmSessionException getError() {
        if (this.f19131n == 1) {
            return this.f19136s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public final T getMediaCrypto() {
        return this.f19135r;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f19131n;
    }

    public boolean h(byte[] bArr) {
        return Arrays.equals(this.f19137t, bArr);
    }

    public final boolean i() {
        int i10 = this.f19131n;
        return i10 == 3 || i10 == 4;
    }

    public final void k(final Exception exc) {
        this.f19136s = new DrmSession.DrmSessionException(exc);
        this.f19126i.b(new g.a() { // from class: p3.e
            @Override // g5.g.a
            public final void a(Object obj) {
                ((f) obj).onDrmSessionManagerError(exc);
            }
        });
        if (this.f19131n != 4) {
            this.f19131n = 1;
        }
    }

    public final void l(Object obj, Object obj2) {
        if (obj == this.f19139v && i()) {
            this.f19139v = null;
            if (obj2 instanceof Exception) {
                m((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f19122e == 3) {
                    this.f19119b.provideKeyResponse((byte[]) k0.i(this.f19138u), bArr);
                    this.f19126i.b(new p3.b());
                    return;
                }
                byte[] bArrProvideKeyResponse = this.f19119b.provideKeyResponse(this.f19137t, bArr);
                int i10 = this.f19122e;
                if ((i10 == 2 || (i10 == 0 && this.f19138u != null)) && bArrProvideKeyResponse != null && bArrProvideKeyResponse.length != 0) {
                    this.f19138u = bArrProvideKeyResponse;
                }
                this.f19131n = 4;
                this.f19126i.b(new g.a() { // from class: p3.d
                    @Override // g5.g.a
                    public final void a(Object obj3) {
                        ((f) obj3).onDrmKeysLoaded();
                    }
                });
            } catch (Exception e10) {
                m(e10);
            }
        }
    }

    public final void m(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f19120c.a(this);
        } else {
            k(exc);
        }
    }

    public final void n() {
        if (this.f19122e == 0 && this.f19131n == 4) {
            k0.i(this.f19137t);
            f(false);
        }
    }

    public final void p(Object obj, Object obj2) {
        if (obj == this.f19140w) {
            if (this.f19131n == 2 || i()) {
                this.f19140w = null;
                if (obj2 instanceof Exception) {
                    this.f19120c.onProvisionError((Exception) obj2);
                    return;
                }
                try {
                    this.f19119b.provideProvisionResponse((byte[]) obj2);
                    this.f19120c.onProvisionCompleted();
                } catch (Exception e10) {
                    this.f19120c.onProvisionError(e10);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return this.f19123f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        byte[] bArr = this.f19137t;
        if (bArr == null) {
            return null;
        }
        return this.f19119b.queryKeyStatus(bArr);
    }

    public final void r(byte[] bArr, int i10, boolean z10) {
        try {
            this.f19139v = this.f19119b.getKeyRequest(bArr, this.f19118a, i10, this.f19125h);
            ((c) k0.i(this.f19134q)).b(1, g5.a.e(this.f19139v), z10);
        } catch (Exception e10) {
            m(e10);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release() {
        int i10 = this.f19132o - 1;
        this.f19132o = i10;
        if (i10 == 0) {
            this.f19131n = 0;
            ((e) k0.i(this.f19130m)).removeCallbacksAndMessages(null);
            ((c) k0.i(this.f19134q)).removeCallbacksAndMessages(null);
            this.f19134q = null;
            ((HandlerThread) k0.i(this.f19133p)).quit();
            this.f19133p = null;
            this.f19135r = null;
            this.f19136s = null;
            this.f19139v = null;
            this.f19140w = null;
            byte[] bArr = this.f19137t;
            if (bArr != null) {
                this.f19119b.closeSession(bArr);
                this.f19137t = null;
                this.f19126i.b(new g.a() { // from class: p3.c
                    @Override // g5.g.a
                    public final void a(Object obj) {
                        ((f) obj).k();
                    }
                });
            }
            this.f19121d.a(this);
        }
    }

    public void s() {
        this.f19140w = this.f19119b.getProvisionRequest();
        ((c) k0.i(this.f19134q)).b(0, g5.a.e(this.f19140w), true);
    }

    public final boolean t() {
        try {
            this.f19119b.restoreKeys(this.f19137t, this.f19138u);
            return true;
        } catch (Exception e10) {
            g5.m.d("DefaultDrmSession", "Error trying to restore keys.", e10);
            k(e10);
            return false;
        }
    }

    public DefaultDrmSession(UUID uuid, com.google.android.exoplayer2.drm.c<T> cVar, a<T> aVar, b<T> bVar, @Nullable List<DrmInitData.SchemeData> list, int i10, boolean z10, boolean z11, @Nullable byte[] bArr, HashMap<String, String> map, com.google.android.exoplayer2.drm.d dVar, Looper looper, g<f> gVar, m mVar) {
        if (i10 == 1 || i10 == 3) {
            g5.a.e(bArr);
        }
        this.f19129l = uuid;
        this.f19120c = aVar;
        this.f19121d = bVar;
        this.f19119b = cVar;
        this.f19122e = i10;
        this.f19123f = z10;
        this.f19124g = z11;
        if (bArr != null) {
            this.f19138u = bArr;
            this.f19118a = null;
        } else {
            this.f19118a = Collections.unmodifiableList((List) g5.a.e(list));
        }
        this.f19125h = map;
        this.f19128k = dVar;
        this.f19126i = gVar;
        this.f19127j = mVar;
        this.f19131n = 2;
        this.f19130m = new e(looper);
    }

    public final boolean q(boolean z10) {
        if (i()) {
            return true;
        }
        try {
            byte[] bArrOpenSession = this.f19119b.openSession();
            this.f19137t = bArrOpenSession;
            this.f19135r = (T) this.f19119b.createMediaCrypto(bArrOpenSession);
            this.f19126i.b(new g.a() { // from class: p3.a
                @Override // g5.g.a
                public final void a(Object obj) {
                    ((f) obj).i();
                }
            });
            this.f19131n = 3;
            g5.a.e(this.f19137t);
            return true;
        } catch (NotProvisionedException e10) {
            if (z10) {
                this.f19120c.a(this);
                return false;
            }
            k(e10);
            return false;
        } catch (Exception e11) {
            k(e11);
            return false;
        }
    }
}
