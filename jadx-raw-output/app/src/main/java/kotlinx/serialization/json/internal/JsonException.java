package kotlinx.serialization.json.internal;

import ck.p;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes7.dex */
public class JsonException extends SerializationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonException(String str) {
        super(str);
        p.j(str, "message");
    }
}
