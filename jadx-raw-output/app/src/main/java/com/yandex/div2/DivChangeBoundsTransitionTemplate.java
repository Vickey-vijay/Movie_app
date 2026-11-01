package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeBoundsTransitionTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DivChangeBoundsTransitionTemplate implements JSONSerializable, JsonTemplate<DivChangeBoundsTransition> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46570d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<Long> f46571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Expression<DivAnimationInterpolator> f46572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Expression<Long> f46573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransitionTemplate> f46574h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f46575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f46576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f46577c;

    /* JADX INFO: compiled from: DivChangeBoundsTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivChangeBoundsTransitionTemplate(Field<Expression<Long>> field, Field<Expression<DivAnimationInterpolator>> field2, Field<Expression<Long>> field3) {
        this.f46575a = field;
        this.f46576b = field2;
        this.f46577c = field3;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f46571e = Expression.Companion.constant$default(companion, 200L, null, 2, null);
        f46572f = Expression.Companion.constant$default(companion, DivAnimationInterpolator.EASE_IN_OUT, null, 2, null);
        f46573g = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f46574h = new bk.p<ParsingEnvironment, JSONObject, DivChangeBoundsTransitionTemplate>() { // from class: com.yandex.div2.DivChangeBoundsTransitionTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivChangeBoundsTransitionTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivChangeBoundsTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().P1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivChangeBoundsTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divChangeBoundsTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivChangeBoundsTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
