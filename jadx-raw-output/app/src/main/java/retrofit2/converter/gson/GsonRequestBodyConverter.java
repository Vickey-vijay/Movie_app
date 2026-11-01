package retrofit2.converter.gson;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;
import s5.o;

/* JADX INFO: loaded from: classes10.dex */
final class GsonRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final o<T> adapter;
    private final Gson gson;

    @Override // retrofit2.Converter
    public RequestBody convert(T t10) throws IOException {
        Buffer buffer = new Buffer();
        JsonWriter jsonWriterNewJsonWriter = this.gson.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), UTF_8));
        this.adapter.d(jsonWriterNewJsonWriter, t10);
        jsonWriterNewJsonWriter.close();
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString());
    }

    public GsonRequestBodyConverter(Gson gson, o<T> oVar) {
        this.gson = gson;
        this.adapter = oVar;
    }
}
