package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import s5.b;
import s5.c;
import s5.o;
import s5.p;
import t5.d;
import t5.e;

/* JADX INFO: loaded from: classes4.dex */
public final class Excluder implements p, Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Excluder f20703h = new Excluder();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20707e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f20704b = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20705c = 136;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20706d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<b> f20708f = Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<b> f20709g = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o<T> f20710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f20711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f20712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Gson f20713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x5.a f20714e;

        public a(boolean z10, boolean z11, Gson gson, x5.a aVar) {
            this.f20711b = z10;
            this.f20712c = z11;
            this.f20713d = gson;
            this.f20714e = aVar;
        }

        @Override // s5.o
        public T b(JsonReader jsonReader) throws IOException {
            if (!this.f20711b) {
                return e().b(jsonReader);
            }
            jsonReader.skipValue();
            return null;
        }

        @Override // s5.o
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            if (this.f20712c) {
                jsonWriter.nullValue();
            } else {
                e().d(jsonWriter, t10);
            }
        }

        public final o<T> e() {
            o<T> oVar = this.f20710a;
            if (oVar != null) {
                return oVar;
            }
            o<T> delegateAdapter = this.f20713d.getDelegateAdapter(Excluder.this, this.f20714e);
            this.f20710a = delegateAdapter;
            return delegateAdapter;
        }
    }

    public final boolean e(Class<?> cls) {
        if (this.f20704b == -1.0d || o((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f20706d && k(cls)) || j(cls);
        }
        return true;
    }

    public final boolean f(Class<?> cls, boolean z10) {
        Iterator<b> it = (z10 ? this.f20708f : this.f20709g).iterator();
        while (it.hasNext()) {
            if (it.next().a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(Field field, boolean z10) {
        t5.a aVar;
        if ((this.f20705c & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f20704b != -1.0d && !o((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f20707e && ((aVar = (t5.a) field.getAnnotation(t5.a.class)) == null || (!z10 ? aVar.deserialize() : aVar.serialize()))) {
            return true;
        }
        if ((!this.f20706d && k(field.getType())) || j(field.getType())) {
            return true;
        }
        List<b> list = z10 ? this.f20708f : this.f20709g;
        if (list.isEmpty()) {
            return false;
        }
        c cVar = new c(field);
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b(cVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean m(d dVar) {
        return dVar == null || dVar.value() <= this.f20704b;
    }

    public final boolean n(e eVar) {
        return eVar == null || eVar.value() > this.f20704b;
    }

    @Override // s5.p
    public <T> o<T> a(Gson gson, x5.a<T> aVar) {
        boolean z10;
        boolean z11;
        Class<? super T> clsC = aVar.c();
        boolean zE = e(clsC);
        if (!zE && !f(clsC, true)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!zE && !f(clsC, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return null;
        }
        return new a(z11, z10, gson, aVar);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public Excluder c() {
        Excluder excluderClone = clone();
        excluderClone.f20706d = false;
        return excluderClone;
    }

    public boolean d(Class<?> cls, boolean z10) {
        if (!e(cls) && !f(cls, z10)) {
            return false;
        }
        return true;
    }

    public Excluder i() {
        Excluder excluderClone = clone();
        excluderClone.f20707e = true;
        return excluderClone;
    }

    public final boolean k(Class<?> cls) {
        if (cls.isMemberClass() && !l(cls)) {
            return true;
        }
        return false;
    }

    public final boolean l(Class<?> cls) {
        if ((cls.getModifiers() & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o(d dVar, e eVar) {
        if (m(dVar) && n(eVar)) {
            return true;
        }
        return false;
    }

    public Excluder p(b bVar, boolean z10, boolean z11) {
        Excluder excluderClone = clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.f20708f);
            excluderClone.f20708f = arrayList;
            arrayList.add(bVar);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.f20709g);
            excluderClone.f20709g = arrayList2;
            arrayList2.add(bVar);
        }
        return excluderClone;
    }

    public Excluder q(int... iArr) {
        Excluder excluderClone = clone();
        excluderClone.f20705c = 0;
        for (int i10 : iArr) {
            excluderClone.f20705c = i10 | excluderClone.f20705c;
        }
        return excluderClone;
    }

    public Excluder r(double d10) {
        Excluder excluderClone = clone();
        excluderClone.f20704b = d10;
        return excluderClone;
    }
}
