package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeModal.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivTooltipModeModal implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49865b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTooltipModeModal> f49866c = new bk.p<ParsingEnvironment, JSONObject, DivTooltipModeModal>() { // from class: com.yandex.div2.DivTooltipModeModal$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipModeModal mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTooltipModeModal.f49865b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49867a;

    public final boolean a(DivTooltipModeModal divTooltipModeModal, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divTooltipModeModal != null;
    }

    /* JADX INFO: compiled from: DivTooltipModeModal.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTooltipModeModal a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().V8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49867a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTooltipModeModal.class).hashCode();
        this.f49867a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
