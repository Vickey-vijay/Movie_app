package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: BaseAbstractSubject.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f34481a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConcurrentHashMap<Integer, Object> f34482b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i10) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f34482b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f34482b.put(Integer.valueOf(i10), obj);
            }
        }
    }

    public synchronized void a() {
        this.f34482b.clear();
    }
}
