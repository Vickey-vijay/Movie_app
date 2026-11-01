package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import s5.o;

/* JADX INFO: compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c<T> extends o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f20841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<T> f20842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f20843c;

    @Override // s5.o
    public T b(JsonReader jsonReader) throws IOException {
        return this.f20842b.b(jsonReader);
    }

    @Override // s5.o
    public void d(JsonWriter jsonWriter, T t10) throws IOException {
        o<T> adapter = this.f20842b;
        Type typeE = e(this.f20843c, t10);
        if (typeE != this.f20843c) {
            adapter = this.f20841a.getAdapter(x5.a.b(typeE));
            if (adapter instanceof ReflectiveTypeAdapterFactory.b) {
                o<T> oVar = this.f20842b;
                if (!(oVar instanceof ReflectiveTypeAdapterFactory.b)) {
                    adapter = oVar;
                }
            }
        }
        adapter.d(jsonWriter, t10);
    }

    public final Type e(Type type, Object obj) {
        if (obj != null) {
            return (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type;
        }
        return type;
    }

    public c(Gson gson, o<T> oVar, Type type) {
        this.f20841a = gson;
        this.f20842b = oVar;
        this.f20843c = type;
    }
}
