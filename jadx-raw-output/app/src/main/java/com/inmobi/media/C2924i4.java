package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2924i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2973k4 f24533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2948j4 f24534b;

    public final Config a(Class cls) {
        ck.p.j(cls, "clazz");
        String strA = AbstractC3197t4.a(cls);
        Config config = (Config) this.f24533a.f24648b.get(strA);
        if (config == null) {
            String[] strArr = C3147r4.f25232a;
            for (int i10 = 0; i10 < 5; i10++) {
                String str = strArr[i10];
                if (this.f24533a.f24648b.get(str) == null) {
                    this.f24533a.f24648b.put(str, AbstractC3024m5.a(str));
                }
            }
            config = (Config) this.f24533a.f24648b.get(strA);
            nk.j.d(this.f24534b.f24584a, null, null, new C2848f4(this, null), 3, null);
        }
        ck.p.h(config, "null cannot be cast to non-null type T of com.inmobi.media.core.config.manager.ConfigManager.getConfig");
        return config;
    }

    public C2924i4(C2973k4 c2973k4, C2948j4 c2948j4) {
        ck.p.j(c2973k4, "configManagerState");
        ck.p.j(c2948j4, "configManagerDI");
        this.f24533a = c2973k4;
        this.f24534b = c2948j4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        C2874g4 c2874g4;
        if (continuationImpl instanceof C2874g4) {
            c2874g4 = (C2874g4) continuationImpl;
            int i10 = c2874g4.f24405c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2874g4.f24405c = i10 - Integer.MIN_VALUE;
            } else {
                c2874g4 = new C2874g4(this, continuationImpl);
            }
        } else {
            c2874g4 = new C2874g4(this, continuationImpl);
        }
        Object obj = c2874g4.f24403a;
        Object objF = sj.a.f();
        int i11 = c2874g4.f24405c;
        if (i11 == 0) {
            kotlin.c.b(obj);
            if (this.f24533a.f24647a.getAndSet(true)) {
                return mj.r.f64562a;
            }
            c2874g4.f24405c = 1;
            if (a(c2874g4) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        String[] strArr = C3147r4.f25232a;
        for (int i12 = 0; i12 < 5; i12++) {
            String str = strArr[i12];
            if (this.f24533a.f24648b.get(str) == null) {
                this.f24533a.f24648b.put(str, AbstractC3024m5.a(str));
            }
        }
        nk.j.d(this.f24534b.f24584a, null, null, new C2899h4(this, null), 3, null);
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        C2797d4 c2797d4;
        if (continuationImpl instanceof C2797d4) {
            c2797d4 = (C2797d4) continuationImpl;
            int i10 = c2797d4.f24218c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2797d4.f24218c = i10 - Integer.MIN_VALUE;
            } else {
                c2797d4 = new C2797d4(this, continuationImpl);
            }
        } else {
            c2797d4 = new C2797d4(this, continuationImpl);
        }
        Object objA = c2797d4.f24216a;
        Object objF = sj.a.f();
        int i11 = c2797d4.f24218c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C2719a4 c2719a4 = (C2719a4) this.f24534b.f24585b.getValue();
            c2797d4.f24218c = 1;
            objA = c2719a4.a(c2797d4);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        for (Config config : (Iterable) objA) {
            config.getType();
            this.f24533a.f24648b.put(config.getType(), config);
        }
        return mj.r.f64562a;
    }
}
