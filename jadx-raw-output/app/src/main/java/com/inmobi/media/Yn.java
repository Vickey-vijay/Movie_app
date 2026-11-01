package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes8.dex */
public final class Yn extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Le f23873b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.inmobi.media.R0
    public final Object a(rj.c cVar) throws Throwable {
        Xn xn2;
        if (cVar instanceof Xn) {
            xn2 = (Xn) cVar;
            int i10 = xn2.f23810c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                xn2.f23810c = i10 - Integer.MIN_VALUE;
            } else {
                xn2 = new Xn(this, (ContinuationImpl) cVar);
            }
        } else {
            xn2 = new Xn(this, (ContinuationImpl) cVar);
        }
        Object objA = xn2.f23808a;
        Object objF = sj.a.f();
        int i11 = xn2.f23810c;
        if (i11 == 0) {
            kotlin.c.b(objA);
            C3168s0 c3168s0 = C3168s0.f25287a;
            Le le2 = this.f23873b;
            xn2.f23810c = 1;
            objA = c3168s0.a(le2, xn2);
            if (objA == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objA);
        }
        Ne ne2 = (Ne) objA;
        ik.i iVar = Se.f23518a;
        ck.p.j(ne2, "<this>");
        return ne2.d().string(lk.c.f63591b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yn(Le le2, C3053n9 c3053n9) {
        super(c3053n9);
        ck.p.j(le2, "networkRequest");
        this.f23873b = le2;
    }

    @Override // com.inmobi.media.R0
    public final mj.r a(AdResponse adResponse, bk.l lVar) {
        Objects.toString(adResponse);
        V0.a(adResponse, this.f23419a, lVar);
        return mj.r.f64562a;
    }
}
