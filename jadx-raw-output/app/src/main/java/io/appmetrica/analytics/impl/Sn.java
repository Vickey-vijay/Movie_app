package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Sn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gn f55877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f55878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4262i6 f55879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cl f55880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ie f55881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Je f55882f;

    public Sn() {
        this(new Gn(), new W(new C4680yn()), new C4262i6(), new Cl(), new Ie(), new Je());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(@NonNull Rn rn2) {
        W5 w10 = new W5();
        Hn hn2 = rn2.f55830a;
        if (hn2 != null) {
            w10.f56069a = this.f55877a.fromModel(hn2);
        }
        V v10 = rn2.f55831b;
        if (v10 != null) {
            w10.f56070b = this.f55878b.fromModel(v10);
        }
        List<El> list = rn2.f55832c;
        if (list != null) {
            w10.f56073e = this.f55880d.fromModel(list);
        }
        String str = rn2.f55836g;
        if (str != null) {
            w10.f56071c = str;
        }
        w10.f56072d = this.f55879c.a(rn2.f55837h);
        if (!TextUtils.isEmpty(rn2.f55833d)) {
            w10.f56076h = this.f55881e.fromModel(rn2.f55833d);
        }
        if (!TextUtils.isEmpty(rn2.f55834e)) {
            w10.f56077i = rn2.f55834e.getBytes();
        }
        if (!mo.a(rn2.f55835f)) {
            w10.f56078j = this.f55882f.fromModel(rn2.f55835f);
        }
        return w10;
    }

    public Sn(Gn gn2, W w10, C4262i6 c4262i6, Cl cl2, Ie ie2, Je je2) {
        this.f55878b = w10;
        this.f55877a = gn2;
        this.f55879c = c4262i6;
        this.f55880d = cl2;
        this.f55881e = ie2;
        this.f55882f = je2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Rn a(@NonNull W5 w10) {
        throw new UnsupportedOperationException();
    }
}
