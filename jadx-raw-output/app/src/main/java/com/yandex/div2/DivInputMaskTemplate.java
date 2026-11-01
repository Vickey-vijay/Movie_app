package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class DivInputMaskTemplate implements JSONSerializable, JsonTemplate<DivInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f47914a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivInputMaskTemplate> f47915b = new bk.p<ParsingEnvironment, JSONObject, DivInputMaskTemplate>() { // from class: com.yandex.div2.DivInputMaskTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputMaskTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivInputMaskTemplate.a.b(DivInputMaskTemplate.f47914a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivInputMaskTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivInputMaskTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().w4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class b extends DivInputMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivCurrencyInputMaskTemplate f47916c;

        public b(DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate) {
            super(null);
            this.f47916c = divCurrencyInputMaskTemplate;
        }

        public final DivCurrencyInputMaskTemplate b() {
            return this.f47916c;
        }
    }

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class c extends DivInputMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFixedLengthInputMaskTemplate f47917c;

        public c(DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate) {
            super(null);
            this.f47917c = divFixedLengthInputMaskTemplate;
        }

        public final DivFixedLengthInputMaskTemplate b() {
            return this.f47917c;
        }
    }

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class d extends DivInputMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivPhoneInputMaskTemplate f47918c;

        public d(DivPhoneInputMaskTemplate divPhoneInputMaskTemplate) {
            super(null);
            this.f47918c = divPhoneInputMaskTemplate;
        }

        public final DivPhoneInputMaskTemplate b() {
            return this.f47918c;
        }
    }

    public DivInputMaskTemplate() {
    }

    public /* synthetic */ DivInputMaskTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof d) {
            return ((d) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof c) {
            return "fixed_length";
        }
        if (this instanceof b) {
            return "currency";
        }
        if (this instanceof d) {
            return "phone";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
