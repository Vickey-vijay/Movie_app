package com.google.gson.internal.bind;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import s5.e;
import s5.h;
import s5.i;
import s5.j;
import s5.l;

/* JADX INFO: compiled from: JsonTreeWriter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends JsonWriter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Writer f20836e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f20837f = new l("closed");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f20838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f20839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f20840d;

    /* JADX INFO: compiled from: JsonTreeWriter.java */
    public static class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        i(new l(str));
        return this;
    }

    public b() {
        super(f20836e);
        this.f20838b = new ArrayList();
        this.f20840d = i.f67028b;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() throws IOException {
        e eVar = new e();
        i(eVar);
        this.f20838b.add(eVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() throws IOException {
        j jVar = new j();
        i(jVar);
        this.f20838b.add(jVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f20838b.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f20838b.add(f20837f);
    }

    public h d() {
        if (this.f20838b.isEmpty()) {
            return this.f20840d;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f20838b);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() throws IOException {
        if (this.f20838b.isEmpty() || this.f20839c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof e)) {
            throw new IllegalStateException();
        }
        List<h> list = this.f20838b;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() throws IOException {
        if (this.f20838b.isEmpty() || this.f20839c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof j)) {
            throw new IllegalStateException();
        }
        List<h> list = this.f20838b;
        list.remove(list.size() - 1);
        return this;
    }

    public final h h() {
        List<h> list = this.f20838b;
        return list.get(list.size() - 1);
    }

    public final void i(h hVar) {
        if (this.f20839c != null) {
            if (!hVar.h() || getSerializeNulls()) {
                ((j) h()).l(this.f20839c, hVar);
            }
            this.f20839c = null;
            return;
        }
        if (this.f20838b.isEmpty()) {
            this.f20840d = hVar;
            return;
        }
        h hVarH = h();
        if (!(hVarH instanceof e)) {
            throw new IllegalStateException();
        }
        ((e) hVarH).l(hVar);
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) throws IOException {
        if (this.f20838b.isEmpty() || this.f20839c != null) {
            throw new IllegalStateException();
        }
        if (!(h() instanceof j)) {
            throw new IllegalStateException();
        }
        this.f20839c = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() throws IOException {
        i(i.f67028b);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z10) throws IOException {
        i(new l(Boolean.valueOf(z10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        i(new l(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d10) throws IOException {
        if (!isLenient() && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
        }
        i(new l(Double.valueOf(d10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j10) throws IOException {
        i(new l(Long.valueOf(j10)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        i(new l(number));
        return this;
    }
}
