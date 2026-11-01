package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStartTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionAnimatorStartTemplate implements JSONSerializable, JsonTemplate<DivActionAnimatorStart> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f46068i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStartTemplate> f46069j = new bk.p<ParsingEnvironment, JSONObject, DivActionAnimatorStartTemplate>() { // from class: com.yandex.div2.DivActionAnimatorStartTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStartTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionAnimatorStartTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f46070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<DivAnimationDirection>> f46071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<Long>> f46072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<DivTypedValueTemplate> f46073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<DivAnimationInterpolator>> f46074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<DivCountTemplate> f46075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Field<Expression<Long>> f46076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Field<DivTypedValueTemplate> f46077h;

    /* JADX INFO: compiled from: DivActionAnimatorStartTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionAnimatorStartTemplate(Field<String> field, Field<Expression<DivAnimationDirection>> field2, Field<Expression<Long>> field3, Field<DivTypedValueTemplate> field4, Field<Expression<DivAnimationInterpolator>> field5, Field<DivCountTemplate> field6, Field<Expression<Long>> field7, Field<DivTypedValueTemplate> field8) {
        this.f46070a = field;
        this.f46071b = field2;
        this.f46072c = field3;
        this.f46073d = field4;
        this.f46074e = field5;
        this.f46075f = field6;
        this.f46076g = field7;
        this.f46077h = field8;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().L().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionAnimatorStartTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionAnimatorStartTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionAnimatorStartTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStartTemplate divActionAnimatorStartTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
