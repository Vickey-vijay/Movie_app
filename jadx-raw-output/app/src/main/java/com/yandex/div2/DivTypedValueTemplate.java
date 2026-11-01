package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTypedValueTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivTypedValueTemplate implements JSONSerializable, JsonTemplate<DivTypedValue> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f49944a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivTypedValueTemplate> f49945b = new bk.p<ParsingEnvironment, JSONObject, DivTypedValueTemplate>() { // from class: com.yandex.div2.DivTypedValueTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTypedValueTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivTypedValueTemplate.d.b(DivTypedValueTemplate.f49944a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class a extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayValueTemplate f49946c;

        public a(ArrayValueTemplate arrayValueTemplate) {
            super(null);
            this.f49946c = arrayValueTemplate;
        }

        public final ArrayValueTemplate b() {
            return this.f49946c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class b extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BoolValueTemplate f49947c;

        public b(BoolValueTemplate boolValueTemplate) {
            super(null);
            this.f49947c = boolValueTemplate;
        }

        public final BoolValueTemplate b() {
            return this.f49947c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class c extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ColorValueTemplate f49948c;

        public c(ColorValueTemplate colorValueTemplate) {
            super(null);
            this.f49948c = colorValueTemplate;
        }

        public final ColorValueTemplate b() {
            return this.f49948c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivTypedValueTemplate b(d dVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return dVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivTypedValueTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().i9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class e extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DictValueTemplate f49949c;

        public e(DictValueTemplate dictValueTemplate) {
            super(null);
            this.f49949c = dictValueTemplate;
        }

        public final DictValueTemplate b() {
            return this.f49949c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class f extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IntegerValueTemplate f49950c;

        public f(IntegerValueTemplate integerValueTemplate) {
            super(null);
            this.f49950c = integerValueTemplate;
        }

        public final IntegerValueTemplate b() {
            return this.f49950c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class g extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NumberValueTemplate f49951c;

        public g(NumberValueTemplate numberValueTemplate) {
            super(null);
            this.f49951c = numberValueTemplate;
        }

        public final NumberValueTemplate b() {
            return this.f49951c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class h extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StrValueTemplate f49952c;

        public h(StrValueTemplate strValueTemplate) {
            super(null);
            this.f49952c = strValueTemplate;
        }

        public final StrValueTemplate b() {
            return this.f49952c;
        }
    }

    /* JADX INFO: compiled from: DivTypedValueTemplate.kt */
    public static final class i extends DivTypedValueTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UrlValueTemplate f49953c;

        public i(UrlValueTemplate urlValueTemplate) {
            super(null);
            this.f49953c = urlValueTemplate;
        }

        public final UrlValueTemplate b() {
            return this.f49953c;
        }
    }

    public DivTypedValueTemplate() {
    }

    public /* synthetic */ DivTypedValueTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof h) {
            return ((h) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof g) {
            return ((g) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof h) {
            return TypedValues.Custom.S_STRING;
        }
        if (this instanceof f) {
            return TypedValues.Custom.S_INT;
        }
        if (this instanceof g) {
            return "number";
        }
        if (this instanceof c) {
            return "color";
        }
        if (this instanceof b) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (this instanceof i) {
            return "url";
        }
        if (this instanceof e) {
            return "dict";
        }
        if (this instanceof a) {
            return "array";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
