package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import mj.r;
import rj.c;
import yads.ad1;
import yads.fp;
import yads.lu2;
import yads.nh2;
import yads.qq1;
import yads.sp1;
import yads.to1;
import yads.uo1;
import yads.vp1;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f42979g = new AtomicBoolean(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f42980h = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f42981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fp f42982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh2 f42983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sp1 f42984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final uo1 f42985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final to1 f42986f;

    public /* synthetic */ a(lu2 lu2Var) {
        fp fpVar = new fp();
        nh2 nh2Var = new nh2();
        sp1 sp1Var = new sp1();
        this(lu2Var, fpVar, nh2Var, sp1Var, new uo1(sp1Var), new to1(sp1Var));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, qq1 qq1Var, c cVar) throws Throwable {
        vp1 vp1Var;
        MediatedAdapterInitializationResult mediatedAdapterInitializationResult;
        if (cVar instanceof vp1) {
            vp1Var = (vp1) cVar;
            int i10 = vp1Var.f83979e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vp1Var.f83979e = i10 - Integer.MIN_VALUE;
            } else {
                vp1Var = new vp1(this, cVar);
            }
        } else {
            vp1Var = new vp1(this, cVar);
        }
        Object objInitialize = vp1Var.f83977c;
        Object objF = sj.a.f();
        int i11 = vp1Var.f83979e;
        if (i11 == 0) {
            kotlin.c.b(objInitialize);
            String strB = this.f42984d.b(qq1Var);
            MediatedAdapterInitializer mediatedAdapterInitializerA = this.f42986f.a(context, qq1Var, this.f42981a);
            if (mediatedAdapterInitializerA != null) {
                Map<String, String> mapD = qq1Var.d();
                vp1Var.f83976b = strB;
                vp1Var.f83979e = 1;
                objInitialize = mediatedAdapterInitializerA.initialize(context, mapD, vp1Var);
                if (objInitialize == objF) {
                    return objF;
                }
            } else {
                mediatedAdapterInitializationResult = null;
            }
            if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Failure) {
                MediatedAdapterInitializationResult.Failure failure = (MediatedAdapterInitializationResult.Failure) mediatedAdapterInitializationResult;
                failure.getErrorCode();
                failure.getErrorMessage();
                boolean z10 = ad1.f75480a;
            } else if (mediatedAdapterInitializationResult == null) {
                boolean z11 = ad1.f75480a;
            }
            return r.f64562a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(objInitialize);
        mediatedAdapterInitializationResult = (MediatedAdapterInitializationResult) objInitialize;
        if (mediatedAdapterInitializationResult instanceof MediatedAdapterInitializationResult.Failure) {
            MediatedAdapterInitializationResult.Failure failure2 = (MediatedAdapterInitializationResult.Failure) mediatedAdapterInitializationResult;
            failure2.getErrorCode();
            failure2.getErrorMessage();
            boolean z12 = ad1.f75480a;
        } else if (mediatedAdapterInitializationResult == null) {
            boolean z13 = ad1.f75480a;
        }
        return r.f64562a;
    }

    public a(lu2 lu2Var, fp fpVar, nh2 nh2Var, sp1 sp1Var, uo1 uo1Var, to1 to1Var) {
        this.f42981a = lu2Var;
        this.f42982b = fpVar;
        this.f42983c = nh2Var;
        this.f42984d = sp1Var;
        this.f42985e = uo1Var;
        this.f42986f = to1Var;
    }
}
