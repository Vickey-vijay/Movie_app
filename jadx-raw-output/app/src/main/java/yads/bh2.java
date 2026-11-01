package yads;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes8.dex */
public final class bh2 implements bl.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bh2 f75829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f75830b;

    static {
        bh2 bh2Var = new bh2();
        f75829a = bh2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", bh2Var, 1);
        pluginGeneratedSerialDescriptor.k("prefetched_mediation_data", false);
        f75830b = pluginGeneratedSerialDescriptor;
    }

    @Override // bl.g0
    public final xk.b[] childSerializers() {
        return new xk.b[]{dh2.f76673b[0]};
    }

    @Override // xk.a
    public final Object deserialize(al.e eVar) {
        List list;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f75830b;
        al.c cVarB = eVar.b(pluginGeneratedSerialDescriptor);
        xk.b[] bVarArr = dh2.f76673b;
        int i10 = 1;
        List list2 = null;
        if (cVarB.j()) {
            list = (List) cVarB.v(pluginGeneratedSerialDescriptor, 0, bVarArr[0], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iX = cVarB.x(pluginGeneratedSerialDescriptor);
                if (iX == -1) {
                    z10 = false;
                } else {
                    if (iX != 0) {
                        throw new UnknownFieldException(iX);
                    }
                    list2 = (List) cVarB.v(pluginGeneratedSerialDescriptor, 0, bVarArr[0], list2);
                    i11 = 1;
                }
            }
            list = list2;
            i10 = i11;
        }
        cVarB.c(pluginGeneratedSerialDescriptor);
        return new dh2(i10, list);
    }

    @Override // xk.b, xk.g, xk.a
    public final kotlinx.serialization.descriptors.a getDescriptor() {
        return f75830b;
    }

    @Override // xk.g
    public final void serialize(al.f fVar, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f75830b;
        al.d dVarB = fVar.b(pluginGeneratedSerialDescriptor);
        dVarB.m(pluginGeneratedSerialDescriptor, 0, dh2.f76673b[0], ((dh2) obj).f76674a);
        dVarB.c(pluginGeneratedSerialDescriptor);
    }

    @Override // bl.g0
    public final xk.b[] typeParametersSerializers() {
        return bl.g0.a.a(this);
    }
}
