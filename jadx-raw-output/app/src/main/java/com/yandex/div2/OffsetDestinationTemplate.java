package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: OffsetDestinationTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class OffsetDestinationTemplate implements JSONSerializable, JsonTemplate<OffsetDestination> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f50487b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, OffsetDestinationTemplate> f50488c = new bk.p<ParsingEnvironment, JSONObject, OffsetDestinationTemplate>() { // from class: com.yandex.div2.OffsetDestinationTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final OffsetDestinationTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new OffsetDestinationTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<Expression<Long>> f50489a;

    /* JADX INFO: compiled from: OffsetDestinationTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public OffsetDestinationTemplate(Field<Expression<Long>> field) {
        this.f50489a = field;
    }

    public /* synthetic */ OffsetDestinationTemplate(ParsingEnvironment parsingEnvironment, OffsetDestinationTemplate offsetDestinationTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : offsetDestinationTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public OffsetDestinationTemplate(ParsingEnvironment parsingEnvironment, OffsetDestinationTemplate offsetDestinationTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
