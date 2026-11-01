package com.yandex.div.internal.viewpool;

import al.c;
import al.d;
import al.e;
import al.f;
import bl.g0;
import bl.p0;
import bl.y1;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.a;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import xk.b;

/* JADX INFO: compiled from: ViewPreCreationProfile.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class PreCreationModel$$serializer implements g0<PreCreationModel> {
    public static final PreCreationModel$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    private PreCreationModel$$serializer() {
    }

    @Override // bl.g0
    public b<?>[] childSerializers() {
        p0 p0Var = p0.f5452a;
        return new b[]{p0Var, p0Var, p0Var};
    }

    @Override // xk.a
    public PreCreationModel deserialize(e eVar) {
        int i10;
        int iF;
        int i11;
        int i12;
        a descriptor2 = getDescriptor();
        c cVarB = eVar.b(descriptor2);
        if (cVarB.j()) {
            int iF2 = cVarB.f(descriptor2, 0);
            int iF3 = cVarB.f(descriptor2, 1);
            i10 = iF2;
            iF = cVarB.f(descriptor2, 2);
            i11 = iF3;
            i12 = 7;
        } else {
            boolean z10 = true;
            int iF4 = 0;
            int iF5 = 0;
            int iF6 = 0;
            int i13 = 0;
            while (z10) {
                int iX = cVarB.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    iF4 = cVarB.f(descriptor2, 0);
                    i13 |= 1;
                } else if (iX == 1) {
                    iF6 = cVarB.f(descriptor2, 1);
                    i13 |= 2;
                } else {
                    if (iX != 2) {
                        throw new UnknownFieldException(iX);
                    }
                    iF5 = cVarB.f(descriptor2, 2);
                    i13 |= 4;
                }
            }
            i10 = iF4;
            iF = iF5;
            i11 = iF6;
            i12 = i13;
        }
        cVarB.c(descriptor2);
        return new PreCreationModel(i12, i10, i11, iF, (y1) null);
    }

    @Override // xk.g
    public void serialize(f fVar, PreCreationModel preCreationModel) {
        a descriptor2 = getDescriptor();
        d dVarB = fVar.b(descriptor2);
        PreCreationModel.write$Self(preCreationModel, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    static {
        PreCreationModel$$serializer preCreationModel$$serializer = new PreCreationModel$$serializer();
        INSTANCE = preCreationModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.div.internal.viewpool.PreCreationModel", preCreationModel$$serializer, 3);
        pluginGeneratedSerialDescriptor.k("capacity", false);
        pluginGeneratedSerialDescriptor.k("min", true);
        pluginGeneratedSerialDescriptor.k("max", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // xk.b, xk.g, xk.a
    public a getDescriptor() {
        return descriptor;
    }

    @Override // bl.g0
    public b<?>[] typeParametersSerializers() {
        return g0.a.a(this);
    }
}
