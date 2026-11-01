package m5;

import com.google.common.base.AbstractIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Splitter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5.b f64133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f64134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f64135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64136d;

    /* JADX INFO: compiled from: Splitter.java */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m5.b f64137a;

        /* JADX INFO: renamed from: m5.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Splitter.java */
        public class C0583a extends b {
            @Override // m5.n.b
            public int e(int i10) {
                return i10 + 1;
            }

            public C0583a(n nVar, CharSequence charSequence) {
                super(nVar, charSequence);
            }

            @Override // m5.n.b
            public int f(int i10) {
                return a.this.f64137a.c(this.f64139d, i10);
            }
        }

        public a(m5.b bVar) {
            this.f64137a = bVar;
        }

        @Override // m5.n.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(n nVar, CharSequence charSequence) {
            return new C0583a(nVar, charSequence);
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public static abstract class b extends AbstractIterator<String> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CharSequence f64139d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final m5.b f64140e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f64141f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f64142g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f64143h;

        public abstract int e(int i10);

        public abstract int f(int i10);

        @Override // com.google.common.base.AbstractIterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a() {
            int i10 = this.f64142g;
            while (true) {
                int i11 = this.f64142g;
                if (i11 == -1) {
                    return b();
                }
                int iF = f(i11);
                if (iF == -1) {
                    iF = this.f64139d.length();
                    this.f64142g = -1;
                } else {
                    this.f64142g = e(iF);
                }
                int i12 = this.f64142g;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f64142g = i13;
                    if (i13 > this.f64139d.length()) {
                        this.f64142g = -1;
                    }
                } else {
                    while (i10 < iF && this.f64140e.e(this.f64139d.charAt(i10))) {
                        i10++;
                    }
                    while (iF > i10 && this.f64140e.e(this.f64139d.charAt(iF - 1))) {
                        iF--;
                    }
                    if (!this.f64141f || i10 != iF) {
                        int i14 = this.f64143h;
                        if (i14 == 1) {
                            iF = this.f64139d.length();
                            this.f64142g = -1;
                            while (iF > i10 && this.f64140e.e(this.f64139d.charAt(iF - 1))) {
                                iF--;
                            }
                        } else {
                            this.f64143h = i14 - 1;
                        }
                        return this.f64139d.subSequence(i10, iF).toString();
                    }
                    i10 = this.f64142g;
                }
            }
        }

        public b(n nVar, CharSequence charSequence) {
            this.f64140e = nVar.f64133a;
            this.f64141f = nVar.f64134b;
            this.f64143h = nVar.f64136d;
            this.f64139d = charSequence;
        }
    }

    /* JADX INFO: compiled from: Splitter.java */
    public interface c {
        Iterator<String> a(n nVar, CharSequence charSequence);
    }

    public n(c cVar) {
        this(cVar, false, m5.b.f(), Integer.MAX_VALUE);
    }

    public n(c cVar, boolean z10, m5.b bVar, int i10) {
        this.f64135c = cVar;
        this.f64134b = z10;
        this.f64133a = bVar;
        this.f64136d = i10;
    }

    public final Iterator<String> g(CharSequence charSequence) {
        return this.f64135c.a(this, charSequence);
    }

    public static n d(char c10) {
        return e(m5.b.d(c10));
    }

    public static n e(m5.b bVar) {
        l.m(bVar);
        return new n(new a(bVar));
    }

    public List<String> f(CharSequence charSequence) {
        l.m(charSequence);
        Iterator<String> itG = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itG.hasNext()) {
            arrayList.add(itG.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
