package io.appmetrica.analytics.impl;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4082b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J6 f56415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f56416b;

    public C4082b7(File file) {
        ArrayList arrayList = new ArrayList();
        this.f56416b = arrayList;
        if (file != null) {
            this.f56415a = new C4496re(file, new O6());
            arrayList.add(new C4496re(file, new C4321ke()));
        } else {
            this.f56415a = new K6(new O6());
        }
        arrayList.add(new K6(new C4321ke()));
    }
}
