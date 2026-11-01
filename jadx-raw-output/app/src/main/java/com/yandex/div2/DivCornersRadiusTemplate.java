package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCornersRadiusTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivCornersRadiusTemplate implements JSONSerializable, JsonTemplate<DivCornersRadius> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f46841e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCornersRadiusTemplate> f46842f = new bk.p<ParsingEnvironment, JSONObject, DivCornersRadiusTemplate>() { // from class: com.yandex.div2.DivCornersRadiusTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCornersRadiusTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivCornersRadiusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f46844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f46845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<Expression<Long>> f46846d;

    /* JADX INFO: compiled from: DivCornersRadiusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivCornersRadiusTemplate(Field<Expression<Long>> field, Field<Expression<Long>> field2, Field<Expression<Long>> field3, Field<Expression<Long>> field4) {
        this.f46843a = field;
        this.f46844b = field2;
        this.f46845c = field3;
        this.f46846d = field4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().t2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivCornersRadiusTemplate(ParsingEnvironment parsingEnvironment, DivCornersRadiusTemplate divCornersRadiusTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCornersRadiusTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCornersRadiusTemplate(ParsingEnvironment parsingEnvironment, DivCornersRadiusTemplate divCornersRadiusTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
