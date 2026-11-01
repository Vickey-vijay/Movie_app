package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;

/* JADX INFO: renamed from: com.ironsource.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC3552k5<T> extends Oc {
    void b(C8 c10);

    String c();

    InterfaceC3392b6 d();

    bk.l<Result<? extends T>, mj.r> i();

    C8 k();

    C7 l();

    default boolean j() {
        return k().exists();
    }

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            bk.l<Result<? extends T>, mj.r> lVarI = i();
            Result.a aVar = Result.Companion;
            lVarI.invoke(Result.m3457boximpl(Result.m3458constructorimpl(kotlin.c.a(e10))));
        }
    }
}
