package com.google.gson.internal.bind;

import com.google.android.material.badge.BadgeDrawable;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.ironsource.C3426d4;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes11.dex */
public final class TypeAdapters {
    public static final s5.o<String> A;
    public static final s5.o<BigDecimal> B;
    public static final s5.o<BigInteger> C;
    public static final s5.p D;
    public static final s5.o<StringBuilder> E;
    public static final s5.p F;
    public static final s5.o<StringBuffer> G;
    public static final s5.p H;
    public static final s5.o<URL> I;
    public static final s5.p J;
    public static final s5.o<URI> K;
    public static final s5.p L;
    public static final s5.o<InetAddress> M;
    public static final s5.p N;
    public static final s5.o<UUID> O;
    public static final s5.p P;
    public static final s5.o<Currency> Q;
    public static final s5.p R;
    public static final s5.p S;
    public static final s5.o<Calendar> T;
    public static final s5.p U;
    public static final s5.o<Locale> V;
    public static final s5.p W;
    public static final s5.o<s5.h> X;
    public static final s5.p Y;
    public static final s5.p Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s5.o<Class> f20785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s5.p f20786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s5.o<BitSet> f20787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s5.p f20788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s5.o<Boolean> f20789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s5.o<Boolean> f20790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s5.p f20791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s5.o<Number> f20792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final s5.p f20793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final s5.o<Number> f20794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s5.p f20795k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final s5.o<Number> f20796l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s5.p f20797m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s5.o<AtomicInteger> f20798n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s5.p f20799o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s5.o<AtomicBoolean> f20800p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s5.p f20801q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s5.o<AtomicIntegerArray> f20802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s5.p f20803s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s5.o<Number> f20804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s5.o<Number> f20805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s5.o<Number> f20806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s5.o<Number> f20807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s5.p f20808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s5.o<Character> f20809y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s5.p f20810z;

