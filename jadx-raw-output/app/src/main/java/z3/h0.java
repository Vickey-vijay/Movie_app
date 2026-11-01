package z3;

import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes10.dex */
public interface h0 {

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface c {
        h0 a(int i10, b bVar);

        SparseArray<h0> createInitialPayloadReaders();
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f86028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f86029e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f86025a = str;
            this.f86026b = i11;
            this.f86027c = i12;
            this.f86028d = Integer.MIN_VALUE;
        }

        public void a() {
            int i10 = this.f86028d;
            this.f86028d = i10 == Integer.MIN_VALUE ? this.f86026b : i10 + this.f86027c;
            this.f86029e = this.f86025a + this.f86028d;
        }

        public final void d() {
            if (this.f86028d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public String b() {
            d();
            return this.f86029e;
        }

        public int c() {
            d();
            return this.f86028d;
        }
    }

    void a(g5.g0 g0Var, q3.i iVar, d dVar);

    void b(g5.t tVar, int i10) throws ParserException;

    void seek();

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f86020c;

        public a(String str, int i10, byte[] bArr) {
            this.f86018a = str;
            this.f86019b = i10;
            this.f86020c = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f86021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f86023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f86024d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            List<a> listUnmodifiableList;
            this.f86021a = i10;
            this.f86022b = str;
            if (list == null) {
                listUnmodifiableList = Collections.emptyList();
            } else {
                listUnmodifiableList = Collections.unmodifiableList(list);
            }
            this.f86023c = listUnmodifiableList;
            this.f86024d = bArr;
        }
    }
}
