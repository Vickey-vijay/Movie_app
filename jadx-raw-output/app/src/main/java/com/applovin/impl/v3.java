package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f9741a = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(y2 y2Var);
    }

    public void a(a aVar) {
        this.f9741a.add(aVar);
    }

    public void a(y2 y2Var) {
        Iterator it = new ArrayList(this.f9741a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(y2Var);
        }
    }

    public void b(a aVar) {
        this.f9741a.remove(aVar);
    }
}
