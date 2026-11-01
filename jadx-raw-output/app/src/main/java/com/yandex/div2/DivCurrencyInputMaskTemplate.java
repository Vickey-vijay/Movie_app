package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCurrencyInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivCurrencyInputMaskTemplate implements JSONSerializable, JsonTemplate<DivCurrencyInputMask> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46861c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCurrencyInputMaskTemplate> f46862d = new bk.p<ParsingEnvironment, JSONObject, DivCurrencyInputMaskTemplate>() { // from class: com.yandex.div2.DivCurrencyInputMaskTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCurrencyInputMaskTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivCurrencyInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<String>> f46863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<String> f46864b;

    /* JADX INFO: compiled from: DivCurrencyInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivCurrencyInputMaskTemplate(Field<Expression<String>> field, Field<String> field2) {
        this.f46863a = field;
        this.f46864b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().z2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivCurrencyInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCurrencyInputMaskTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCurrencyInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
