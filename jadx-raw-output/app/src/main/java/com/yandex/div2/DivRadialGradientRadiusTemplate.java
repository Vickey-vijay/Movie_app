package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivRadialGradientRadiusTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientRadius> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48472a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRadiusTemplate> f48473b = new bk.p<ParsingEnvironment, JSONObject, DivRadialGradientRadiusTemplate>() { // from class: com.yandex.div2.DivRadialGradientRadiusTemplate$Companion$CREATOR$1
        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRadiusTemplate mo1invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return DivRadialGradientRadiusTemplate.a.b(DivRadialGradientRadiusTemplate.f48472a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        public static /* synthetic */ DivRadialGradientRadiusTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        public final DivRadialGradientRadiusTemplate a(ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().p6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class b extends DivRadialGradientRadiusTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivFixedSizeTemplate f48474c;

        public b(DivFixedSizeTemplate divFixedSizeTemplate) {
            super(null);
            this.f48474c = divFixedSizeTemplate;
        }

        public final DivFixedSizeTemplate b() {
            return this.f48474c;
        }
    }

    /* JADX INFO: compiled from: DivRadialGradientRadiusTemplate.kt */
    public static final class c extends DivRadialGradientRadiusTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final DivRadialGradientRelativeRadiusTemplate f48475c;

        public c(DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate) {
            super(null);
            this.f48475c = divRadialGradientRelativeRadiusTemplate;
        }

        public final DivRadialGradientRelativeRadiusTemplate b() {
            return this.f48475c;
        }
    }

    public DivRadialGradientRadiusTemplate() {
    }

    public /* synthetic */ DivRadialGradientRadiusTemplate(ck.i iVar) {
        this();
    }

    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getType() {
        if (this instanceof b) {
            return "fixed";
        }
        if (this instanceof c) {
            return "relative";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
