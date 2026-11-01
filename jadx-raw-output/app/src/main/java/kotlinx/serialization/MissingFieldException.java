package kotlinx.serialization;

import ck.p;
import java.util.List;
import nj.r;

/* JADX INFO: compiled from: SerializationExceptions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List<String> list, String str, Throwable th2) {
        super(str, th2);
        p.j(list, "missingFields");
        this.missingFields = list;
    }

    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List<String> list, String str) {
        String str2;
        p.j(list, "missingFields");
        p.j(str, "serialName");
        if (list.size() == 1) {
            str2 = "Field '" + list.get(0) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String str2) {
        this(r.e(str), "Field '" + str + "' is required for type with serial name '" + str2 + "', but it was missing", null);
        p.j(str, "missingField");
        p.j(str2, "serialName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str) {
        this(r.e(str), "Field '" + str + "' is required, but it was missing", null);
        p.j(str, "missingField");
    }
}
