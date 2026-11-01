package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import com.inmobi.media.C3118q;
import com.inmobi.media.I2;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;

/* JADX INFO: renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C3118q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static AudioManager f25118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2968k f25119c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static kotlinx.coroutines.g f25122f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static bk.l f25125i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3118q f25117a = new C3118q();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f25120d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference f25121e = new AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final nk.l0 f25123g = A9.f22352d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final CopyOnWriteArraySet f25124h = new CopyOnWriteArraySet();

    public static final mj.r a(long j10, I2 i10) {
        ck.p.j(i10, "it");
        int i11 = i10.f22839a;
        if (i11 != 101) {
            if (i11 == 102) {
                kotlinx.coroutines.g gVar = f25122f;
                if (gVar != null) {
                    kotlinx.coroutines.g.a.a(gVar, null, 1, null);
                }
                f25122f = null;
            }
        } else if (f25122f == null && f25120d.get()) {
            f25122f = F3.a(f25123g, 0L, j10, new C3068o(null));
        }
        return mj.r.f64562a;
    }

    public static boolean b() {
        AudioManager audioManager;
        AudioManager audioManager2;
        C3298x5.f25687a.getClass();
        if (!C3298x5.w() ? (audioManager = f25118b) == null || audioManager.getStreamVolume(3) != 0 : (audioManager2 = f25118b) == null || !audioManager2.isStreamMute(3)) {
            if (!Ji.f22956f) {
                return false;
            }
        }
        return true;
    }

    public static void a(final long j10) {
        bk.l lVar = new bk.l() { // from class: b7.z9
            @Override // bk.l
            public final Object invoke(Object obj) {
                return C3118q.a(j10, (I2) obj);
            }
        };
        f25125i = lVar;
        ((C3305xc) Ji.f22955e.getValue()).a(new int[]{102, 101}, lVar);
    }

    public static void a(final InterfaceC3028m9 interfaceC3028m9) {
        final Context context = Ji.f22951a;
        if (context == null) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("AdAudioTracker", "Context is null. Cannot start audio volume tracking");
            }
            a((Float) null);
            return;
        }
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        final long muteChangeInterval = ((AdConfig) Y3.f23815a.a(AdConfig.class)).getMraid3Config().getMuteChangeInterval();
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(H3.a(new bk.a() { // from class: b7.y9
            @Override // bk.a
            public final Object invoke() {
                return C3118q.a(interfaceC3028m9, context, muteChangeInterval);
            }
        }));
        if (thM3461exceptionOrNullimpl != null) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).b("AdAudioTracker", "Error starting audio volume tracking - " + thM3461exceptionOrNullimpl.getMessage());
            }
            a((Float) null);
        }
    }

    public static final Object a(InterfaceC3028m9 interfaceC3028m9, Context context, long j10) {
        if (f25120d.compareAndSet(false, true)) {
            return nk.j.d(f25123g, null, null, new C3093p(interfaceC3028m9, context, j10, null), 3, null);
        }
        if (interfaceC3028m9 == null) {
            return null;
        }
        ((C3053n9) interfaceC3028m9).c("AdAudioTracker", "Audio volume tracking is already started");
        return mj.r.f64562a;
    }

    public static void a(final Context context, InterfaceC3028m9 interfaceC3028m9) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(H3.a(new bk.a() { // from class: b7.aa
            @Override // bk.a
            public final Object invoke() {
                return C3118q.a(context);
            }
        }));
        if (thM3461exceptionOrNullimpl == null || interfaceC3028m9 == null) {
            return;
        }
        ((C3053n9) interfaceC3028m9).b("AdAudioTracker", "Error cleaning up audio volume tracker - " + thM3461exceptionOrNullimpl.getMessage());
    }

    public static final mj.r a(final Context context) {
        final C2968k c2968k = f25119c;
        if (c2968k != null) {
            H3.a(new bk.a() { // from class: b7.ba
                @Override // bk.a
                public final Object invoke() {
                    return C3118q.a(context, c2968k);
                }
            });
            f25119c = null;
        }
        kotlinx.coroutines.g gVar = f25122f;
        if (gVar != null) {
            kotlinx.coroutines.g.a.a(gVar, null, 1, null);
        }
        bk.l lVar = f25125i;
        if (lVar != null) {
            ((C3305xc) Ji.f22955e.getValue()).a(lVar);
        }
        f25125i = null;
        f25122f = null;
        return mj.r.f64562a;
    }

    public static final mj.r a(Context context, C2968k c2968k) {
        context.unregisterReceiver(c2968k);
        return mj.r.f64562a;
    }

    public final synchronized float a() {
        float f10;
        boolean zB = b();
        AudioManager audioManager = f25118b;
        int streamVolume = audioManager != null ? audioManager.getStreamVolume(3) : 0;
        AudioManager audioManager2 = f25118b;
        int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
        if (zB) {
            return 0.0f;
        }
        if (streamVolume < 0) {
            return 0.0f;
        }
        if (streamVolume > streamMaxVolume) {
            f10 = 1.0f;
        } else {
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            f10 = streamVolume / streamMaxVolume;
        }
        return f10;
    }

    public static void a(Float f10) {
        if (ck.p.d((Float) f25121e.getAndSet(f10), f10)) {
            return;
        }
        Iterator it = f25124h.iterator();
        ck.p.i(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC2943j interfaceC2943j = (InterfaceC2943j) ((WeakReference) it.next()).get();
            if (interfaceC2943j != null) {
                ((Ph) interfaceC2943j).a(f10 != null ? Float.valueOf(F3.a(f10.floatValue() * 100.0f)) : null);
            }
        }
    }
}
