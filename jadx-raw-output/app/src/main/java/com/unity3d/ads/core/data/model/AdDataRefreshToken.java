package com.unity3d.ads.core.data.model;

import ck.p;

/* JADX INFO: compiled from: AdContext.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class AdDataRefreshToken {
    private final String data;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m3158boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3159constructorimpl(String str) {
        p.j(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3160equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && p.e(str, ((AdDataRefreshToken) obj).m3164unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3161equalsimpl0(String str, String str2) {
        return p.e(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3162hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3163toStringimpl(String str) {
        return "AdDataRefreshToken(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m3160equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m3162hashCodeimpl(this.data);
    }

    public String toString() {
        return m3163toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3164unboximpl() {
        return this.data;
    }

    public final String getData() {
        return this.data;
    }

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }
}
