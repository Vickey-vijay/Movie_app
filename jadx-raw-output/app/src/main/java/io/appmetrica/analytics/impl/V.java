package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4655xn f56001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f56002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56003c;

    public V(C4655xn c4655xn, ArrayList arrayList, String str) {
        List listUnmodifiableListCopy;
        this.f56001a = c4655xn;
        if (arrayList == null) {
            listUnmodifiableListCopy = Collections.emptyList();
        } else {
            listUnmodifiableListCopy = CollectionUtils.unmodifiableListCopy(arrayList);
        }
        this.f56002b = listUnmodifiableListCopy;
        this.f56003c = str;
    }
}
