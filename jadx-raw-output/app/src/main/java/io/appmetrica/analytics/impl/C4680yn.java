package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4680yn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cl f58036a;

    public C4680yn() {
        this(new Cl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4081b6 fromModel(@NonNull C4655xn c4655xn) {
        C4081b6 c4081b6 = new C4081b6();
        Integer num = c4655xn.f57976e;
        c4081b6.f56413e = num == null ? -1 : num.intValue();
        c4081b6.f56412d = c4655xn.f57975d;
        c4081b6.f56410b = c4655xn.f57973b;
        c4081b6.f56409a = c4655xn.f57972a;
        c4081b6.f56411c = c4655xn.f57974c;
        Cl cl2 = this.f58036a;
        List list = c4655xn.f57977f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new El((StackTraceElement) it.next()));
        }
        c4081b6.f56414f = cl2.fromModel(arrayList);
        return c4081b6;
    }

    public C4680yn(Cl cl2) {
        this.f58036a = cl2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @NonNull
    public final C4655xn a(@NonNull C4081b6 c4081b6) {
        throw new UnsupportedOperationException();
    }
}
