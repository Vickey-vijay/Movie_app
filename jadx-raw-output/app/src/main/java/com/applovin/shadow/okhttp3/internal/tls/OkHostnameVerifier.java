package com.applovin.shadow.okhttp3.internal.tls;

import ck.p;
import com.applovin.shadow.okhttp3.internal.HostnamesKt;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okio.Utf8;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import lk.a0;
import lk.x;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        p.j(str, "host");
        p.j(sSLSession, "session");
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            p.h(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        p.j(x509Certificate, "certificate");
        return b0.y0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            p.i(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            p.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return s.k();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && p.e(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return s.k();
        }
    }

    private final boolean isAscii(String str) {
        if (str.length() != ((int) Utf8.size$default(str, 0, 0, 3, null))) {
            return false;
        }
        return true;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (p.e(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        p.j(str, "host");
        p.j(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        String str3;
        String str4 = str;
        if ((str4 == null || str.length() == 0) || x.R(str4, ".", false, 2, null) || x.D(str4, "..", false, 2, null)) {
            return false;
        }
        if ((str2 == null || str2.length() == 0) || x.R(str2, ".", false, 2, null) || x.D(str2, "..", false, 2, null)) {
            return false;
        }
        if (!x.D(str4, ".", false, 2, null)) {
            str4 = str4 + '.';
        }
        String str5 = str4;
        if (x.D(str2, ".", false, 2, null)) {
            str3 = str2;
        } else {
            str3 = str2 + '.';
        }
        String strAsciiToLowercase = asciiToLowercase(str3);
        if (!a0.X(strAsciiToLowercase, "*", false, 2, null)) {
            return p.e(str5, strAsciiToLowercase);
        }
        if (!x.R(strAsciiToLowercase, "*.", false, 2, null) || a0.k0(strAsciiToLowercase, '*', 1, false, 4, null) != -1 || str5.length() < strAsciiToLowercase.length() || p.e("*.", strAsciiToLowercase)) {
            return false;
        }
        String strSubstring = strAsciiToLowercase.substring(1);
        p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
        if (!x.D(str5, strSubstring, false, 2, null)) {
            return false;
        }
        int length = str5.length() - strSubstring.length();
        return length <= 0 || a0.q0(str5, '.', length + (-1), false, 4, null) == -1;
    }
}
