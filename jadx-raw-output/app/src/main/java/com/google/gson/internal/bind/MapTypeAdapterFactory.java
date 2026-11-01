package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import s5.h;
import s5.l;
import s5.o;
import s5.p;
import u5.d;
import u5.e;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.b f20742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20743c;

    public final class a<K, V> extends o<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o<K> f20744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o<V> f20745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e<? extends Map<K, V>> f20746c;

        public a(Gson gson, Type type, o<K> oVar, Type type2, o<V> oVar2, e<? extends Map<K, V>> eVar) {
            this.f20744a = new c(gson, oVar, type);
            this.f20745b = new c(gson, oVar2, type2);
            this.f20746c = eVar;
        }

        @Override // s5.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Map<K, V> map) throws IOException {
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            if (!MapTypeAdapterFactory.this.f20743c) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    this.f20745b.d(jsonWriter, entry.getValue());
                }
                jsonWriter.endObject();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                h hVarC = this.f20744a.c(entry2.getKey());
                arrayList.add(hVarC);
                arrayList2.add(entry2.getValue());
                z10 |= hVarC.g() || hVarC.i();
            }
            if (!z10) {
                jsonWriter.beginObject();
                int size = arrayList.size();
                while (i10 < size) {
                    jsonWriter.name(e((h) arrayList.get(i10)));
                    this.f20745b.d(jsonWriter, (V) arrayList2.get(i10));
                    i10++;
                }
                jsonWriter.endObject();
                return;
            }
            jsonWriter.beginArray();
            int size2 = arrayList.size();
            while (i10 < size2) {
                jsonWriter.beginArray();
                u5.h.b((h) arrayList.get(i10), jsonWriter);
                this.f20745b.d(jsonWriter, (V) arrayList2.get(i10));
                jsonWriter.endArray();
                i10++;
            }
            jsonWriter.endArray();
        }

        public final String e(h hVar) {
            if (hVar.j()) {
                l lVarF = hVar.f();
                if (lVarF.u()) {
                    return String.valueOf(lVarF.q());
                }
                if (lVarF.s()) {
                    return Boolean.toString(lVarF.l());
                }
                if (lVarF.w()) {
                    return lVarF.r();
                }
                throw new AssertionError();
            }
            if (hVar.h()) {
                return "null";
            }
            throw new AssertionError();
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map<K, V> mapA = this.f20746c.a();
            if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    K kB = this.f20744a.b(jsonReader);
                    if (mapA.put(kB, this.f20745b.b(jsonReader)) == null) {
                        jsonReader.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + kB);
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    d.INSTANCE.promoteNameToValue(jsonReader);
                    K kB2 = this.f20744a.b(jsonReader);
                    if (mapA.put(kB2, this.f20745b.b(jsonReader)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + kB2);
                    }
                }
                jsonReader.endObject();
            }
            return mapA;
        }
    }

    public final o<?> b(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f20790f : gson.getAdapter(x5.a.b(type));
    }

    public MapTypeAdapterFactory(u5.b bVar, boolean z10) {
        this.f20742b = bVar;
        this.f20743c = z10;
    }

    @Override // s5.p
    public <T> o<T> a(Gson gson, x5.a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] typeArrJ = C$Gson$Types.j(type, C$Gson$Types.k(type));
        return new a(gson, typeArrJ[0], b(gson, typeArrJ[0]), typeArrJ[1], gson.getAdapter(x5.a.b(typeArrJ[1])), this.f20742b.a(aVar));
    }
}
