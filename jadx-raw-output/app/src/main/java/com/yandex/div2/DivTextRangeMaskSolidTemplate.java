package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskSolidTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivTextRangeMaskSolidTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMaskSolid> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f49698c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Expression<Boolean> f49699d = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolidTemplate> f49700e = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskSolidTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskSolidTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskSolidTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivTextRangeMaskSolidTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Integer>> f49701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49702b;

    /* JADX INFO: compiled from: DivTextRangeMaskSolidTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTextRangeMaskSolidTemplate(Field<Expression<Integer>> field, Field<Expression<Boolean>> field2) {
        this.f49701a = field;
        this.f49702b = field2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTextRangeMaskSolidTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeMaskSolidTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTextRangeMaskSolidTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
