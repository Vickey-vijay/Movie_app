package com.yandex.div2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVariableTemplate.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class DivVariableTemplate implements JSONSerializable, JsonTemplate<DivVariable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f49966a = new d(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivVariableTemplate> f49967b = new bk.p<ParsingEnvironment, JSONObject, DivVariableTemplate>() { // from class: com.yandex.div2.DivVariableTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivVariableTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivVariableTemplate.d.b(DivVariableTemplate.f49966a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class a extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayVariableTemplate f49968c;

        public a(ArrayVariableTemplate arrayVariableTemplate) {
            super(null);
            this.f49968c = arrayVariableTemplate;
        }

        public final ArrayVariableTemplate b() {
            return this.f49968c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class b extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BoolVariableTemplate f49969c;

        public b(BoolVariableTemplate boolVariableTemplate) {
            super(null);
            this.f49969c = boolVariableTemplate;
        }

        public final BoolVariableTemplate b() {
            return this.f49969c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class c extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ColorVariableTemplate f49970c;

        public c(ColorVariableTemplate colorVariableTemplate) {
            super(null);
            this.f49970c = colorVariableTemplate;
        }

        public final ColorVariableTemplate b() {
            return this.f49970c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class d {
        public d() {
        }

        public /* synthetic */ d(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivVariableTemplate b(d dVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return dVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivVariableTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().l9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class e extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DictVariableTemplate f49971c;

        public e(DictVariableTemplate dictVariableTemplate) {
            super(null);
            this.f49971c = dictVariableTemplate;
        }

        public final DictVariableTemplate b() {
            return this.f49971c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class f extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IntegerVariableTemplate f49972c;

        public f(IntegerVariableTemplate integerVariableTemplate) {
            super(null);
            this.f49972c = integerVariableTemplate;
        }

        public final IntegerVariableTemplate b() {
            return this.f49972c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class g extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NumberVariableTemplate f49973c;

        public g(NumberVariableTemplate numberVariableTemplate) {
            super(null);
            this.f49973c = numberVariableTemplate;
        }

        public final NumberVariableTemplate b() {
            return this.f49973c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class h extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PropertyVariableTemplate f49974c;

        public h(PropertyVariableTemplate propertyVariableTemplate) {
            super(null);
            this.f49974c = propertyVariableTemplate;
        }

        public final PropertyVariableTemplate b() {
            return this.f49974c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class i extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StrVariableTemplate f49975c;

        public i(StrVariableTemplate strVariableTemplate) {
            super(null);
            this.f49975c = strVariableTemplate;
        }

        public final StrVariableTemplate b() {
            return this.f49975c;
        }
    }

    /* JADX INFO: compiled from: DivVariableTemplate.kt */
    public static final class j extends DivVariableTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UrlVariableTemplate f49976c;

        public j(UrlVariableTemplate urlVariableTemplate) {
            super(null);
            this.f49976c = urlVariableTemplate;
        }

        public final UrlVariableTemplate b() {
            return this.f49976c;
        }
    }

    public DivVariableTemplate() {
    }

    public /* synthetic */ DivVariableTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof i) {
            return ((i) this).b();
        }
        if (this instanceof g) {
            return ((g) this).b();
        }
        if (this instanceof f) {
            return ((f) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof j) {
            return ((j) this).b();
        }
        if (this instanceof e) {
            return ((e) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (this instanceof h) {
            return ((h) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof i) {
            return TypedValues.Custom.S_STRING;
        }
        if (this instanceof g) {
            return "number";
        }
        if (this instanceof f) {
            return TypedValues.Custom.S_INT;
        }
        if (this instanceof b) {
            return TypedValues.Custom.S_BOOLEAN;
        }
        if (this instanceof c) {
            return "color";
        }
        if (this instanceof j) {
            return "url";
        }
        if (this instanceof e) {
            return "dict";
        }
        if (this instanceof a) {
            return "array";
        }
        if (this instanceof h) {
            return "property";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().l9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
