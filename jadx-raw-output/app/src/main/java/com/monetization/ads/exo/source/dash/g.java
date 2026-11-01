package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import java.io.IOException;
import yads.bg1;
import yads.bn1;
import yads.fg1;
import yads.hm1;
import yads.qb2;
import yads.vf1;
import yads.yf1;
import yads.zf1;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements yf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f42930b;

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f42930b;
        iVar.getClass();
        long j12 = qb2Var.f81792a;
        Uri uri = qb2Var.f81795d.f82098c;
        vf1 vf1Var = new vf1();
        iVar.f42937n.getClass();
        bn1 bn1Var = iVar.f42940q;
        bn1Var.a(vf1Var, new hm1(qb2Var.f81794c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
    }

    public g(i iVar) {
        this.f42930b = iVar;
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f42930b;
        iVar.getClass();
        long j12 = qb2Var.f81792a;
        Uri uri = qb2Var.f81795d.f82098c;
        vf1 vf1Var = new vf1();
        iVar.f42937n.getClass();
        bn1 bn1Var = iVar.f42940q;
        bn1Var.b(vf1Var, new hm1(qb2Var.f81794c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
        iVar.L = ((Long) qb2Var.f81797f).longValue() - j10;
        iVar.a(true);
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        qb2 qb2Var = (qb2) bg1Var;
        i iVar = this.f42930b;
        bn1 bn1Var = iVar.f42940q;
        long j12 = qb2Var.f81792a;
        Uri uri = qb2Var.f81795d.f82098c;
        bn1Var.a(new vf1(), new hm1(qb2Var.f81794c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)), iOException, true);
        iVar.f42937n.getClass();
        iVar.a(iOException);
        return fg1.f77388d;
    }
}
