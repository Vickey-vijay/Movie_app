package com.ironsource;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class S implements P, P.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f27566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, O> f27567b;

    /* JADX WARN: Multi-variable type inference failed */
    public S() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.P
    public O a(String str) {
        ck.p.j(str, com.ironsource.sdk.controller.f.b.f30919c);
        this.f27566a.readLock().lock();
        try {
            return this.f27567b.get(str);
        } finally {
            this.f27566a.readLock().unlock();
        }
    }

    public S(ReadWriteLock readWriteLock) {
        ck.p.j(readWriteLock, "readWriteLock");
        this.f27566a = readWriteLock;
        this.f27567b = new LinkedHashMap();
    }

    @Override // com.ironsource.P
    public List<O> a() {
        this.f27566a.readLock().lock();
        List<O> listO0 = nj.b0.O0(this.f27567b.values());
        this.f27566a.readLock().unlock();
        return listO0;
    }

    public /* synthetic */ S(ReadWriteLock readWriteLock, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new ReentrantReadWriteLock() : readWriteLock);
    }

    @Override // com.ironsource.P.a
    public void a(O o10) {
        ck.p.j(o10, "adInfo");
        this.f27566a.writeLock().lock();
        try {
            if (this.f27567b.get(o10.c()) == null) {
                this.f27567b.put(o10.c(), o10);
            }
        } finally {
            this.f27566a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.P.a
    public void a(JSONObject jSONObject, EnumC3603n0 enumC3603n0, String str) {
        ck.p.j(jSONObject, "json");
        ck.p.j(enumC3603n0, "adStatus");
        ck.p.j(str, com.ironsource.sdk.controller.f.b.f30919c);
        this.f27566a.writeLock().lock();
        try {
            O o10 = this.f27567b.get(str);
            if (o10 == null) {
                return;
            }
            String strOptString = jSONObject.optString("bundleId");
            ck.p.i(strOptString, "bundleId");
            if (strOptString.length() > 0) {
                o10.a(strOptString);
            }
            String strOptString2 = jSONObject.optString("dynamicDemandSource");
            ck.p.i(strOptString2, "dynamicDemandSourceId");
            if (strOptString2.length() > 0) {
                o10.a(W7.f27827b.a(strOptString2));
            }
            o10.a(enumC3603n0);
        } finally {
            this.f27566a.writeLock().unlock();
        }
    }

    @Override // com.ironsource.P.a
    public void a(EnumC3603n0 enumC3603n0, String str) {
        ck.p.j(enumC3603n0, "adStatus");
        ck.p.j(str, com.ironsource.sdk.controller.f.b.f30919c);
        this.f27566a.writeLock().lock();
        try {
            O o10 = this.f27567b.get(str);
            if (o10 == null) {
                return;
            }
            o10.a(enumC3603n0);
            o10.a(System.currentTimeMillis() / 1000.0d);
        } finally {
            this.f27566a.writeLock().unlock();
        }
    }
}
