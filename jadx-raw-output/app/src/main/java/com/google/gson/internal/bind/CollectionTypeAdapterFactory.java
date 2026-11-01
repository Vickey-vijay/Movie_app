package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import s5.o;
import s5.p;
import u5.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.b f20736b;

    public static final class a<E> extends o<Collection<E>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o<E> f20737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e<? extends Collection<E>> f20738b;

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Collection<E> collection) throws IOException {
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f20737a.d(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }

        public a(Gson gson, Type type, o<E> oVar, e<? extends Collection<E>> eVar) {
            this.f20737a = new c(gson, oVar, type);
            this.f20738b = eVar;
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<E> b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionA = this.f20738b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionA.add(this.f20737a.b(jsonReader));
            }
            jsonReader.endArray();
            return collectionA;
        }
    }

    public CollectionTypeAdapterFactory(u5.b bVar) {
        this.f20736b = bVar;
    }

    @Override // s5.p
    public <T> o<T> a(Gson gson, x5.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> clsC = aVar.c();
        if (!Collection.class.isAssignableFrom(clsC)) {
            return null;
        }
        Type typeH = C$Gson$Types.h(type, clsC);
        return new a(gson, typeH, gson.getAdapter(x5.a.b(typeH)), this.f20736b.a(aVar));
    }
}
