package u5;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: Streams.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: compiled from: Streams.java */
    public static final class a extends Writer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Appendable f72734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0761a f72735c = new C0761a();

        /* JADX INFO: renamed from: u5.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Streams.java */
        public static class C0761a implements CharSequence {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public char[] f72736b;

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f72736b[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f72736b.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f72736b, i10, i11 - i10);
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) throws IOException {
            C0761a c0761a = this.f72735c;
            c0761a.f72736b = cArr;
            this.f72734b.append(c0761a, i10, i11 + i10);
        }

        public a(Appendable appendable) {
            this.f72734b = appendable;
        }

        @Override // java.io.Writer
        public void write(int i10) throws IOException {
            this.f72734b.append((char) i10);
        }
    }

    public static void b(s5.h hVar, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.X.d(jsonWriter, hVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }

    public static s5.h a(JsonReader jsonReader) throws JsonParseException {
        boolean z10;
        try {
            try {
                jsonReader.peek();
                z10 = false;
                try {
                    return TypeAdapters.X.b(jsonReader);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return s5.i.f67028b;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (EOFException e11) {
                e = e11;
                z10 = true;
            }
        } catch (MalformedJsonException e12) {
            throw new JsonSyntaxException(e12);
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        } catch (NumberFormatException e14) {
            throw new JsonSyntaxException(e14);
        }
    }
}
