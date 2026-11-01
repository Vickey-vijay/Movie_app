package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C2722a7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2722a7 f23964a = new C2722a7();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InMobiUserDataModel f23965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final wk.a f23966c;

    static {
        ck.p.i(C2722a7.class.getSimpleName(), "getSimpleName(...)");
        f23966c = wk.g.b(false, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InMobiUserDataModel inMobiUserDataModel, ContinuationImpl continuationImpl) throws Throwable {
        Z6 z10;
        wk.a aVar;
        if (continuationImpl instanceof Z6) {
            z10 = (Z6) continuationImpl;
            int i10 = z10.f23894d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z10.f23894d = i10 - Integer.MIN_VALUE;
            } else {
                z10 = new Z6(continuationImpl);
            }
        } else {
            z10 = new Z6(continuationImpl);
        }
        Object obj = z10.f23893c;
        Object objF = sj.a.f();
        int i11 = z10.f23894d;
        if (i11 == 0) {
            kotlin.c.b(obj);
            aVar = f23966c;
            z10.f23891a = inMobiUserDataModel;
            z10.f23892b = aVar;
            z10.f23894d = 1;
            if (aVar.a(null, z10) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wk.a aVar2 = z10.f23892b;
            InMobiUserDataModel inMobiUserDataModel2 = z10.f23891a;
            kotlin.c.b(obj);
            aVar = aVar2;
            inMobiUserDataModel = inMobiUserDataModel2;
        }
        try {
            Objects.toString(f23965b);
            Objects.toString(inMobiUserDataModel);
            f23965b = inMobiUserDataModel;
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    public final String toString() {
        return String.valueOf(f23965b);
    }
}
