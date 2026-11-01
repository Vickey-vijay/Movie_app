package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivBorderTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivBorderTemplate implements JSONSerializable, JsonTemplate<DivBorder> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f46543f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Boolean> f46544g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivBorderTemplate> f46545h = new bk.p<ParsingEnvironment, JSONObject, DivBorderTemplate>() { // from class: com.yandex.div2.DivBorderTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivBorderTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivBorderTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivCornersRadiusTemplate> f46547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<DivShadowTemplate> f46549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<DivStrokeTemplate> f46550e;

    /* JADX INFO: compiled from: DivBorderTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivBorderTemplate(Field<Expression<Long>> field, Field<DivCornersRadiusTemplate> field2, Field<Expression<Boolean>> field3, Field<DivShadowTemplate> field4, Field<DivStrokeTemplate> field5) {
        this.f46546a = field;
        this.f46547b = field2;
        this.f46548c = field3;
        this.f46549d = field4;
        this.f46550e = field5;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().M1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivBorderTemplate(ParsingEnvironment parsingEnvironment, DivBorderTemplate divBorderTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divBorderTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivBorderTemplate(ParsingEnvironment parsingEnvironment, DivBorderTemplate divBorderTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
