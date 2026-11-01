package io.appmetrica.analytics.impl;

import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4495rd extends Lambda implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4215gb f57599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4495rd(C4215gb c4215gb) {
        super(1);
        this.f57599a = c4215gb;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        Zc zc2 = (Zc) ((Map.Entry) obj).getValue();
        return zc2.f56283b.parse(this.f57599a);
    }
}
