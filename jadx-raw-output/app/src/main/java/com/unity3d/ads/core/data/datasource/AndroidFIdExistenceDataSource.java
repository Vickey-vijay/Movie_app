package com.unity3d.ads.core.data.datasource;

import ck.p;
import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: AndroidFIdExistenceDataSource.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidFIdExistenceDataSource implements FIdExistenceDataSource {
    private final String className;

    public AndroidFIdExistenceDataSource(String str) {
        p.j(str, "className");
        this.className = str;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdExistenceDataSource
    public boolean invoke() {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Class.forName(this.className));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        return Result.m3464isSuccessimpl(objM3458constructorimpl);
    }
}
