package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4118ch extends Sg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4646xe f56517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProtobufStateStorage f56518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4684z2 f56519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4129d2 f56520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4509s2 f56521f;

    public C4118ch(Y4 y10, C4646xe c4646xe) {
        this(y10, c4646xe, ((Sm) Qm.a(U1.class)).create(y10.getContext()), new C4684z2(y10.getContext()), new C4129d2(), new C4509s2(y10.getContext()));
    }

    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        Y4 y10 = this.f55865a;
        y10.f56200b.toString();
        if (!y10.f56218t.c() || !y10.x()) {
            return false;
        }
        U1 u10 = (U1) this.f56518c.read();
        List list = u10.f55956a;
        C4659y2 c4659y2 = u10.f55957b;
        C4684z2 c4684z2 = this.f56519d;
        c4684z2.getClass();
        U1 u11 = null;
        C4659y2 c4659y2A = AndroidUtils.isApiAchieved(28) ? C4584v2.a(c4684z2.f58040a, c4684z2.f58041b) : null;
        List list2 = u10.f55958c;
        List list3 = (List) SystemServiceUtils.accessSystemServiceSafelyOrDefault(this.f56521f.f57644a, "getting available providers", "location manager", Collections.emptyList(), new C4484r2());
        C4646xe c4646xe = this.f56517b;
        Context context = this.f55865a.f56199a;
        c4646xe.getClass();
        ArrayList arrayListA = new Qi(context, new SafePackageManager()).a();
        if (CollectionUtils.areCollectionsEqual(arrayListA, list)) {
            arrayListA = null;
        }
        if (arrayListA != null || !mo.a(c4659y2, c4659y2A) || !CollectionUtils.areCollectionsEqual(list2, list3)) {
            if (arrayListA != null) {
                list = arrayListA;
            }
            u11 = new U1(list, c4659y2A, list3);
        }
        if (u11 != null) {
            C4342l9 c4342l9 = y10.f56212n;
            Q5 q5A = Q5.a(q10, u11.f55956a, u11.f55957b, this.f56520e, u11.f55958c);
            c4342l9.a(q5A, Sk.a(c4342l9.f57182c.b(q5A), q5A.f55781i));
            long jCurrentTimeSeconds = c4342l9.f57188i.currentTimeSeconds();
            c4342l9.f57190k = jCurrentTimeSeconds;
            c4342l9.f57180a.a(jCurrentTimeSeconds).b();
            this.f56518c.save(u11);
            return false;
        }
        if (!y10.A()) {
            return false;
        }
        C4342l9 c4342l10 = y10.f56212n;
        Q5 q5A2 = Q5.a(q10, u10.f55956a, u10.f55957b, this.f56520e, u10.f55958c);
        c4342l10.a(q5A2, Sk.a(c4342l10.f57182c.b(q5A2), q5A2.f55781i));
        long jCurrentTimeSeconds2 = c4342l10.f57188i.currentTimeSeconds();
        c4342l10.f57190k = jCurrentTimeSeconds2;
        c4342l10.f57180a.a(jCurrentTimeSeconds2).b();
        return false;
    }

    public C4118ch(Y4 y10, C4646xe c4646xe, ProtobufStateStorage protobufStateStorage, C4684z2 c4684z2, C4129d2 c4129d2, C4509s2 c4509s2) {
        super(y10);
        this.f56517b = c4646xe;
        this.f56518c = protobufStateStorage;
        this.f56519d = c4684z2;
        this.f56520e = c4129d2;
        this.f56521f = c4509s2;
    }
}
