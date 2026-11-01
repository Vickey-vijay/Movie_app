package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class Gn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cl f55282a;

    public Gn() {
        this(new Cl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4107c6 fromModel(@NonNull Hn hn2) {
        C4107c6 c4107c6 = new C4107c6();
        c4107c6.f56462a = (String) WrapUtils.getOrDefault(hn2.f55325a, "");
        c4107c6.f56463b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(hn2.f55326b, ""));
        List<El> list = hn2.f55327c;
        if (list != null) {
            c4107c6.f56464c = this.f55282a.fromModel(list);
        }
        Hn hn3 = hn2.f55328d;
        if (hn3 != null) {
            c4107c6.f56465d = fromModel(hn3);
        }
        List list2 = hn2.f55329e;
        int i10 = 0;
        if (list2 == null) {
            c4107c6.f56466e = new C4107c6[0];
        } else {
            c4107c6.f56466e = new C4107c6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c4107c6.f56466e[i10] = fromModel((Hn) it.next());
                i10++;
            }
        }
        return c4107c6;
    }

    public Gn(Cl cl2) {
        this.f55282a = cl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final Hn a(@NonNull C4107c6 c4107c6) {
        throw new UnsupportedOperationException();
    }
}
