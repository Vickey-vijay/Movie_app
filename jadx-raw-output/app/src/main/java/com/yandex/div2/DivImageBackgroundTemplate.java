package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivImageBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivImageBackgroundTemplate implements JSONSerializable, JsonTemplate<DivImageBackground> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f47607h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Expression<Double> f47608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Expression<DivAlignmentHorizontal> f47609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Expression<DivAlignmentVertical> f47610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Expression<Boolean> f47611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Expression<DivImageScale> f47612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivImageBackgroundTemplate> f47613n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Double>> f47614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAlignmentHorizontal>> f47615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<DivAlignmentVertical>> f47616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivFilterTemplate>> f47617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Uri>> f47618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<Expression<Boolean>> f47619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<DivImageScale>> f47620g;

    /* JADX INFO: compiled from: DivImageBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivImageBackgroundTemplate(Field<Expression<Double>> field, Field<Expression<DivAlignmentHorizontal>> field2, Field<Expression<DivAlignmentVertical>> field3, Field<List<DivFilterTemplate>> field4, Field<Expression<Uri>> field5, Field<Expression<Boolean>> field6, Field<Expression<DivImageScale>> field7) {
        this.f47614a = field;
        this.f47615b = field2;
        this.f47616c = field3;
        this.f47617d = field4;
        this.f47618e = field5;
        this.f47619f = field6;
        this.f47620g = field7;
    }

    static {
        Expression.Companion companion = Expression.Companion;
        f47608i = Expression.Companion.constant$default(companion, Double.valueOf(1.0d), null, 2, null);
        f47609j = Expression.Companion.constant$default(companion, DivAlignmentHorizontal.CENTER, null, 2, null);
        f47610k = Expression.Companion.constant$default(companion, DivAlignmentVertical.CENTER, null, 2, null);
        f47611l = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
        f47612m = Expression.Companion.constant$default(companion, DivImageScale.FILL, null, 2, null);
        f47613n = new bk.p<ParsingEnvironment, JSONObject, DivImageBackgroundTemplate>() { // from class: com.yandex.div2.DivImageBackgroundTemplate$Companion$CREATOR$1
            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivImageBackgroundTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return new DivImageBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
            }
        };
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivImageBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivImageBackgroundTemplate divImageBackgroundTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divImageBackgroundTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivImageBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivImageBackgroundTemplate divImageBackgroundTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
