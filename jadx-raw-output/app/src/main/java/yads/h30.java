package yads;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class h30 implements pm1, qx2, ku {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a30 f78027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r83 f78028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sk0 f78029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ae0 f78030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vo f78031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f78032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gg1 f78033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qe f78034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i73 f78035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g30[] f78036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hc0 f78037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ue2 f78038n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bn1 f78040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ok0 f78041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ye2 f78042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public om1 f78043s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public sy f78046v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c30 f78047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f78048x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f78049y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f78025z = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern A = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public lu[] f78044t = a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zm0[] f78045u = new zm0[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap f78039o = new IdentityHashMap();

    public h30(int i10, c30 c30Var, vo voVar, int i11, a30 a30Var, r83 r83Var, sk0 sk0Var, ok0 ok0Var, ae0 ae0Var, bn1 bn1Var, long j10, gg1 gg1Var, qe qeVar, hc0 hc0Var, com.monetization.ads.exo.source.dash.c cVar, ye2 ye2Var) {
        this.f78026b = i10;
        this.f78047w = c30Var;
        this.f78031g = voVar;
        this.f78048x = i11;
        this.f78027c = a30Var;
        this.f78028d = r83Var;
        this.f78029e = sk0Var;
        this.f78041q = ok0Var;
        this.f78030f = ae0Var;
        this.f78040p = bn1Var;
        this.f78032h = j10;
        this.f78033i = gg1Var;
        this.f78034j = qeVar;
        this.f78037m = hc0Var;
        this.f78042r = ye2Var;
        this.f78038n = new ue2(c30Var, cVar, qeVar);
        lu[] luVarArr = this.f78044t;
        hc0Var.getClass();
        this.f78046v = hc0.a(luVarArr);
        fc2 fc2VarA = c30Var.a(i11);
        List list = fc2VarA.f77352d;
        this.f78049y = list;
        Pair pairA = a(sk0Var, fc2VarA.f77351c, list);
        this.f78035k = (i73) pairA.first;
        this.f78036l = (g30[]) pairA.second;
    }

    public static Pair a(sk0 sk0Var, List list, List list2) {
        int i10;
        int i11;
        int i12;
        mx0[] mx0VarArrA;
        int iMin;
        wf0 wf0VarA;
        List list3 = list;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i13 = 0; i13 < size; i13++) {
            sparseIntArray.put(((zb) list3.get(i13)).f85265a, i13);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i13));
            arrayList.add(arrayList2);
            sparseArray.put(i13, arrayList2);
        }
        for (int i14 = 0; i14 < size; i14++) {
            zb zbVar = (zb) list3.get(i14);
            wf0 wf0VarA2 = a("http://dashif.org/guidelines/trickmode", zbVar.f85269e);
            if (wf0VarA2 == null) {
                wf0VarA2 = a("http://dashif.org/guidelines/trickmode", zbVar.f85270f);
            }
            if (wf0VarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(wf0VarA2.f84184b), -1)) == -1) {
                iMin = i14;
            }
            if (iMin == i14 && (wf0VarA = a("urn:mpeg:dash:adaptation-set-switching:2016", zbVar.f85270f)) != null) {
                String str = wf0VarA.f84184b;
                int i15 = ib3.f78556a;
                for (String str2 : str.split(StringUtils.COMMA, -1)) {
                    int i16 = sparseIntArray.get(Integer.parseInt(str2), -1);
                    if (i16 != -1) {
                        iMin = Math.min(iMin, i16);
                    }
                }
            }
            if (iMin != i14) {
                List list4 = (List) sparseArray.get(i14);
                List list5 = (List) sparseArray.get(iMin);
                list5.addAll(list4);
                sparseArray.put(i14, list5);
                arrayList.remove(list4);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i17 = 0; i17 < size2; i17++) {
            int[] iArrA = td1.a((Collection) arrayList.get(i17));
            iArr[i17] = iArrA;
            Arrays.sort(iArrA);
        }
        boolean[] zArr = new boolean[size2];
        mx0[][] mx0VarArr = new mx0[size2][];
        int i18 = 0;
        for (int i19 = 0; i19 < size2; i19++) {
            for (int i20 : iArr[i19]) {
                List list6 = ((zb) list3.get(i20)).f85267c;
                for (int i21 = 0; i21 < list6.size(); i21++) {
                    if (!((lo2) list6.get(i21)).f79871d.isEmpty()) {
                        zArr[i19] = true;
                        i18++;
                        break;
                    }
                }
            }
            int[] iArr2 = iArr[i19];
            int length = iArr2.length;
            int i22 = 0;
            while (true) {
                if (i22 >= length) {
                    mx0VarArrA = new mx0[0];
                    break;
                }
                int i23 = iArr2[i22];
                zb zbVar2 = (zb) list3.get(i23);
                List list7 = ((zb) list3.get(i23)).f85268d;
                for (int i24 = 0; i24 < list7.size(); i24++) {
                    wf0 wf0Var = (wf0) list7.get(i24);
                    if ("urn:scte:dash:cc:cea-608:2015".equals(wf0Var.f84183a)) {
                        lx0 lx0Var = new lx0();
                        lx0Var.f79967k = "application/cea-608";
                        lx0Var.f79957a = zbVar2.f85265a + ":cea608";
                        mx0VarArrA = a(wf0Var, f78025z, new mx0(lx0Var));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(wf0Var.f84183a)) {
                        lx0 lx0Var2 = new lx0();
                        lx0Var2.f79967k = "application/cea-708";
                        lx0Var2.f79957a = zbVar2.f85265a + ":cea708";
                        mx0VarArrA = a(wf0Var, A, new mx0(lx0Var2));
                        break;
                    }
                }
                i22++;
            }
            mx0VarArr[i19] = mx0VarArrA;
            if (mx0VarArrA.length != 0) {
                i18++;
            }
        }
        int size3 = list2.size() + i18 + size2;
        h73[] h73VarArr = new h73[size3];
        g30[] g30VarArr = new g30[size3];
        int i25 = 0;
        int i26 = 0;
        while (i25 < size2) {
            int[] iArr3 = iArr[i25];
            ArrayList arrayList3 = new ArrayList();
            for (int i27 : iArr3) {
                arrayList3.addAll(((zb) list3.get(i27)).f85267c);
            }
            int size4 = arrayList3.size();
            mx0[] mx0VarArr2 = new mx0[size4];
            int i28 = 0;
            while (i28 < size4) {
                mx0 mx0Var = ((lo2) arrayList3.get(i28)).f79868a;
                int i29 = size2;
                int[][] iArr4 = iArr;
                int iA = sk0Var.a(mx0Var);
                lx0 lx0Var3 = new lx0(mx0Var);
                lx0Var3.D = iA;
                mx0VarArr2[i28] = new mx0(lx0Var3);
                i28++;
                size2 = i29;
                iArr = iArr4;
            }
            int i30 = size2;
            int[][] iArr5 = iArr;
            zb zbVar3 = (zb) list3.get(iArr3[0]);
            int i31 = zbVar3.f85265a;
            String string = i31 != -1 ? Integer.toString(i31) : mg2.a("unset:", i25);
            int i32 = i26 + 1;
            if (zArr[i25]) {
                i10 = i26 + 2;
            } else {
                i10 = i32;
                i32 = -1;
            }
            if (mx0VarArr[i25].length != 0) {
                i11 = i10 + 1;
            } else {
                i11 = i10;
                i10 = -1;
            }
            h73VarArr[i26] = new h73(string, mx0VarArr2);
            g30VarArr[i26] = new g30(zbVar3.f85266b, 0, iArr3, i26, i32, i10, -1);
            if (i32 != -1) {
                String str3 = string + ":emsg";
                lx0 lx0Var4 = new lx0();
                lx0Var4.f79957a = str3;
                lx0Var4.f79967k = "application/x-emsg";
                h73VarArr[i32] = new h73(str3, new mx0(lx0Var4));
                g30VarArr[i32] = new g30(5, 1, iArr3, i26, -1, -1, -1);
                i12 = -1;
            } else {
                i12 = -1;
            }
            if (i10 != i12) {
                h73VarArr[i10] = new h73(string + ":cc", mx0VarArr[i25]);
                g30VarArr[i10] = new g30(3, 1, iArr3, i26, -1, -1, -1);
            }
            i25++;
            list3 = list;
            i26 = i11;
            size2 = i30;
            iArr = iArr5;
        }
        int i33 = 0;
        while (i33 < list2.size()) {
            an0 an0Var = (an0) list2.get(i33);
            lx0 lx0Var5 = new lx0();
            lx0Var5.f79957a = an0Var.f75573c + "/" + an0Var.f75574d;
            lx0Var5.f79967k = "application/x-emsg";
            mx0 mx0Var2 = new mx0(lx0Var5);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(an0Var.f75573c + "/" + an0Var.f75574d);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(i33);
            h73VarArr[i26] = new h73(sb2.toString(), mx0Var2);
            g30VarArr[i26] = new g30(5, 2, new int[0], -1, -1, -1, i33);
            i33++;
            i26++;
        }
        return Pair.create(new i73(h73VarArr), g30VarArr);
    }

    public static lu[] a() {
        return new lu[0];
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        return this.f78046v.continueLoading(j10);
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        long j11;
        for (lu luVar : this.f78044t) {
            if (!luVar.c()) {
                ms2 ms2Var = luVar.f79923n;
                int i10 = ms2Var.f80366q;
                ms2Var.a(j10, z10, true);
                ms2 ms2Var2 = luVar.f79923n;
                int i11 = ms2Var2.f80366q;
                if (i11 > i10) {
                    synchronized (ms2Var2) {
                        j11 = ms2Var2.f80365p == 0 ? Long.MIN_VALUE : ms2Var2.f80363n[ms2Var2.f80367r];
                    }
                    int i12 = 0;
                    while (true) {
                        ms2[] ms2VarArr = luVar.f79924o;
                        if (i12 >= ms2VarArr.length) {
                            break;
                        }
                        ms2VarArr[i12].a(j11, z10, luVar.f79914e[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(luVar.a(i11, 0), luVar.f79931v);
                if (iMin > 0) {
                    ArrayList arrayList = luVar.f79921l;
                    int i13 = ib3.f78556a;
                    if (iMin > arrayList.size() || iMin < 0) {
                        throw new IllegalArgumentException();
                    }
                    if (iMin != 0) {
                        arrayList.subList(0, iMin).clear();
                    }
                    luVar.f79931v -= iMin;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        return this.f78046v.getBufferedPositionUs();
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        return this.f78046v.getNextLoadPositionUs();
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        return this.f78035k;
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f78046v.isLoading();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() {
        this.f78033i.a();
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        this.f78046v.reevaluateBuffer(j10);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0099 A[LOOP:2: B:45:0x0097->B:46:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0 A[LOOP:3: B:50:0x00be->B:51:0x00c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9 A[LOOP:4: B:58:0x00e7->B:59:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x00b5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00d9, please report this as an issue */
    @Override // yads.pm1
    public final long seekToUs(long j10) {
        int i10;
        jo joVar;
        int i11;
        int i12;
        ag1 ag1Var;
        int i13;
        lu[] luVarArr = this.f78044t;
        int length = luVarArr.length;
        int i14 = 0;
        while (i14 < length) {
            lu luVar = luVarArr[i14];
            luVar.f79930u = j10;
            if (luVar.c()) {
                luVar.f79929t = j10;
                i10 = i14;
            } else {
                int i15 = 0;
                while (true) {
                    if (i15 < luVar.f79921l.size()) {
                        joVar = (jo) luVar.f79921l.get(i15);
                        long j11 = joVar.f76430g;
                        i10 = i14;
                        if (j11 == j10 && joVar.f79131k == -9223372036854775807L) {
                            break;
                        }
                        if (j11 <= j10) {
                            i15++;
                            i14 = i10;
                        }
                    } else {
                        i10 = i14;
                    }
                    joVar = null;
                    break;
                }
                if (joVar != null) {
                    ms2 ms2Var = luVar.f79923n;
                    int iA = joVar.a(0);
                    synchronized (ms2Var) {
                        ms2Var.e();
                        int i16 = ms2Var.f80366q;
                        if (iA >= i16 && iA <= ms2Var.f80365p + i16) {
                            ms2Var.f80369t = Long.MIN_VALUE;
                            ms2Var.f80368s = iA - i16;
                            ms2 ms2Var2 = luVar.f79923n;
                            luVar.f79931v = luVar.a(ms2Var2.f80366q + ms2Var2.f80368s, 0);
                            for (ms2 ms2Var3 : luVar.f79924o) {
                                ms2Var3.b(j10, true);
                            }
                        }
                        luVar.f79929t = j10;
                        luVar.f79933x = false;
                        luVar.f79921l.clear();
                        luVar.f79931v = 0;
                        if (luVar.f79919j.b()) {
                            luVar.f79923n.a();
                            for (ms2 ms2Var4 : luVar.f79924o) {
                                ms2Var4.a();
                            }
                            ag1Var = luVar.f79919j.f77391b;
                            if (ag1Var != null) {
                                throw new IllegalStateException();
                            }
                            ag1Var.a(false);
                        } else {
                            luVar.f79919j.f77392c = null;
                            luVar.f79923n.b(false);
                            for (ms2 ms2Var5 : luVar.f79924o) {
                                ms2Var5.b(false);
                            }
                        }
                    }
                } else if (luVar.f79923n.b(j10, j10 < luVar.getNextLoadPositionUs())) {
                    ms2 ms2Var6 = luVar.f79923n;
                    luVar.f79931v = luVar.a(ms2Var6.f80366q + ms2Var6.f80368s, 0);
                    while (i13 < r6) {
                        ms2Var3.b(j10, true);
                    }
                } else {
                    luVar.f79929t = j10;
                    luVar.f79933x = false;
                    luVar.f79921l.clear();
                    luVar.f79931v = 0;
                    if (luVar.f79919j.b()) {
                        luVar.f79923n.a();
                        while (i12 < r6) {
                            ms2Var4.a();
                        }
                        ag1Var = luVar.f79919j.f77391b;
                        if (ag1Var != null) {
                            throw new IllegalStateException();
                        }
                        ag1Var.a(false);
                    } else {
                        luVar.f79919j.f77392c = null;
                        luVar.f79923n.b(false);
                        while (i11 < r7) {
                            ms2Var5.b(false);
                        }
                    }
                }
                i14 = i10 + 1;
            }
            i14 = i10 + 1;
        }
        for (zm0 zm0Var : this.f78045u) {
            int iA2 = ib3.a(zm0Var.f85481d, j10, true);
            zm0Var.f85485h = iA2;
            zm0Var.f85486i = (zm0Var.f85482e && iA2 == zm0Var.f85481d.length) ? j10 : -9223372036854775807L;
        }
        return j10;
    }

    public static wf0 a(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            wf0 wf0Var = (wf0) list.get(i10);
            if (str.equals(wf0Var.f84183a)) {
                return wf0Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        long jA;
        long j11;
        for (lu luVar : this.f78044t) {
            if (luVar.f79911b == 2) {
                for (lc0 lc0Var : ((nc0) luVar.f79915f).f80629h) {
                    i30 i30Var = lc0Var.f79746d;
                    if (i30Var != null) {
                        long jA2 = i30Var.a(j10, lc0Var.f79747e);
                        long j12 = lc0Var.f79748f;
                        long j13 = jA2 + j12;
                        long jA3 = lc0Var.f79746d.a(j13 - j12);
                        long jC = lc0Var.f79746d.c(lc0Var.f79747e);
                        if (jA3 >= j10) {
                            jA = jA3;
                        } else {
                            if (jC != -1) {
                                long jB = lc0Var.f79746d.b() + lc0Var.f79748f + jC;
                                j11 = 1;
                                if (j13 >= jB - 1) {
                                    jA = jA3;
                                }
                            } else {
                                j11 = 1;
                            }
                            jA = lc0Var.f79746d.a((j13 + j11) - lc0Var.f79748f);
                        }
                        return ww2Var.a(j10, jA3, jA);
                    }
                }
                return j10;
            }
        }
        return j10;
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        this.f78043s.a((rx2) this);
    }

    public static mx0[] a(wf0 wf0Var, Pattern pattern, mx0 mx0Var) {
        String str = wf0Var.f84184b;
        if (str == null) {
            return new mx0[]{mx0Var};
        }
        int i10 = ib3.f78556a;
        String[] strArrSplit = str.split(";", -1);
        mx0[] mx0VarArr = new mx0[strArrSplit.length];
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            Matcher matcher = pattern.matcher(strArrSplit[i11]);
            if (!matcher.matches()) {
                return new mx0[]{mx0Var};
            }
            int i12 = Integer.parseInt(matcher.group(1));
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.f79957a = mx0Var.f80418b + StringUtils.PROCESS_POSTFIX_DELIMITER + i12;
            lx0Var.C = i12;
            lx0Var.f79959c = matcher.group(2);
            mx0VarArr[i11] = new mx0(lx0Var);
        }
        return mx0VarArr;
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f78043s = om1Var;
        om1Var.a((pm1) this);
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0290  */
    /* JADX WARN: Code duplicated, block: B:152:0x029a  */
    /* JADX WARN: Code duplicated, block: B:155:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x02d0 A[LOOP:8: B:153:0x02a2->B:162:0x02d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00de  */
    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        int i10;
        int i11;
        int i12;
        int i13;
        lu luVar;
        int i14;
        int i15;
        ms2[] ms2VarArr;
        boolean[] zArr3;
        int i16;
        int[] iArr;
        int i17;
        ns2[] ns2VarArr2;
        int i18;
        h73 h73VarA;
        h73 h73VarA2;
        int i19;
        te2 te2Var;
        int i20;
        ns2 ns2Var;
        boolean[] zArr4;
        int i21;
        op0[] op0VarArr2 = op0VarArr;
        ns2[] ns2VarArr3 = ns2VarArr;
        int length = op0VarArr2.length;
        int[] iArr2 = new int[length];
        int i22 = 0;
        while (true) {
            i10 = -1;
            if (i22 >= op0VarArr2.length) {
                break;
            }
            op0 op0Var = op0VarArr2[i22];
            if (op0Var != null) {
                int iIndexOf = this.f78035k.f78515c.indexOf(op0Var.b());
                iArr2[i22] = iIndexOf >= 0 ? iIndexOf : -1;
            } else {
                iArr2[i22] = -1;
            }
            i22++;
        }
        for (int i23 = 0; i23 < op0VarArr2.length; i23++) {
            if (op0VarArr2[i23] == null || !zArr[i23]) {
                ns2 ns2Var2 = ns2VarArr3[i23];
                if (ns2Var2 instanceof lu) {
                    lu luVar2 = (lu) ns2Var2;
                    luVar2.f79928s = this;
                    ms2 ms2Var = luVar2.f79923n;
                    ms2Var.a();
                    ms2Var.d();
                    for (ms2 ms2Var2 : luVar2.f79924o) {
                        ms2Var2.a();
                        ms2Var2.d();
                    }
                    luVar2.f79919j.a(luVar2);
                } else if (ns2Var2 instanceof ju) {
                    ju juVar = (ju) ns2Var2;
                    boolean[] zArr5 = juVar.f79185f.f79914e;
                    int i24 = juVar.f79183d;
                    if (zArr5[i24]) {
                        zArr5[i24] = false;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                ns2VarArr3[i23] = null;
            }
        }
        for (int i25 = 0; i25 < op0VarArr2.length; i25++) {
            ns2 ns2Var3 = ns2VarArr3[i25];
            if ((ns2Var3 instanceof wl0) || (ns2Var3 instanceof ju)) {
                int i26 = iArr2[i25];
                if (i26 == -1) {
                    i20 = -1;
                    break;
                }
                int i27 = this.f78036l[i26].f77618e;
                i20 = 0;
                while (true) {
                    if (i20 >= length) {
                        i20 = -1;
                        break;
                    }
                    int i28 = iArr2[i20];
                    if (i28 == i27 && this.f78036l[i28].f77616c == 0) {
                        break;
                    }
                    i20++;
                }
                if (i20 == -1) {
                    if (ns2VarArr3[i25] instanceof wl0) {
                        continue;
                    } else {
                        ns2Var = ns2VarArr3[i25];
                        if (ns2Var instanceof ju) {
                            ju juVar2 = (ju) ns2Var;
                            zArr4 = juVar2.f79185f.f79914e;
                            i21 = juVar2.f79183d;
                            if (zArr4[i21]) {
                                zArr4[i21] = false;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        ns2VarArr3[i25] = null;
                    }
                } else {
                    ns2 ns2Var4 = ns2VarArr3[i25];
                    if (!(ns2Var4 instanceof ju) || ((ju) ns2Var4).f79181b != ns2VarArr3[i20]) {
                        ns2Var = ns2VarArr3[i25];
                        if (ns2Var instanceof ju) {
                            ju juVar3 = (ju) ns2Var;
                            zArr4 = juVar3.f79185f.f79914e;
                            i21 = juVar3.f79183d;
                            if (zArr4[i21]) {
                                zArr4[i21] = false;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        ns2VarArr3[i25] = null;
                    }
                }
            }
        }
        int i29 = 0;
        while (i29 < op0VarArr2.length) {
            op0 op0Var2 = op0VarArr2[i29];
            if (op0Var2 == null) {
                i16 = i29;
                iArr = iArr2;
                i17 = length;
                ns2VarArr2 = ns2VarArr3;
            } else {
                ns2 ns2Var5 = ns2VarArr3[i29];
                if (ns2Var5 == null) {
                    zArr2[i29] = true;
                    g30 g30Var = this.f78036l[iArr2[i29]];
                    int i30 = g30Var.f77616c;
                    if (i30 == 0) {
                        int i31 = g30Var.f77619f;
                        boolean z10 = i31 != i10;
                        if (z10) {
                            h73VarA = this.f78035k.a(i31);
                            i18 = 1;
                        } else {
                            i18 = 0;
                            h73VarA = null;
                        }
                        int i32 = g30Var.f77620g;
                        boolean z11 = i32 != i10;
                        if (z11) {
                            h73VarA2 = this.f78035k.a(i32);
                            i18 += h73VarA2.f78087b;
                        } else {
                            h73VarA2 = null;
                        }
                        mx0[] mx0VarArr = new mx0[i18];
                        int[] iArr3 = new int[i18];
                        if (z10) {
                            mx0VarArr[0] = h73VarA.f78090e[0];
                            iArr3[0] = 5;
                            i19 = 1;
                        } else {
                            i19 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        int i33 = i29;
                        if (z11) {
                            for (int i34 = 0; i34 < h73VarA2.f78087b; i34++) {
                                mx0 mx0Var = h73VarA2.f78090e[i34];
                                mx0VarArr[i19] = mx0Var;
                                iArr3[i19] = 3;
                                arrayList.add(mx0Var);
                                i19++;
                            }
                        }
                        if (this.f78047w.f76128d && z10) {
                            ue2 ue2Var = this.f78038n;
                            te2Var = new te2(ue2Var, ue2Var.f83444b);
                        } else {
                            te2Var = null;
                        }
                        a30 a30Var = this.f78027c;
                        gg1 gg1Var = this.f78033i;
                        c30 c30Var = this.f78047w;
                        int[] iArr4 = iArr2;
                        vo voVar = this.f78031g;
                        int i35 = length;
                        int i36 = this.f78048x;
                        int[] iArr5 = g30Var.f77614a;
                        int i37 = g30Var.f77615b;
                        te2 te2Var2 = te2Var;
                        long j11 = this.f78032h;
                        r83 r83Var = this.f78028d;
                        ye2 ye2Var = this.f78042r;
                        kc0 kc0Var = (kc0) a30Var;
                        p30 p30VarCreateDataSource = kc0Var.f79367a.createDataSource();
                        if (r83Var != null) {
                            p30VarCreateDataSource.a(r83Var);
                        }
                        i16 = i33;
                        iArr = iArr4;
                        i17 = i35;
                        lu luVar3 = new lu(g30Var.f77615b, iArr3, mx0VarArr, new nc0(kc0Var.f79368b, gg1Var, c30Var, voVar, i36, iArr5, op0Var2, i37, p30VarCreateDataSource, j11, z10, arrayList, te2Var2, ye2Var), this, this.f78034j, j10, this.f78029e, this.f78041q, this.f78030f, this.f78040p);
                        synchronized (this) {
                            this.f78039o.put(luVar3, te2Var2);
                        }
                        ns2VarArr2 = ns2VarArr;
                        ns2VarArr2[i16] = luVar3;
                    } else {
                        i16 = i29;
                        iArr = iArr2;
                        i17 = length;
                        ns2VarArr2 = ns2VarArr3;
                        if (i30 == 2) {
                            ns2VarArr2[i16] = new zm0((an0) this.f78049y.get(g30Var.f77617d), op0Var2.b().f78090e[0], this.f78047w.f76128d);
                        }
                    }
                } else {
                    i16 = i29;
                    iArr = iArr2;
                    i17 = length;
                    ns2VarArr2 = ns2VarArr3;
                    if (ns2Var5 instanceof lu) {
                        ((nc0) ((lu) ns2Var5).f79915f).f80630i = op0Var2;
                    }
                }
            }
            i29 = i16 + 1;
            ns2VarArr3 = ns2VarArr2;
            iArr2 = iArr;
            length = i17;
            i10 = -1;
            op0VarArr2 = op0VarArr;
        }
        int[] iArr6 = iArr2;
        int i38 = length;
        ns2[] ns2VarArr4 = ns2VarArr3;
        int i39 = 0;
        while (i39 < op0VarArr.length) {
            if (ns2VarArr4[i39] != null || op0VarArr[i39] == null) {
                i11 = i38;
            } else {
                int i40 = iArr6[i39];
                g30 g30Var2 = this.f78036l[i40];
                if (g30Var2.f77616c == 1) {
                    if (i40 == -1) {
                        i11 = i38;
                    } else {
                        int i41 = g30Var2.f77618e;
                        i12 = 0;
                        i11 = i38;
                        while (true) {
                            if (i12 < i11) {
                                int i42 = iArr6[i12];
                                if (i42 == i41 && this.f78036l[i42].f77616c == 0) {
                                    i13 = -1;
                                    break;
                                }
                                i12++;
                            }
                        }
                        if (i12 == i13) {
                            ns2VarArr4[i39] = new wl0();
                        } else {
                            luVar = (lu) ns2VarArr4[i12];
                            i14 = g30Var2.f77615b;
                            i15 = 0;
                            while (true) {
                                ms2VarArr = luVar.f79924o;
                                if (i15 < ms2VarArr.length) {
                                    if (luVar.f79912c[i15] == i14) {
                                        zArr3 = luVar.f79914e;
                                        if (!zArr3[i15]) {
                                            zArr3[i15] = true;
                                            ms2VarArr[i15].b(j10, true);
                                            ns2VarArr4[i39] = new ju(luVar, luVar, luVar.f79924o[i15], i15);
                                            break;
                                        }
                                        throw new IllegalStateException();
                                    }
                                    i15++;
                                } else {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    i13 = -1;
                    i12 = -1;
                    if (i12 == i13) {
                        ns2VarArr4[i39] = new wl0();
                    } else {
                        luVar = (lu) ns2VarArr4[i12];
                        i14 = g30Var2.f77615b;
                        i15 = 0;
                        while (true) {
                            ms2VarArr = luVar.f79924o;
                            if (i15 < ms2VarArr.length) {
                                if (luVar.f79912c[i15] == i14) {
                                    zArr3 = luVar.f79914e;
                                    if (!zArr3[i15]) {
                                        zArr3[i15] = true;
                                        ms2VarArr[i15].b(j10, true);
                                        ns2VarArr4[i39] = new ju(luVar, luVar, luVar.f79924o[i15], i15);
                                        break;
                                        break;
                                    }
                                    throw new IllegalStateException();
                                }
                                i15++;
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                    }
                } else {
                    i11 = i38;
                }
                i39++;
                i38 = i11;
            }
            i39++;
            i38 = i11;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (ns2 ns2Var6 : ns2VarArr4) {
            if (ns2Var6 instanceof lu) {
                arrayList2.add((lu) ns2Var6);
            } else if (ns2Var6 instanceof zm0) {
                arrayList3.add((zm0) ns2Var6);
            }
        }
        lu[] luVarArr = new lu[arrayList2.size()];
        this.f78044t = luVarArr;
        arrayList2.toArray(luVarArr);
        zm0[] zm0VarArr = new zm0[arrayList3.size()];
        this.f78045u = zm0VarArr;
        arrayList3.toArray(zm0VarArr);
        hc0 hc0Var = this.f78037m;
        lu[] luVarArr2 = this.f78044t;
        hc0Var.getClass();
        this.f78046v = new sy(luVarArr2);
        return j10;
    }
}
