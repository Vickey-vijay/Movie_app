package yads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class g93 implements rw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib2 f77709a = new ib2(new byte[5]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f77710b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f77711c = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h93 f77713e;

    @Override // yads.rw2
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
    }

    public g93(h93 h93Var, int i10) {
        this.f77713e = h93Var;
        this.f77712d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0153  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:98:0x021d  */
    @Override // yads.rw2
    public final void a(jb2 jb2Var) {
        y63 y63Var;
        int i10;
        int i11;
        m93 m93VarA;
        int i12;
        if (jb2Var.m() != 2) {
            return;
        }
        h93 h93Var = this.f77713e;
        int i13 = h93Var.f78127a;
        int i14 = 0;
        if (i13 == 1 || i13 == 2 || h93Var.f78139m == 1) {
            y63Var = (y63) h93Var.f78129c.get(0);
        } else {
            y63Var = new y63(((y63) h93Var.f78129c.get(0)).a());
            this.f77713e.f78129c.add(y63Var);
        }
        if ((jb2Var.m() & 128) == 0) {
            return;
        }
        jb2Var.e(jb2Var.f78967b + 1);
        int iR = jb2Var.r();
        int i15 = 3;
        jb2Var.e(jb2Var.f78967b + 3);
        ib2 ib2Var = this.f77709a;
        jb2Var.a(ib2Var.f78552a, 0, 2);
        ib2Var.b(0);
        this.f77709a.c(3);
        int i16 = 13;
        this.f77713e.f78145s = this.f77709a.a(13);
        ib2 ib2Var2 = this.f77709a;
        jb2Var.a(ib2Var2.f78552a, 0, 2);
        ib2Var2.b(0);
        int i17 = 4;
        this.f77709a.c(4);
        int i18 = 12;
        jb2Var.e(jb2Var.f78967b + this.f77709a.a(12));
        h93 h93Var2 = this.f77713e;
        int i19 = 21;
        if (h93Var2.f78127a == 2 && h93Var2.f78143q == null) {
            j93 j93Var = new j93(21, null, null, ib3.f78561f);
            h93 h93Var3 = this.f77713e;
            h93Var3.f78143q = ((jf0) h93Var3.f78132f).a(21, j93Var);
            h93 h93Var4 = this.f77713e;
            m93 m93Var = h93Var4.f78143q;
            if (m93Var != null) {
                m93Var.a(y63Var, h93Var4.f78138l, new l93(iR, 21, 8192));
            }
        }
        this.f77710b.clear();
        this.f77711c.clear();
        int i20 = jb2Var.f78968c - jb2Var.f78967b;
        while (i20 > 0) {
            ib2 ib2Var3 = this.f77709a;
            int i21 = 5;
            jb2Var.a(ib2Var3.f78552a, i14, 5);
            ib2Var3.b(i14);
            int iA = this.f77709a.a(8);
            this.f77709a.c(i15);
            int iA2 = this.f77709a.a(i16);
            this.f77709a.c(i17);
            int iA3 = this.f77709a.a(i18);
            int i22 = jb2Var.f78967b;
            int i23 = i22 + iA3;
            int i24 = -1;
            String strTrim = null;
            ArrayList arrayList = null;
            while (true) {
                if (jb2Var.f78967b >= i23) {
                    i10 = i17;
                    break;
                }
                int iM = jb2Var.m();
                int iM2 = jb2Var.f78967b + jb2Var.m();
                if (iM2 > i23) {
                    i10 = 4;
                    break;
                }
                if (iM == i21) {
                    long jN = jb2Var.n();
                    if (jN == 1094921523) {
                        i24 = 129;
                    } else if (jN == 1161904947) {
                        i24 = 135;
                    } else if (jN == 1094921524) {
                        i24 = 172;
                    } else if (jN == 1212503619) {
                        i24 = 36;
                    }
                    i12 = 4;
                } else {
                    if (iM == 106) {
                        i24 = 129;
                    } else if (iM == 122) {
                        i24 = 135;
                    } else if (iM == 127) {
                        if (jb2Var.m() == i19) {
                            i24 = 172;
                        }
                    } else if (iM == 123) {
                        i24 = 138;
                    } else if (iM == 10) {
                        strTrim = jb2Var.a(3, bu.f75964c).trim();
                    } else {
                        int i25 = 3;
                        if (iM == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (jb2Var.f78967b < iM2) {
                                String strTrim2 = jb2Var.a(i25, bu.f75964c).trim();
                                jb2Var.m();
                                byte[] bArr = new byte[4];
                                jb2Var.a(bArr, 0, 4);
                                arrayList2.add(new i93(strTrim2, bArr));
                                i25 = 3;
                            }
                            i12 = 4;
                            arrayList = arrayList2;
                            i24 = 89;
                        } else {
                            i12 = 4;
                            if (iM == 111) {
                                i24 = 257;
                            }
                        }
                    }
                    i12 = 4;
                }
                int i26 = jb2Var.f78967b;
                jb2Var.e((iM2 - i26) + i26);
                i17 = i12;
                i21 = 5;
                i19 = 21;
            }
            jb2Var.e(i23);
            j93 j93Var2 = new j93(i24, strTrim, arrayList, Arrays.copyOfRange(jb2Var.f78966a, i22, i23));
            if (iA == 6 || iA == 5) {
                iA = i24;
            }
            i20 -= iA3 + 5;
            h93 h93Var5 = this.f77713e;
            int i27 = h93Var5.f78127a == 2 ? iA : iA2;
            if (h93Var5.f78134h.get(i27)) {
                i11 = 21;
            } else {
                h93 h93Var6 = this.f77713e;
                if (h93Var6.f78127a == 2) {
                    i11 = 21;
                    if (iA == 21) {
                        m93VarA = h93Var6.f78143q;
                    }
                    if (this.f77713e.f78127a == 2 || iA2 < this.f77711c.get(i27, 8192)) {
                        this.f77711c.put(i27, iA2);
                        this.f77710b.put(i27, m93VarA);
                    }
                } else {
                    i11 = 21;
                }
                m93VarA = ((jf0) h93Var6.f78132f).a(iA, j93Var2);
                if (this.f77713e.f78127a == 2) {
                    this.f77711c.put(i27, iA2);
                    this.f77710b.put(i27, m93VarA);
                } else {
                    this.f77711c.put(i27, iA2);
                    this.f77710b.put(i27, m93VarA);
                }
            }
            i19 = i11;
            i14 = 0;
            i15 = 3;
            i16 = 13;
            i18 = 12;
            i17 = i10;
        }
        int size = this.f77711c.size();
        for (int i28 = 0; i28 < size; i28++) {
            int iKeyAt = this.f77711c.keyAt(i28);
            int iValueAt = this.f77711c.valueAt(i28);
            this.f77713e.f78134h.put(iKeyAt, true);
            this.f77713e.f78135i.put(iValueAt, true);
            m93 m93Var2 = (m93) this.f77710b.valueAt(i28);
            if (m93Var2 != null) {
                h93 h93Var7 = this.f77713e;
                if (m93Var2 != h93Var7.f78143q) {
                    m93Var2.a(y63Var, h93Var7.f78138l, new l93(iR, iKeyAt, 8192));
                }
                this.f77713e.f78133g.put(iValueAt, m93Var2);
            }
        }
        h93 h93Var8 = this.f77713e;
        if (h93Var8.f78127a == 2) {
            if (h93Var8.f78140n) {
                return;
            }
            h93Var8.f78138l.a();
            h93 h93Var9 = this.f77713e;
            h93Var9.f78139m = 0;
            h93Var9.f78140n = true;
            return;
        }
        h93Var8.f78133g.remove(this.f77712d);
        h93 h93Var10 = this.f77713e;
        int i29 = h93Var10.f78127a == 1 ? 0 : h93Var10.f78139m - 1;
        h93Var10.f78139m = i29;
        if (i29 == 0) {
            h93Var10.f78138l.a();
            this.f77713e.f78140n = true;
        }
    }
}
