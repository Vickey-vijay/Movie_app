package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedCountTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivFixedCountTemplate implements JSONSerializable, JsonTemplate<DivFixedCount> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f47153b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFixedCountTemplate> f47154c = new bk.p<ParsingEnvironment, JSONObject, DivFixedCountTemplate>() { // from class: com.yandex.div2.DivFixedCountTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedCountTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivFixedCountTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f47155a;

    /* JADX INFO: compiled from: DivFixedCountTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivFixedCountTemplate(Field<Expression<Long>> field) {
        this.f47155a = field;
    }

    public /* synthetic */ DivFixedCountTemplate(ParsingEnvironment parsingEnvironment, DivFixedCountTemplate divFixedCountTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFixedCountTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivFixedCountTemplate(ParsingEnvironment parsingEnvironment, DivFixedCountTemplate divFixedCountTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
