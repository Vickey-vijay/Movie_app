package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;
import s5.e;
import s5.h;
import s5.i;
import s5.j;
import s5.l;

/* JADX INFO: compiled from: JsonTreeReader.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends JsonReader {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Reader f20830f = new C0205a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f20831g = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f20832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f20834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f20835e;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JsonTreeReader.java */
    public static class C0205a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f20832b = new Object[]{f20831g};
        this.f20833c = 1;
    }

    public a(h hVar) {
        super(f20830f);
        this.f20832b = new Object[32];
        this.f20833c = 0;
        this.f20834d = new String[32];
        this.f20835e = new int[32];
        l(hVar);
    }

    private String locationString() {
        return " at path " + getPath();
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginArray() throws IOException {
        a(JsonToken.BEGIN_ARRAY);
        l(((e) d()).iterator());
        this.f20835e[this.f20833c - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public void beginObject() throws IOException {
        a(JsonToken.BEGIN_OBJECT);
        l(((j) d()).entrySet().iterator());
    }

    public final Object d() {
        return this.f20832b[this.f20833c - 1];
    }

    @Override // com.google.gson.stream.JsonReader
    public void endArray() throws IOException {
        a(JsonToken.END_ARRAY);
        h();
        h();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public void endObject() throws IOException {
        a(JsonToken.END_OBJECT);
        h();
        h();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (i10 < this.f20833c) {
            Object[] objArr = this.f20832b;
            Object obj = objArr[i10];
            if (obj instanceof e) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f20835e[i10]);
                    sb2.append(']');
                }
            } else if (obj instanceof j) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f20834d[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public final Object h() {
        Object[] objArr = this.f20832b;
        int i10 = this.f20833c - 1;
        this.f20833c = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    public void k() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        l(entry.getValue());
        l(new l((String) entry.getKey()));
    }

    public final void l(Object obj) {
        int i10 = this.f20833c;
        Object[] objArr = this.f20832b;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[i10 * 2];
            int[] iArr = new int[i10 * 2];
            String[] strArr = new String[i10 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f20835e, 0, iArr, 0, this.f20833c);
            System.arraycopy(this.f20834d, 0, strArr, 0, this.f20833c);
            this.f20832b = objArr2;
            this.f20835e = iArr;
            this.f20834d = strArr;
        }
        Object[] objArr3 = this.f20832b;
        int i11 = this.f20833c;
        this.f20833c = i11 + 1;
        objArr3[i11] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean nextBoolean() throws IOException {
        a(JsonToken.BOOLEAN);
        boolean zL = ((l) h()).l();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return zL;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextName() throws IOException {
        a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) d()).next();
        String str = (String) entry.getKey();
        this.f20834d[this.f20833c - 1] = str;
        l(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public void nextNull() throws IOException {
        a(JsonToken.NULL);
        h();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public JsonToken peek() throws IOException {
        if (this.f20833c == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objD = d();
        if (objD instanceof Iterator) {
            boolean z10 = this.f20832b[this.f20833c - 2] instanceof j;
            Iterator it = (Iterator) objD;
            if (!it.hasNext()) {
                return z10 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z10) {
                return JsonToken.NAME;
            }
            l(it.next());
            return peek();
        }
        if (objD instanceof j) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objD instanceof e) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(objD instanceof l)) {
            if (objD instanceof i) {
                return JsonToken.NULL;
            }
            if (objD == f20831g) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        l lVar = (l) objD;
        if (lVar.w()) {
            return JsonToken.STRING;
        }
        if (lVar.s()) {
            return JsonToken.BOOLEAN;
        }
        if (lVar.u()) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.JsonReader
    public String toString() {
        return a.class.getSimpleName();
    }

    public final void a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public boolean hasNext() throws IOException {
        JsonToken jsonTokenPeek = peek();
        if (jsonTokenPeek != JsonToken.END_OBJECT && jsonTokenPeek != JsonToken.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.google.gson.stream.JsonReader
    public double nextDouble() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        double dN = ((l) d()).n();
        if (!isLenient() && (Double.isNaN(dN) || Double.isInfinite(dN))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dN);
        }
        h();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return dN;
    }

    @Override // com.google.gson.stream.JsonReader
    public int nextInt() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        int iO = ((l) d()).o();
        h();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return iO;
    }

    @Override // com.google.gson.stream.JsonReader
    public long nextLong() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        long jP = ((l) d()).p();
        h();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return jP;
    }

    @Override // com.google.gson.stream.JsonReader
    public String nextString() throws IOException {
        JsonToken jsonTokenPeek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenPeek != jsonToken && jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenPeek + locationString());
        }
        String strR = ((l) h()).r();
        int i10 = this.f20833c;
        if (i10 > 0) {
            int[] iArr = this.f20835e;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return strR;
    }

    @Override // com.google.gson.stream.JsonReader
    public void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f20834d[this.f20833c - 2] = "null";
        } else {
            h();
            int i10 = this.f20833c;
            if (i10 > 0) {
                this.f20834d[i10 - 1] = "null";
            }
        }
        int i11 = this.f20833c;
        if (i11 > 0) {
            int[] iArr = this.f20835e;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }
}
