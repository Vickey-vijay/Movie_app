package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedSizeTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivFixedSizeTemplate implements JSONSerializable, JsonTemplate<DivFixedSize> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f47197c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression<DivSizeUnit> f47198d = Expression.Companion.constant$default(Expression.Companion, DivSizeUnit.DP, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivFixedSizeTemplate> f47199e = new bk.p<ParsingEnvironment, JSONObject, DivFixedSizeTemplate>() { // from class: com.yandex.div2.DivFixedSizeTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedSizeTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivFixedSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<DivSizeUnit>> f47200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f47201b;

    /* JADX INFO: compiled from: DivFixedSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivFixedSizeTemplate(Field<Expression<DivSizeUnit>> field, Field<Expression<Long>> field2) {
        this.f47200a = field;
        this.f47201b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivFixedSizeTemplate(ParsingEnvironment parsingEnvironment, DivFixedSizeTemplate divFixedSizeTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFixedSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFixedSizeTemplate(ParsingEnvironment parsingEnvironment, DivFixedSizeTemplate divFixedSizeTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
