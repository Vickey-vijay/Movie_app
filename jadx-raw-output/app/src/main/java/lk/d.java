package lk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d implements kk.i<ik.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f63599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk.p<CharSequence, Integer, Pair<Integer, Integer>> f63602d;

    /* JADX INFO: compiled from: Strings.kt */
    public static final class a implements Iterator<ik.i>, dk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f63603b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f63604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f63605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ik.i f63606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f63607f;

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a() {
            int iK = ik.k.k(d.this.f63600b, 0, d.this.f63599a.length());
            this.f63604c = iK;
            this.f63605d = iK;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        public final void a() {
            Pair pair;
            if (this.f63605d < 0) {
                this.f63603b = 0;
                this.f63606e = null;
                return;
            }
            if (d.this.f63601c > 0) {
                int i10 = this.f63607f + 1;
                this.f63607f = i10;
                if (i10 >= d.this.f63601c) {
                    this.f63606e = new ik.i(this.f63604c, a0.f0(d.this.f63599a));
                    this.f63605d = -1;
                } else if (this.f63605d > d.this.f63599a.length() && (pair = (Pair) d.this.f63602d.mo1invoke(d.this.f63599a, Integer.valueOf(this.f63605d))) != null) {
                    int iIntValue = ((Number) pair.component1()).intValue();
                    int iIntValue2 = ((Number) pair.component2()).intValue();
                    this.f63606e = ik.k.q(this.f63604c, iIntValue);
                    int i11 = iIntValue + iIntValue2;
                    this.f63604c = i11;
                    this.f63605d = i11 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f63606e = new ik.i(this.f63604c, a0.f0(d.this.f63599a));
                    this.f63605d = -1;
                }
            } else if (this.f63605d > d.this.f63599a.length()) {
                this.f63606e = new ik.i(this.f63604c, a0.f0(d.this.f63599a));
                this.f63605d = -1;
            } else {
                int iIntValue3 = ((Number) pair.component1()).intValue();
                int iIntValue4 = ((Number) pair.component2()).intValue();
                this.f63606e = ik.k.q(this.f63604c, iIntValue3);
                int i12 = iIntValue3 + iIntValue4;
                this.f63604c = i12;
                this.f63605d = i12 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f63603b = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ik.i next() {
            if (this.f63603b == -1) {
                a();
            }
            if (this.f63603b == 0) {
                throw new NoSuchElementException();
            }
            ik.i iVar = this.f63606e;
            ck.p.h(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f63606e = null;
            this.f63603b = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f63603b == -1) {
                a();
            }
            return this.f63603b == 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(CharSequence charSequence, int i10, int i11, bk.p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        ck.p.j(charSequence, "input");
        ck.p.j(pVar, "getNextMatch");
        this.f63599a = charSequence;
        this.f63600b = i10;
        this.f63601c = i11;
        this.f63602d = pVar;
    }

    @Override // kk.i
    public Iterator<ik.i> iterator() {
        return new a();
    }
}
