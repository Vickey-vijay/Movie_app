package com.unity3d.ads.core.data.model;

import ck.p;

/* JADX INFO: compiled from: AdContext.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AdData {
    private final String data;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m3151boximpl(String str) {
        return new AdData(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3152constructorimpl(String str) {
        p.j(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3153equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && p.e(str, ((AdData) obj).m3157unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3154equalsimpl0(String str, String str2) {
        return p.e(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3155hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3156toStringimpl(String str) {
        return "AdData(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m3153equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m3155hashCodeimpl(this.data);
    }

    public String toString() {
        return m3156toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3157unboximpl() {
        return this.data;
    }

    public final String getData() {
        return this.data;
    }

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }
}
