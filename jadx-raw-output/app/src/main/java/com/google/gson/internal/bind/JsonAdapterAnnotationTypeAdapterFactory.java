package com.google.gson.internal.bind;

import com.google.gson.Gson;
import s5.g;
import s5.n;
import s5.o;
import s5.p;

/* JADX INFO: loaded from: classes9.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.b f20741b;

    public JsonAdapterAnnotationTypeAdapterFactory(u5.b bVar) {
        this.f20741b = bVar;
    }

    @Override // s5.p
    public <T> o<T> a(Gson gson, x5.a<T> aVar) {
        t5.b bVar = (t5.b) aVar.c().getAnnotation(t5.b.class);
        if (bVar == null) {
            return null;
        }
        return (o<T>) b(this.f20741b, gson, aVar, bVar);
    }

    public o<?> b(u5.b bVar, Gson gson, x5.a<?> aVar, t5.b bVar2) {
        n nVar;
        o<?> treeTypeAdapter;
        Object objA = bVar.a(x5.a.a(bVar2.value())).a();
        if (objA instanceof o) {
            treeTypeAdapter = (o) objA;
        } else if (objA instanceof p) {
            treeTypeAdapter = ((p) objA).a(gson, aVar);
        } else {
            boolean z10 = objA instanceof n;
            if (!z10 && !(objA instanceof g)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            g gVar = null;
            if (z10) {
                nVar = (n) objA;
            } else {
                nVar = null;
            }
            if (objA instanceof g) {
                gVar = (g) objA;
            }
            treeTypeAdapter = new TreeTypeAdapter<>(nVar, gVar, gson, aVar, null);
        }
        if (treeTypeAdapter != null && bVar2.nullSafe()) {
            return treeTypeAdapter.a();
        }
        return treeTypeAdapter;
    }
}
