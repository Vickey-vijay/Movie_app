package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Fg implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gn f55234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f55235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4262i6 f55236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cl f55237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ie f55238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Je f55239f;

    public Fg() {
        this(new Gn(), new W(new C4680yn()), new C4262i6(), new Cl(), new Ie(), new Je());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Y5 fromModel(@NonNull Eg eg2) {
        Y5 y10 = new Y5();
        y10.f56231f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(eg2.f55181a, y10.f56231f));
        Rn rn2 = eg2.f55182b;
        if (rn2 != null) {
            Hn hn2 = rn2.f55830a;
            if (hn2 != null) {
                y10.f56226a = this.f55234a.fromModel(hn2);
            }
            V v10 = rn2.f55831b;
            if (v10 != null) {
                y10.f56227b = this.f55235b.fromModel(v10);
            }
            List<El> list = rn2.f55832c;
            if (list != null) {
                y10.f56230e = this.f55237d.fromModel(list);
            }
            y10.f56228c = (String) WrapUtils.getOrDefault(rn2.f55836g, y10.f56228c);
            y10.f56229d = this.f55236c.a(rn2.f55837h);
            if (!TextUtils.isEmpty(rn2.f55833d)) {
                y10.f56234i = this.f55238e.fromModel(rn2.f55833d);
            }
            if (!TextUtils.isEmpty(rn2.f55834e)) {
                y10.f56235j = rn2.f55834e.getBytes();
            }
            if (!mo.a(rn2.f55835f)) {
                y10.f56236k = this.f55239f.fromModel(rn2.f55835f);
            }
        }
        return y10;
    }

    public Fg(Gn gn2, W w10, C4262i6 c4262i6, Cl cl2, Ie ie2, Je je2) {
        this.f55234a = gn2;
        this.f55235b = w10;
        this.f55236c = c4262i6;
        this.f55237d = cl2;
        this.f55238e = ie2;
        this.f55239f = je2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Eg a(@NonNull Y5 y10) {
        throw new UnsupportedOperationException();
    }
}
