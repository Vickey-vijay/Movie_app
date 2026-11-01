package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import s5.f;
import s5.g;
import s5.h;
import s5.m;
import s5.n;
import s5.o;
import s5.p;

/* JADX INFO: loaded from: classes9.dex */
public final class TreeTypeAdapter<T> extends o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<T> f20772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g<T> f20773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gson f20774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x5.a<T> f20775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f20776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TreeTypeAdapter<T>.b f20777f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o<T> f20778g;

    public static final class SingleTypeFactory implements p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x5.a<?> f20779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Class<?> f20781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n<?> f20782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final g<?> f20783f;

        @Override // s5.p
        public <T> o<T> a(Gson gson, x5.a<T> aVar) {
            boolean zIsAssignableFrom;
            x5.a<?> aVar2 = this.f20779b;
            if (aVar2 != null) {
                zIsAssignableFrom = aVar2.equals(aVar) || (this.f20780c && this.f20779b.getType() == aVar.c());
            } else {
                zIsAssignableFrom = this.f20781d.isAssignableFrom(aVar.c());
            }
            if (zIsAssignableFrom) {
                return new TreeTypeAdapter(this.f20782e, this.f20783f, gson, aVar, this);
            }
            return null;
        }

        public SingleTypeFactory(Object obj, x5.a<?> aVar, boolean z10, Class<?> cls) {
            n<?> nVar;
            boolean z11;
            if (obj instanceof n) {
                nVar = (n) obj;
            } else {
                nVar = null;
            }
            this.f20782e = nVar;
            g<?> gVar = obj instanceof g ? (g) obj : null;
            this.f20783f = gVar;
            if (nVar == null && gVar == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            u5.a.a(z11);
            this.f20779b = aVar;
            this.f20780c = z10;
            this.f20781d = cls;
        }
    }

    public final class b implements m, f {
        public b() {
        }
    }

    public static p g(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, null, false, cls);
    }

    @Override // s5.o
    public T b(JsonReader jsonReader) throws IOException {
        if (this.f20773b == null) {
            return e().b(jsonReader);
        }
        h hVarA = u5.h.a(jsonReader);
        if (hVarA.h()) {
            return null;
        }
        return this.f20773b.a(hVarA, this.f20775d.getType(), this.f20777f);
    }

    @Override // s5.o
    public void d(JsonWriter jsonWriter, T t10) throws IOException {
        n<T> nVar = this.f20772a;
        if (nVar == null) {
            e().d(jsonWriter, t10);
        } else if (t10 == null) {
            jsonWriter.nullValue();
        } else {
            u5.h.b(nVar.a(t10, this.f20775d.getType(), this.f20777f), jsonWriter);
        }
    }

    public final o<T> e() {
        o<T> oVar = this.f20778g;
        if (oVar != null) {
            return oVar;
        }
        o<T> delegateAdapter = this.f20774c.getDelegateAdapter(this.f20776e, this.f20775d);
        this.f20778g = delegateAdapter;
        return delegateAdapter;
    }

    public TreeTypeAdapter(n<T> nVar, g<T> gVar, Gson gson, x5.a<T> aVar, p pVar) {
        this.f20772a = nVar;
        this.f20773b = gVar;
        this.f20774c = gson;
        this.f20775d = aVar;
        this.f20776e = pVar;
    }

    public static p f(x5.a<?> aVar, Object obj) {
        boolean z10;
        if (aVar.getType() == aVar.c()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new SingleTypeFactory(obj, aVar, z10, null);
    }
}
