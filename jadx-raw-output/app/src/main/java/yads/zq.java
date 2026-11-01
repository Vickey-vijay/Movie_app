package yads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class zq implements m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0 f85563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al0 f85564c = new al0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mx0 f85565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m73 f85566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f85567f;

    /* JADX WARN: Code duplicated, block: B:43:0x008c  */
    @Override // yads.m73
    public final void a(mx0 mx0Var) {
        mx0 mx0Var2;
        String str;
        String str2;
        float f10;
        int i10;
        float f11;
        String string;
        mx0 mx0Var3 = this.f85563b;
        if (mx0Var3 == null) {
            mx0Var2 = mx0Var;
        } else if (mx0Var == mx0Var3) {
            mx0Var.getClass();
            mx0Var2 = mx0Var;
        } else {
            int iD = ht1.d(mx0Var.f80429m);
            String str3 = mx0Var3.f80418b;
            String str4 = mx0Var3.f80419c;
            if (str4 == null) {
                str4 = mx0Var.f80419c;
            }
            String str5 = mx0Var.f80420d;
            if ((iD == 3 || iD == 1) && (str = mx0Var3.f80420d) != null) {
                str5 = str;
            }
            int i11 = mx0Var.f80423g;
            if (i11 == -1) {
                i11 = mx0Var3.f80423g;
            }
            int i12 = mx0Var.f80424h;
            if (i12 == -1) {
                i12 = mx0Var3.f80424h;
            }
            String str6 = mx0Var.f80426j;
            if (str6 == null) {
                String str7 = mx0Var3.f80426j;
                String[] strArrSplit = TextUtils.isEmpty(str7) ? new String[0] : str7.trim().split("(\\s*,\\s*)", -1);
                if (strArrSplit.length == 0) {
                    string = null;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    int length = strArrSplit.length;
                    int i13 = 0;
                    while (i13 < length) {
                        String str8 = strArrSplit[i13];
                        int i14 = length;
                        if (iD == ht1.d(ht1.a(str8))) {
                            if (sb2.length() > 0) {
                                sb2.append(StringUtils.COMMA);
                            }
                            sb2.append(str8);
                        }
                        i13++;
                        length = i14;
                    }
                    if (sb2.length() > 0) {
                        string = sb2.toString();
                    } else {
                        string = null;
                    }
                }
                if ((TextUtils.isEmpty(string) ? new String[0] : string.trim().split("(\\s*,\\s*)", -1)).length == 1) {
                    str6 = string;
                }
            }
            ts1 ts1Var = mx0Var.f80427k;
            if (ts1Var == null) {
                ts1Var = mx0Var3.f80427k;
            } else {
                ts1 ts1Var2 = mx0Var3.f80427k;
                if (ts1Var2 != null) {
                    ss1[] ss1VarArr = ts1Var2.f83163b;
                    if (ss1VarArr.length != 0) {
                        ts1Var = new ts1((ss1[]) ib3.a((Object[]) ts1Var.f83163b, (Object[]) ss1VarArr));
                    }
                }
            }
            float f12 = mx0Var.f80436t;
            if (f12 == -1.0f && iD == 2) {
                f12 = mx0Var3.f80436t;
            }
            int i15 = mx0Var.f80421e | mx0Var3.f80421e;
            int i16 = mx0Var.f80422f | mx0Var3.f80422f;
            kk0 kk0Var = mx0Var3.f80432p;
            kk0 kk0Var2 = mx0Var.f80432p;
            ArrayList arrayList = new ArrayList();
            if (kk0Var != null) {
                String str9 = kk0Var.f79437d;
                jk0[] jk0VarArr = kk0Var.f79435b;
                int length2 = jk0VarArr.length;
                int i17 = 0;
                while (i17 < length2) {
                    int i18 = length2;
                    jk0 jk0Var = jk0VarArr[i17];
                    jk0[] jk0VarArr2 = jk0VarArr;
                    if (jk0Var.f79080f != null) {
                        arrayList.add(jk0Var);
                    }
                    i17++;
                    length2 = i18;
                    jk0VarArr = jk0VarArr2;
                }
                str2 = str9;
            } else {
                str2 = null;
            }
            if (kk0Var2 != null) {
                if (str2 == null) {
                    str2 = kk0Var2.f79437d;
                }
                int size = arrayList.size();
                jk0[] jk0VarArr3 = kk0Var2.f79435b;
                int length3 = jk0VarArr3.length;
                String str10 = str2;
                int i19 = 0;
                while (i19 < length3) {
                    int i20 = length3;
                    jk0 jk0Var2 = jk0VarArr3[i19];
                    jk0[] jk0VarArr4 = jk0VarArr3;
                    if (jk0Var2.f79080f != null) {
                        UUID uuid = jk0Var2.f79077c;
                        f11 = f12;
                        int i21 = 0;
                        while (true) {
                            if (i21 >= size) {
                                i10 = size;
                                arrayList.add(jk0Var2);
                                break;
                            } else {
                                i10 = size;
                                if (((jk0) arrayList.get(i21)).f79077c.equals(uuid)) {
                                    break;
                                }
                                i21++;
                                size = i10;
                            }
                        }
                    } else {
                        i10 = size;
                        f11 = f12;
                    }
                    i19++;
                    length3 = i20;
                    jk0VarArr3 = jk0VarArr4;
                    f12 = f11;
                    size = i10;
                }
                f10 = f12;
                str2 = str10;
            } else {
                f10 = f12;
            }
            kk0 kk0Var3 = arrayList.isEmpty() ? null : new kk0(str2, false, (jk0[]) arrayList.toArray(new jk0[0]));
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.f79957a = str3;
            lx0Var.f79958b = str4;
            lx0Var.f79959c = str5;
            lx0Var.f79960d = i15;
            lx0Var.f79961e = i16;
            lx0Var.f79962f = i11;
            lx0Var.f79963g = i12;
            lx0Var.f79964h = str6;
            lx0Var.f79965i = ts1Var;
            lx0Var.f79970n = kk0Var3;
            lx0Var.f79974r = f10;
            mx0Var2 = new mx0(lx0Var);
        }
        this.f85565d = mx0Var2;
        m73 m73Var = this.f85566e;
        int i22 = ib3.f78556a;
        m73Var.a(mx0Var2);
    }

    public zq(int i10, int i11, mx0 mx0Var) {
        this.f85562a = i11;
        this.f85563b = mx0Var;
    }

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) {
        m73 m73Var = this.f85566e;
        int i11 = ib3.f78556a;
        return m73Var.b(l30Var, i10, z10);
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        m73 m73Var = this.f85566e;
        int i11 = ib3.f78556a;
        m73Var.a(i10, jb2Var);
    }

    @Override // yads.m73
    public final void a(long j10, int i10, int i11, int i12, l73 l73Var) {
        long j11 = this.f85567f;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f85566e = this.f85564c;
        }
        m73 m73Var = this.f85566e;
        int i13 = ib3.f78556a;
        m73Var.a(j10, i10, i11, i12, l73Var);
    }
}
