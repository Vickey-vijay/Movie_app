package com.yandex.div.internal.parser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bk.l;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.internal.template.Field;
import com.yandex.div.internal.template.FieldKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import java.util.List;
import mj.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JsonFieldParser {
    private static final ValueValidator<String> IS_NOT_EMPTY = new ValueValidator() { // from class: ge.a
        @Override // com.yandex.div.internal.parser.ValueValidator
        public final boolean isValid(Object obj) {
            return JsonFieldParser.lambda$static$0((String) obj);
        }
    };

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field) {
        return readField(parsingContext, jSONObject, str, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        try {
            return new Field.Value(z10, JsonPropertyParser.readList(parsingContext, jSONObject, str, gVar));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<List<V>> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<ExpressionList<V>> field, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalExpressionListField(parsingContext, jSONObject, str, typeHelper, z10, field, lVar, listValidator, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field) {
        return readOptionalField(parsingContext, jSONObject, str, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator) {
        return readOptionalListField(parsingContext, jSONObject, str, z10, field, lVar, listValidator, JsonParsers.alwaysValid());
    }

    public static <V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<Expression<V>> field) {
        writeExpressionField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field) {
        writeField(parsingContext, jSONObject, str, field, JsonParsers.doNotConvert());
    }

    public static <R, V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<List<V>> field, @NonNull l<V, R> lVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, lVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull l<R, V> lVar) {
        return readField(parsingContext, jSONObject, str, z10, field, lVar, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull l<R, V> lVar) {
        return readOptionalField(parsingContext, jSONObject, str, z10, field, lVar, JsonParsers.alwaysValid());
    }

    @Nullable
    public static String readReference(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str) {
        return (String) JsonPropertyParser.readOptional(parsingContext, jSONObject, '$' + str, IS_NOT_EMPTY);
    }

    @Nullable
    public static <V> Field<V> referenceOrFallback(boolean z10, @Nullable String str, @Nullable Field<V> field) {
        if (str != null) {
            return new Field.Reference(z10, str);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        if (z10) {
            return Field.Companion.nullField(z10);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, V> void writeExpressionField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<Expression<V>> field, @NonNull l<V, R> lVar) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpression(parsingContext, jSONObject, str, (Expression) ((Field.Value) field).value, lVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <R, V> void writeExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<ExpressionList<V>> field, @NonNull l<V, R> lVar) {
        if (field instanceof Field.Value) {
            JsonExpressionParser.writeExpressionList(parsingContext, jSONObject, str, (ExpressionList) ((Field.Value) field).value, lVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <R, V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field, @NonNull l<V, R> lVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, (l<T, R>) lVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$0(String str) {
        return !str.isEmpty();
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull ValueValidator<V> valueValidator) {
        return readField(parsingContext, jSONObject, str, z10, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull l<R, V> lVar) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, lVar, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<ExpressionList<V>> readOptionalExpressionListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<ExpressionList<V>> field, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        ExpressionList optionalExpressionList = JsonExpressionParser.readOptionalExpressionList(parsingContext, jSONObject, str, typeHelper, lVar, listValidator, valueValidator);
        if (optionalExpressionList != null) {
            return new Field.Value(z10, optionalExpressionList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.Companion.nullField(z10);
    }

    @NonNull
    public static <R, V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        Object optional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, lVar, valueValidator);
        if (optional != null) {
            return new Field.Value(z10, optional);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.Companion.nullField(z10);
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull l<R, V> lVar) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, lVar, JsonParsers.alwaysValid());
    }

    @NonNull
    public static <R, V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull l<R, V> lVar, @NonNull ListValidator<V> listValidator, @NonNull ValueValidator<V> valueValidator) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, lVar, listValidator, valueValidator);
        if (optionalList != null) {
            return new Field.Value(z10, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.Companion.nullField(z10);
    }

    @NonNull
    public static <R, V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z10, JsonPropertyParser.read(parsingContext, jSONObject, str, lVar, valueValidator));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<V> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), valueValidator);
    }

    @NonNull
    public static <V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull ValueValidator<V> valueValidator) {
        return readOptionalFieldWithExpression(parsingContext, jSONObject, str, typeHelper, z10, field, JsonParsers.doNotConvert(), valueValidator);
    }

    public static <V> void writeListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<List<V>> field, @NonNull g<Serializer<JSONObject, V>> gVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.writeList(parsingContext, jSONObject, str, (List) ((Field.Value) field).value, gVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    public static <V> void writeField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @Nullable Field<V> field, @NonNull g<Serializer<JSONObject, V>> gVar) {
        if (field instanceof Field.Value) {
            JsonPropertyParser.write(parsingContext, jSONObject, str, ((Field.Value) field).value, (g<Serializer<JSONObject, T>>) gVar);
        } else if (field instanceof Field.Reference) {
            JsonPropertyParser.write(parsingContext, jSONObject, "$" + str, ((Field.Reference) field).reference);
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        try {
            return new Field.Value(z10, JsonExpressionParser.readExpression(parsingContext, jSONObject, str, typeHelper, lVar, valueValidator));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<Expression<V>> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull g<Deserializer<JSONObject, V>> gVar, @NonNull ListValidator<V> listValidator) {
        try {
            return new Field.Value(z10, JsonPropertyParser.readList(parsingContext, jSONObject, str, gVar, listValidator));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<List<V>> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <R, V> Field<Expression<V>> readOptionalFieldWithExpression(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, @NonNull TypeHelper<V> typeHelper, boolean z10, @Nullable Field<Expression<V>> field, @NonNull l<R, V> lVar, @NonNull ValueValidator<V> valueValidator) {
        Expression optionalExpression = JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, str, typeHelper, lVar, valueValidator, null);
        if (optionalExpression != null) {
            return new Field.Value(z10, optionalExpression);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.Companion.nullField(z10);
    }

    @NonNull
    public static <V> Field<V> readOptionalField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        Object optional = JsonPropertyParser.readOptional(parsingContext, jSONObject, str, gVar);
        if (optional != null) {
            return new Field.Value(z10, optional);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.Companion.nullField(z10);
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, gVar);
        if (optionalList != null) {
            return new Field.Value(z10, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.Companion.nullField(z10);
    }

    @NonNull
    public static <V> Field<V> readField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<V> field, @NonNull g<Deserializer<JSONObject, V>> gVar) {
        try {
            return new Field.Value(z10, JsonPropertyParser.read(parsingContext, jSONObject, str, gVar));
        } catch (ParsingException e10) {
            JsonTemplateParserKt.suppressMissingValueOrThrow(e10);
            Field<V> fieldReferenceOrFallback = referenceOrFallback(z10, readReference(parsingContext, jSONObject, str), field);
            if (fieldReferenceOrFallback != null) {
                return fieldReferenceOrFallback;
            }
            throw e10;
        }
    }

    @NonNull
    public static <V> Field<List<V>> readOptionalListField(@NonNull ParsingContext parsingContext, @NonNull JSONObject jSONObject, @NonNull String str, boolean z10, @Nullable Field<List<V>> field, @NonNull g<Deserializer<JSONObject, V>> gVar, @NonNull ListValidator<V> listValidator) {
        List optionalList = JsonPropertyParser.readOptionalList(parsingContext, jSONObject, str, gVar, listValidator);
        if (optionalList != null) {
            return new Field.Value(z10, optionalList);
        }
        String reference = readReference(parsingContext, jSONObject, str);
        if (reference != null) {
            return new Field.Reference(z10, reference);
        }
        if (field != null) {
            return FieldKt.clone(field, z10);
        }
        return Field.Companion.nullField(z10);
    }
}
