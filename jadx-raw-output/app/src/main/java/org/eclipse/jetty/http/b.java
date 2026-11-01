package org.eclipse.jetty.http;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import lm.h;
import lm.i;
import lm.m;
import lm.o;
import lm.p;
import mm.d;
import mm.e;
import mm.g;
import mm.k;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;
import zm.c;

/* JADX INFO: compiled from: HttpGenerator.java */
/* JADX INFO: loaded from: classes10.dex */
public class b extends lm.a {
    public static final byte[] B;
    public static final byte[] C;
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static byte[] I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f65574v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f65575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f65576x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f65577y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f65573z = zm.b.a(b.class);
    public static final C0606b[] A = new C0606b[508];

    /* JADX INFO: renamed from: org.eclipse.jetty.http.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpGenerator.java */
    public static class C0606b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f65578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f65579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f65580c;

        public C0606b() {
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02b0 A[Catch: ArrayIndexOutOfBoundsException -> 0x051c, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x051c, blocks: (B:21:0x0039, B:23:0x0052, B:26:0x005c, B:28:0x0082, B:30:0x00a4, B:32:0x00a9, B:75:0x0197, B:77:0x019d, B:79:0x01a1, B:82:0x01c7, B:84:0x01dc, B:185:0x035a, B:87:0x01e3, B:95:0x01f6, B:96:0x01fc, B:98:0x0202, B:100:0x020f, B:102:0x021b, B:104:0x0224, B:105:0x022f, B:107:0x023f, B:114:0x024d, B:115:0x0254, B:118:0x0260, B:120:0x026a, B:121:0x026f, B:127:0x027f, B:129:0x0288, B:128:0x0285, B:130:0x0291, B:132:0x0297, B:133:0x029e, B:135:0x02a2, B:137:0x02a8, B:139:0x02b0, B:141:0x02b6, B:142:0x02ba, B:144:0x02c2, B:146:0x02c8, B:148:0x02ce, B:150:0x02d4, B:152:0x02e2, B:154:0x02e5, B:156:0x02f3, B:160:0x02fd, B:162:0x0306, B:184:0x0353, B:161:0x0303, B:163:0x030c, B:165:0x0310, B:167:0x0316, B:169:0x031d, B:171:0x0323, B:172:0x0327, B:174:0x032f, B:176:0x0335, B:178:0x033b, B:181:0x0344, B:183:0x034e, B:182:0x034b, B:188:0x037b, B:234:0x0430, B:237:0x0438, B:239:0x043f, B:241:0x044b, B:242:0x0451, B:243:0x0458, B:244:0x0459, B:245:0x0460, B:247:0x0466, B:249:0x046d, B:251:0x0473, B:254:0x047d, B:256:0x0481, B:258:0x048a, B:260:0x04b1, B:262:0x04ba, B:264:0x04e1, B:266:0x04fe, B:268:0x0504, B:270:0x050a, B:271:0x0511, B:195:0x038c, B:197:0x0392, B:203:0x03a0, B:204:0x03a9, B:205:0x03b5, B:207:0x03bb, B:209:0x03bf, B:210:0x03c7, B:212:0x03cb, B:214:0x03d1, B:216:0x03d7, B:219:0x03e1, B:221:0x03e5, B:222:0x0409, B:224:0x0411, B:229:0x041b, B:231:0x0423, B:233:0x0429, B:31:0x00a7, B:33:0x00b5, B:35:0x00b9, B:37:0x00c2, B:42:0x00cc, B:43:0x00d2, B:45:0x00d9, B:49:0x00e1, B:51:0x0115, B:53:0x013a, B:58:0x0163, B:61:0x0169, B:63:0x0171, B:64:0x0174, B:66:0x017a, B:72:0x018c, B:74:0x0194, B:52:0x0135, B:54:0x0142, B:56:0x0146, B:57:0x014e), top: B:276:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02b6 A[Catch: ArrayIndexOutOfBoundsException -> 0x051c, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x051c, blocks: (B:21:0x0039, B:23:0x0052, B:26:0x005c, B:28:0x0082, B:30:0x00a4, B:32:0x00a9, B:75:0x0197, B:77:0x019d, B:79:0x01a1, B:82:0x01c7, B:84:0x01dc, B:185:0x035a, B:87:0x01e3, B:95:0x01f6, B:96:0x01fc, B:98:0x0202, B:100:0x020f, B:102:0x021b, B:104:0x0224, B:105:0x022f, B:107:0x023f, B:114:0x024d, B:115:0x0254, B:118:0x0260, B:120:0x026a, B:121:0x026f, B:127:0x027f, B:129:0x0288, B:128:0x0285, B:130:0x0291, B:132:0x0297, B:133:0x029e, B:135:0x02a2, B:137:0x02a8, B:139:0x02b0, B:141:0x02b6, B:142:0x02ba, B:144:0x02c2, B:146:0x02c8, B:148:0x02ce, B:150:0x02d4, B:152:0x02e2, B:154:0x02e5, B:156:0x02f3, B:160:0x02fd, B:162:0x0306, B:184:0x0353, B:161:0x0303, B:163:0x030c, B:165:0x0310, B:167:0x0316, B:169:0x031d, B:171:0x0323, B:172:0x0327, B:174:0x032f, B:176:0x0335, B:178:0x033b, B:181:0x0344, B:183:0x034e, B:182:0x034b, B:188:0x037b, B:234:0x0430, B:237:0x0438, B:239:0x043f, B:241:0x044b, B:242:0x0451, B:243:0x0458, B:244:0x0459, B:245:0x0460, B:247:0x0466, B:249:0x046d, B:251:0x0473, B:254:0x047d, B:256:0x0481, B:258:0x048a, B:260:0x04b1, B:262:0x04ba, B:264:0x04e1, B:266:0x04fe, B:268:0x0504, B:270:0x050a, B:271:0x0511, B:195:0x038c, B:197:0x0392, B:203:0x03a0, B:204:0x03a9, B:205:0x03b5, B:207:0x03bb, B:209:0x03bf, B:210:0x03c7, B:212:0x03cb, B:214:0x03d1, B:216:0x03d7, B:219:0x03e1, B:221:0x03e5, B:222:0x0409, B:224:0x0411, B:229:0x041b, B:231:0x0423, B:233:0x0429, B:31:0x00a7, B:33:0x00b5, B:35:0x00b9, B:37:0x00c2, B:42:0x00cc, B:43:0x00d2, B:45:0x00d9, B:49:0x00e1, B:51:0x0115, B:53:0x013a, B:58:0x0163, B:61:0x0169, B:63:0x0171, B:64:0x0174, B:66:0x017a, B:72:0x018c, B:74:0x0194, B:52:0x0135, B:54:0x0142, B:56:0x0146, B:57:0x014e), top: B:276:0x0039 }] */
    @Override // lm.a, lm.c
    public void A(org.eclipse.jetty.http.a aVar, boolean z10) throws IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        org.eclipse.jetty.http.a.h hVar;
        StringBuilder sb2;
        org.eclipse.jetty.http.a.h hVar2;
        int i14;
        int i15;
        if (this.f63723c != 0) {
            return;
        }
        if (E() && this.f63724d == 0) {
            throw new EofException();
        }
        boolean z11 = this.f63731k;
        if (z11 && !z10) {
            throw new IllegalStateException("last?");
        }
        this.f63731k = z11 | z10;
        if (this.f63735o == null) {
            this.f63735o = this.f63721a.b();
        }
        try {
            int i16 = 48;
            int i17 = 0;
            int i18 = 1;
            if (j()) {
                this.f63734n = Boolean.TRUE;
                if (this.f63725e == 9) {
                    this.f63730j = 0L;
                    this.f63735o.S(this.f63727g);
                    this.f63735o.put((byte) 32);
                    this.f63735o.X(this.f63728h.getBytes("UTF-8"));
                    this.f63735o.X(m.f63844a);
                    this.f63723c = 3;
                    this.f63733m = true;
                    return;
                }
                this.f63735o.S(this.f63727g);
                this.f63735o.put((byte) 32);
                this.f63735o.X(this.f63728h.getBytes("UTF-8"));
                this.f63735o.put((byte) 32);
                this.f63735o.S(this.f63725e == 10 ? o.f63863c : o.f63864d);
                this.f63735o.X(m.f63844a);
            } else {
                int i19 = this.f63725e;
                if (i19 == 9) {
                    this.f63734n = Boolean.FALSE;
                    this.f63730j = -1L;
                    this.f63723c = 2;
                    return;
                }
                if (this.f63734n == null) {
                    this.f63734n = Boolean.valueOf(i19 > 10);
                }
                int i20 = this.f63724d;
                C0606b[] c0606bArr = A;
                C0606b c0606b = i20 < c0606bArr.length ? c0606bArr[i20] : null;
                if (c0606b == null) {
                    this.f63735o.S(o.f63864d);
                    this.f63735o.put((byte) 32);
                    this.f63735o.put((byte) ((this.f63724d / 100) + 48));
                    this.f63735o.put((byte) (((this.f63724d % 100) / 10) + 48));
                    this.f63735o.put((byte) ((this.f63724d % 10) + 48));
                    this.f63735o.put((byte) 32);
                    d dVar = this.f63726f;
                    if (dVar == null) {
                        this.f63735o.put((byte) ((this.f63724d / 100) + 48));
                        this.f63735o.put((byte) (((this.f63724d % 100) / 10) + 48));
                        this.f63735o.put((byte) ((this.f63724d % 10) + 48));
                    } else {
                        this.f63735o.S(dVar);
                    }
                    this.f63735o.X(m.f63844a);
                } else if (this.f63726f == null) {
                    this.f63735o.S(c0606b.f65580c);
                } else {
                    this.f63735o.S(c0606b.f65579b);
                    this.f63735o.S(this.f63726f);
                    this.f63735o.X(m.f63844a);
                }
                int i21 = this.f63724d;
                if (i21 < 200 && i21 >= 100) {
                    this.f63733m = true;
                    this.f63737q = null;
                    d dVar2 = this.f63736p;
                    if (dVar2 != null) {
                        dVar2.clear();
                    }
                    if (this.f63724d != 101) {
                        this.f63735o.X(m.f63844a);
                        this.f63723c = 2;
                        return;
                    }
                } else if (i21 == 204 || i21 == 304) {
                    this.f63733m = true;
                    this.f63737q = null;
                    d dVar3 = this.f63736p;
                    if (dVar3 != null) {
                        dVar3.clear();
                    }
                }
            }
            if (this.f63724d >= 200 && this.f63738r != null) {
                this.f63735o.S(i.f63794m);
                this.f63735o.put((byte) 58);
                this.f63735o.put((byte) 32);
                this.f63735o.S(this.f63738r);
                this.f63735o.X(G);
            }
            int i22 = -1;
            int i23 = 11;
            if (aVar != null) {
                int iK = aVar.K();
                int i24 = 0;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                sb2 = null;
                org.eclipse.jetty.http.a.h hVar3 = null;
                org.eclipse.jetty.http.a.h hVar4 = null;
                while (i24 < iK) {
                    org.eclipse.jetty.http.a.h hVarQ = aVar.q(i24);
                    if (hVarQ != null) {
                        int iG = hVarQ.g();
                        if (iG == i18) {
                            i15 = iK;
                            i24 = i24;
                            if (j()) {
                                hVarQ.k(this.f63735o);
                            }
                            int iJ = hVarQ.j();
                            if (iJ == i22) {
                                String[] strArrSplit = hVarQ.h().split(StringUtils.COMMA);
                                int i25 = 0;
                                while (strArrSplit != null && i25 < strArrSplit.length) {
                                    e.a aVarB = h.f63761d.b(strArrSplit[i25].trim());
                                    if (aVarB != null) {
                                        int iE = aVarB.e();
                                        if (iE == i18) {
                                            if (E()) {
                                                this.f63734n = Boolean.FALSE;
                                            }
                                            if (!this.f63734n.booleanValue() && E() && this.f63730j == -3) {
                                                this.f63730j = -1L;
                                            }
                                            i11 = 0;
                                            i12 = 1;
                                        } else if (iE != 5) {
                                            if (sb2 == null) {
                                                sb2 = new StringBuilder();
                                            } else {
                                                sb2.append(',');
                                            }
                                            sb2.append(strArrSplit[i25]);
                                        } else if (this.f63725e == 10) {
                                            if (E()) {
                                                this.f63734n = Boolean.TRUE;
                                            }
                                            i11 = i18;
                                        }
                                    } else {
                                        if (sb2 == null) {
                                            sb2 = new StringBuilder();
                                        } else {
                                            sb2.append(',');
                                        }
                                        sb2.append(strArrSplit[i25]);
                                    }
                                    i25++;
                                    i18 = 1;
                                }
                            } else if (iJ == i18) {
                                if (E()) {
                                    this.f63734n = Boolean.FALSE;
                                }
                                if (!this.f63734n.booleanValue() && E() && this.f63730j == -3) {
                                    this.f63730j = -1L;
                                }
                                i12 = i18;
                            } else if (iJ != 5) {
                                if (iJ != i23) {
                                    if (sb2 == null) {
                                        sb2 = new StringBuilder();
                                    } else {
                                        sb2.append(',');
                                    }
                                    sb2.append(hVarQ.h());
                                } else if (E()) {
                                    hVarQ.k(this.f63735o);
                                } else {
                                    if (E()) {
                                        this.f63734n = Boolean.FALSE;
                                    }
                                    if (!this.f63734n.booleanValue()) {
                                        this.f63730j = -1L;
                                    }
                                    i12 = i18;
                                }
                            } else if (this.f63725e == 10) {
                                if (E()) {
                                    this.f63734n = Boolean.TRUE;
                                }
                                i11 = i18;
                            }
                        } else if (iG == 5) {
                            i15 = iK;
                            i24 = i24;
                            if (this.f63725e == i23) {
                                hVar4 = hVarQ;
                            }
                        } else if (iG == 12) {
                            i24 = i24;
                            long jE = hVarQ.e();
                            this.f63730j = jE;
                            i15 = iK;
                            long j10 = this.f63729i;
                            hVar3 = (jE < j10 || (this.f63731k && jE != j10)) ? null : hVarQ;
                            hVarQ.k(this.f63735o);
                        } else if (iG == 16) {
                            if (g.a(p.f63870f, hVarQ.i())) {
                                this.f63730j = -4L;
                            }
                            hVarQ.k(this.f63735o);
                            i10 = i18;
                            i15 = iK;
                        } else if (iG != i16) {
                            hVarQ.k(this.f63735o);
                        } else if (f()) {
                            hVarQ.k(this.f63735o);
                            i13 = i18;
                        }
                        i24++;
                        iK = i15;
                        i22 = -1;
                        i18 = 1;
                        i23 = 11;
                        i16 = 48;
                    }
                    i15 = iK;
                    i24 = i24;
                    i24++;
                    iK = i15;
                    i22 = -1;
                    i18 = 1;
                    i23 = 11;
                    i16 = 48;
                }
                hVar2 = hVar3;
                hVar = hVar4;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                hVar = null;
                sb2 = null;
                hVar2 = null;
            }
            int i26 = (int) this.f63730j;
            if (i26 != -3) {
                if (i26 == -1) {
                    this.f63734n = Boolean.valueOf(j());
                } else if (i26 == 0 && hVar2 == null && E() && (i14 = this.f63724d) >= 200 && i14 != 204 && i14 != 304) {
                    this.f63735o.X(C);
                }
            } else if (E() && this.f63733m) {
                this.f63730j = 0L;
                this.f63729i = 0L;
            } else if (this.f63731k) {
                this.f63730j = this.f63729i;
                if (hVar2 == null && ((E() || this.f63730j > 0 || i10 != 0) && !this.f63733m)) {
                    this.f63735o.S(i.f63788j);
                    this.f63735o.put((byte) 58);
                    this.f63735o.put((byte) 32);
                    g.d(this.f63735o, this.f63730j);
                    this.f63735o.X(m.f63844a);
                }
            } else {
                this.f63730j = (!this.f63734n.booleanValue() || this.f63725e < 11) ? -1L : -2L;
                if (j() && this.f63730j == -1) {
                    this.f63730j = 0L;
                    this.f63733m = true;
                }
            }
            if (this.f63730j == -2) {
                if (hVar == null || 2 == hVar.j()) {
                    this.f63735o.X(H);
                } else {
                    if (!hVar.h().endsWith("chunked")) {
                        throw new IllegalArgumentException("BAD TE");
                    }
                    hVar.k(this.f63735o);
                }
            }
            if (this.f63730j == -1) {
                this.f63734n = Boolean.FALSE;
            } else {
                i17 = i11;
            }
            if (E()) {
                if (!this.f63734n.booleanValue() && (i12 != 0 || this.f63725e > 10)) {
                    this.f63735o.X(E);
                    if (sb2 != null) {
                        d dVar4 = this.f63735o;
                        dVar4.W(dVar4.T() - 2);
                        this.f63735o.put((byte) 44);
                        this.f63735o.X(sb2.toString().getBytes());
                        this.f63735o.X(G);
                    }
                } else if (i17 != 0) {
                    this.f63735o.X(D);
                    if (sb2 != null) {
                        d dVar5 = this.f63735o;
                        dVar5.W(dVar5.T() - 2);
                        this.f63735o.put((byte) 44);
                        this.f63735o.X(sb2.toString().getBytes());
                        this.f63735o.X(G);
                    }
                } else if (sb2 != null) {
                    this.f63735o.X(F);
                    this.f63735o.X(sb2.toString().getBytes());
                    this.f63735o.X(G);
                }
            }
            if (i13 == 0 && this.f63724d > 199 && f()) {
                this.f63735o.X(I);
            }
            this.f63735o.X(m.f63844a);
            this.f63723c = 2;
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new RuntimeException("Header>" + this.f63735o.e0(), e10);
        }
    }

