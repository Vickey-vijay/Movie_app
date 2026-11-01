package com.monetization.ads.mediation.banner;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import nj.s;
import yads.ad1;
import yads.bp1;
import yads.d4;
import yads.do1;
import yads.dp1;
import yads.hq1;
import yads.j1;
import yads.km;
import yads.lu2;
import yads.mo1;
import yads.sb2;
import yads.um;
import yads.v9;
import yads.xo1;
import yads.zo1;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements um {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f42970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f42971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do1 f42972c;

    @Override // yads.um
    public final List a() {
        return s.k();
    }

    @Override // yads.um
    public final void a(Context context) {
        this.f42972c.a(context);
    }

    @Override // yads.um
    public final String getAdInfo() {
        return this.f42970a.f83811c;
    }

    public c(km kmVar, v9 v9Var, hq1 hq1Var) {
        this.f42970a = v9Var;
        d4 d4VarE = kmVar.e();
        lu2 lu2VarH = kmVar.h();
        bp1 bp1Var = new bp1(d4VarE);
        xo1 xo1Var = new xo1(d4VarE, lu2VarH, v9Var);
        zo1 zo1Var = new zo1(new mo1(hq1Var.c(), bp1Var, xo1Var));
        do1 do1Var = new do1(d4VarE, lu2VarH, kmVar.f(), new b(), xo1Var, zo1Var, new sb2(kmVar, hq1Var));
        this.f42972c = do1Var;
        this.f42971b = new a(kmVar, do1Var, new dp1(kmVar.r(), kmVar.e().d()));
    }

    @Override // yads.um
    public final void a(Context context, v9 v9Var) {
        Activity activityA = j1.a();
        if (activityA != null) {
            boolean z10 = ad1.f75480a;
        }
        if (activityA != null) {
            context = activityA;
        }
        this.f42972c.a(context, this.f42971b);
    }

    @Override // yads.um
    public final List b() {
        return s.k();
    }
}
