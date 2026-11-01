package kotlinx.serialization.json.internal;

import ck.p;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str) {
        super(str);
        p.j(str, "message");
    }
}
