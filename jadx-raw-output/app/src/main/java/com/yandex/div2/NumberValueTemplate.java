package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: NumberValueTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class NumberValueTemplate implements JSONSerializable, JsonTemplate<NumberValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50471b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, NumberValueTemplate> f50472c = new bk.p<ParsingEnvironment, JSONObject, NumberValueTemplate>() { // from class: com.yandex.div2.NumberValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final NumberValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new NumberValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Double>> f50473a;

    /* JADX INFO: compiled from: NumberValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public NumberValueTemplate(Field<Expression<Double>> field) {
        this.f50473a = field;
    }

    public /* synthetic */ NumberValueTemplate(ParsingEnvironment parsingEnvironment, NumberValueTemplate numberValueTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : numberValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public NumberValueTemplate(ParsingEnvironment parsingEnvironment, NumberValueTemplate numberValueTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
