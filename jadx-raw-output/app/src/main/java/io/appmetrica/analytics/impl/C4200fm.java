package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4200fm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f56782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xo f56783b;

    public C4200fm(ProtobufStateStorage protobufStateStorage, xo xoVar) {
        this.f56782a = protobufStateStorage;
        this.f56783b = xoVar;
    }

    public C4200fm(Context context) {
        this(((Sm) Qm.a(C4329km.class)).create(context), C4418oa.k().D().a());
    }
}
