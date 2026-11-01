package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Cl implements ListConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Dl f55113a = new Dl();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4055a6[] fromModel(@NonNull List<El> list) {
        C4055a6[] c4055a6Arr = new C4055a6[list.size()];
        Iterator<El> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c4055a6Arr[i10] = this.f55113a.fromModel(it.next());
            i10++;
        }
        return c4055a6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final List<El> a(C4055a6[] c4055a6Arr) {
        throw new UnsupportedOperationException();
    }
}
