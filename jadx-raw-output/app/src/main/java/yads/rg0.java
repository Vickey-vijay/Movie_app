package yads;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f82254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f82256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f82258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f82259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f82260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f82261h;

    public static List a(lr lrVar) {
        List list = lrVar.f79890h;
        if (list != null) {
            return list;
        }
        Map map = lrVar.f79889g;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public rg0(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f82255b = str;
        this.f82256c = "".equals(str2) ? null : str2;
        this.f82257d = j10;
        this.f82258e = j11;
        this.f82259f = j12;
        this.f82260g = j13;
        this.f82261h = list;
    }

    public static rg0 a(sg0 sg0Var) throws IOException {
        if (tg0.a(sg0Var) == 538247942) {
            String str = new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8");
            String str2 = new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8");
            long jB = tg0.b(sg0Var);
            long jB2 = tg0.b(sg0Var);
            long jB3 = tg0.b(sg0Var);
            long jB4 = tg0.b(sg0Var);
            int iA = tg0.a(sg0Var);
            if (iA >= 0) {
                List listEmptyList = iA == 0 ? Collections.emptyList() : new ArrayList();
                int i10 = 0;
                while (i10 < iA) {
                    listEmptyList.add(new q01(new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8").intern(), new String(tg0.a(sg0Var, tg0.b(sg0Var)), "UTF-8").intern()));
                    i10++;
                    jB4 = jB4;
                    jB3 = jB3;
                }
                return new rg0(str, str2, jB, jB2, jB3, jB4, listEmptyList);
            }
            throw new IOException(mg2.a("readHeaderList size=", iA));
        }
        throw new IOException();
    }

    public final lr a(byte[] bArr) {
        lr lrVar = new lr();
        lrVar.f79883a = bArr;
        lrVar.f79884b = this.f82256c;
        lrVar.f79885c = this.f82257d;
        lrVar.f79886d = this.f82258e;
        lrVar.f79887e = this.f82259f;
        lrVar.f79888f = this.f82260g;
        List<q01> list = this.f82261h;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (q01 q01Var : list) {
            treeMap.put(q01Var.f81668a, q01Var.f81669b);
        }
        lrVar.f79889g = treeMap;
        lrVar.f79890h = Collections.unmodifiableList(this.f82261h);
        return lrVar;
    }

    public final boolean a(BufferedOutputStream bufferedOutputStream) {
        try {
            tg0.a(bufferedOutputStream, 538247942);
            byte[] bytes = this.f82255b.getBytes("UTF-8");
            tg0.a(bufferedOutputStream, bytes.length);
            bufferedOutputStream.write(bytes, 0, bytes.length);
            String str = this.f82256c;
            if (str == null) {
                str = "";
            }
            byte[] bytes2 = str.getBytes("UTF-8");
            tg0.a(bufferedOutputStream, bytes2.length);
            bufferedOutputStream.write(bytes2, 0, bytes2.length);
            tg0.a(bufferedOutputStream, this.f82257d);
            tg0.a(bufferedOutputStream, this.f82258e);
            tg0.a(bufferedOutputStream, this.f82259f);
            tg0.a(bufferedOutputStream, this.f82260g);
            List<q01> list = this.f82261h;
            if (list != null) {
                tg0.a(bufferedOutputStream, list.size());
                for (q01 q01Var : list) {
                    byte[] bytes3 = q01Var.f81668a.getBytes("UTF-8");
                    tg0.a(bufferedOutputStream, bytes3.length);
                    bufferedOutputStream.write(bytes3, 0, bytes3.length);
                    byte[] bytes4 = q01Var.f81669b.getBytes("UTF-8");
                    tg0.a(bufferedOutputStream, bytes4.length);
                    bufferedOutputStream.write(bytes4, 0, bytes4.length);
                }
            } else {
                tg0.a(bufferedOutputStream, 0);
            }
            bufferedOutputStream.flush();
            return true;
        } catch (IOException unused) {
            boolean z10 = lm3.f79855a;
            boolean z11 = ad1.f75480a;
            return false;
        }
    }
}
