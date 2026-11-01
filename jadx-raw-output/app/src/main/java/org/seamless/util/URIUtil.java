package org.seamless.util;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;

/* JADX INFO: loaded from: classes2.dex */
public class URIUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BitSet f65835a = new BitSet() { // from class: org.seamless.util.URIUtil.1
        {
            for (int i10 = 97; i10 <= 122; i10++) {
                set(i10);
            }
            for (int i11 = 65; i11 <= 90; i11++) {
                set(i11);
            }
            for (int i12 = 48; i12 <= 57; i12++) {
                set(i12);
            }
            set(33);
            set(36);
            set(38);
            set(39);
            set(40);
            set(41);
            set(42);
            set(43);
            set(44);
            set(59);
            set(61);
            set(45);
            set(46);
            set(95);
            set(126);
            set(58);
            set(64);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BitSet f65836b = new BitSet() { // from class: org.seamless.util.URIUtil.2
        {
            or(URIUtil.f65835a);
            clear(59);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BitSet f65837c = new BitSet() { // from class: org.seamless.util.URIUtil.3
        {
            or(URIUtil.f65835a);
            clear(59);
            clear(61);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final BitSet f65838d = new BitSet() { // from class: org.seamless.util.URIUtil.4
        {
            or(URIUtil.f65835a);
            clear(59);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final BitSet f65839e = new BitSet() { // from class: org.seamless.util.URIUtil.5
        {
            or(URIUtil.f65835a);
            set(47);
            set(63);
            clear(61);
            clear(38);
            clear(43);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final BitSet f65840f = new BitSet() { // from class: org.seamless.util.URIUtil.6
        {
            or(URIUtil.f65835a);
            set(47);
            set(63);
        }
    };

    public static URI a(URI uri, URI uri2) throws IllegalArgumentException {
        if (uri == null && !uri2.isAbsolute()) {
            throw new IllegalArgumentException("Base URI is null and given URI is not absolute");
        }
        if (uri == null && uri2.isAbsolute()) {
            return uri2;
        }
        if (uri.getPath().length() == 0) {
            try {
                uri = new URI(uri.getScheme(), uri.getAuthority(), "/", uri.getQuery(), uri.getFragment());
            } catch (Exception e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        return uri.resolve(uri2);
    }

    public static URL b(URL url, URI uri) throws IllegalArgumentException {
        if (url == null && !uri.isAbsolute()) {
            throw new IllegalArgumentException("Base URL is null and given URI is not absolute");
        }
        if (url == null && uri.isAbsolute()) {
            try {
                return uri.toURL();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Base URL was null and given URI can't be converted to URL");
            }
        }
        try {
            return a(url.toURI(), uri).toURL();
        } catch (Exception e10) {
            throw new IllegalArgumentException("Base URL is not an URI, or can't create absolute URI (null?), or absolute URI can not be converted to URL", e10);
        }
    }

    public static String c(BitSet bitSet, String str, String str2) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str.length() * 3);
        try {
            for (char c10 : str.toCharArray()) {
                if (bitSet.get(c10)) {
                    sb2.append(c10);
                } else {
                    for (byte b10 : String.valueOf(c10).getBytes(str2)) {
                        sb2.append(String.format("%%%1$02X", Integer.valueOf(b10 & 255)));
                    }
                }
            }
            return sb2.toString();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String d(String str) {
        return c(f65836b, str, "UTF-8");
    }

    public static URL e(URI uri) {
        if (uri == null) {
            return null;
        }
        try {
            return uri.toURL();
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }
}
