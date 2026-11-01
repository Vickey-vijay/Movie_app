package com.vungle.ads.internal.model;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.d2;
import bl.g0;
import ck.p;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import me.goldze.mvvmhabit.base.ContainerActivity;
import xk.b;

/* JADX INFO: compiled from: AppNode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/AppNode.$serializer", "Lbl/g0;", "Lcom/vungle/ads/internal/model/AppNode;", "", "Lxk/b;", "childSerializers", "()[Lxk/b;", "Lal/e;", "decoder", "deserialize", "Lal/f;", "encoder", "value", "Lmj/r;", "serialize", "Lkotlinx/serialization/descriptors/a;", "getDescriptor", "()Lkotlinx/serialization/descriptors/a;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AppNode$$serializer implements g0<AppNode> {
    public static final AppNode$$serializer INSTANCE;
    public static final /* synthetic */ a descriptor;

    private AppNode$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        d2 d2Var = d2.f5397a;
        return new b[]{d2Var, d2Var, d2Var};
    }

    @Override // xk.a
    public AppNode deserialize(e decoder) {
        String str;
        String strI;
        String str2;
        int i10;
        p.j(decoder, "decoder");
        a descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.j()) {
            String strI2 = cVarB.i(descriptor2, 0);
            String strI3 = cVarB.i(descriptor2, 1);
            str = strI2;
            strI = cVarB.i(descriptor2, 2);
            str2 = strI3;
            i10 = 7;
        } else {
            String strI4 = null;
            String strI5 = null;
            String strI6 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    strI4 = cVarB.i(descriptor2, 0);
                    i11 |= 1;
                } else if (iX == 1) {
                    strI6 = cVarB.i(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    strI5 = cVarB.i(descriptor2, 2);
                    i11 |= 4;
                }
            }
            str = strI4;
            strI = strI5;
            str2 = strI6;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AppNode(i10, str, str2, strI, null);
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // xk.g
    public void serialize(f fVar, AppNode appNode) {
        p.j(fVar, "encoder");
        p.j(appNode, "value");
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        AppNode.write$Self(appNode, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        AppNode$$serializer appNode$$serializer = new AppNode$$serializer();
        INSTANCE = appNode$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.AppNode", appNode$$serializer, 3);
        pluginGeneratedSerialDescriptor.k(ContainerActivity.BUNDLE, false);
        pluginGeneratedSerialDescriptor.k("ver", false);
        pluginGeneratedSerialDescriptor.k("id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
