package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f79894a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f79895b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f79896c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f79897d = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ks f79898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ks f79899f;

    public final hs a(String str) {
        hs hsVar = (hs) this.f79894a.get(str);
        if (hsVar != null) {
            return hsVar;
        }
        SparseArray sparseArray = this.f79895b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        hs hsVar2 = new hs(iKeyAt, str, jc0.f78970c);
        this.f79894a.put(str, hsVar2);
        this.f79895b.put(iKeyAt, str);
        this.f79897d.put(iKeyAt, true);
        this.f79898e.a(hsVar2);
        return hsVar2;
    }

    public final void b(String str) {
        hs hsVar = (hs) this.f79894a.get(str);
        if (hsVar != null && hsVar.f78341c.isEmpty() && hsVar.f78342d.isEmpty()) {
            this.f79894a.remove(str);
            int i10 = hsVar.f78339a;
            boolean z10 = this.f79897d.get(i10);
            this.f79898e.a(hsVar, z10);
            if (z10) {
                this.f79895b.remove(i10);
                this.f79897d.delete(i10);
            } else {
                this.f79895b.put(i10, null);
                this.f79896c.put(i10, true);
            }
        }
    }

    public ls(jn0 jn0Var, File file) {
        is isVar = new is(jn0Var);
        js jsVar = new js(new File(file, "monetization_cached_content_index.exi"));
        this.f79898e = isVar;
        this.f79899f = jsVar;
    }

    public final void a(long j10) {
        ks ksVar;
        this.f79898e.a(j10);
        ks ksVar2 = this.f79899f;
        if (ksVar2 != null) {
            ksVar2.a(j10);
        }
        if (!this.f79898e.a() && (ksVar = this.f79899f) != null && ksVar.a()) {
            this.f79899f.a(this.f79894a, this.f79895b);
            this.f79898e.b(this.f79894a);
        } else {
            this.f79898e.a(this.f79894a, this.f79895b);
        }
        ks ksVar3 = this.f79899f;
        if (ksVar3 != null) {
            ksVar3.b();
            this.f79899f = null;
        }
    }

    public static jc0 a(DataInputStream dataInputStream) {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 >= 0) {
                int iMin = Math.min(i12, 10485760);
                byte[] bArrCopyOf = ib3.f78561f;
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i13 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                    dataInputStream.readFully(bArrCopyOf, i13, iMin);
                    iMin = Math.min(i12 - i14, 10485760);
                    i13 = i14;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(mg2.a("Invalid value size: ", i12));
            }
        }
        return new jc0(map);
    }

    public final void a() {
        this.f79898e.a(this.f79894a);
        int size = this.f79896c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f79895b.remove(this.f79896c.keyAt(i10));
        }
        this.f79896c.clear();
        this.f79897d.clear();
    }
}
