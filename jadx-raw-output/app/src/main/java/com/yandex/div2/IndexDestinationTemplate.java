package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: IndexDestinationTemplate.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class IndexDestinationTemplate implements JSONSerializable, JsonTemplate<IndexDestination> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50143b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, IndexDestinationTemplate> f50144c = new bk.p<ParsingEnvironment, JSONObject, IndexDestinationTemplate>() { // from class: com.yandex.div2.IndexDestinationTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IndexDestinationTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new IndexDestinationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f50145a;

    /* JADX INFO: compiled from: IndexDestinationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public IndexDestinationTemplate(Field<Expression<Long>> field) {
        this.f50145a = field;
    }

    public /* synthetic */ IndexDestinationTemplate(ParsingEnvironment parsingEnvironment, IndexDestinationTemplate indexDestinationTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : indexDestinationTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public IndexDestinationTemplate(ParsingEnvironment parsingEnvironment, IndexDestinationTemplate indexDestinationTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
