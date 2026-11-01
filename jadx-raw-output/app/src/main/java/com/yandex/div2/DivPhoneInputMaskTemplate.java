package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPhoneInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivPhoneInputMaskTemplate implements JSONSerializable, JsonTemplate<DivPhoneInputMask> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48380b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivPhoneInputMaskTemplate> f48381c = new bk.p<ParsingEnvironment, JSONObject, DivPhoneInputMaskTemplate>() { // from class: com.yandex.div2.DivPhoneInputMaskTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPhoneInputMaskTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return new DivPhoneInputMaskTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field<String> f48382a;

    /* JADX INFO: compiled from: DivPhoneInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    public DivPhoneInputMaskTemplate(Field<String> field) {
        this.f48382a = field;
    }

    public /* synthetic */ DivPhoneInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, boolean z10, JSONObject jSONObject, int i10, ck.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divPhoneInputMaskTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public DivPhoneInputMaskTemplate(ParsingEnvironment parsingEnvironment, DivPhoneInputMaskTemplate divPhoneInputMaskTemplate, boolean z10, JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }
}
