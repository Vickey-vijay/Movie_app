package com.bytedance.sdk.component.ouw;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class ko {
    private volatile boolean fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final bly f11875lh;
    private final ouw ouw;
    private final WebView vt;
    private final List<ryl> yu;

    public final void ouw() {
        if (this.fkw) {
            return;
        }
        this.ouw.vt();
        this.fkw = true;
        Iterator<ryl> it = this.yu.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void vt() {
        if (this.fkw) {
            pno.ouw(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public ko(bly blyVar) {
        ArrayList arrayList = new ArrayList();
        this.yu = arrayList;
        this.fkw = false;
        this.f11875lh = blyVar;
        if (blyVar.ouw != null) {
            ouw ouwVar = blyVar.vt;
            if (ouwVar == null) {
                this.ouw = new qbp();
            } else {
                this.ouw = ouwVar;
            }
        } else {
            this.ouw = blyVar.vt;
        }
        this.ouw.lh(blyVar);
        this.vt = blyVar.ouw;
        arrayList.add(blyVar.bly);
        pno.ouw = blyVar.f11865le;
        th.ouw = blyVar.f11867ra;
    }

    public final ko ouw(String str, yu<?, ?> yuVar) {
        vt();
        le leVar = this.ouw.f11883ra;
        yuVar.ouw = str;
        leVar.vt.put(str, yuVar);
        pno.ouw("JsBridge stateless method registered: ".concat(String.valueOf(str)));
        return this;
    }

    public final ko ouw(Set<String> set, vm<?, ?> vmVar) {
        vm vmVarRemove;
        Set<String> set2;
        vt();
        le leVar = this.ouw.f11883ra;
        vmVar.f11884lh = set;
        zih<String, vm> zihVar = leVar.f11877lh;
        for (String str : set) {
            if (zihVar.ouw.containsKey(str) && (vmVarRemove = zihVar.ouw.remove(str)) != null && (set2 = zihVar.vt.get(vmVarRemove)) != null) {
                set2.remove(str);
                if (set2.isEmpty()) {
                    zihVar.vt.remove(vmVarRemove);
                }
            }
        }
        Set<String> hashSet = zihVar.vt.get(vmVar);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            zihVar.vt.put(vmVar, hashSet);
        }
        hashSet.addAll(set);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            zihVar.ouw.put(it.next(), vmVar);
        }
        pno.ouw("JsBridge stateless method registered: ".concat(String.valueOf(set)));
        return this;
    }

    public final ko ouw(String str, lh.vt vtVar) {
        vt();
        this.ouw.f11883ra.yu.put(str, vtVar);
        pno.ouw("JsBridge stateful method registered: ".concat(String.valueOf(str)));
        return this;
    }
}
