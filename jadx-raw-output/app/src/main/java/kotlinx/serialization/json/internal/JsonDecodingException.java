package kotlinx.serialization.json.internal;

import ck.p;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class JsonDecodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDecodingException(String str) {
        super(str);
        p.j(str, "message");
    }
}
