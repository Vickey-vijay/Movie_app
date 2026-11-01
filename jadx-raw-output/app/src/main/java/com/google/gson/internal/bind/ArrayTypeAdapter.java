package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import s5.o;
import s5.p;

/* JADX INFO: loaded from: classes11.dex */
public final class ArrayTypeAdapter<E> extends o<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f20733c = new p() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // s5.p
        public <T> o<T> a(Gson gson, x5.a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type typeG = C$Gson$Types.g(type);
            return new ArrayTypeAdapter(gson, gson.getAdapter(x5.a.b(typeG)), C$Gson$Types.k(typeG));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<E> f20734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<E> f20735b;

    @Override // s5.o
    public void d(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f20735b.d(jsonWriter, (E) Array.get(obj, i10));
        }
        jsonWriter.endArray();
    }

    public ArrayTypeAdapter(Gson gson, o<E> oVar, Class<E> cls) {
        this.f20735b = new c(gson, oVar, cls);
        this.f20734a = cls;
    }

    @Override // s5.o
    public Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f20735b.b(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f20734a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }
}
