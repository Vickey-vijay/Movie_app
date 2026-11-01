package lk;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f63618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f63619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f63620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f63621d;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a extends nj.d<String> {
        public a() {
        }

        @Override // nj.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return f((String) obj);
            }
            return false;
        }

        @Override // nj.d, java.util.List
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public String get(int i10) {
            String strGroup = j.this.e().group(i10);
            return strGroup == null ? "" : strGroup;
        }

        @Override // nj.d, nj.b
        public int getSize() {
            return j.this.e().groupCount() + 1;
        }

        @Override // nj.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return h((String) obj);
            }
            return -1;
        }

        @Override // nj.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return j((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean f(String str) {
            return super.contains(str);
        }

        public /* bridge */ int h(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int j(String str) {
            return super.lastIndexOf(str);
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class b extends nj.b<g> implements h {
        @Override // nj.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        public b() {
        }

        @Override // nj.b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof g) {
                return g((g) obj);
            }
            return false;
        }

        @Override // nj.b
        public int getSize() {
            return j.this.e().groupCount() + 1;
        }

        public g h(int i10) {
            ik.i iVarI = m.i(j.this.e(), i10);
            if (iVarI.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = j.this.e().group(i10);
            ck.p.i(strGroup, "group(...)");
            return new g(strGroup, iVarI);
        }

        public static final g j(b bVar, int i10) {
            return bVar.h(i10);
        }

        public /* bridge */ boolean g(g gVar) {
            return super.contains(gVar);
        }

        @Override // nj.b, java.util.Collection, java.lang.Iterable
        public Iterator<g> iterator() {
            return SequencesKt___SequencesKt.K(nj.b0.S(nj.s.l(this)), new bk.l() { // from class: lk.k
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return j.b.j(this.f63624b, ((Integer) obj).intValue());
                }
            }).iterator();
        }
    }

    public j(Matcher matcher, CharSequence charSequence) {
        ck.p.j(matcher, "matcher");
        ck.p.j(charSequence, "input");
        this.f63618a = matcher;
        this.f63619b = charSequence;
        this.f63620c = new b();
    }

    @Override // lk.i
    public List<String> b() {
        if (this.f63621d == null) {
            this.f63621d = new a();
        }
        List<String> list = this.f63621d;
        ck.p.g(list);
        return list;
    }

    public final MatchResult e() {
        return this.f63618a;
    }

    @Override // lk.i
    public i.b a() {
        return i.a.a(this);
    }

    @Override // lk.i
    public ik.i c() {
        return m.h(e());
    }

    @Override // lk.i
    public String getValue() {
        String strGroup = e().group();
        ck.p.i(strGroup, "group(...)");
        return strGroup;
    }

    @Override // lk.i
    public i next() {
        int i10;
        int iEnd = e().end();
        if (e().end() == e().start()) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = iEnd + i10;
        if (i11 <= this.f63619b.length()) {
            Matcher matcher = this.f63618a.pattern().matcher(this.f63619b);
            ck.p.i(matcher, "matcher(...)");
            return m.f(matcher, i11, this.f63619b);
        }
        return null;
    }
}
