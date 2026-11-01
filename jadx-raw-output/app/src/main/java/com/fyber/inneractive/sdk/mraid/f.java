package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f15975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f15976d;

    public abstract void a();

    public abstract boolean b();

    public final int a(String str) {
        String str2 = (String) this.f15974b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public f(Map map, i0 i0Var, g1 g1Var) {
        this.f15974b = map;
        this.f15976d = g1Var;
        this.f15975c = i0Var;
    }
}
