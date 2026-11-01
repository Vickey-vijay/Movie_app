package com.inmobi.media;

import com.inmobi.media.Se;
import com.ironsource.C3426d4;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ik.i f23518a = ik.k.q(408, 600);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ik.i f23519b = ik.k.q(com.safedk.android.internal.d.f44769a, 500);

    public static final String a(String str, Map map) {
        StringBuilder sb2;
        ck.p.j(str, "url");
        if (map == null) {
            return str;
        }
        String strP0 = nj.b0.p0(map.entrySet(), C3426d4.j.f28584c, null, null, 0, null, new bk.l() { // from class: b7.e4
            @Override // bk.l
            public final Object invoke(Object obj) {
                return Se.a((Map.Entry) obj);
            }
        }, 30, null);
        if (lk.a0.X(str, "?", false, 2, null)) {
            sb2 = new StringBuilder();
            sb2.append(C3426d4.j.f28584c);
        } else {
            sb2 = new StringBuilder();
            sb2.append("?");
        }
        sb2.append(strP0);
        return str + sb2.toString();
    }

    public static final CharSequence a(Map.Entry entry) throws UnsupportedEncodingException {
        ck.p.j(entry, "<destruct>");
        String str = (String) entry.getKey();
        String str2 = (String) entry.getValue();
        Charset charset = lk.c.f63591b;
        return URLEncoder.encode(str, charset.name()) + "=" + URLEncoder.encode(str2, charset.name());
    }
}
