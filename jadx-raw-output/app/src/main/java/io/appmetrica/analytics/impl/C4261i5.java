package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4261i5 extends Lambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4261i5 f56944a = new C4261i5();

    public C4261i5() {
        super(1);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        return ((ModuleAdRevenueProcessor) obj).getDescription();
    }
}
