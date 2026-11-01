package s5;

import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: compiled from: JsonParser.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k {
    public h a(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
        boolean zIsLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                h hVarA = u5.h.a(jsonReader);
                jsonReader.setLenient(zIsLenient);
                return hVarA;
            } catch (OutOfMemoryError e10) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e10);
            } catch (StackOverflowError e11) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e11);
            }
        } catch (Throwable th2) {
            jsonReader.setLenient(zIsLenient);
            throw th2;
        }
    }

    public h b(Reader reader) throws JsonSyntaxException, JsonIOException {
        try {
            JsonReader jsonReader = new JsonReader(reader);
            h hVarA = a(jsonReader);
            if (!hVarA.h() && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new JsonSyntaxException("Did not consume the entire document.");
            }
            return hVarA;
        } catch (MalformedJsonException e10) {
            throw new JsonSyntaxException(e10);
        } catch (IOException e11) {
            throw new JsonIOException(e11);
        } catch (NumberFormatException e12) {
            throw new JsonSyntaxException(e12);
        }
    }

    public h c(String str) throws JsonSyntaxException {
        return b(new StringReader(str));
    }
}
