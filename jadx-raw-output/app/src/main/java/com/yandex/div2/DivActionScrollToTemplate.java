package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollToTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivActionScrollToTemplate implements JSONSerializable, JsonTemplate<DivActionScrollTo> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46232d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Expression<Boolean> f46233e = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivActionScrollToTemplate> f46234f = new bk.p<ParsingEnvironment, JSONObject, DivActionScrollToTemplate>() { // from class: com.yandex.div2.DivActionScrollToTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionScrollToTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivActionScrollToTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Boolean>> f46235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<DivActionScrollDestinationTemplate> f46236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<Expression<String>> f46237c;

    /* JADX INFO: compiled from: DivActionScrollToTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivActionScrollToTemplate(Field<Expression<Boolean>> field, Field<DivActionScrollDestinationTemplate> field2, Field<Expression<String>> field3) {
        this.f46235a = field;
        this.f46236b = field2;
        this.f46237c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().H0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivActionScrollToTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollToTemplate divActionScrollToTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionScrollToTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionScrollToTemplate(ParsingEnvironment parsingEnvironment, DivActionScrollToTemplate divActionScrollToTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
