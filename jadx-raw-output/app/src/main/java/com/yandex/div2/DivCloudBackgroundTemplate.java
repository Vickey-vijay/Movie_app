package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCloudBackgroundTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivCloudBackgroundTemplate implements JSONSerializable, JsonTemplate<DivCloudBackground> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46614d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivCloudBackgroundTemplate> f46615e = new bk.p<ParsingEnvironment, JSONObject, DivCloudBackgroundTemplate>() { // from class: com.yandex.div2.DivCloudBackgroundTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCloudBackgroundTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivCloudBackgroundTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Integer>> f46616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field<Expression<Long>> f46617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Field<DivEdgeInsetsTemplate> f46618c;

    /* JADX INFO: compiled from: DivCloudBackgroundTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivCloudBackgroundTemplate(Field<Expression<Integer>> field, Field<Expression<Long>> field2, Field<DivEdgeInsetsTemplate> field3) {
        this.f46616a = field;
        this.f46617b = field2;
        this.f46618c = field3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().b2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ DivCloudBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivCloudBackgroundTemplate divCloudBackgroundTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divCloudBackgroundTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivCloudBackgroundTemplate(ParsingEnvironment parsingEnvironment, DivCloudBackgroundTemplate divCloudBackgroundTemplate, boolean z10, JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
