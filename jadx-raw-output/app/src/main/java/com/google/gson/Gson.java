package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import s5.h;
import s5.i;
import s5.o;
import s5.p;
import u5.g;

/* JADX INFO: loaded from: classes5.dex */
public final class Gson {
    public static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    public static final boolean DEFAULT_ESCAPE_HTML = true;
    public static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    public static final boolean DEFAULT_LENIENT = false;
    public static final boolean DEFAULT_PRETTY_PRINT = false;
    public static final boolean DEFAULT_SERIALIZE_NULLS = false;
    public static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final x5.a<?> NULL_KEY_SURROGATE = x5.a.a(Object.class);
    public final List<p> builderFactories;
    public final List<p> builderHierarchyFactories;
    private final ThreadLocal<Map<x5.a<?>, f<?>>> calls;
    public final boolean complexMapKeySerialization;
    private final u5.b constructorConstructor;
    public final String datePattern;
    public final int dateStyle;
    public final Excluder excluder;
    public final List<p> factories;
    public final FieldNamingStrategy fieldNamingStrategy;
    public final boolean generateNonExecutableJson;
    public final boolean htmlSafe;
    public final Map<Type, s5.d<?>> instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    public final boolean lenient;
    public final LongSerializationPolicy longSerializationPolicy;
    public final boolean prettyPrinting;
    public final boolean serializeNulls;
    public final boolean serializeSpecialFloatingPointValues;
    public final int timeStyle;
    private final Map<x5.a<?>, o<?>> typeTokenCache;

    public class a extends o<Number> {
        public a() {
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                Gson.checkValidFloatingPoint(number.doubleValue());
                jsonWriter.value(number);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Double b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }
    }

    public class b extends o<Number> {
        public b() {
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                Gson.checkValidFloatingPoint(number.floatValue());
                jsonWriter.value(number);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }
    }

