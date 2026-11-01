package yads;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class c30 implements dv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f76126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f76128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f76129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f76130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f76131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f76132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hb3 f76133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zx2 f76134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f76135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj2 f76136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f76137m;

    public c30(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, dj2 dj2Var, hb3 hb3Var, zx2 zx2Var, Uri uri, ArrayList arrayList) {
        this.f76125a = j10;
        this.f76126b = j11;
        this.f76127c = j12;
        this.f76128d = z10;
        this.f76129e = j13;
        this.f76130f = j14;
        this.f76131g = j15;
        this.f76132h = j16;
        this.f76136l = dj2Var;
        this.f76133i = hb3Var;
        this.f76135k = uri;
        this.f76134j = zx2Var;
        this.f76137m = arrayList;
    }

    public final fc2 a(int i10) {
        return (fc2) this.f76137m.get(i10);
    }

    public final c30 a(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new v33(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f76137m.size()) {
                break;
            }
            if (((v33) linkedList.peek()).f83733b != i10) {
                long jB = b(i10);
                if (jB != -9223372036854775807L) {
                    j10 += jB;
                }
            } else {
                fc2 fc2Var = (fc2) this.f76137m.get(i10);
                List list2 = fc2Var.f77351c;
                v33 v33Var = (v33) linkedList.poll();
                int i11 = v33Var.f83733b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = v33Var.f83734c;
                    zb zbVar = (zb) list2.get(i12);
                    List list3 = zbVar.f85267c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((lo2) list3.get(v33Var.f83735d));
                        v33Var = (v33) linkedList.poll();
                        if (v33Var.f83733b != i11) {
                            break;
                        }
                    } while (v33Var.f83734c == i12);
                    List list4 = list2;
                    arrayList2.add(new zb(zbVar.f85265a, zbVar.f85266b, arrayList3, zbVar.f85268d, zbVar.f85269e, zbVar.f85270f));
                    if (v33Var.f83733b != i11) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(v33Var);
                arrayList.add(new fc2(fc2Var.f77349a, fc2Var.f77350b - j10, arrayList2, fc2Var.f77352d));
            }
            i10++;
        }
        long j11 = this.f76126b;
        return new c30(this.f76125a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, this.f76127c, this.f76128d, this.f76129e, this.f76130f, this.f76131g, this.f76132h, this.f76136l, this.f76133i, this.f76134j, this.f76135k, arrayList);
    }

    public final long b(int i10) {
        if (i10 != this.f76137m.size() - 1) {
            return ((fc2) this.f76137m.get(i10 + 1)).f77350b - ((fc2) this.f76137m.get(i10)).f77350b;
        }
        long j10 = this.f76126b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - ((fc2) this.f76137m.get(i10)).f77350b;
    }

    public final long c(int i10) {
        return ib3.a(b(i10));
    }
}
