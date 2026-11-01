package com.google.gson.internal.bind;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import s5.o;
import s5.p;
import u5.e;
import u5.g;

/* JADX INFO: loaded from: classes11.dex */
public final class ReflectiveTypeAdapterFactory implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.b f20751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FieldNamingStrategy f20752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Excluder f20753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f20754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5.b f20755f = w5.b.a();

    public class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Field f20756d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f20757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ o f20758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Gson f20759g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ x5.a f20760h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f20761i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, boolean z11, Field field, boolean z12, o oVar, Gson gson, x5.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f20756d = field;
            this.f20757e = z12;
            this.f20758f = oVar;
            this.f20759g = gson;
            this.f20760h = aVar;
            this.f20761i = z13;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public void a(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            Object objB = this.f20758f.b(jsonReader);
            if (objB == null && this.f20761i) {
                return;
            }
            this.f20756d.set(obj, objB);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public void b(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            (this.f20757e ? this.f20758f : new com.google.gson.internal.bind.c(this.f20759g, this.f20758f, this.f20760h.getType())).d(jsonWriter, this.f20756d.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
        public boolean c(Object obj) throws IllegalAccessException, IOException {
            return this.f20766b && this.f20756d.get(obj) != obj;
        }
    }

    public static final class b<T> extends o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e<T> f20763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<String, c> f20764b;

        @Override // s5.o
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (c cVar : this.f20764b.values()) {
                    if (cVar.c(t10)) {
                        jsonWriter.name(cVar.f20765a);
                        cVar.b(jsonWriter, t10);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        public b(e<T> eVar, Map<String, c> map) {
            this.f20763a = eVar;
            this.f20764b = map;
        }

        @Override // s5.o
        public T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T tA = this.f20763a.a();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    c cVar = this.f20764b.get(jsonReader.nextName());
                    if (cVar != null && cVar.f20767c) {
                        cVar.a(jsonReader, tA);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return tA;
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }
    }

    public final c b(Gson gson, Field field, String str, x5.a<?> aVar, boolean z10, boolean z11) {
        boolean zB = g.b(aVar.c());
        t5.b bVar = (t5.b) field.getAnnotation(t5.b.class);
        o<?> oVarB = bVar != null ? this.f20754e.b(this.f20751b, gson, aVar, bVar) : null;
        boolean z12 = oVarB != null;
        if (oVarB == null) {
            oVarB = gson.getAdapter(aVar);
        }
        return new a(str, z10, z11, field, z12, oVarB, gson, aVar, zB);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f20766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f20767c;

        public abstract void a(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void b(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean c(Object obj) throws IllegalAccessException, IOException;

        public c(String str, boolean z10, boolean z11) {
            this.f20765a = str;
            this.f20766b = z10;
            this.f20767c = z11;
        }
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.f20753d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final Map<String, c> e(Gson gson, x5.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        x5.a<?> aVarB = aVar;
        Class<?> clsC = cls;
        while (clsC != Object.class) {
            Field[] declaredFields = clsC.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean zC = c(field, true);
                boolean zC2 = c(field, z10);
                if (zC || zC2) {
                    this.f20755f.b(field);
                    Type typeP = C$Gson$Types.p(aVarB.getType(), clsC, field.getGenericType());
                    List<String> listF = f(field);
                    int size = listF.size();
                    c cVar = null;
                    ?? r10 = z10;
                    while (r10 < size) {
                        String str = listF.get(r10);
                        boolean z11 = r10 != 0 ? z10 : zC;
                        ?? r20 = r10;
                        c cVar2 = cVar;
                        int i11 = size;
                        List<String> list = listF;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, b(gson, field, str, x5.a.b(typeP), z11, zC2)) : cVar2;
                        zC = z11;
                        listF = list;
                        size = i11;
                        field = field2;
                        z10 = false;
                        r10 = (r20 == true ? 1 : 0) + 1;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.f20765a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVarB = x5.a.b(C$Gson$Types.p(aVarB.getType(), clsC, clsC.getGenericSuperclass()));
            clsC = aVarB.c();
        }
        return linkedHashMap;
    }

    public final List<String> f(Field field) {
        t5.c cVar = (t5.c) field.getAnnotation(t5.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f20752c.translateName(field));
        }
        String strValue = cVar.value();
        String[] strArrAlternate = cVar.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    public ReflectiveTypeAdapterFactory(u5.b bVar, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f20751b = bVar;
        this.f20752c = fieldNamingStrategy;
        this.f20753d = excluder;
        this.f20754e = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public static boolean d(Field field, boolean z10, Excluder excluder) {
        if (!excluder.d(field.getType(), z10) && !excluder.g(field, z10)) {
            return true;
        }
        return false;
    }

    @Override // s5.p
    public <T> o<T> a(Gson gson, x5.a<T> aVar) {
        Class<? super T> clsC = aVar.c();
        if (!Object.class.isAssignableFrom(clsC)) {
            return null;
        }
        return new b(this.f20751b.a(aVar), e(gson, aVar, clsC));
    }
}
