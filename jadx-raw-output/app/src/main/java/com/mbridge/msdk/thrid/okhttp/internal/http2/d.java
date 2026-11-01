package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.thrid.okio.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Hpack.java */
/* JADX INFO: loaded from: classes8.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c[] f37666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<com.mbridge.msdk.thrid.okio.f, Integer> f37667b;

    /* JADX INFO: compiled from: Hpack.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<c> f37668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.e f37669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f37670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f37671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c[] f37672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f37673f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f37674g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f37675h;

        public a(int i10, s sVar) {
            this(i10, i10, sVar);
        }

        private void a() {
            int i10 = this.f37671d;
            int i11 = this.f37675h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    b(i11 - i10);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f37672e, (Object) null);
            this.f37673f = this.f37672e.length - 1;
            this.f37674g = 0;
            this.f37675h = 0;
        }

        private boolean d(int i10) {
            return i10 >= 0 && i10 <= d.f37666a.length - 1;
        }

        private void e(int i10) throws IOException {
            if (d(i10)) {
                this.f37668a.add(d.f37666a[i10]);
                return;
            }
            int iA = a(i10 - d.f37666a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f37672e;
                if (iA < cVarArr.length) {
                    this.f37668a.add(cVarArr[iA]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void g(int i10) throws IOException {
            this.f37668a.add(new c(c(i10), e()));
        }

        public List<c> c() {
            ArrayList arrayList = new ArrayList(this.f37668a);
            this.f37668a.clear();
            return arrayList;
        }

        public void f() throws IOException {
            while (!this.f37669b.f()) {
                int i10 = this.f37669b.readByte() & 255;
                if (i10 == 128) {
                    throw new IOException("index == 0");
                }
                if ((i10 & 128) == 128) {
                    e(a(i10, 127) - 1);
                } else if (i10 == 64) {
                    g();
                } else if ((i10 & 64) == 64) {
                    f(a(i10, 63) - 1);
                } else if ((i10 & 32) == 32) {
                    int iA = a(i10, 31);
                    this.f37671d = iA;
                    if (iA < 0 || iA > this.f37670c) {
                        throw new IOException("Invalid dynamic table size update " + this.f37671d);
                    }
                    a();
                } else if (i10 == 16 || i10 == 0) {
                    h();
                } else {
                    g(a(i10, 15) - 1);
                }
            }
        }

        public a(int i10, int i11, s sVar) {
            this.f37668a = new ArrayList();
            this.f37672e = new c[8];
            this.f37673f = 7;
            this.f37674g = 0;
            this.f37675h = 0;
            this.f37670c = i10;
            this.f37671d = i11;
            this.f37669b = com.mbridge.msdk.thrid.okio.l.a(sVar);
        }

        private int d() throws IOException {
            return this.f37669b.readByte() & 255;
        }

        private com.mbridge.msdk.thrid.okio.f c(int i10) throws IOException {
            if (d(i10)) {
                return d.f37666a[i10].f37663a;
            }
            int iA = a(i10 - d.f37666a.length);
            if (iA >= 0) {
                c[] cVarArr = this.f37672e;
                if (iA < cVarArr.length) {
                    return cVarArr[iA].f37663a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private void h() throws IOException {
            this.f37668a.add(new c(d.a(e()), e()));
        }

        private int a(int i10) {
            return this.f37673f + 1 + i10;
        }

        private void g() throws IOException {
            a(-1, new c(d.a(e()), e()));
        }

        private void a(int i10, c cVar) {
            this.f37668a.add(cVar);
            int i11 = cVar.f37665c;
            if (i10 != -1) {
                i11 -= this.f37672e[a(i10)].f37665c;
            }
            int i12 = this.f37671d;
            if (i11 > i12) {
                b();
                return;
            }
            int iB = b((this.f37675h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f37674g + 1;
                c[] cVarArr = this.f37672e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f37673f = this.f37672e.length - 1;
                    this.f37672e = cVarArr2;
                }
                int i14 = this.f37673f;
                this.f37673f = i14 - 1;
                this.f37672e[i14] = cVar;
                this.f37674g++;
            } else {
                this.f37672e[i10 + a(i10) + iB] = cVar;
            }
            this.f37675h += i11;
        }

        private int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f37672e.length;
                while (true) {
                    length--;
                    i11 = this.f37673f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f37672e[length].f37665c;
                    i10 -= i13;
                    this.f37675h -= i13;
                    this.f37674g--;
                    i12++;
                }
                c[] cVarArr = this.f37672e;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f37674g);
                this.f37673f += i12;
            }
            return i12;
        }

        public com.mbridge.msdk.thrid.okio.f e() throws IOException {
            int iD = d();
            boolean z10 = (iD & 128) == 128;
            int iA = a(iD, 127);
            if (z10) {
                return com.mbridge.msdk.thrid.okio.f.a(k.b().a(this.f37669b.c(iA)));
            }
            return this.f37669b.b(iA);
        }

        private void f(int i10) throws IOException {
            a(-1, new c(c(i10), e()));
        }

        public int a(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int iD = d();
                if ((iD & 128) == 0) {
                    return i11 + (iD << i13);
                }
                i11 += (iD & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* JADX INFO: compiled from: Hpack.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.thrid.okio.c f37676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f37677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f37678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f37679d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37680e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f37681f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c[] f37682g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f37683h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f37684i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f37685j;

        public b(com.mbridge.msdk.thrid.okio.c cVar) {
            this(4096, true, cVar);
        }

        private int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f37682g.length;
                while (true) {
                    length--;
                    i11 = this.f37683h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f37682g[length].f37665c;
                    i10 -= i13;
                    this.f37685j -= i13;
                    this.f37684i--;
                    i12++;
                }
                c[] cVarArr = this.f37682g;
                int i14 = i11 + 1;
                System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f37684i);
                c[] cVarArr2 = this.f37682g;
                int i15 = this.f37683h + 1;
                Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
                this.f37683h += i12;
            }
            return i12;
        }

        private void b() {
            Arrays.fill(this.f37682g, (Object) null);
            this.f37683h = this.f37682g.length - 1;
            this.f37684i = 0;
            this.f37685j = 0;
        }

        public b(int i10, boolean z10, com.mbridge.msdk.thrid.okio.c cVar) {
            this.f37678c = Integer.MAX_VALUE;
            this.f37682g = new c[8];
            this.f37683h = 7;
            this.f37684i = 0;
            this.f37685j = 0;
            this.f37680e = i10;
            this.f37681f = i10;
            this.f37677b = z10;
            this.f37676a = cVar;
        }

        public void b(int i10) {
            this.f37680e = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f37681f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f37678c = Math.min(this.f37678c, iMin);
            }
            this.f37679d = true;
            this.f37681f = iMin;
            a();
        }

        private void a(c cVar) {
            int i10 = cVar.f37665c;
            int i11 = this.f37681f;
            if (i10 > i11) {
                b();
                return;
            }
            a((this.f37685j + i10) - i11);
            int i12 = this.f37684i + 1;
            c[] cVarArr = this.f37682g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f37683h = this.f37682g.length - 1;
                this.f37682g = cVarArr2;
            }
            int i13 = this.f37683h;
            this.f37683h = i13 - 1;
            this.f37682g[i13] = cVar;
            this.f37684i++;
            this.f37685j += i10;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX WARN: Code duplicated, block: B:26:0x0070  */
        /* JADX WARN: Code duplicated, block: B:28:0x0078  */
        /* JADX WARN: Code duplicated, block: B:30:0x0084  */
        /* JADX WARN: Code duplicated, block: B:33:0x0098 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:34:0x009a  */
        /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00af  */
        /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:46:0x00db  */
        /* JADX WARN: Code duplicated, block: B:55:0x0090 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x00a2 A[SYNTHETIC] */
        public void a(List<c> list) throws IOException {
            int length;
            int length2;
            int i10;
            int length3;
            if (this.f37679d) {
                int i11 = this.f37678c;
                if (i11 < this.f37681f) {
                    a(i11, 31, 32);
                }
                this.f37679d = false;
                this.f37678c = Integer.MAX_VALUE;
                a(this.f37681f, 31, 32);
            }
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                c cVar = list.get(i12);
                com.mbridge.msdk.thrid.okio.f fVarK = cVar.f37663a.k();
                com.mbridge.msdk.thrid.okio.f fVar = cVar.f37664b;
                Integer num = d.f37667b.get(fVarK);
                if (num != null) {
                    length = num.intValue() + 1;
                    if (length <= 1 || length >= 8) {
                        length2 = length;
                        length = -1;
                    } else {
                        c[] cVarArr = d.f37666a;
                        if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[length - 1].f37664b, fVar)) {
                            if (com.mbridge.msdk.thrid.okhttp.internal.c.a(cVarArr[length].f37664b, fVar)) {
                                length2 = length;
                                length++;
                            } else {
                                length2 = length;
                                length = -1;
                            }
                        }
                    }
                    if (length == -1) {
                        length3 = this.f37682g.length;
                        for (i10 = this.f37683h + 1; i10 < length3; i10++) {
                            if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37682g[i10].f37663a, fVarK)) {
                                if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37682g[i10].f37664b, fVar)) {
                                    length = d.f37666a.length + (i10 - this.f37683h);
                                    break;
                                } else if (length2 == -1) {
                                    length2 = (i10 - this.f37683h) + d.f37666a.length;
                                }
                            }
                        }
                    }
                    if (length != -1) {
                        a(length, 127, 128);
                    } else if (length2 == -1) {
                        this.f37676a.writeByte(64);
                        a(fVarK);
                        a(fVar);
                        a(cVar);
                    } else if (!fVarK.b(c.f37657d) && !c.f37662i.equals(fVarK)) {
                        a(length2, 15, 0);
                        a(fVar);
                    } else {
                        a(length2, 63, 64);
                        a(fVar);
                        a(cVar);
                    }
                } else {
                    length = -1;
                }
                length2 = length;
                if (length == -1) {
                    length3 = this.f37682g.length;
                    while (i10 < length3) {
                        if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37682g[i10].f37663a, fVarK)) {
                            if (com.mbridge.msdk.thrid.okhttp.internal.c.a(this.f37682g[i10].f37664b, fVar)) {
                                length = d.f37666a.length + (i10 - this.f37683h);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i10 - this.f37683h) + d.f37666a.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    a(length, 127, 128);
                } else if (length2 == -1) {
                    this.f37676a.writeByte(64);
                    a(fVarK);
                    a(fVar);
                    a(cVar);
                } else if (!fVarK.b(c.f37657d)) {
                    a(length2, 63, 64);
                    a(fVar);
                    a(cVar);
                } else {
                    a(length2, 63, 64);
                    a(fVar);
                    a(cVar);
                }
            }
        }

        public void a(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f37676a.writeByte(i10 | i12);
                return;
            }
            this.f37676a.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f37676a.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f37676a.writeByte(i13);
        }

        public void a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
            if (this.f37677b && k.b().a(fVar) < fVar.j()) {
                com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
                k.b().a(fVar, cVar);
                com.mbridge.msdk.thrid.okio.f fVarO = cVar.o();
                a(fVarO.j(), 127, 128);
                this.f37676a.a(fVarO);
                return;
            }
            a(fVar.j(), 127, 0);
            this.f37676a.a(fVar);
        }

        private void a() {
            int i10 = this.f37681f;
            int i11 = this.f37685j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    a(i11 - i10);
                }
            }
        }
    }

    private static Map<com.mbridge.msdk.thrid.okio.f, Integer> a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f37666a.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f37666a;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f37663a)) {
                linkedHashMap.put(cVarArr[i10].f37663a, Integer.valueOf(i10));
            }
            i10++;
        }
    }

    static {
        com.mbridge.msdk.thrid.okio.f fVar = c.f37659f;
        com.mbridge.msdk.thrid.okio.f fVar2 = c.f37660g;
        com.mbridge.msdk.thrid.okio.f fVar3 = c.f37661h;
        com.mbridge.msdk.thrid.okio.f fVar4 = c.f37658e;
        f37666a = new c[]{new c(c.f37662i, ""), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, "https"), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f37667b = a();
    }

    public static com.mbridge.msdk.thrid.okio.f a(com.mbridge.msdk.thrid.okio.f fVar) throws IOException {
        int iJ = fVar.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            byte bA = fVar.a(i10);
            if (bA >= 65 && bA <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.m());
            }
        }
        return fVar;
    }
}
