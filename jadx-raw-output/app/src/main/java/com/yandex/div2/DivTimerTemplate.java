package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTimerTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivTimerTemplate implements JSONSerializable, JsonTemplate<DivTimer> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f49824g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Expression<Long> f49825h = Expression.Companion.constant$default(Expression.Companion, 0L, null, 2, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTimerTemplate> f49826i = new bk.p<ParsingEnvironment, JSONObject, DivTimerTemplate>() { // from class: com.yandex.div2.DivTimerTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTimerTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivTimerTemplate(parsingEnvironment, (DivTimerTemplate) null, false, jSONObject, 6, (ck.i) null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f49827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<String> f49829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field<List<DivActionTemplate>> f49830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field<Expression<Long>> f49831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Field<String> f49832f;

    /* JADX INFO: compiled from: DivTimerTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivTimerTemplate(Field<Expression<Long>> field, Field<List<DivActionTemplate>> field2, Field<String> field3, Field<List<DivActionTemplate>> field4, Field<Expression<Long>> field5, Field<String> field6) {
        this.f49827a = field;
        this.f49828b = field2;
        this.f49829c = field3;
        this.f49830d = field4;
        this.f49831e = field5;
        this.f49832f = field6;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().N8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivTimerTemplate(ParsingEnvironment parsingEnvironment, DivTimerTemplate divTimerTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divTimerTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivTimerTemplate(ParsingEnvironment parsingEnvironment, DivTimerTemplate divTimerTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<Expression<Long>>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<String>) companion.nullField(false), (Field<List<DivActionTemplate>>) companion.nullField(false), (Field<Expression<Long>>) companion.nullField(false), (Field<String>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
