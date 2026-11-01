package com.mbridge.msdk.thrid.okhttp;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: FormBody.java */
/* JADX INFO: loaded from: classes7.dex */
public final class p extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f37901c = u.a(ShareTarget.ENCODING_TYPE_URL_ENCODED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f37902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f37903b;

    /* JADX INFO: compiled from: FormBody.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f37904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<String> f37905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Charset f37906c;

        public a() {
            this(null);
        }

        public a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f37904a.add(s.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f37906c));
            this.f37905b.add(s.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f37906c));
            return this;
        }

        public a(Charset charset) {
            this.f37904a = new ArrayList();
            this.f37905b = new ArrayList();
            this.f37906c = charset;
        }

        public p a() {
            return new p(this.f37904a, this.f37905b);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public long a() {
        return a((com.mbridge.msdk.thrid.okio.d) null, true);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
        a(dVar, false);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.z
    public u b() {
        return f37901c;
    }

    public p(List<String> list, List<String> list2) {
        this.f37902a = com.mbridge.msdk.thrid.okhttp.internal.c.a(list);
        this.f37903b = com.mbridge.msdk.thrid.okhttp.internal.c.a(list2);
    }

    private long a(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        com.mbridge.msdk.thrid.okio.c cVarA;
        if (z10) {
            cVarA = new com.mbridge.msdk.thrid.okio.c();
        } else {
            cVarA = dVar.a();
        }
        int size = this.f37902a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                cVarA.writeByte(38);
            }
            cVarA.a(this.f37902a.get(i10));
            cVarA.writeByte(61);
            cVarA.a(this.f37903b.get(i10));
        }
        if (!z10) {
            return 0L;
        }
        long size2 = cVarA.size();
        cVarA.k();
        return size2;
    }
}
