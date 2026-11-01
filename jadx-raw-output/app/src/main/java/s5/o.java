package s5;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: TypeAdapter.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class o<T> {

    /* JADX INFO: compiled from: TypeAdapter.java */
    public class a extends o<T> {
        public a() {
        }

        @Override // s5.o
        public void d(JsonWriter jsonWriter, T t10) throws IOException {
            if (t10 == null) {
                jsonWriter.nullValue();
            } else {
                o.this.d(jsonWriter, t10);
            }
        }

        @Override // s5.o
        public T b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            return (T) o.this.b(jsonReader);
        }
    }

    public abstract T b(JsonReader jsonReader) throws IOException;

    public abstract void d(JsonWriter jsonWriter, T t10) throws IOException;

    public final o<T> a() {
        return new a();
    }

    public final h c(T t10) {
        try {
            com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
            d(bVar, t10);
            return bVar.d();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }
}
