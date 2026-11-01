package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskBaseTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivTextRangeMaskBaseTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMaskBase> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49665b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Expression<Boolean> f49666c = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBaseTemplate> f49667d = new bk.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBaseTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskBaseTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskBaseTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivTextRangeMaskBaseTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f49668a;

    /* JADX INFO: compiled from: DivTextRangeMaskBaseTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTextRangeMaskBaseTemplate(Field<Expression<Boolean>> field) {
        this.f49668a = field;
    }

    public /* synthetic */ DivTextRangeMaskBaseTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTextRangeMaskBaseTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().C8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivTextRangeMaskBaseTemplate(ParsingEnvironment parsingEnvironment, DivTextRangeMaskBaseTemplate divTextRangeMaskBaseTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