    static {
        int length = o.f63864d.length();
        for (int i10 = 0; i10 < A.length; i10++) {
            HttpStatus.Code codeA = HttpStatus.a(i10);
            if (codeA != null) {
                String message = codeA.getMessage();
                int i11 = length + 5;
                int length2 = message.length() + i11 + 2;
                byte[] bArr = new byte[length2];
                o.f63864d.J(0, bArr, 0, length);
                bArr[length + 0] = 32;
                bArr[length + 1] = (byte) ((i10 / 100) + 48);
                bArr[length + 2] = (byte) (((i10 % 100) / 10) + 48);
                bArr[length + 3] = (byte) ((i10 % 10) + 48);
                bArr[length + 4] = 32;
                for (int i12 = 0; i12 < message.length(); i12++) {
                    bArr[i11 + i12] = (byte) message.charAt(i12);
                }
                bArr[message.length() + i11] = 13;
                bArr[length + 6 + message.length()] = 10;
                C0606b[] c0606bArr = A;
                C0606b c0606b = new C0606b();
                c0606bArr[i10] = c0606b;
                c0606b.f65578a = new mm.h(bArr, i11, (length2 - length) - 7, 0);
                c0606bArr[i10].f65579b = new mm.h(bArr, 0, i11, 0);
                c0606bArr[i10].f65580c = new mm.h(bArr, 0, length2, 0);
            }
        }
        B = new byte[]{48, 13, 10, 13, 10};
        C = xm.o.c("Content-Length: 0\r\n");
        D = xm.o.c("Connection: keep-alive\r\n");
        E = xm.o.c("Connection: close\r\n");
        F = xm.o.c("Connection: ");
        G = xm.o.c("\r\n");
        H = xm.o.c("Transfer-Encoding: chunked\r\n");
        I = xm.o.c("Server: Jetty(7.0.x)\r\n");
    }

