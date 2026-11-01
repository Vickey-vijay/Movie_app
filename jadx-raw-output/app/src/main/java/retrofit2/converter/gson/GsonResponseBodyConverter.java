package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import s5.o;

/* JADX INFO: loaded from: classes10.dex */
final class GsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final o<T> adapter;
    private final Gson gson;

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader jsonReaderNewJsonReader = this.gson.newJsonReader(responseBody.charStream());
        try {
            T tB = this.adapter.b(jsonReaderNewJsonReader);
            if (jsonReaderNewJsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonIOException("JSON document was not fully consumed.");
            }
            responseBody.close();
            return tB;
        } catch (Throwable th2) {
            responseBody.close();
            throw th2;
        }
    }

    public GsonResponseBodyConverter(Gson gson, o<T> oVar) {
        this.gson = gson;
        this.adapter = oVar;
    }
}