    public static class a extends s5.o<AtomicIntegerArray> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicIntegerArray b(JsonReader jsonReader) throws IOException {
            ArrayList arrayList = new ArrayList();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                try {
                    arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                } catch (NumberFormatException e10) {
                    throw new JsonSyntaxException(e10);
                }
            }
            jsonReader.endArray();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicIntegerArray atomicIntegerArray) throws IOException {
            jsonWriter.beginArray();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value(atomicIntegerArray.get(i10));
            }
            jsonWriter.endArray();
        }
    }

    public static class b0 extends s5.o<AtomicInteger> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicInteger b(JsonReader jsonReader) throws IOException {
            try {
                return new AtomicInteger(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicInteger atomicInteger) throws IOException {
            jsonWriter.value(atomicInteger.get());
        }
    }

    public static class c0 extends s5.o<AtomicBoolean> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public AtomicBoolean b(JsonReader jsonReader) throws IOException {
            return new AtomicBoolean(jsonReader.nextBoolean());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, AtomicBoolean atomicBoolean) throws IOException {
            jsonWriter.value(atomicBoolean.get());
        }
    }

    public static final class d0<T extends Enum<T>> extends s5.o<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, T> f20827a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map<T, String> f20828b = new HashMap();

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            jsonWriter.value(t10 == null ? null : this.f20828b.get(t10));
        }

        public d0(Class<T> cls) {
            try {
                for (T t10 : cls.getEnumConstants()) {
                    String strName = t10.name();
                    t5.c cVar = (t5.c) cls.getField(strName).getAnnotation(t5.c.class);
                    if (cVar != null) {
                        strName = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f20827a.put(str, t10);
                        }
                    }
                    this.f20827a.put(strName, t10);
                    this.f20828b.put(t10, strName);
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return this.f20827a.get(jsonReader.nextString());
        }
    }

    public static class f extends s5.o<Character> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Character ch2) throws IOException {
            jsonWriter.value(ch2 == null ? null : String.valueOf(ch2));
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Character b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if (strNextString.length() == 1) {
                return Character.valueOf(strNextString.charAt(0));
            }
            throw new JsonSyntaxException("Expecting character, got: " + strNextString);
        }
    }

    public static class j extends s5.o<StringBuilder> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, StringBuilder sb2) throws IOException {
            jsonWriter.value(sb2 == null ? null : sb2.toString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuilder b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuilder(jsonReader.nextString());
        }
    }

    public static class k extends s5.o<Class> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Class b(JsonReader jsonReader) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Class cls) throws IOException {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    public static class l extends s5.o<StringBuffer> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, StringBuffer stringBuffer) throws IOException {
            jsonWriter.value(stringBuffer == null ? null : stringBuffer.toString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public StringBuffer b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return new StringBuffer(jsonReader.nextString());
        }
    }

    public static class m extends s5.o<URL> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, URL url) throws IOException {
            jsonWriter.value(url == null ? null : url.toExternalForm());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URL b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            String strNextString = jsonReader.nextString();
            if ("null".equals(strNextString)) {
                return null;
            }
            return new URL(strNextString);
        }
    }

    public static class n extends s5.o<URI> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, URI uri) throws IOException {
            jsonWriter.value(uri == null ? null : uri.toASCIIString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public URI b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                String strNextString = jsonReader.nextString();
                if ("null".equals(strNextString)) {
                    return null;
                }
                return new URI(strNextString);
            } catch (URISyntaxException e10) {
                throw new JsonIOException(e10);
            }
        }
    }

    public static class o extends s5.o<InetAddress> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, InetAddress inetAddress) throws IOException {
            jsonWriter.value(inetAddress == null ? null : inetAddress.getHostAddress());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public InetAddress b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return InetAddress.getByName(jsonReader.nextString());
        }
    }

    public static class p extends s5.o<UUID> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, UUID uuid) throws IOException {
            jsonWriter.value(uuid == null ? null : uuid.toString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UUID b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return UUID.fromString(jsonReader.nextString());
        }
    }

    public static class r extends s5.o<Calendar> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Calendar calendar) throws IOException {
            if (calendar == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("year");
            jsonWriter.value(calendar.get(1));
            jsonWriter.name("month");
            jsonWriter.value(calendar.get(2));
            jsonWriter.name("dayOfMonth");
            jsonWriter.value(calendar.get(5));
            jsonWriter.name("hourOfDay");
            jsonWriter.value(calendar.get(11));
            jsonWriter.name("minute");
            jsonWriter.value(calendar.get(12));
            jsonWriter.name("second");
            jsonWriter.value(calendar.get(13));
            jsonWriter.endObject();
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Calendar b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (jsonReader.peek() != JsonToken.END_OBJECT) {
                String strNextName = jsonReader.nextName();
                int iNextInt = jsonReader.nextInt();
                if ("year".equals(strNextName)) {
                    i10 = iNextInt;
                } else if ("month".equals(strNextName)) {
                    i11 = iNextInt;
                } else if ("dayOfMonth".equals(strNextName)) {
                    i12 = iNextInt;
                } else if ("hourOfDay".equals(strNextName)) {
                    i13 = iNextInt;
                } else if ("minute".equals(strNextName)) {
                    i14 = iNextInt;
                } else if ("second".equals(strNextName)) {
                    i15 = iNextInt;
                }
            }
            jsonReader.endObject();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }
    }

    public static class s extends s5.o<Locale> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Locale locale) throws IOException {
            jsonWriter.value(locale == null ? null : locale.toString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Locale b(JsonReader jsonReader) throws IOException {
            String strNextToken;
            String strNextToken2;
            String strNextToken3 = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
            if (stringTokenizer.hasMoreElements()) {
                strNextToken = stringTokenizer.nextToken();
            } else {
                strNextToken = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                strNextToken2 = stringTokenizer.nextToken();
            } else {
                strNextToken2 = null;
            }
            if (stringTokenizer.hasMoreElements()) {
                strNextToken3 = stringTokenizer.nextToken();
            }
            if (strNextToken2 == null && strNextToken3 == null) {
                return new Locale(strNextToken);
            }
            if (strNextToken3 == null) {
                return new Locale(strNextToken, strNextToken2);
            }
            return new Locale(strNextToken, strNextToken2, strNextToken3);
        }
    }

    public static class t extends s5.o<s5.h> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public s5.h b(JsonReader jsonReader) throws IOException {
            switch (v.f20829a[jsonReader.peek().ordinal()]) {
                case 1:
                    return new s5.l(new LazilyParsedNumber(jsonReader.nextString()));
                case 2:
                    return new s5.l(Boolean.valueOf(jsonReader.nextBoolean()));
                case 3:
                    return new s5.l(jsonReader.nextString());
                case 4:
                    jsonReader.nextNull();
                    return s5.i.f67028b;
                case 5:
                    s5.e eVar = new s5.e();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        eVar.l(b(jsonReader));
                    }
                    jsonReader.endArray();
                    return eVar;
                case 6:
                    s5.j jVar = new s5.j();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        jVar.l(jsonReader.nextName(), b(jsonReader));
                    }
                    jsonReader.endObject();
                    return jVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, s5.h hVar) throws IOException {
            if (hVar == null || hVar.h()) {
                jsonWriter.nullValue();
                return;
            }
            if (hVar.j()) {
                s5.l lVarF = hVar.f();
                if (lVarF.u()) {
                    jsonWriter.value(lVarF.q());
                    return;
                } else if (lVarF.s()) {
                    jsonWriter.value(lVarF.l());
                    return;
                } else {
                    jsonWriter.value(lVarF.r());
                    return;
                }
            }
            if (hVar.g()) {
                jsonWriter.beginArray();
                Iterator<s5.h> it = hVar.c().iterator();
                while (it.hasNext()) {
                    d(jsonWriter, it.next());
                }
                jsonWriter.endArray();
                return;
            }
            if (!hVar.i()) {
                throw new IllegalArgumentException("Couldn't write " + hVar.getClass());
            }
            jsonWriter.beginObject();
            for (Map.Entry<String, s5.h> entry : hVar.e().entrySet()) {
                jsonWriter.name(entry.getKey());
                d(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
    }

    public static class u extends s5.o<BitSet> {
        /* JADX WARN: Code duplicated, block: B:15:0x002e  */
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BitSet b(JsonReader jsonReader) throws IOException {
            BitSet bitSet = new BitSet();
            jsonReader.beginArray();
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i10 = 0;
            while (jsonTokenPeek != JsonToken.END_ARRAY) {
                int i11 = v.f20829a[jsonTokenPeek.ordinal()];
                boolean zNextBoolean = true;
                if (i11 != 1) {
                    if (i11 == 2) {
                        zNextBoolean = jsonReader.nextBoolean();
                    } else {
                        if (i11 != 3) {
                            throw new JsonSyntaxException("Invalid bitset value type: " + jsonTokenPeek);
                        }
                        String strNextString = jsonReader.nextString();
                        try {
                            if (Integer.parseInt(strNextString) == 0) {
                                zNextBoolean = false;
                            }
                        } catch (NumberFormatException unused) {
                            throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + strNextString);
                        }
                    }
                } else if (jsonReader.nextInt() == 0) {
                    zNextBoolean = false;
                }
                if (zNextBoolean) {
                    bitSet.set(i10);
                }
                i10++;
                jsonTokenPeek = jsonReader.peek();
            }
            jsonReader.endArray();
            return bitSet;
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, BitSet bitSet) throws IOException {
            jsonWriter.beginArray();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                jsonWriter.value(bitSet.get(i10) ? 1L : 0L);
            }
            jsonWriter.endArray();
        }
    }

    public static class x extends s5.o<Boolean> {
        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool == null ? "null" : bool.toString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Boolean.valueOf(jsonReader.nextString());
        }
    }

    public static class a0 extends s5.o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Integer.valueOf(jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class b extends s5.o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class c extends s5.o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Float.valueOf((float) jsonReader.nextDouble());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class d extends s5.o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class e extends s5.o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            int i10 = v.f20829a[jsonTokenPeek.ordinal()];
            if (i10 != 1 && i10 != 3) {
                if (i10 == 4) {
                    jsonReader.nextNull();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + jsonTokenPeek);
            }
            return new LazilyParsedNumber(jsonReader.nextString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class g extends s5.o<String> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (jsonTokenPeek == JsonToken.BOOLEAN) {
                return Boolean.toString(jsonReader.nextBoolean());
            }
            return jsonReader.nextString();
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, String str) throws IOException {
            jsonWriter.value(str);
        }
    }

    public static class h extends s5.o<BigDecimal> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigDecimal b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    }

    public static class i extends s5.o<BigInteger> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public BigInteger b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    }

    public static class q extends s5.o<Currency> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Currency b(JsonReader jsonReader) throws IOException {
            return Currency.getInstance(jsonReader.nextString());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Currency currency) throws IOException {
            jsonWriter.value(currency.getCurrencyCode());
        }
    }

    public static /* synthetic */ class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20829a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f20829a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20829a[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20829a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20829a[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20829a[JsonToken.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20829a[JsonToken.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20829a[JsonToken.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20829a[JsonToken.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20829a[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20829a[JsonToken.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class w extends s5.o<Boolean> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(JsonReader jsonReader) throws IOException {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (jsonTokenPeek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            if (jsonTokenPeek == JsonToken.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString()));
            }
            return Boolean.valueOf(jsonReader.nextBoolean());
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Boolean bool) throws IOException {
            jsonWriter.value(bool);
        }
    }

    public static class y extends s5.o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Byte.valueOf((byte) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    public static class z extends s5.o<Number> {
        @Override // s5.o
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Number b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Short.valueOf((short) jsonReader.nextInt());
            } catch (NumberFormatException e10) {
                throw new JsonSyntaxException(e10);
            }
        }

        @Override // s5.o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    }

    static {
        s5.o<Class> oVarA = new k().a();
        f20785a = oVarA;
        f20786b = b(Class.class, oVarA);
        s5.o<BitSet> oVarA2 = new u().a();
        f20787c = oVarA2;
        f20788d = b(BitSet.class, oVarA2);
        w wVar = new w();
        f20789e = wVar;
        f20790f = new x();
        f20791g = a(Boolean.TYPE, Boolean.class, wVar);
        y yVar = new y();
        f20792h = yVar;
        f20793i = a(Byte.TYPE, Byte.class, yVar);
        z zVar = new z();
        f20794j = zVar;
        f20795k = a(Short.TYPE, Short.class, zVar);
        a0 a0Var = new a0();
        f20796l = a0Var;
        f20797m = a(Integer.TYPE, Integer.class, a0Var);
        s5.o<AtomicInteger> oVarA3 = new b0().a();
        f20798n = oVarA3;
        f20799o = b(AtomicInteger.class, oVarA3);
        s5.o<AtomicBoolean> oVarA4 = new c0().a();
        f20800p = oVarA4;
        f20801q = b(AtomicBoolean.class, oVarA4);
        s5.o<AtomicIntegerArray> oVarA5 = new a().a();
        f20802r = oVarA5;
        f20803s = b(AtomicIntegerArray.class, oVarA5);
        f20804t = new b();
        f20805u = new c();
        f20806v = new d();
        e eVar = new e();
        f20807w = eVar;
        f20808x = b(Number.class, eVar);
        f fVar = new f();
        f20809y = fVar;
        f20810z = a(Character.TYPE, Character.class, fVar);
        g gVar = new g();
        A = gVar;
        B = new h();
        C = new i();
        D = b(String.class, gVar);
        j jVar = new j();
        E = jVar;
        F = b(StringBuilder.class, jVar);
        l lVar = new l();
        G = lVar;
        H = b(StringBuffer.class, lVar);
        m mVar = new m();
        I = mVar;
        J = b(URL.class, mVar);
        n nVar = new n();
        K = nVar;
        L = b(URI.class, nVar);
        o oVar = new o();
        M = oVar;
        N = e(InetAddress.class, oVar);
        p pVar = new p();
        O = pVar;
        P = b(UUID.class, pVar);
        s5.o<Currency> oVarA6 = new q().a();
        Q = oVarA6;
        R = b(Currency.class, oVarA6);
        S = new s5.p() { // from class: com.google.gson.internal.bind.TypeAdapters.26

            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$26$a */
            public class a extends s5.o<Timestamp> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ s5.o f20811a;

                public a(s5.o oVar) {
                    this.f20811a = oVar;
                }

                @Override // s5.o
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public Timestamp b(JsonReader jsonReader) throws IOException {
                    Date date = (Date) this.f20811a.b(jsonReader);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }

                @Override // s5.o
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public void d(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                    this.f20811a.d(jsonWriter, timestamp);
                }
            }

            @Override // s5.p
            public <T> s5.o<T> a(Gson gson, x5.a<T> aVar) {
                if (aVar.c() != Timestamp.class) {
                    return null;
                }
                return new a(gson.getAdapter(Date.class));
            }
        };
        r rVar = new r();
        T = rVar;
        U = d(Calendar.class, GregorianCalendar.class, rVar);
        s sVar = new s();
        V = sVar;
        W = b(Locale.class, sVar);
        t tVar = new t();
        X = tVar;
        Y = e(s5.h.class, tVar);
        Z = new s5.p() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // s5.p
            public <T> s5.o<T> a(Gson gson, x5.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                    return null;
                }
                if (!clsC.isEnum()) {
                    clsC = clsC.getSuperclass();
                }
                return new d0(clsC);
            }
        };
    }

    public static <TT> s5.p a(final Class<TT> cls, final Class<TT> cls2, final s5.o<? super TT> oVar) {
        return new s5.p() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            public String toString() {
                return "Factory[type=" + cls2.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + cls.getName() + ",adapter=" + oVar + C3426d4.j.f28588e;
            }

            @Override // s5.p
            public <T> s5.o<T> a(Gson gson, x5.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC != cls && clsC != cls2) {
                    return null;
                }
                return oVar;
            }
        };
    }

    public static <TT> s5.p b(final Class<TT> cls, final s5.o<TT> oVar) {
        return new s5.p() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + oVar + C3426d4.j.f28588e;
            }

            @Override // s5.p
            public <T> s5.o<T> a(Gson gson, x5.a<T> aVar) {
                if (aVar.c() == cls) {
                    return oVar;
                }
                return null;
            }
        };
    }

    public static <TT> s5.p c(final x5.a<TT> aVar, final s5.o<TT> oVar) {
        return new s5.p() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // s5.p
            public <T> s5.o<T> a(Gson gson, x5.a<T> aVar2) {
                if (aVar2.equals(aVar)) {
                    return oVar;
                }
                return null;
            }
        };
    }

    public static <TT> s5.p d(final Class<TT> cls, final Class<? extends TT> cls2, final s5.o<? super TT> oVar) {
        return new s5.p() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            public String toString() {
                return "Factory[type=" + cls.getName() + BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX + cls2.getName() + ",adapter=" + oVar + C3426d4.j.f28588e;
            }

            @Override // s5.p
            public <T> s5.o<T> a(Gson gson, x5.a<T> aVar) {
                Class<? super T> clsC = aVar.c();
                if (clsC != cls && clsC != cls2) {
                    return null;
                }
                return oVar;
            }
        };
    }

    public static <T1> s5.p e(final Class<T1> cls, final s5.o<T1> oVar) {
        return new s5.p() { // from class: com.google.gson.internal.bind.TypeAdapters.35

            /* JADX INFO: Add missing generic type declarations: [T1] */
            /* JADX INFO: renamed from: com.google.gson.internal.bind.TypeAdapters$35$a */
            public class a<T1> extends s5.o<T1> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Class f20825a;

                public a(Class cls) {
                    this.f20825a = cls;
                }

                @Override // s5.o
                public T1 b(JsonReader jsonReader) throws IOException {
                    T1 t10 = (T1) oVar.b(jsonReader);
                    if (t10 == null || this.f20825a.isInstance(t10)) {
                        return t10;
                    }
                    throw new JsonSyntaxException("Expected a " + this.f20825a.getName() + " but was " + t10.getClass().getName());
                }

                @Override // s5.o
                public void d(JsonWriter jsonWriter, T1 t10) throws IOException {
                    oVar.d(jsonWriter, t10);
                }
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + oVar + C3426d4.j.f28588e;
            }

            @Override // s5.p
            public <T2> s5.o<T2> a(Gson gson, x5.a<T2> aVar) {
                Class<? super T2> clsC = aVar.c();
                if (!cls.isAssignableFrom(clsC)) {
                    return null;
                }
                return new a(clsC);
            }
        };
    }
}