    public static void I(String str) {
        I = xm.o.c("Server: Jetty(" + str + ")\r\n");
    }

    public boolean D() {
        d dVar;
        d dVar2;
        d dVar3 = this.f63735o;
        return (dVar3 == null || dVar3.length() == 0) && ((dVar = this.f63736p) == null || dVar.length() == 0) && ((dVar2 = this.f63737q) == null || dVar2.length() == 0);
    }

    public boolean E() {
        return this.f63727g == null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0199  */
    /* JADX WARN: Code duplicated, block: B:103:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x016b  */
    public final void F() {
        int length;
        d dVar;
        d dVar2;
        int iL;
        byte[] bArr;
        d dVar3;
        d dVar4;
        int iL2;
        byte[] bArr2;
        d dVar5;
        d dVar6;
        d dVar7;
        d dVar8;
        d dVar9;
        if (!this.f65577y) {
            if (!this.f65574v && (dVar8 = this.f63737q) != null && dVar8.length() > 0 && (dVar9 = this.f63736p) != null && dVar9.L() > 0) {
                this.f63737q.skip(this.f63736p.S(this.f63737q));
                if (this.f63737q.length() == 0) {
                    this.f63737q = null;
                }
            }
            if (this.f63730j == -2) {
                if (!this.f65574v || (!((dVar6 = this.f63736p) == null || dVar6.length() == 0) || (dVar7 = this.f63737q) == null)) {
                    d dVar10 = this.f63736p;
                    if (dVar10 != null && (length = dVar10.length()) > 0) {
                        this.f65577y = true;
                        if (this.f63736p.getIndex() == 12) {
                            d dVar11 = this.f63736p;
                            int index = dVar11.getIndex() - 2;
                            byte[] bArr3 = m.f63844a;
                            dVar11.M(index, bArr3, 0, 2);
                            d dVar12 = this.f63736p;
                            dVar12.i0(dVar12.getIndex() - 2);
                            g.b(this.f63736p, length);
                            if (this.f65575w) {
                                d dVar13 = this.f63736p;
                                dVar13.M(dVar13.getIndex() - 2, bArr3, 0, 2);
                                d dVar14 = this.f63736p;
                                dVar14.i0(dVar14.getIndex() - 2);
                                this.f65575w = false;
                            }
                        } else {
                            if (this.f63735o == null) {
                                this.f63735o = this.f63721a.b();
                            }
                            if (this.f65575w) {
                                if (this.f63735o.length() > 0) {
                                    throw new IllegalStateException("EOC");
                                }
                                this.f63735o.X(m.f63844a);
                                this.f65575w = false;
                            }
                            g.e(this.f63735o, length);
                            this.f63735o.X(m.f63844a);
                        }
                        if (this.f63736p.L() >= 2) {
                            this.f63736p.X(m.f63844a);
                        } else {
                            this.f65575w = true;
                        }
                    }
                } else {
                    int length2 = dVar7.length();
                    this.f65577y = true;
                    if (this.f63735o == null) {
                        this.f63735o = this.f63721a.b();
                    }
                    if (this.f65575w) {
                        if (this.f63735o.length() > 0) {
                            throw new IllegalStateException("EOC");
                        }
                        this.f63735o.X(m.f63844a);
                        this.f65575w = false;
                    }
                    g.e(this.f63735o, length2);
                    this.f63735o.X(m.f63844a);
                    this.f65575w = true;
                }
                if (this.f65576x && ((dVar = this.f63737q) == null || dVar.length() == 0)) {
                    if (this.f63735o == null && this.f63736p == null) {
                        this.f63735o = this.f63721a.b();
                    }
                    if (this.f65575w) {
                        if (this.f63736p != null || (dVar5 = this.f63735o) == null) {
                            dVar4 = this.f63736p;
                            if (dVar4 != null) {
                                iL2 = dVar4.L();
                                bArr2 = m.f63844a;
                                if (iL2 >= bArr2.length) {
                                    this.f63736p.X(bArr2);
                                    this.f65575w = false;
                                }
                            }
                        } else {
                            int iL3 = dVar5.L();
                            byte[] bArr4 = m.f63844a;
                            if (iL3 >= bArr4.length) {
                                this.f63735o.X(bArr4);
                                this.f65575w = false;
                            } else {
                                dVar4 = this.f63736p;
                                if (dVar4 != null) {
                                    iL2 = dVar4.L();
                                    bArr2 = m.f63844a;
                                    if (iL2 >= bArr2.length) {
                                        this.f63736p.X(bArr2);
                                        this.f65575w = false;
                                    }
                                }
                            }
                        }
                    }
                    if (!this.f65575w && this.f65576x) {
                        if (this.f63736p != null || (dVar3 = this.f63735o) == null) {
                            dVar2 = this.f63736p;
                            if (dVar2 != null) {
                                iL = dVar2.L();
                                bArr = B;
                                if (iL >= bArr.length) {
                                    if (!this.f63732l) {
                                        this.f63736p.X(bArr);
                                        this.f65577y = true;
                                    }
                                    this.f65576x = false;
                                }
                            }
                        } else {
                            int iL4 = dVar3.L();
                            byte[] bArr5 = B;
                            if (iL4 >= bArr5.length) {
                                if (!this.f63732l) {
                                    this.f63735o.X(bArr5);
                                    this.f65577y = true;
                                }
                                this.f65576x = false;
                            } else {
                                dVar2 = this.f63736p;
                                if (dVar2 != null) {
                                    iL = dVar2.L();
                                    bArr = B;
                                    if (iL >= bArr.length) {
                                        if (!this.f63732l) {
                                            this.f63736p.X(bArr);
                                            this.f65577y = true;
                                        }
                                        this.f65576x = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        d dVar15 = this.f63737q;
        if (dVar15 == null || dVar15.length() != 0) {
            return;
        }
        this.f63737q = null;
    }

    public void G(int i10) throws IOException {
        if (this.f63723c != 0) {
            return;
        }
        if (i10 < 100 || i10 > 199) {
            throw new IllegalArgumentException("!1xx");
        }
        C0606b c0606b = A[i10];
        if (c0606b == null) {
            throw new IllegalArgumentException(i10 + "?");
        }
        if (this.f63735o == null) {
            this.f63735o = this.f63721a.b();
        }
        this.f63735o.S(c0606b.f65580c);
        this.f63735o.X(m.f63844a);
        while (this.f63735o.length() > 0) {
            try {
                int iU = this.f63722b.u(this.f63735o);
                if (iU < 0 || !this.f63722b.isOpen()) {
                    throw new EofException();
                }
                if (iU == 0) {
                    Thread.sleep(100L);
                }
            } catch (InterruptedException e10) {
                f65573z.a(e10);
                throw new InterruptedIOException(e10.toString());
            }
        }
    }

    public void H(d dVar) throws IOException {
        d dVar2;
        if (this.f63733m || this.f63723c != 0 || (((dVar2 = this.f63737q) != null && dVar2.length() > 0) || this.f65577y || this.f63732l)) {
            throw new IllegalStateException();
        }
        this.f63731k = true;
        this.f63737q = dVar;
        this.f65574v = true;
        this.f63723c = 3;
        long length = dVar.length();
        this.f63729i = length;
        this.f63730j = length;
    }

    @Override // lm.a, lm.c
    public void complete() throws IOException {
        if (this.f63723c == 4) {
            return;
        }
        super.complete();
        if (this.f63723c < 3) {
            this.f63723c = 3;
            if (this.f63730j == -2) {
                this.f65576x = true;
            }
        }
        z();
    }

    @Override // lm.a
    public boolean j() {
        return this.f63727g != null;
    }

    @Override // lm.a
    public int m() throws IOException {
        if (this.f63733m || this.f63731k || this.f63723c == 4) {
            return -1;
        }
        d dVar = this.f63737q;
        if ((dVar != null && dVar.length() > 0) || this.f65577y) {
            z();
            if ((dVar != null && dVar.length() > 0) || this.f65577y) {
                throw new IllegalStateException("FULL");
            }
        }
        if (this.f63736p == null) {
            this.f63736p = this.f63721a.getBuffer();
        }
        this.f63729i -= (long) this.f63736p.length();
        if (this.f63732l) {
            return Integer.MAX_VALUE;
        }
        return this.f63736p.L() - (this.f63730j == -2 ? 12 : 0);
    }

    public final int o() {
        d dVar;
        d dVar2 = this.f63735o;
        int i10 = 0;
        int i11 = (dVar2 == null || dVar2.length() <= 0) ? 0 : 4;
        d dVar3 = this.f63736p;
        int i12 = i11 | ((dVar3 == null || dVar3.length() <= 0) ? 0 : 2);
        if (this.f65574v && (dVar = this.f63737q) != null && dVar.length() > 0) {
            i10 = 1;
        }
        return i12 | i10;
    }

    @Override // lm.a, lm.c
    public void reset() {
        k kVar;
        Boolean bool = this.f63734n;
        if (bool != null && !bool.booleanValue() && (kVar = this.f63722b) != null && !kVar.s()) {
            try {
                this.f63722b.l();
            } catch (IOException e10) {
                f65573z.h(e10);
            }
        }
        super.reset();
        d dVar = this.f63736p;
        if (dVar != null) {
            dVar.clear();
        }
        d dVar2 = this.f63735o;
        if (dVar2 != null) {
            dVar2.clear();
        }
        if (this.f63737q != null) {
            this.f63737q = null;
        }
        this.f65574v = false;
        this.f65575w = false;
        this.f65576x = false;
        this.f65577y = false;
        this.f63727g = null;
        this.f63728h = null;
        this.f63733m = false;
    }

    @Override // lm.c
    public void t(d dVar, boolean z10) throws IOException {
        d dVar2;
        d dVarC;
        if (this.f63733m) {
            throw new IllegalStateException("NO CONTENT");
        }
        if (this.f63731k || this.f63723c == 4) {
            f65573z.g("Ignoring extra content {}", dVar);
            dVar.clear();
            return;
        }
        this.f63731k = z10;
        d dVar3 = this.f63737q;
        if ((dVar3 != null && dVar3.length() > 0) || this.f65577y) {
            if (this.f63722b.s()) {
                throw new EofException();
            }
            z();
            d dVar4 = this.f63737q;
            if (dVar4 != null && dVar4.length() > 0) {
                if (this.f65577y) {
                    dVarC = this.f63721a.c(this.f63737q.length() + 12 + dVar.length());
                    dVarC.S(this.f63737q);
                    byte[] bArr = m.f63844a;
                    dVarC.X(bArr);
                    g.e(dVarC, dVar.length());
                    dVarC.X(bArr);
                    dVarC.S(dVar);
                } else {
                    dVarC = this.f63721a.c(this.f63737q.length() + dVar.length());
                    dVarC.S(this.f63737q);
                    dVarC.S(dVar);
                }
                dVar = dVarC;
            }
        }
        this.f63737q = dVar;
        this.f63729i += (long) dVar.length();
        if (this.f63732l) {
            dVar.clear();
            this.f63737q = null;
            return;
        }
        if (this.f63722b != null && (((dVar2 = this.f63736p) == null || dVar2.length() == 0) && this.f63737q.length() > 0 && (this.f63731k || (a() && this.f63737q.length() > 1024)))) {
            this.f65574v = true;
            return;
        }
        if (this.f65577y) {
            return;
        }
        if (this.f63736p == null) {
            this.f63736p = this.f63721a.getBuffer();
        }
        this.f63737q.skip(this.f63736p.S(this.f63737q));
        if (this.f63737q.length() == 0) {
            this.f63737q = null;
        }
    }

    public String toString() {
        d dVar = this.f63735o;
        d dVar2 = this.f63736p;
        d dVar3 = this.f63737q;
        Object[] objArr = new Object[5];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = Integer.valueOf(this.f63723c);
        objArr[2] = Integer.valueOf(dVar == null ? -1 : dVar.length());
        objArr[3] = Integer.valueOf(dVar2 == null ? -1 : dVar2.length());
        objArr[4] = Integer.valueOf(dVar3 != null ? dVar3.length() : -1);
        return String.format("%s{s=%d,h=%d,b=%d,c=%d}", objArr);
    }

    @Override // lm.a, lm.c
    public int z() throws IOException {
        d dVar;
        Boolean bool;
        d dVar2;
        d dVar3;
        try {
            if (this.f63723c == 0) {
                throw new IllegalStateException("State==HEADER");
            }
            F();
            if (this.f63722b == null) {
                if (this.f65575w && (dVar3 = this.f63736p) != null) {
                    dVar3.X(m.f63844a);
                }
                if (this.f65576x && (dVar2 = this.f63736p) != null && !this.f63732l) {
                    dVar2.X(B);
                }
                this.f65575w = false;
                this.f65576x = false;
                return 0;
            }
            int iU = -1;
            int iO = o();
            int i10 = 0;
            while (true) {
                switch (iO) {
                    case 0:
                        d dVar4 = this.f63735o;
                        if (dVar4 != null) {
                            dVar4.clear();
                        }
                        this.f65574v = false;
                        this.f65577y = false;
                        d dVar5 = this.f63736p;
                        if (dVar5 != null) {
                            dVar5.clear();
                            if (this.f63730j == -2) {
                                this.f63736p.W(12);
                                this.f63736p.i0(12);
                                d dVar6 = this.f63737q;
                                if (dVar6 != null && dVar6.length() < this.f63736p.L() && this.f63723c != 3) {
                                    this.f63736p.S(this.f63737q);
                                    this.f63737q.clear();
                                    this.f63737q = null;
                                }
                            }
                        }
                        if (this.f65575w || this.f65576x || !((dVar = this.f63737q) == null || dVar.length() == 0)) {
                            F();
                        } else {
                            if (this.f63723c == 3) {
                                this.f63723c = 4;
                            }
                            if (this.f63723c == 4 && (bool = this.f63734n) != null && !bool.booleanValue() && this.f63724d != 100 && this.f63727g == null) {
                                this.f63722b.l();
                            }
                        }
                        iU = 0;
                        break;
                    case 1:
                        iU = this.f63722b.u(this.f63737q);
                        break;
                    case 2:
                        iU = this.f63722b.u(this.f63736p);
                        break;
                    case 3:
                        iU = this.f63722b.i(this.f63736p, this.f63737q, null);
                        break;
                    case 4:
                        iU = this.f63722b.u(this.f63735o);
                        break;
                    case 5:
                        iU = this.f63722b.i(this.f63735o, this.f63737q, null);
                        break;
                    case 6:
                        iU = this.f63722b.i(this.f63735o, this.f63736p, null);
                        break;
                    case 7:
                        throw new IllegalStateException();
                }
                if (iU > 0) {
                    i10 += iU;
                }
                int iO2 = o();
                if (iU <= 0 && (iO2 == 0 || iO != 0)) {
                    return i10;
                }
                iO = iO2;
            }
        } catch (IOException e10) {
            f65573z.h(e10);
            if (e10 instanceof EofException) {
                throw e10;
            }
            throw new EofException(e10);
        }
    }

    public b(Buffers buffers, k kVar) {
        super(buffers, kVar);
        this.f65574v = false;
        this.f65575w = false;
        this.f65576x = false;
        this.f65577y = false;
    }

    @Override // lm.a
    public boolean h() {
        d dVar;
        if (!super.h() && !this.f65577y && !this.f65574v && (this.f63730j != -2 || (dVar = this.f63736p) == null || dVar.L() >= 12)) {
            return false;
        }
        return true;
    }
}
