package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C2923i3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2923i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2997l3 f24532a;

    public final void a(final S2 s10) {
        ck.p.j(s10, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: b7.y7
            @Override // java.lang.Runnable
            public final void run() {
                C2923i3.a(s10, this);
            }
        });
    }

    public C2923i3(InterfaceC2997l3 interfaceC2997l3) {
        ck.p.j(interfaceC2997l3, "mEventHandler");
        this.f24532a = interfaceC2997l3;
    }

    public static final mj.r b(S2 s10) {
        C3271w3 c3271w3 = C3271w3.f25610a;
        ck.p.i("w3", "access$getTAG$p(...)");
        String str = s10.f23479b;
        return mj.r.f64562a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [T, com.inmobi.media.mo] */
    public static final void a(final S2 s10, C2923i3 c2923i3) {
        Je je2 = new Je(s10.f23479b, C3271w3.a(s10), null, null, null, false, 60);
        int pingTimeout = C3271w3.c().getPingTimeout();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? moVar = new mo(je2, new C2898h3(new AtomicBoolean(false), ref$ObjectRef, c2923i3, s10), pingTimeout * 1000, new bk.a() { // from class: b7.z7
            @Override // bk.a
            public final Object invoke() {
                return C2923i3.b(s10);
            }
        });
        ref$ObjectRef.element = moVar;
        moVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C2923i3 c2923i3, S2 s10, boolean z10) {
        if (atomicBoolean.compareAndSet(false, true)) {
            mo moVar = (mo) ref$ObjectRef.element;
            if (moVar != null) {
                moVar.a();
            }
            if (z10) {
                c2923i3.f24532a.a(s10);
            } else {
                c2923i3.f24532a.a(s10, EnumC2721a6.f23948d);
            }
        }
    }
}
