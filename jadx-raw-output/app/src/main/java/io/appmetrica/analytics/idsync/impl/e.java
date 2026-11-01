package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f54873a = new x();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final o fromModel(IdSyncConfig idSyncConfig) {
        o oVar = new o();
        oVar.f54904a = idSyncConfig.getEnabled();
        n nVar = new n();
        nVar.f54899a = idSyncConfig.getLaunchDelay();
        int size = idSyncConfig.getRequests().size();
        m[] mVarArr = new m[size];
        for (int i10 = 0; i10 < size; i10++) {
            mVarArr[i10] = this.f54873a.fromModel(idSyncConfig.getRequests().get(i10));
        }
        nVar.f54900b = mVarArr;
        oVar.f54905b = nVar;
        return oVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final IdSyncConfig toModel(o oVar) {
        n nVar = oVar.f54905b;
        if (nVar == null) {
            nVar = new n();
        }
        boolean z10 = oVar.f54904a;
        long j10 = nVar.f54899a;
        m[] mVarArr = nVar.f54900b;
        ArrayList arrayList = new ArrayList(mVarArr.length);
        for (m mVar : mVarArr) {
            arrayList.add(this.f54873a.toModel(mVar));
        }
        return new IdSyncConfig(z10, j10, arrayList);
    }
}
