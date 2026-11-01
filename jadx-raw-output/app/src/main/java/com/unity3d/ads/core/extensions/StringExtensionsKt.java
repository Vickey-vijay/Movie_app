package com.unity3d.ads.core.extensions;

import ck.p;
import java.net.URLConnection;
import java.util.Arrays;
import lk.c;
import okio.ByteString;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        p.j(str, "<this>");
        byte[] bytes = str.getBytes(c.f63591b);
        p.i(bytes, "this as java.lang.String).getBytes(charset)");
        String strHex = ByteString.of(Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        p.i(strHex, "bytes.sha256().hex()");
        return strHex;
    }

    public static final String guessMimeType(String str) {
        p.j(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
