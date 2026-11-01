package com.yandex.div.evaluable.types;

import ck.i;
import ck.p;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: compiled from: Url.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Url {
    public static final Companion Companion = new Companion(null);
    private final String value;

    /* JADX INFO: compiled from: Url.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final boolean isValid(String str) {
            try {
                new URL(str);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        /* JADX INFO: renamed from: from-VcSV9u8, reason: not valid java name */
        public final String m3386fromVcSV9u8(String str) throws IllegalArgumentException {
            p.j(str, "urlString");
            if (isValid(str)) {
                return Url.m3380constructorimpl(str);
            }
            throw new IllegalArgumentException("Invalid url " + str);
        }
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m3379boximpl(String str) {
        return new Url(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m3380constructorimpl(String str) {
        p.j(str, "value");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m3381equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && p.e(str, ((Url) obj).m3385unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3382equalsimpl0(String str, String str2) {
        return p.e(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m3383hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m3384toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m3381equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m3383hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3385unboximpl() {
        return this.value;
    }

    public String toString() {
        return m3384toStringimpl(this.value);
    }

    private /* synthetic */ Url(String str) {
        this.value = str;
    }
}
