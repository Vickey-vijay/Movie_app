package com.unity3d.ads.core.data.model;

import ck.p;

/* JADX INFO: compiled from: AdContext.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ImpressionConfig {
    private final String data;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m3165boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3166constructorimpl(String str) {
        p.j(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3167equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && p.e(str, ((ImpressionConfig) obj).m3171unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3168equalsimpl0(String str, String str2) {
        return p.e(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3169hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3170toStringimpl(String str) {
        return "ImpressionConfig(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m3167equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m3169hashCodeimpl(this.data);
    }

    public String toString() {
        return m3170toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3171unboximpl() {
        return this.data;
    }

    public final String getData() {
        return this.data;
    }

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }
}