    public static class c extends o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Long.valueOf(jsonReader.nextLong());
        }
    }

    public static class d extends o<AtomicLong> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f20698a;

        public d(o oVar) {
            this.f20698a = oVar;
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLong b(JsonReader jsonReader) throws IOException {
            return new AtomicLong(((Number) this.f20698a.b(jsonReader)).longValue());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
            this.f20698a.d(jsonWriter, Long.valueOf(atomicLong.get()));
        }
    }

    public static class e extends o<AtomicLongArray> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f20699a;

        public e(o oVar) {
            this.f20699a = oVar;
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicLongArray b(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f20699a.b(jsonReader)).longValue()));
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f20699a.d(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
            }
            jsonWriter.endArray();
        }
    }

    public static class f<T> extends o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o<T> f20700a;

        @Override // s5.o
        public T b(JsonReader jsonReader) throws IOException {
            o<T> oVar = this.f20700a;
            if (oVar != null) {
                return oVar.b(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // s5.o
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            o<T> oVar = this.f20700a;
            if (oVar == null) {
                throw new IllegalStateException();
            }
            oVar.d(jsonWriter, t10);
        }

        public void e(o<T> oVar) {
            if (this.f20700a != null) {
                throw new AssertionError();
            }
            this.f20700a = oVar;
        }
    }

    public Gson() {
        this(Excluder.f20703h, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public <T> T fromJson(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) g.c(cls).cast(fromJson(str, (Type) cls));
    }

    public <T> o<T> getAdapter(x5.a<T> aVar) {
        o<T> oVar = (o) this.typeTokenCache.get(aVar == null ? NULL_KEY_SURROGATE : aVar);
        if (oVar != null) {
            return oVar;
        }
        Map<x5.a<?>, f<?>> map = this.calls.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.calls.set(map);
            z10 = true;
        }
        f<?> fVar = map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f<?> fVar2 = new f<>();
            map.put(aVar, fVar2);
            Iterator<p> it = this.factories.iterator();
            while (it.hasNext()) {
                o<T> oVarA = it.next().a(this, aVar);
                if (oVarA != null) {
                    fVar2.e(oVarA);
                    this.typeTokenCache.put(aVar, oVarA);
                    map.remove(aVar);
                    if (z10) {
                        this.calls.remove();
                    }
                    return oVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } catch (Throwable th2) {
            map.remove(aVar);
            if (z10) {
                this.calls.remove();
            }
            throw th2;
        }
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((h) i.f67028b) : toJson(obj, obj.getClass());
    }

    public h toJsonTree(Object obj) {
        return obj == null ? i.f67028b : toJsonTree(obj, obj.getClass());
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new JsonSyntaxException(e10);
            } catch (IOException e11) {
                throw new JsonIOException(e11);
            }
        }
    }

    private static o<AtomicLong> atomicLongAdapter(o<Number> oVar) {
        return new d(oVar).a();
    }

    private static o<AtomicLongArray> atomicLongArrayAdapter(o<Number> oVar) {
        return new e(oVar).a();
    }

    private o<Number> doubleAdapter(boolean z10) {
        return z10 ? TypeAdapters.f20806v : new a();
    }

    private o<Number> floatAdapter(boolean z10) {
        return z10 ? TypeAdapters.f20805u : new b();
    }

    private static o<Number> longAdapter(LongSerializationPolicy longSerializationPolicy) {
        return longSerializationPolicy == LongSerializationPolicy.DEFAULT ? TypeAdapters.f20804t : new c();
    }

    public Excluder excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> o<T> getDelegateAdapter(p pVar, x5.a<T> aVar) {
        if (!this.factories.contains(pVar)) {
            pVar = this.jsonAdapterFactory;
        }
        boolean z10 = false;
        for (p pVar2 : this.factories) {
            if (z10) {
                o<T> oVarA = pVar2.a(this, aVar);
                if (oVarA != null) {
                    return oVarA;
                }
            } else if (pVar2 == pVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.lenient);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.prettyPrinting) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
    }

    public static void checkValidFloatingPoint(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public <T> T fromJson(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), type);
    }

    public String toJson(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        toJson(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public h toJsonTree(Object obj, Type type) {
        com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
        toJson(obj, type, bVar);
        return bVar.d();
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        Object objFromJson = fromJson(jsonReaderNewJsonReader, cls);
        assertFullConsumption(objFromJson, jsonReaderNewJsonReader);
        return (T) g.c(cls).cast(objFromJson);
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, s5.d<?>> map, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, LongSerializationPolicy longSerializationPolicy, String str, int i10, int i11, List<p> list, List<p> list2, List<p> list3) {
        this.calls = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        u5.b bVar = new u5.b(map);
        this.constructorConstructor = bVar;
        this.serializeNulls = z10;
        this.complexMapKeySerialization = z11;
        this.generateNonExecutableJson = z12;
        this.htmlSafe = z13;
        this.prettyPrinting = z14;
        this.lenient = z15;
        this.serializeSpecialFloatingPointValues = z16;
        this.longSerializationPolicy = longSerializationPolicy;
        this.datePattern = str;
        this.dateStyle = i10;
        this.timeStyle = i11;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.f20748b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f20797m);
        arrayList.add(TypeAdapters.f20791g);
        arrayList.add(TypeAdapters.f20793i);
        arrayList.add(TypeAdapters.f20795k);
        o<Number> oVarLongAdapter = longAdapter(longSerializationPolicy);
        arrayList.add(TypeAdapters.a(Long.TYPE, Long.class, oVarLongAdapter));
        arrayList.add(TypeAdapters.a(Double.TYPE, Double.class, doubleAdapter(z16)));
        arrayList.add(TypeAdapters.a(Float.TYPE, Float.class, floatAdapter(z16)));
        arrayList.add(TypeAdapters.f20808x);
        arrayList.add(TypeAdapters.f20799o);
        arrayList.add(TypeAdapters.f20801q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, atomicLongAdapter(oVarLongAdapter)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, atomicLongArrayAdapter(oVarLongAdapter)));
        arrayList.add(TypeAdapters.f20803s);
        arrayList.add(TypeAdapters.f20810z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.C));
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.f20788d);
        arrayList.add(DateTypeAdapter.f20739b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.f20770b);
        arrayList.add(SqlDateTypeAdapter.f20768b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.f20733c);
        arrayList.add(TypeAdapters.f20786b);
        arrayList.add(new CollectionTypeAdapterFactory(bVar));
        arrayList.add(new MapTypeAdapterFactory(bVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(bVar);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        arrayList.add(new ReflectiveTypeAdapterFactory(bVar, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    public void toJson(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((h) i.f67028b, appendable);
        }
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            toJson(obj, type, newJsonWriter(u5.h.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public <T> T fromJson(Reader reader, Type type) throws JsonSyntaxException, JsonIOException {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        T t10 = (T) fromJson(jsonReaderNewJsonReader, type);
        assertFullConsumption(t10, jsonReaderNewJsonReader);
        return t10;
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        o adapter = getAdapter(x5.a.b(type));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                adapter.d(jsonWriter, obj);
                jsonWriter.setLenient(zIsLenient);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th2;
        }
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws JsonSyntaxException, JsonIOException {
        boolean zIsLenient = jsonReader.isLenient();
        boolean z10 = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z10 = false;
                    T tB = getAdapter(x5.a.b(type)).b(jsonReader);
                    jsonReader.setLenient(zIsLenient);
                    return tB;
                } catch (IOException e10) {
                    throw new JsonSyntaxException(e10);
                } catch (IllegalStateException e11) {
                    throw new JsonSyntaxException(e11);
                }
            } catch (EOFException e12) {
                if (z10) {
                    jsonReader.setLenient(zIsLenient);
                    return null;
                }
                throw new JsonSyntaxException(e12);
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e13.getMessage(), e13);
            }
        } catch (Throwable th2) {
            jsonReader.setLenient(zIsLenient);
            throw th2;
        }
    }

    public <T> o<T> getAdapter(Class<T> cls) {
        return getAdapter(x5.a.a(cls));
    }

    public <T> T fromJson(h hVar, Class<T> cls) throws JsonSyntaxException {
        return (T) g.c(cls).cast(fromJson(hVar, (Type) cls));
    }

    public <T> T fromJson(h hVar, Type type) throws JsonSyntaxException {
        if (hVar == null) {
            return null;
        }
        return (T) fromJson(new com.google.gson.internal.bind.a(hVar), type);
    }

    public String toJson(h hVar) {
        StringWriter stringWriter = new StringWriter();
        toJson(hVar, (Appendable) stringWriter);
        return stringWriter.toString();
    }

    public void toJson(h hVar, Appendable appendable) throws JsonIOException {
        try {
            toJson(hVar, newJsonWriter(u5.h.c(appendable)));
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public void toJson(h hVar, JsonWriter jsonWriter) throws JsonIOException {
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                u5.h.b(hVar, jsonWriter);
                jsonWriter.setLenient(zIsLenient);
                jsonWriter.setHtmlSafe(zIsHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } catch (Throwable th2) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th2;
        }
    }
}
