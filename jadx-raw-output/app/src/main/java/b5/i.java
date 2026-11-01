package b5;

import android.text.SpannableStringBuilder;
import g5.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements t4.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f4808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f4810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f4811e;

    @Override // t4.e
    public long getEventTime(int i10) {
        g5.a.a(i10 >= 0);
        g5.a.a(i10 < this.f4811e.length);
        return this.f4811e[i10];
    }

    @Override // t4.e
    public List<t4.b> getCues(long j10) {
        ArrayList arrayList = new ArrayList();
        SpannableStringBuilder spannableStringBuilder = null;
        e eVar = null;
        for (int i10 = 0; i10 < this.f4809c; i10++) {
            long[] jArr = this.f4810d;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar2 = this.f4808b.get(i10);
                if (!eVar2.a()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) g5.a.e(eVar.f72220b)).append((CharSequence) "\n").append((CharSequence) g5.a.e(eVar2.f72220b));
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) g5.a.e(eVar2.f72220b));
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new e.b().o(spannableStringBuilder).a());
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        return arrayList;
    }

    @Override // t4.e
    public int getEventTimeCount() {
        return this.f4811e.length;
    }

    @Override // t4.e
    public int getNextEventTimeIndex(long j10) {
        int iE = k0.e(this.f4811e, j10, false, false);
        if (iE < this.f4811e.length) {
            return iE;
        }
        return -1;
    }

    public i(List<e> list) {
        this.f4808b = list;
        int size = list.size();
        this.f4809c = size;
        this.f4810d = new long[size * 2];
        for (int i10 = 0; i10 < this.f4809c; i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f4810d;
            jArr[i11] = eVar.f4780q;
            jArr[i11 + 1] = eVar.f4781r;
        }
        long[] jArr2 = this.f4810d;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f4811e = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
