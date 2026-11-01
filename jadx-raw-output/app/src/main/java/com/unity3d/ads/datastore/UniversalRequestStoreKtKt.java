package com.unity3d.ads.datastore;

import bk.l;
import ck.p;
import mj.r;

/* JADX INFO: compiled from: UniversalRequestStoreKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class UniversalRequestStoreKtKt {
    /* JADX INFO: renamed from: -initializeuniversalRequestStore, reason: not valid java name */
    public static final UniversalRequestStoreOuterClass.UniversalRequestStore m3175initializeuniversalRequestStore(l<? super UniversalRequestStoreKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builderNewBuilder = UniversalRequestStoreOuterClass.UniversalRequestStore.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        UniversalRequestStoreKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final UniversalRequestStoreOuterClass.UniversalRequestStore copy(UniversalRequestStoreOuterClass.UniversalRequestStore universalRequestStore, l<? super UniversalRequestStoreKt.Dsl, r> lVar) {
        p.j(universalRequestStore, "<this>");
        p.j(lVar, "block");
        UniversalRequestStoreKt.Dsl.Companion companion = UniversalRequestStoreKt.Dsl.Companion;
        UniversalRequestStoreOuterClass.UniversalRequestStore.Builder builder = universalRequestStore.toBuilder();
        p.i(builder, "this.toBuilder()");
        UniversalRequestStoreKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
