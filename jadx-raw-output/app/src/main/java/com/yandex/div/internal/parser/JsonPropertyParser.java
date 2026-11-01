package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bk.l;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mj.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class JsonPropertyParser {
    @Nullable
    private static <T> T optSafe(JSONObject jSONObject, String str) {
        T t10 = (T) jSONObject.opt(str);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            throw ParsingExceptionKt.missingValue(jSONObject, str);
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObjectNullable != null) {
                try {
                    V vDeserialize = gVar.getValue().deserialize(parsingContext, jSONObjectNullable);
                    if (vDeserialize != null) {
                        arrayList.add(vDeserialize);
                    }
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalList(parsingContext, jSONObject, str, lVar, listValidator, JsonParsers.alwaysValid());
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v10) {
        write(parsingContext, jSONObject, str, v10, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull l<V, R> lVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(lVar.invoke(list.get(i10)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e10) {
            parsingContext.getLogger().logError(e10);
        }
    }

    @Nullable
    private static JSONObject nullable(@Nullable JSONObject jSONObject) {
        if (jSONObject == null || jSONObject == JSONObject.NULL) {
            return null;
        }
        return jSONObject;
    }

    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull l<R, V> lVar) {
        return (V) read(parsingContext, jSONObject, str, lVar, JsonParsers.alwaysValid());
    }

    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull l<R, V> lVar) {
        return (V) readOptional(parsingContext, jSONObject, str, lVar, JsonParsers.alwaysValid());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<V> listEmptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(listEmptyList)) {
                    return listEmptyList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, listEmptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, listEmptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            Object objOptSafe = optSafe(jSONArrayOptJSONArray, i10);
            if (objOptSafe != null) {
                try {
                    V vInvoke = lVar.invoke(objOptSafe);
                    if (vInvoke != null) {
                        try {
                            if (valueValidator.isValid(vInvoke)) {
                                arrayList.add(vInvoke);
                            } else {
                                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, vInvoke));
                            }
                        } catch (ClassCastException unused2) {
                            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, vInvoke));
                        }
                    }
                } catch (ClassCastException unused3) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONArrayOptJSONArray, str, i10, objOptSafe));
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONArrayOptJSONArray, str, i10, objOptSafe, e10));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused4) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }

    public static <R, V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v10, @NonNull l<V, R> lVar) {
        if (v10 != null) {
            try {
                jSONObject.put(str, lVar.invoke(v10));
            } catch (JSONException e10) {
                parsingContext.getLogger().logError(e10);
            }
        }
    }

    @Nullable
    private static <T> T optSafe(JSONArray jSONArray, int i10) {
        T t10 = (T) jSONArray.opt(i10);
        if (t10 == JSONObject.NULL) {
            return null;
        }
        return t10;
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) read(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull ValueValidator<V> valueValidator) {
        return (V) readOptional(parsingContext, jSONObject, str, JsonParsers.doNotConvert(), valueValidator);
    }

    @Nullable
    public static String readOptionalString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        try {
            return (String) objOptSafe;
        } catch (ClassCastException unused) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e10) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10));
            return null;
        }
    }

    @NonNull
    public static String readString(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            try {
                return (String) objOptSafe;
            } catch (ClassCastException unused) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
            } catch (Exception e10) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static <R, V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe != null) {
            try {
                V v10 = (V) lVar.invoke(objOptSafe);
                if (v10 != null) {
                    try {
                        if (valueValidator.isValid(v10)) {
                            return v10;
                        }
                        throw ParsingExceptionKt.invalidValue(jSONObject, str, v10);
                    } catch (ClassCastException unused) {
                        throw ParsingExceptionKt.typeMismatch(jSONObject, str, v10);
                    }
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe);
            } catch (Exception e10) {
                throw ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static <R, V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        Object objOptSafe = optSafe(jSONObject, str);
        if (objOptSafe == null) {
            return null;
        }
        try {
            V v10 = (V) lVar.invoke(objOptSafe);
            if (v10 == null) {
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            }
            try {
                if (valueValidator.isValid(v10)) {
                    return v10;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
                return null;
            }
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, objOptSafe));
            return null;
        } catch (Exception e10) {
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, objOptSafe, e10));
            return null;
        }
    }

    public static <V> void write(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable V v10, @NonNull g<Serializer<JSONObject, V>> gVar) {
        if (v10 != null) {
            try {
                jSONObject.put(str, gVar.getValue().serialize(parsingContext, v10));
            } catch (JSONException e10) {
                parsingContext.getLogger().logError(e10);
            }
        }
    }

    public static <V> void writeList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable List<V> list, @NonNull g<Serializer<JSONObject, V>> gVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray.put(gVar.getValue().serialize(parsingContext, list.get(i10)));
        }
        try {
            jSONObject.put(str, jSONArray);
        } catch (JSONException e10) {
            parsingContext.getLogger().logError(e10);
        }
    }

    @NonNull
    public static <V> List<V> readList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g<Deserializer<JSONObject, V>> gVar, @NonNull ListValidator<V> listValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            if (length == 0) {
                List<V> listEmptyList = Collections.emptyList();
                try {
                    if (!listValidator.isValid(listEmptyList)) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, listEmptyList));
                    }
                    return listEmptyList;
                } catch (ClassCastException unused) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, listEmptyList));
                    return listEmptyList;
                }
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
                if (jSONObjectNullable != null) {
                    try {
                        V vDeserialize = gVar.getValue().deserialize(parsingContext, jSONObjectNullable);
                        if (vDeserialize != null) {
                            arrayList.add(vDeserialize);
                        }
                    } catch (Exception e10) {
                        parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                    }
                }
            }
            try {
                if (listValidator.isValid(arrayList)) {
                    return arrayList;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, arrayList);
            } catch (ClassCastException unused2) {
                throw ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> V readOptional(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        try {
            return gVar.getValue().deserialize(parsingContext, jSONObjectOptJSONObject);
        } catch (Exception e10) {
            parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONObject, str, e10));
            return null;
        }
    }

    @NonNull
    public static <V> V read(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            try {
                V vDeserialize = gVar.getValue().deserialize(parsingContext, jSONObjectOptJSONObject);
                if (vDeserialize != null) {
                    return vDeserialize;
                }
                throw ParsingExceptionKt.invalidValue(jSONObject, str, (Object) null);
            } catch (Exception e10) {
                throw ParsingExceptionKt.dependencyFailed(jSONObject, str, e10);
            }
        }
        throw ParsingExceptionKt.missingValue(jSONObject, str);
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObjectNullable != null) {
                try {
                    V vDeserialize = gVar.getValue().deserialize(parsingContext, jSONObjectNullable);
                    if (vDeserialize != null) {
                        arrayList.add(vDeserialize);
                    }
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static <V> List<V> readOptionalList(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull g<Deserializer<JSONObject, V>> gVar, @NonNull ListValidator<V> listValidator) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        if (length == 0) {
            List<V> listEmptyList = Collections.emptyList();
            try {
                if (listValidator.isValid(listEmptyList)) {
                    return listEmptyList;
                }
                parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, listEmptyList));
                return null;
            } catch (ClassCastException unused) {
                parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, listEmptyList));
                return null;
            }
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectNullable = nullable(jSONArrayOptJSONArray.optJSONObject(i10));
            if (jSONObjectNullable != null) {
                try {
                    V vDeserialize = gVar.getValue().deserialize(parsingContext, jSONObjectNullable);
                    if (vDeserialize != null) {
                        arrayList.add(vDeserialize);
                    }
                } catch (Exception e10) {
                    parsingContext.getLogger().logError(ParsingExceptionKt.dependencyFailed(jSONArrayOptJSONArray, str, i10, e10));
                }
            }
        }
        try {
            if (listValidator.isValid(arrayList)) {
                return arrayList;
            }
            parsingContext.getLogger().logError(ParsingExceptionKt.invalidValue(jSONObject, str, arrayList));
            return null;
        } catch (ClassCastException unused2) {
            parsingContext.getLogger().logError(ParsingExceptionKt.typeMismatch(jSONObject, str, arrayList));
            return null;
        }
    }
}
