package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.Paint;
import com.bytedance.adsdk.vt.ouw.ouw.qbp;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vm implements lh {
    public final float bly;
    public final com.bytedance.adsdk.vt.lh.ouw.yu fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final com.bytedance.adsdk.vt.lh.ouw.vt f11224le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final List<com.bytedance.adsdk.vt.lh.ouw.vt> f11225lh;
    public final String ouw;
    public final vt pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final ouw f11226ra;
    public final boolean tlj;
    public final com.bytedance.adsdk.vt.lh.ouw.vt vt;
    public final com.bytedance.adsdk.vt.lh.ouw.ouw yu;

    public enum ouw {
        BUTT,
        ROUND,
        UNKNOWN;

        public final Paint.Cap ouw() {
            int i10 = AnonymousClass1.ouw[ordinal()];
            if (i10 != 1) {
                return i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    public enum vt {
        MITER,
        ROUND,
        BEVEL;

        public final Paint.Join ouw() {
            int i10 = AnonymousClass1.vt[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.lh.vt.vm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] ouw;
        public static final /* synthetic */ int[] vt;

        static {
            int[] iArr = new int[vt.values().length];
            vt = iArr;
            try {
                iArr[vt.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                vt[vt.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                vt[vt.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ouw.values().length];
            ouw = iArr2;
            try {
                iArr2[ouw.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ouw[ouw.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ouw[ouw.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.vt.lh
    public final com.bytedance.adsdk.vt.ouw.ouw.lh ouw(com.bytedance.adsdk.vt.bly blyVar, com.bytedance.adsdk.vt.ra raVar, com.bytedance.adsdk.vt.lh.lh.ouw ouwVar) {
        return new qbp(blyVar, ouwVar, this);
    }

    public vm(String str, com.bytedance.adsdk.vt.lh.ouw.vt vtVar, List<com.bytedance.adsdk.vt.lh.ouw.vt> list, com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar, com.bytedance.adsdk.vt.lh.ouw.yu yuVar, com.bytedance.adsdk.vt.lh.ouw.vt vtVar2, ouw ouwVar2, vt vtVar3, float f10, boolean z10) {
        this.ouw = str;
        this.vt = vtVar;
        this.f11225lh = list;
        this.yu = ouwVar;
        this.fkw = yuVar;
        this.f11224le = vtVar2;
        this.f11226ra = ouwVar2;
        this.pno = vtVar3;
        this.bly = f10;
        this.tlj = z10;
    }
}
