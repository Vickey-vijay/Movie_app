package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.pf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3109pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3109pf f25078a = new C3109pf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f25079b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C3183sf f25080c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        C3009lf c3009lf;
        Context context;
        AdConfig.OmidConfig omidConfig;
        if (continuationImpl instanceof C3009lf) {
            c3009lf = (C3009lf) continuationImpl;
            int i10 = c3009lf.f24774e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3009lf.f24774e = i10 - Integer.MIN_VALUE;
            } else {
                c3009lf = new C3009lf(this, continuationImpl);
            }
        } else {
            c3009lf = new C3009lf(this, continuationImpl);
        }
        Object obj = c3009lf.f24772c;
        Object objF = sj.a.f();
        int i11 = c3009lf.f24774e;
        if (i11 == 0) {
            kotlin.c.b(obj);
            C2924i4 c2924i4 = Y3.f23815a;
            ck.p.j(AdConfig.class, "clazz");
            AdConfig.OmidConfig omidConfig2 = ((AdConfig) Y3.f23815a.a(AdConfig.class)).getViewability().getOmidConfig();
            Context context2 = Ji.f22951a;
            if (context2 == null) {
                return mj.r.f64562a;
            }
            c3009lf.f24770a = omidConfig2;
            c3009lf.f24771b = context2;
            c3009lf.f24774e = 1;
            Object objA = a(context2, omidConfig2, c3009lf);
            if (objA == objF) {
                return objF;
            }
            context = context2;
            omidConfig = omidConfig2;
            obj = objA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = c3009lf.f24771b;
            omidConfig = c3009lf.f24770a;
            kotlin.c.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return mj.r.f64562a;
        }
        f25079b.set(2);
        nk.j.d(A9.f22351c, null, null, new C3034mf(omidConfig, context, null), 3, null);
        return mj.r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, AdConfig.OmidConfig omidConfig, ContinuationImpl continuationImpl) throws Throwable {
        C3084of c3084of;
        if (continuationImpl instanceof C3084of) {
            c3084of = (C3084of) continuationImpl;
            int i10 = c3084of.f24996c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3084of.f24996c = i10 - Integer.MIN_VALUE;
            } else {
                c3084of = new C3084of(this, continuationImpl);
            }
        } else {
            c3084of = new C3084of(this, continuationImpl);
        }
        Object objG = c3084of.f24994a;
        Object objF = sj.a.f();
        int i11 = c3084of.f24996c;
        boolean z10 = true;
        if (i11 == 0) {
            kotlin.c.b(objG);
            AtomicInteger atomicInteger = f25079b;
            if (atomicInteger.get() != 1 && atomicInteger.get() != 2) {
                C3183sf c3183sf = f25080c;
                if (c3183sf == null) {
                    c3183sf = new C3183sf(context);
                    f25080c = c3183sf;
                }
                c3084of.f24996c = 1;
                objG = nk.h.g(nk.w0.b(), new C3134qf(c3183sf, omidConfig, null), c3084of);
                if (objG == objF) {
                    return objF;
                }
            }
            return tj.a.a(z10);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(objG);
        if (((Boolean) objG).booleanValue()) {
            z10 = false;
        }
        return tj.a.a(z10);
    }
}
