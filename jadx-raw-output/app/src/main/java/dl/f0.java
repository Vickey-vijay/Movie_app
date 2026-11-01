package dl;

import com.ironsource.C3426d4;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* JADX INFO: compiled from: JsonExceptions.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f0 {
    public static final JsonDecodingException a(Number number, String str, String str2) {
        ck.p.j(number, "value");
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "output");
        return e(-1, k(number, str, str2));
    }

    public static final JsonEncodingException b(Number number, String str) {
        ck.p.j(number, "value");
        ck.p.j(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str, 0, 1, null)));
    }

    public static final JsonEncodingException c(Number number, String str, String str2) {
        ck.p.j(number, "value");
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "output");
        return new JsonEncodingException(k(number, str, str2));
    }

    public static final JsonEncodingException d(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + aVar.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + aVar.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException e(int i10, String str) {
        ck.p.j(str, "message");
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException f(int i10, String str, CharSequence charSequence) {
        ck.p.j(str, "message");
        ck.p.j(charSequence, "input");
        return e(i10, str + "\nJSON input: " + ((Object) h(charSequence, i10)));
    }

    public static final JsonDecodingException g(String str, String str2) {
        ck.p.j(str, C3426d4.i.W);
        ck.p.j(str2, "input");
        return e(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) i(str2, 0, 1, null)));
    }

    public static /* synthetic */ CharSequence i(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return h(charSequence, i10);
    }

    public static final Void j(a aVar, Number number) {
        ck.p.j(aVar, "<this>");
        ck.p.j(number, "result");
        a.y(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new KotlinNothingValueException();
    }

    public static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }

    public static final CharSequence h(CharSequence charSequence, int i10) {
        String str;
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str2 = ".....";
        if (i10 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i11 = i10 - 30;
        int i12 = i10 + 30;
        if (i11 > 0) {
            str = ".....";
        } else {
            str = "";
        }
        if (i12 >= charSequence.length()) {
            str2 = "";
        }
        return str + charSequence.subSequence(ik.k.d(i11, 0), ik.k.g(i12, charSequence.length())).toString() + str2;
    }
}
