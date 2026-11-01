package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeNonModal.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivTooltipModeNonModal implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f49870b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTooltipModeNonModal> f49871c = new bk.p<ParsingEnvironment, JSONObject, DivTooltipModeNonModal>() { // from class: com.yandex.div2.DivTooltipModeNonModal$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTooltipModeNonModal mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTooltipModeNonModal.f49870b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f49872a;

    public final boolean a(DivTooltipModeNonModal divTooltipModeNonModal, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return divTooltipModeNonModal != null;
    }

    /* JADX INFO: compiled from: DivTooltipModeNonModal.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public final DivTooltipModeNonModal a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().Y8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f49872a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = ck.s.b(DivTooltipModeNonModal.class).hashCode();
        this.f49872a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
