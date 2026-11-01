package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import com.ironsource.C3426d4;

/* JADX INFO: compiled from: Header.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f38181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38182b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f38181a, gVar.f38181a) && TextUtils.equals(this.f38182b, gVar.f38182b);
    }

    public final String a() {
        return this.f38181a;
    }

    public final String b() {
        return this.f38182b;
    }

    public int hashCode() {
        return (this.f38181a.hashCode() * 31) + this.f38182b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f38181a + ",value=" + this.f38182b + C3426d4.j.f28588e;
    }

    public g(String str, String str2) {
        this.f38181a = str;
        this.f38182b = str2;
    }
}
