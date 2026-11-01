package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3290wm {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3115pl c3115pl, double d10, Pe pe2, int i10, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) throws Throwable {
        C3141qm c3141qm;
        double d11;
        if (continuationImpl instanceof C3141qm) {
            c3141qm = (C3141qm) continuationImpl;
            int i11 = c3141qm.f25203e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3141qm.f25203e = i11 - Integer.MIN_VALUE;
            } else {
                c3141qm = new C3141qm(continuationImpl);
            }
        } else {
            c3141qm = new C3141qm(continuationImpl);
        }
        Object objA = c3141qm.f25202d;
        Object objF = sj.a.f();
        int i12 = c3141qm.f25203e;
        if (i12 == 0) {
            kotlin.c.b(objA);
            c3141qm.f25199a = c3115pl;
            c3141qm.f25200b = pe2;
            c3141qm.f25201c = i10;
            c3141qm.f25203e = 1;
            objA = a(c3115pl, d10, vastVideoConfig, c3141qm);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = c3141qm.f25201c;
            pe2 = c3141qm.f25200b;
            c3115pl = c3141qm.f25199a;
            kotlin.c.b(objA);
        }
        double dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue == Double.MAX_VALUE) {
            return tj.a.b(Double.MAX_VALUE);
        }
        double dAbs = Math.abs((c3115pl.f25092a * c3115pl.f25093b) - i10);
        int iOrdinal = pe2.ordinal();
        if (iOrdinal != 2) {
            d11 = iOrdinal != 3 ? 0.5d : 1.5d;
        } else {
            d11 = 1.0d;
        }
        return tj.a.b((dAbs * d11) / Math.exp(dDoubleValue / 3.145728E7d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3115pl c3115pl, double d10, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) throws Throwable {
        C3165rm c3165rm;
        double dDoubleValue;
        if (continuationImpl instanceof C3165rm) {
            c3165rm = (C3165rm) continuationImpl;
            int i10 = c3165rm.f25282c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3165rm.f25282c = i10 - Integer.MIN_VALUE;
            } else {
                c3165rm = new C3165rm(continuationImpl);
            }
        } else {
            c3165rm = new C3165rm(continuationImpl);
        }
        Object objA = c3165rm.f25281b;
        Object objF = sj.a.f();
        int i11 = c3165rm.f25282c;
        double d11 = Double.MAX_VALUE;
        if (i11 == 0) {
            kotlin.c.b(objA);
            dDoubleValue = ((double) c3115pl.f25095d) * d10;
            if (dDoubleValue <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                return tj.a.b(Double.MAX_VALUE);
            }
            if (dDoubleValue <= 0.0d) {
                c3165rm.f25280a = vastVideoConfig;
                c3165rm.f25282c = 1;
                objA = a(c3115pl, vastVideoConfig, c3165rm);
                if (objA == objF) {
                    return objF;
                }
            }
            if (dDoubleValue > 0.0d && dDoubleValue <= vastVideoConfig.getVastMaxAssetSize()) {
                d11 = dDoubleValue;
            }
            return tj.a.b(d11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AdConfig.VastVideoConfig vastVideoConfig2 = c3165rm.f25280a;
        kotlin.c.b(objA);
        vastVideoConfig = vastVideoConfig2;
        dDoubleValue = ((Number) objA).doubleValue();
        if (dDoubleValue > 0.0d) {
            d11 = dDoubleValue;
        }
        return tj.a.b(d11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(C3115pl c3115pl, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) throws Throwable {
        C3190sm c3190sm;
        Ne ne2;
        if (continuationImpl instanceof C3190sm) {
            c3190sm = (C3190sm) continuationImpl;
            int i10 = c3190sm.f25354b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3190sm.f25354b = i10 - Integer.MIN_VALUE;
            } else {
                c3190sm = new C3190sm(continuationImpl);
            }
        } else {
            c3190sm = new C3190sm(continuationImpl);
        }
        Object objA = c3190sm.f25353a;
        Object objF = sj.a.f();
        int i11 = c3190sm.f25354b;
        try {
            if (i11 == 0) {
                kotlin.c.b(objA);
                Ke ke2 = new Ke(c3115pl.f25094c, new C3114pk(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                C3227u9 c3227u9 = (C3227u9) He.f22812c.getValue();
                c3190sm.f25354b = 1;
                objA = c3227u9.f25449a.a(ke2, c3190sm);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objA);
            }
            ne2 = (Ne) objA;
        } catch (Exception unused) {
            ne2 = null;
        }
        if (ne2 != null && ne2.c() == 200) {
            return tj.a.b(ne2.b().f22866c);
        }
        return tj.a.b(Double.MAX_VALUE);
    }
}
