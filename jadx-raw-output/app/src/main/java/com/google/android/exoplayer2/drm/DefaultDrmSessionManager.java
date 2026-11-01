package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import e5.m;
import g5.g;
import g5.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import k3.k;
import p3.f;
import p3.i;
import p3.j;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(18)
public class DefaultDrmSessionManager<T extends i> implements com.google.android.exoplayer2.drm.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f19147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.c.InterfaceC0177c<T> f19148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f19149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, String> f19150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g<f> f19151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f19153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19154i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f19155j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DefaultDrmSession<T>> f19156k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DefaultDrmSession<T>> f19157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f19158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer2.drm.c<T> f19159n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession<T> f19160o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public DefaultDrmSession<T> f19161p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Looper f19162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public byte[] f19164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public volatile DefaultDrmSessionManager<T>.c f19165t;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public class b implements com.google.android.exoplayer2.drm.c.b<T> {
        public b() {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f19156k) {
                if (defaultDrmSession.h(bArr)) {
                    defaultDrmSession.o(message.what);
                    return;
                }
            }
        }
    }

    public static List<DrmInitData.SchemeData> l(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f19171e);
        for (int i10 = 0; i10 < drmInitData.f19171e; i10++) {
            DrmInitData.SchemeData schemeDataE = drmInitData.e(i10);
            if ((schemeDataE.e(uuid) || (k.f62191c.equals(uuid) && schemeDataE.e(k.f62190b))) && (schemeDataE.f19176f != null || z10)) {
                arrayList.add(schemeDataE);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.a
    public boolean b(DrmInitData drmInitData) {
        if (this.f19164s != null) {
            return true;
        }
        if (l(drmInitData, this.f19147b, true).isEmpty()) {
            if (drmInitData.f19171e != 1 || !drmInitData.e(0).e(k.f62190b)) {
                return false;
            }
            g5.m.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f19147b);
        }
        String str = drmInitData.f19170d;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || k0.f53108a >= 25;
    }

    public final void i(Handler handler, f fVar) {
        this.f19151f.a(handler, fVar);
    }

    public final void j(Looper looper) {
        Looper looper2 = this.f19162q;
        g5.a.f(looper2 == null || looper2 == looper);
        this.f19162q = looper;
    }

    public final DefaultDrmSession<T> k(@Nullable List<DrmInitData.SchemeData> list, boolean z10) {
        g5.a.e(this.f19159n);
        return new DefaultDrmSession<>(this.f19147b, this.f19159n, null, new DefaultDrmSession.b() { // from class: p3.h
            @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
            public final void a(DefaultDrmSession defaultDrmSession) {
                this.f65877a.o(defaultDrmSession);
            }
        }, list, this.f19163r, this.f19154i | z10, z10, this.f19164s, this.f19150e, this.f19149d, (Looper) g5.a.e(this.f19162q), this.f19151f, this.f19155j);
    }

    public final void n(Looper looper) {
        if (this.f19165t == null) {
            this.f19165t = new c(looper);
        }
    }

    public final void o(DefaultDrmSession<T> defaultDrmSession) {
        this.f19156k.remove(defaultDrmSession);
        if (this.f19160o == defaultDrmSession) {
            this.f19160o = null;
        }
        if (this.f19161p == defaultDrmSession) {
            this.f19161p = null;
        }
        if (this.f19157l.size() > 1 && this.f19157l.get(0) == defaultDrmSession) {
            this.f19157l.get(1).s();
        }
        this.f19157l.remove(defaultDrmSession);
    }

    @Override // com.google.android.exoplayer2.drm.a
    public final void prepare() {
        int i10 = this.f19158m;
        this.f19158m = i10 + 1;
        if (i10 == 0) {
            g5.a.f(this.f19159n == null);
            com.google.android.exoplayer2.drm.c<T> cVarAcquireExoMediaDrm = this.f19148c.acquireExoMediaDrm(this.f19147b);
            this.f19159n = cVarAcquireExoMediaDrm;
            cVarAcquireExoMediaDrm.b(new b());
        }
    }

    @Override // com.google.android.exoplayer2.drm.a
    public final void release() {
        int i10 = this.f19158m - 1;
        this.f19158m = i10;
        if (i10 == 0) {
            ((com.google.android.exoplayer2.drm.c) g5.a.e(this.f19159n)).release();
            this.f19159n = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.a
    @Nullable
    public Class<T> c(DrmInitData drmInitData) {
        if (b(drmInitData)) {
            return ((com.google.android.exoplayer2.drm.c) g5.a.e(this.f19159n)).a();
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.a
    @Nullable
    public DrmSession<T> d(Looper looper, int i10) {
        boolean z10;
        j(looper);
        com.google.android.exoplayer2.drm.c cVar = (com.google.android.exoplayer2.drm.c) g5.a.e(this.f19159n);
        if (j.class.equals(cVar.a()) && j.f65878d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && k0.k0(this.f19153h, i10) != -1 && cVar.a() != null) {
            n(looper);
            if (this.f19160o == null) {
                DefaultDrmSession<T> defaultDrmSessionK = k(Collections.emptyList(), true);
                this.f19156k.add(defaultDrmSessionK);
                this.f19160o = defaultDrmSessionK;
            }
            this.f19160o.acquire();
            return this.f19160o;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.drm.DefaultDrmSessionManager$a] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.exoplayer2.drm.DefaultDrmSession, com.google.android.exoplayer2.drm.DrmSession<T extends p3.i>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.exoplayer2.drm.DefaultDrmSession<T extends p3.i>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.exoplayer2.drm.a
    public DrmSession<T> e(Looper looper, DrmInitData drmInitData) {
        List<DrmInitData.SchemeData> listL;
        j(looper);
        n(looper);
        DefaultDrmSession<T> defaultDrmSessionK = (DefaultDrmSession<T>) null;
        if (this.f19164s == null) {
            listL = l(drmInitData, this.f19147b, false);
            if (listL.isEmpty()) {
                final MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f19147b);
                this.f19151f.b(new g.a() { // from class: p3.g
                    @Override // g5.g.a
                    public final void a(Object obj) {
                        ((f) obj).onDrmSessionManagerError(missingSchemeDataException);
                    }
                });
                return new com.google.android.exoplayer2.drm.b(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
        } else {
            listL = null;
        }
        if (!this.f19152g) {
            defaultDrmSessionK = this.f19161p;
        } else {
            for (DefaultDrmSession<T> defaultDrmSession : this.f19156k) {
                if (k0.c(defaultDrmSession.f19118a, listL)) {
                    defaultDrmSessionK = defaultDrmSession;
                    break;
                }
            }
        }
        if (defaultDrmSessionK == 0) {
            defaultDrmSessionK = k(listL, false);
            if (!this.f19152g) {
                this.f19161p = defaultDrmSessionK;
            }
            this.f19156k.add(defaultDrmSessionK);
        }
        ((DefaultDrmSession) defaultDrmSessionK).acquire();
        return (DrmSession<T>) defaultDrmSessionK;
    }
}
