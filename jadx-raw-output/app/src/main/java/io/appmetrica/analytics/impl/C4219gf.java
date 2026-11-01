package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4219gf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4522sf f56812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4090bf f56813b;

    public C4219gf() {
        this(new C4522sf(), new C4090bf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4423of fromModel(@NonNull C4167ef c4167ef) {
        C4423of c4423of = new C4423of();
        c4423of.f57443a = this.f56812a.fromModel(c4167ef.f56668a);
        c4423of.f57444b = new C4398nf[c4167ef.f56669b.size()];
        Iterator<C4142df> it = c4167ef.f56669b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            c4423of.f57444b[i10] = this.f56813b.fromModel(it.next());
            i10++;
        }
        return c4423of;
    }

    public C4219gf(C4522sf c4522sf, C4090bf c4090bf) {
        this.f56812a = c4522sf;
        this.f56813b = c4090bf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4167ef toModel(@NonNull C4423of c4423of) {
        C4497rf model;
        ArrayList arrayList = new ArrayList(c4423of.f57444b.length);
        for (C4398nf c4398nf : c4423of.f57444b) {
            arrayList.add(this.f56813b.toModel(c4398nf));
        }
        C4373mf c4373mf = c4423of.f57443a;
        if (c4373mf == null) {
            model = this.f56812a.toModel(new C4373mf());
        } else {
            model = this.f56812a.toModel(c4373mf);
        }
        return new C4167ef(model, arrayList);
    }
}
